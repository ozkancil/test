package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FaceLogin extends TestBase {

    @Test
    public void logInTest(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        driver.get("https://www.facebook.com/");
WebElement username=driver.findElement(By.id("email"));
username.sendKeys("fakeusername");
WebElement pass=driver.findElement(By.id("pass"));
pass.sendKeys("fakepassword");


WebElement login=driver.findElement(By.id("loginbutton"));
login.click();

       WebElement forgotPass=driver.findElement(By.linkText("Forgot Password?"));
       String actual=forgotPass.getText();

       String expected="Forgot Password?";
        Assert.assertTrue(actual.equals(expected));
        System.out.println(actual);









    }



}
