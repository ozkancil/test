package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceLogInPage1 {
//we will create page objects (webelements) in this class
    //so all of hte objects will be in the log in page. Our inspected elements with their webElements will
    //be in the pages class
    //we will store all of the face log in page in this class and use it in the test classs
//
    //creating driver
    WebDriver driver;

    //initialize the driver using constructor
    public FaceLogInPage1(WebDriver driver){
        this.driver=driver;
        //we are using page Factory to initialize the driver.
        PageFactory.initElements(driver, this);
}

@FindBy(id="email")
    public WebElement email;
@FindBy(id="pass")
    public WebElement password;
@FindBy(id="u_0_b")
    public WebElement signIn;







}
