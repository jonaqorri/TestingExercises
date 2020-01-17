package steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Configuration {

    protected DeviceController deviceController;

    public Configuration(DeviceController deviceController){
        this.deviceController = deviceController;
    }

    @Before
    public void setup(Scenario scenario){
        deviceController.setupController(scenario);
    }

    @After
    public void tearDown(Scenario scenario) {
        deviceController.tearDownController(scenario);
    }
}
