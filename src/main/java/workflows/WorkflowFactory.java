package workflows;

import steps.DeviceController;
import workflows.android.RegistrationPageAndroid;
import workflows.chrome.RegistrationPageChrome;

public class WorkflowFactory {

    public static RegistrationWorkflow getTestWorkflow(DeviceController deviceController){
        switch (deviceController.getDevice()){
            case ANDROID:
                System.out.println("ITS AN ANDROID");
                return new RegistrationPageAndroid(deviceController);
            case CHROME:
            default:
                System.out.println("ITS CHROME");
                return new RegistrationPageChrome(deviceController);
        }
    }

}
