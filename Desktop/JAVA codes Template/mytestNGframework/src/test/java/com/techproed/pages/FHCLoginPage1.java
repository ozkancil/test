package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FHCLoginPage1 {

//create a login page with object and logIn method
    //create a constructor
    public FHCLoginPage1(){
        //we need to get the driver
        PageFactory.initElements(Driver.getDriver(),this);
}
@FindBy(id="UserName")
    public WebElement username;
    @FindBy(id="Password")
    public WebElement password;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement logInButton;
@FindBy(xpath="//div[@id='diveMessageResult']")
public WebElement error_message;


    //creating a log in method
    public void login(String user,String pass){
        //login("manager2","Manager2!");
        username.sendKeys(user);
        password.sendKeys(pass);


    }

}

