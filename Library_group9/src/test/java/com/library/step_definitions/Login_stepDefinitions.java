package com.library.step_definitions;

import com.library.pages.LibraryLoginPage;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepDefinitions {

    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

    @Given("User is on the library login page")
    public void user_is_on_the_library_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Url"));
    }

    @When("User enters correct {string} and {string}")
    public void user_enters_correct_and(String arg1, String arg2){
        libraryLoginPage.inputUsername.sendKeys(arg1);
        libraryLoginPage.inputPassword.sendKeys(arg2);
    }

    @When("User clicks the sign-in button")
    public void user_clicks_the_sign_in_button(){
        libraryLoginPage.loginButton.click();
    }

    @Then("User sees the library homepage")
    public void userSeesTheLibraryHomepage() {
        String expectedInTitle = "Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        if ((actualTitle.contains(expectedInTitle))) {
            System.out.println("All users successfully logged in.");
        } else {
            System.out.println("Login unsuccessful.");
        }
    }
}
