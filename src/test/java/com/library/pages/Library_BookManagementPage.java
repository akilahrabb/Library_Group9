package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Library_BookManagementPage {

    public Library_BookManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='#books']")
    public WebElement booksTab;

    @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement recordDropdown;





}
