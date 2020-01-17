package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import workflows.RegistrationWorkflow;
import workflows.WorkflowFactory;

public class Register {

    private final RegistrationWorkflow registrationWorkflow;

    public Register(DeviceController deviceController){
        this.registrationWorkflow = WorkflowFactory.getTestWorkflow(deviceController);
    }

    @When("^I click on Register tab$")
    public void iClickOnRegisterTab() throws Throwable
    {
        System.out.println("I click on Register tab");
    }

    @Then("^I see 6 text fields$")
    public void iSeeSixTextFields() throws Throwable
    {
        System.out.println("I see 6 text fields");
    }

    @Given("^I am on the Registration page$")
    public void iAmOnTheRegistrationPage() throws Throwable
    {
        System.out.println("I am on the Registration page");
    }

    @When("^I fill in the 6 text fields$")
    public void iFillInTheSixTextFields() throws Throwable
    {
        System.out.println("I fill in the 6 text field");
    }

    @And("^I am able to click the Register button")
    public void iAmAbleToClickTheRegisterButton() throws Throwable
    {
        System.out.println("I am able to click the Register button");
    }

    @Then("^I am redirected to the Welcome to Codeveros page$")
    public void iAmRedirectedToTheWelcomeToCodeverosPage() throws Throwable
    {
        System.out.println("I am redirected to the Welcome to Codeveros page");
    }

    @When("^I click User under Menu$")
    public void iClickUserUnderMenu() throws Throwable
    {
        System.out.println("I click User under Menu");
    }

    @Then("^I see my information populated under the User List$")
    public void iSeeMyInformationPopulatedUnderTheUserList() throws Throwable
    {
        System.out.println("I see my information populated under the User List");
    }

    @When("^I click the User icon on the site header$")
    public void iCLickTheUserIconOnTheSiteHeader() throws Throwable
    {
        System.out.println("I click the User icon on the site header");
    }

}
