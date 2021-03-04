package com.library.step_definitions;

import com.library.pages.Library_BasePage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Book_Search_7_Steps {

    Library_BasePage library_basePage = new Library_BasePage();


    @Then("user sees the below categories")
    public void userSeesTheBelowCategories(List<String> expectedCategories) {
        Select Categories = new Select(library_basePage.BookCategories);
        List<String> actualCategories = BrowserUtils.getElementsText(Categories.getOptions());

        System.out.println(expectedCategories);
        System.out.println(actualCategories);

        Assert.assertEquals("Category lists match.", expectedCategories,  actualCategories);
    }
}
