package controllers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.core.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import steps.Configuration;
import steps.DeviceController;
import utilities.Device;

import java.util.concurrent.TimeUnit;

public class AndroidController extends DeviceController {

    private AppiumDriverLocalService appiumDriverLocalService;

    public AndroidController(){
        device = Device.ANDROID;
        configuration = new Configuration(this);
    }

    @Override
    public void setupController(Scenario scenario) {

    }

    public void setUpController(Scenario scenario){
        appiumDriverLocalService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withStartUpTimeOut(15, TimeUnit.SECONDS).usingAnyFreePort());
        appiumDriverLocalService.start();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

        WebDriverManager.chromedriver().forceCache().version("69").setup();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "GalaxyS8-4");
        capabilities.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, WebDriverManager.chromedriver().getBinaryPath());

        driver = new AndroidDriver(appiumDriverLocalService, capabilities);
    }

    @Override
    public void tearDownController(Scenario scenario) {
        driver.quit();
    }
}
