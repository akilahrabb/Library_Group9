package com.library.pages;


import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), "Url");
    }

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement signInButton;

    //login method where we don't have to pass username, password
    public void loginToLibrary(){
        inputUsername.sendKeys("Tester");
        inputPassword.sendKeys("test");
        signInButton.click();
    }

    //overloaded version where we can pass username and password
    public void loginToLibrary(String username, String password){
        inputUsername.click();
        inputUsername.sendKeys(username);
        inputPassword.click();
        inputPassword.sendKeys(password);
        signInButton.click();
    }

    //login method where we can pass data from configuration.properties
    @Test
    public void loginToLibrary_Config() {
        inputUsername.sendKeys(ConfigurationReader.getProperty("Username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("Password"));
        signInButton.click();
    }

}




