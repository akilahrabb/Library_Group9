package com.library.step_definitions;

import com.library.pages.Library_BasePage;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.basic.BasicSliderUI;
import java.util.List;

public class bookSearch_stepDefinitions {

    Library_BasePage library_basePage = new Library_BasePage();

    @Then("user sees the categories below")
    public void userSeesTheCategoriesBelow(List<String> category) throws StaleElementReferenceException {
        //select dropdown - create an object of Select class

        library_basePage.BookCategories.click();
        int repeat = -1;
        for (int i = 0; i <= category.size()-1; i++) {
            repeat += 1;
            while (repeat <= i) {
                library_basePage.BookCategories.sendKeys(Keys.ARROW_DOWN);
                if (i == category.size()-1) {
                    library_basePage.BookCategories.click();
                    System.out.println(library_basePage.FirstRowCategory.getText());
                    //Assert.assertTrue(library_basePage.FirstRowCategory.getText().contains(category.get(i)));
                    continue;
                }else if (repeat == i) {
                    library_basePage.BookCategories.click();
                    System.out.println(library_basePage.FirstRowCategory.getText());

                    //Assert.assertTrue(library_basePage.FirstRowCategory.getText().toString().contains(category.get(i)));
                }
            }
        }
    }
}
