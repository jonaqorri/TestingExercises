package controllers;

import io.cucumber.core.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import steps.Configuration;
import steps.DeviceController;
import utilities.Device;

public class ChromeController extends DeviceController {

    public ChromeController() {
        device = Device.CHROME;
        configuration = new Configuration(this);
    }

    public DesiredCapabilities getDeviceCapabilities() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        return capabilities;
    }

    @Override
    public void setupController(Scenario scenario) {
        WebDriverManager.chromedriver().forceCache().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.silentOutput", "true");
        DesiredCapabilities capabilities = getDeviceCapabilities();
        chromeOptions = chromeOptions.merge(capabilities);
        this.driver = new ChromeDriver(chromeOptions);
    }

    public void tearDownController(Scenario scenario) {
        this.driver.quit();
    }
}
