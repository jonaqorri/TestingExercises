package workflows.chrome;

import steps.DeviceController;
import utilities.Property;
import workflows.RegistrationWorkflow;

public class RegistrationPageChrome extends RegistrationWorkflow {

    public RegistrationPageChrome(DeviceController deviceController) {
        this.deviceController = deviceController;
    }

    @Override
    public void loadEnvironment() {
        deviceController.getDriver().get(Property.getAppProperty("automation.web.url"));
    }
}
