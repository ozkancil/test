package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FaceLoginTest1 extends TestBase {

@Test
    public void logInTest() throws InterruptedException {
    driver.get("https://www.facebook.com/");

    WebElement username=driver.findElement(By.id("email"));
      WebElement password=driver.findElement(By.id("pass"));
    WebElement signIn=driver.findElement(By.id("u_0_b"));
 username.sendKeys("fakeuser");
    password.sendKeys("123445");

    signIn.click();


WebElement forgotPass=driver.findElement(By.linkText("Forgot Password?"));
String getTextForgotPass=forgotPass.getText();
    System.out.println(getTextForgotPass);
    Assert.assertTrue(forgotPass.isDisplayed());

}


}

