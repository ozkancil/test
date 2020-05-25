package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FHCPosNegLogInPage1 {

    WebDriver driver;

public FHCPosNegLogInPage1(WebDriver driver) {
    this.driver=driver;

    PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy(id="UserName")
    public WebElement username;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(id="btnSubmit")
    public WebElement login;

    @FindBy(xpath="//div[@id='diveMessageResult']")
    public WebElement error_message;



}
