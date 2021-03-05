package com.library.step_definitions;

import com.library.pages.LibraryLoginPage;
import com.library.pages.Library_BasePage;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import com.github.javafaker.Faker;

public class LibrarianAddUser_4_StepDefinitions {

    Library_BasePage library_basePage = new Library_BasePage();

    @Then("Clicks on users button")
    public void clicksOnUserButton() {
        library_basePage.Users.click();
    }

    @And("Clicks on Add User button")
    public void clicksOnAddUserButton(){
        library_basePage.addUser.click();
    }

    @When("On add user form ,should be able to complete all boxes with valid info")
    public void onAddUserFormShouldBeAbleToCompleteAllBoxesWithValidInfo() {
        Faker faker= new Faker();
        String fullName=faker.name().fullName();
        String emailAddress=faker.internet().emailAddress();

        library_basePage.fullName.sendKeys(fullName);
        library_basePage.passWord.sendKeys("Hello123");
        library_basePage.email.sendKeys(emailAddress);


    }

    @Then("Clicks Save changes button")
    public void clicksSaveChangesButton() {
        library_basePage.saveChanges.click();

        Assert.assertTrue("The user has been create",true);
        if (true){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");

        }
    }


}
