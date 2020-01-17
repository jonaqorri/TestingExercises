package workflows;

import steps.DeviceController;
import workflows.android.RegistrationPageAndroid;
import workflows.chrome.RegistrationPageChrome;

public class WorkflowFactory {

    public static RegistrationWorkflow getTestWorkflow(DeviceController deviceController){
        switch (deviceController.getDevice()){
            case ANDROID:
                return new RegistrationPageAndroid(deviceController);
            case CHROME:
            default:
                return new RegistrationPageChrome(deviceController);
        }
    }

}
