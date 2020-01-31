package steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

    private final DeviceController registration;

    public Register(DeviceController registration) {
        this.registration = registration;
    }

    /*public Register(DeviceController deviceController){
        this.registrationWorkflow = WorkflowFactory.getTestWorkflow(deviceController);
    } */
    @Given("^I am on the registration tab$")
    public void registrationTab(){
        //TODO
    }

    @When("^I register a new user$")
    public void registerNewUser(){
        //TODO
    }

}
