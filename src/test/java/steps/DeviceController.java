package steps;

import io.cucumber.core.api.Scenario;
import org.openqa.selenium.WebDriver;
import utilities.Device;

public abstract class DeviceController {

    public DeviceController() {}

    protected Configuration configuration = null;
    protected Device device;
    public WebDriver driver;

    public Device getDevice() {
        return device;
    }

    public abstract void setupController(Scenario scenario);

    public abstract void tearDownController(Scenario scenario);

    public WebDriver getDriver() {
        return this.driver;
    }
}
