package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLogout extends LibraryLoginPage {

    public LibraryLogout(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //login method where we can pass data from configuration.properties
    public void loginToLibrary_Config(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("Username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("Password"));
        loginButton.click();
    }

    public void loginToLibrary() {
        inputUsername.sendKeys("student43@library");
        inputPassword.sendKeys("7F1rV4W8");
        loginButton.click();
    }
    @FindBy (xpath = "//*[@id=\"navbarDropdown\"]")
    public WebElement dropMenu;

    @FindBy(xpath = "//a[contains(text(), 'Log Out')]")
    public WebElement logOutButton;



}
