package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import objects.Driver;
import org.openqa.selenium.WebDriver;

public class Logout {
    private WebDriver driver;

    public Logout(WebDriver driver) {
        this.driver = driver;
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

    @After
    public void cleanUp(){
        driver.close();
    }
}
