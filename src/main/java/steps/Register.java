package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import workflows.RegistrationWorkflow;
import workflows.WorkflowFactory;

public class Register {

    private final RegistrationWorkflow registrationWorkflow;

    public Register(DeviceController deviceController){
        this.registrationWorkflow = WorkflowFactory.getTestWorkflow(deviceController);
    }

    @When("^I navigate to the login page$")
    public void navigateToLoginPage() {
        registrationWorkflow.loadEnvironment();
    }

    @Then("^I see the login page$")
    public void iSeeTheSignInPage(){
        registrationWorkflow.verifyLoginPage();
    }

    @When("^I click on Register tab$")
    public void clickOnRegisterTab() {

    }
    @Then("^I see 6 text fields$")
    public void verifyRegistrationTextFields() {

    }

}
