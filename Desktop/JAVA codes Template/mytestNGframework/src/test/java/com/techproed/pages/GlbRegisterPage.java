package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlbRegisterPage {
    WebDriver driver;
    public GlbRegisterPage(WebDriver driver){
       // this.driver=driver;
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="name")
    public WebElement name;

    @FindBy(id="mobile")
    public WebElement mobile;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id="re_password")
    public WebElement repassword;

    @FindBy(xpath ="//button[@name='submit']")
    public WebElement signup;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement message;

}
