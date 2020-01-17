package controllers;

import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;
import steps.DeviceController;
import utilities.Device;
import objects.User;


public class CustomPicoFactory implements ObjectFactory {

    private PicoFactory picoFact = new PicoFactory();

    public CustomPicoFactory(){
        addClass(User.class);
        addClass(DeviceController.class);

        switch (Device.getDevice()) {
            case ANDROID:
                addClass(AndroidController.class);
                break;
            case CHROME:
            default:
                addClass(ChromeController.class);
        }
    }

    public void start() {
        picoFact.start();
    }

    public void stop() {
        picoFact.stop();
    }

    public boolean addClass(Class<?> aClass) {
        return picoFact.addClass(aClass);
    }

    public <T> T getInstance(Class<T> aClass) {
        return picoFact.getInstance(aClass);
    }
}
