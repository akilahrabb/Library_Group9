package com.library.pages;


import com.library.utilities.ConfigurationReader;
import com.library.utilities.CredentialReader;
import com.library.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LibraryLoginPage extends Library_BasePage {

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement inputUsername;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(css = "[class='btn btn-lg btn-primary btn-block']")
    public WebElement loginButton;

    //login method where we don't have to pass username, password
    public void loginToLibrary(){
        inputUsername.sendKeys("student48@library");
        inputPassword.sendKeys("xjapSRzD");
        loginButton.click();
    }

    //overloaded version where we can pass username and password
    public void loginToLibrary(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    //login method where we can pass data from configuration.properties
    public void loginToLibrary_Credentials(){
        inputUsername.sendKeys(CredentialReader.getProperty("student1Username"));
        inputPassword.sendKeys(CredentialReader.getProperty("student1Password"));
        loginButton.click();
    }
}