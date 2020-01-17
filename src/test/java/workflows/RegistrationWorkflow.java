package workflows;

import org.testng.Assert;
import steps.DeviceController;

public abstract class RegistrationWorkflow {
    protected DeviceController deviceController;

    public abstract void loadEnvironment();

    public void verifyLoginPage() {
        Assert.assertEquals("Coveros", deviceController.getDriver().getTitle());
    }
}
