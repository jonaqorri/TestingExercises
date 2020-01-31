package objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.text.html.parser.Element;
import objects.Driver;

public class LoginTab {

    private final WebDriver webDriver;
    private final Driver driver;

    //private final Element signInLink;

    public LoginTab(Driver driver) {
        this.driver = driver;
        this.webDriver = (WebDriver) driver;
    }

    public HomePage login(String username, String password){
        webDriver.findElement(By.id("sign-in-username")).sendKeys(username);
        webDriver.findElement(By.id("sign-in-password")).sendKeys(password);
        webDriver.findElement(By.id("sign-in-button")).click();
        return new HomePage(driver);
    }

    public void verifyLoginTab() {
    }

    public void incorrectLogin() {
    }
}
