package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Library_BasePage {

    public Library_BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-book']")
    public WebElement Books;

    @FindBy(xpath = "//i[@class='fa fa-book-reader']")
    public WebElement BorrowingBooks;

    @FindBy(xpath = "//a[@href='#dashboard']")
    public WebElement Dashboard;

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement Users;

    @FindBy(id = "user_avatar")
    public WebElement userLogout;
}