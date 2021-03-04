package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Library_BasePage {

    public Library_BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-book']")
    public WebElement Books;

        @FindBy(xpath = "//select[@id='book_categories']")
        public WebElement BookCategories;

    @FindBy(xpath = "//i[@class='fa fa-book-reader']")
    public WebElement BorrowingBooks;

        @FindBy(xpath = "//table[@id='borrowed_list']//tr/th")
        public List<WebElement> Columns;

        @FindBy(xpath = "//table[@id='borrowed_list']//th[1]")
        public WebElement Action;

        @FindBy(xpath = "//table[@id='borrowed_list']//th[2]")
        public WebElement BookName;

        @FindBy(xpath = "//table[@id='borrowed_list']//th[3]")
        public WebElement BorrowDate;

        @FindBy(xpath = "//table[@id='borrowed_list']//th[4]")
        public WebElement PlannedReturn;

        @FindBy(xpath = "//table[@id='borrowed_list']//th[5]")
        public WebElement ReturnDate;

        @FindBy(xpath = "//table[@id='borrowed_list']//th[6]")
        public WebElement IsReturned;

    @FindBy(xpath = "//a[@href='#dashboard']")
    public WebElement Dashboard;

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement Users;

    @FindBy(id="user_groups")
    public WebElement UserGroup;

    @FindBy(id = "user_avatar")
    public WebElement userAvatar;

        @FindBy(xpath = "//a[contains(text(), 'Log Out')]")
        public WebElement LogOut;

    @FindBy(xpath="//th")
    public List<WebElement> tableHeaders;

}