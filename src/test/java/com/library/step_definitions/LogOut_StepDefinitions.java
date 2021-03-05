package com.library.step_definitions;

import com.library.pages.LibraryLoginPage;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class LogOut_StepDefinitions extends LibraryLoginPage {

    public LogOut_StepDefinitions(){ PageFactory.initElements(Driver.getDriver(), this);
        Driver.getDriver().get(ConfigurationReader.getProperty("Url"));

        inputUsername.sendKeys("student43@library");
        inputPassword.sendKeys("7F1rV4W8");
        loginButton.click();
    }

    @Given(": User is logged into homepage in library app.")
    public void userIsLoggedIntoHomepageInLibraryApp() {

        String expectedInTitle = "Library";
        String actualTitle = Driver.getDriver().getTitle();

        //Assert.assertTrue(expectedInTitle.contains(actualTitle));

    }

    Actions actions = new Actions(Driver.getDriver());
    @When(":User moves cursor to user name and select to see drop menu")
    public void userMovesCursorToUserNameAndSelectToSeeDropMenu() throws InterruptedException {

        Actions actions=new Actions(Driver.getDriver());
        WebElement dropMenu=Driver.getDriver().findElement(By.xpath("//*[@id=\"navbarDropdown\"]"));
        actions.moveToElement(dropMenu).click();

        dropMenu.click();
        Thread.sleep(3000);


    }
    @And(":User should be able to log out by clicking on {string} button")
    public void userShouldBeAbleToLogOutByClickingOnButton(String arg0) {
        Actions actions=new Actions(Driver.getDriver());
        WebElement logOutButton=Driver.getDriver().findElement(By.xpath("//a[contains(text(), 'Log Out')]"));

        logOutButton.click();
    }


    @Then(":User should be logged out , and returned back to log in page")
    public void userShouldBeLoggedOutAndReturnedBackToLogInPage() {
        String expectedTitle="Login-Library";
        String actualTitle=Driver.getDriver().getTitle();

        //Assert.assertTrue(actualTitle.contains(expectedTitle));
        //if ((actualTitle.contains(expectedTitle))) {
            //System.out.println("User able to logout successfully.");
        //} else {
            //System.out.println("Logout unsuccessful.");
        }

    //}



}
