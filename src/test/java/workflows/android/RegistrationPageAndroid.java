package workflows.android;

import steps.DeviceController;
import workflows.RegistrationWorkflow;
import utilities.Property;

public class RegistrationPageAndroid extends RegistrationWorkflow {

    public RegistrationPageAndroid(DeviceController deviceController) {
        this.deviceController = deviceController;
    }

    @Override
    public void loadEnvironment() {
        deviceController.getDriver().get(Property.getAppProperty("automation.android.url"));
    }
}
