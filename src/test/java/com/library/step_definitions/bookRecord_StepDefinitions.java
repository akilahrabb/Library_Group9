package com.library.step_definitions;

import com.library.pages.LibraryLoginPage;
import com.library.pages.Library_BasePage;
import com.library.pages.Library_BookManagementPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.CredentialReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class bookRecord_StepDefinitions {

    Library_BookManagementPage libraryBookManagementPage = new Library_BookManagementPage();




    @When("User clicks on the Books tab")
    public void user_clicks_on_the_books_tab() {

        libraryBookManagementPage.booksTab.click();

    }
    @Then("User should see default showing {string} records")
    public void user_should_see_default_showing_records(String string) {

        Select select = new Select(libraryBookManagementPage.recordDropdown);
        String actual = select.getFirstSelectedOption().getText();
        System.out.println("actual = " + actual);

        Assert.assertEquals(actual,string);

    }

    @Then("User clicks to see all record count options and should see displayed")
    public void user_clicks_to_see_all_record_count_options_and_should_see_displayed(List<String> expectedCount)  {

        Select select = new Select(libraryBookManagementPage.recordDropdown);

        List<String> actualCount = BrowserUtils.getElementsText(select.getOptions());

        Assert.assertEquals(expectedCount,actualCount);

    }

}
