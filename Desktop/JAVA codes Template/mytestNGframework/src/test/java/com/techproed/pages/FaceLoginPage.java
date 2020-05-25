package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceLoginPage {
    //we will create page object(webElement) in this class
    //we will store all of the face log in page object in this class and use
    //in test class


//creating driver
WebDriver driver;
//initialize driver using constructor
    public FaceLoginPage(WebDriver driver){
        this.driver=driver;
        //we are pagefactory to initialize the driver.
        PageFactory.initElements(driver, this);//

    }
//FindBy annotation
    @FindBy(id="email")
 public   WebElement username;
@FindBy(id="pass")
  public   WebElement pass;

@FindBy(id="loginbutton")
  public   WebElement login;




}
