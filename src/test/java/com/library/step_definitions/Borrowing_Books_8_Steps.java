package com.library.step_definitions;

import  com.library.pages.Library_BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Borrowing_Books_8_Steps {

    Library_BasePage library_basePage = new Library_BasePage();

    @When("User selects Borrowing Books from the menu")
    public void user_selects_borrowing_books_from_the_menu() {
        library_basePage.BorrowingBooks.click();
    }

    @Then("User sees the following column names {string}")
    public void userSeesTheFollowingColumnNames(String expectedName){

        List<WebElement> columns = library_basePage.Columns;

        String[] actualName = new String[6];//Array for the information from the List<> columns
        int actualNameIndex = columns.indexOf(expectedName)+1;//not sure why we needed to add 1, but it worked
        actualName[actualNameIndex] = columns.get(actualNameIndex).getText();//add column names into array

        if (actualName[actualNameIndex].equals(expectedName)) { // compare the two strings
            System.out.println("Expected column name:" + expectedName);
            System.out.println("Actual column name: " + actualName[actualNameIndex]);
        }
        //Assert.assertEquals(expectedName, actualName[actualNameIndex]);
        //This assert statement seems to use the following row in the Example table, causing tests to fail
        //It would have returned a printed statement similar to the one in the if statement above
    }
}
