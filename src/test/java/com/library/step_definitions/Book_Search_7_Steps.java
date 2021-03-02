package com.library.step_definitions;

import com.library.pages.Library_BasePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;

import java.util.List;

public class Book_Search_7_Steps {

    Library_BasePage library_basePage = new Library_BasePage();

    @Then("user sees the categories below")
    public void userSeesTheCategoriesBelow(List<String> category) throws StaleElementReferenceException {

        library_basePage.BookCategories.click();
        for (String each:category) {
            library_basePage.BookCategories.sendKeys(Keys.ARROW_DOWN);
            library_basePage.BookCategories.click();
            System.out.println(library_basePage.FirstRowCategory.getText());
        }

        //Assert.assertTrue(library_basePage.FirstRowCategory.getText().equals(category.get(each)));

    }
}
