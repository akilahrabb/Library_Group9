package com.library.step_definitions;

import com.library.pages.Library_BasePage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Verify_Status_10_Steps {

    Library_BasePage library_basePage = new Library_BasePage();


    @Then("User clicks User module")
    public void userClicksUserModule() {
        library_basePage.Users.click();
    }

    @When("User clicks the status dropdown button")
    public void userClicksTheStatusDropdownButton() {
        library_basePage.StatusDropDown.click();
    }

    @Then("User should see the following options")
    public void userShouldSeeTheFollowingOptions(List<String> expectedList){
        Select statusDropDown=new Select(library_basePage.StatusDropDown);
        List<String>actualText= BrowserUtils.getElementsText(statusDropDown.getOptions());
        Assert.assertEquals(actualText, expectedList);

    }

}
