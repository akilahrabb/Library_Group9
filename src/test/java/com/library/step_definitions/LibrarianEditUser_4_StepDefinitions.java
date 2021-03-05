package com.library.step_definitions;

import com.library.pages.Library_BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LibrarianEditUser_4_StepDefinitions {
    Library_BasePage library_basePage = new Library_BasePage();

    @Then("Clicks Edit User button")
    public void clicksEditUserButton(){
        library_basePage.editUser.click();
    }
    @And("Clicks close button")
    public void clicksCloseButton(){
        library_basePage.closeButton.click();
    }
}
