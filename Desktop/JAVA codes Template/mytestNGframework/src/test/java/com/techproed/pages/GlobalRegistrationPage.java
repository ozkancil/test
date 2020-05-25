package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GlobalRegistrationPage {


    public GlobalRegistrationPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="email")
    public WebElement email1;

    @FindBy(id="name")
    public WebElement username1;

    @FindBy(id="mobile")
    public WebElement phone;

    @FindBy(id="password")
    public WebElement password1;

    @FindBy(xpath="//input[@id='re_password']")
    public WebElement repassword1;

    @FindBy(xpath ="//button[@name='submit']")
    public WebElement signup1;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement message1;
}
