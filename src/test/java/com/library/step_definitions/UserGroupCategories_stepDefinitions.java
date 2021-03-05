package com.library.step_definitions;

import com.library.pages.Library_BasePage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.StaleElementReferenceException;


import java.util.List;

public class UserGroupCategories_stepDefinitions {

    Library_BasePage library_basePage = new Library_BasePage();


     @When("User click users module")
     public void user_click_users_module() {
    library_basePage.Users.click();
     }

     @When("the user click User Group dropdown")
     public void the_user_click_user_group_dropdown() {
         library_basePage.UserGroup.click();
     }


    @Then("the user should see the following options")
    public void the_user_should_see_the_following_options(List<String> options) throws StaleElementReferenceException {


        Select dropDown = new Select(library_basePage.UserGroup);
        List<String> actualTexts = BrowserUtils.getElementsText(dropDown.getOptions());

        Assert.assertTrue(options.equals(actualTexts));

         System.out.println(library_basePage.UserGroup.getText());


     }

    }










