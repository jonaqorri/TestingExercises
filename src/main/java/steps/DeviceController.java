package steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import objects.Driver;
import utilities.Property;

import java.util.concurrent.TimeUnit;

public class DeviceController {

    private Driver driver;
    private AppiumDriverLocalService appiumDriverLocalService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withStartUpTimeOut(15, TimeUnit.SECONDS).usingAnyFreePort());
    private String url = System.getProperty(Property.getPropertyFiles("automation.url"));
    public DeviceController(Driver driver) {
        this.driver = driver;
    }

    public DesiredCapabilities getChromeDeviceCapabilities() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        return capabilities;
    }

    @Before
    public void setupDriver(Scenario scenario){
        WebDriver webDriver;
        String device = System.getProperty("device");
        if(device != null) {
            System.getProperty("device").toLowerCase();
        }
        else {
            device = "";
        }

        switch (device) {
            case "chrome":
            default:
                WebDriverManager.chromedriver().forceCache().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                System.setProperty("webdriver.chrome.silentOutput", "true");
                DesiredCapabilities capabilities = getChromeDeviceCapabilities();
                chromeOptions = chromeOptions.merge(capabilities);
                webDriver = new ChromeDriver(chromeOptions);
                //driver.setDriver(new ChromeDriver(chromeOptions));

            case "android":
                appiumDriverLocalService.start();

                DesiredCapabilities androidCapabilities = new DesiredCapabilities();
                androidCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
                androidCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
                androidCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "android.device");
                androidCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 90);
                androidCapabilities.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, WebDriverManager.chromedriver().getBinaryPath());

                WebDriverManager.chromedriver().forceCache().version("chrome.version").setup();
                webDriver = new AndroidDriver<AndroidElement>(appiumDriverLocalService, androidCapabilities);
                //driver.setDriver(new AndroidDriver<AndroidElement>(appiumDriverLocalService, androidCapabilities));

        }
        webDriver.get(url);
        this.driver.setDriver(webDriver);
        this.driver.setScenario(scenario);
    }

    @After
    public void tearDownController(){
        driver.getDriver().quit();
    }

    @AfterStep
    public void takeScreenShot(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png", "\n");
    }

}
