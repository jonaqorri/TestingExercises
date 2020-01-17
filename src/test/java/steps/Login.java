package steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import workflows.RegistrationWorkflow;
import workflows.WorkflowFactory;

public class Login {

    private final RegistrationWorkflow registrationWorkflow;

    public Login(DeviceController deviceController) {
        this.registrationWorkflow = WorkflowFactory.getTestWorkflow(deviceController);
    }

    @Given("^I am a registered user$")
    public void iAmARegisteredUser() throws Throwable
    {
        System.out.println("I am a registered user");
    }

    @Given("^I am a user$")
    public void iAmAUser() throws Throwable
    {
        System.out.println("I am a user");
    }

    @Given("^I navigate to the Codeveros Login page$")
    public void iNavigateToTheCodeverosLoginPage() throws Throwable
    {
        System.out.println("I navigate to the Codeveros Login page");
    }

    @When ("^I click on the Sign In tab on the site$")
    public void iClickOnTheSignInTabOnTheSite() throws Throwable
    {
        System.out.println("I click on the Sign In tab on the site");
    }

    @And("^I type my correct username and password$")
    public void iTypeMyCorrectUsernameAndPassword() throws Throwable
    {
        System.out.println("I type my correct username and password");
    }

    @And("^I click the Sign In button$")
    public void iClickTheSignInButton() throws Throwable
    {
        System.out.println("I click the Sign In button");
    }

    @Then("^I should be redirected to the Welcome page$")
    public void iShouldBeRedirectedToTheWelcomePage() throws Throwable
    {
        System.out.println("I should be redirected to the Welcome page");
    }

    @And("^I type in the wrong username and password combo$")
    public void iTypeInTheWrongUsernameAndPasswordCombo() throws Throwable
    {
        System.out.println("I type in the wrong username and password combo");
    }

    @Then("^I should see a Failed Login message$")
    public void iShouldSeeAFailedLoginMessage() throws Throwable
    {
        System.out.println("I should see a Failed Login message");
    }

    @And("^I am logged in to the site$")
    public void iAmLoggedInToTheSite() throws Throwable
    {
        System.out.println("I am logged in to the site");
    }

    @And("^I am on the Welcome page$")
    public void iAmOnTheWelcomePage() throws Throwable
    {
        System.out.println("I am on the Welcome page");
    }
}

