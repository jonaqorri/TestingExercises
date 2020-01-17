package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import workflows.RegistrationWorkflow;
import workflows.WorkflowFactory;

public class Logout {
    private final RegistrationWorkflow registrationWorkflow;

    public Logout(DeviceController deviceController) {
        this.registrationWorkflow = WorkflowFactory.getTestWorkflow(deviceController);
    }

    @When("^I click the log out button$")
    public void iClickTheLogOutButton() throws Throwable
    {
        System.out.println("I click the log out button");
    }

    @And("^the Sign Out pop up appears$")
    public void theSignOutPopUpAppears() throws Throwable
    {
        System.out.println("The Sign Out pop up appears");
    }

    @And("^I click confirm$")
    public void iClickConfirm() throws Throwable
    {
        System.out.println("I click confirm");
    }

    @Then("^I am returned to the Sign In page$")
    public void iAmReturnedToTheSignInPage() throws Throwable
    {
        System.out.println("I am returned to the Sign In page");
    }

}
