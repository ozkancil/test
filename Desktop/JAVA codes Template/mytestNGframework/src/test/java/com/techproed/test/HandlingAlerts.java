package com.techproed.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLOutput;

public class HandlingAlerts {


    /*
        1. acceptAlert
        2. dismiss Alerts
        3. sendKeysAlert
        Create a @BeforeMethod

        Go to https://the-internet.herokuapp.com/javascript_alerts

         */

WebDriver driver;
@BeforeClass
    public  void setUp(){

        WebDriverManager.chromedriver().setup();
       driver= new ChromeDriver();

driver.get("https://the-internet.herokuapp.com/javascript_alerts");


    }
    @Test
    public void acceptAlert(){

WebElement jsAlert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
jsAlert.click();
driver.switchTo().alert().accept();

WebElement assertAlertSuccess=driver.findElement(By.id("result"));
String actual=assertAlertSuccess.getText();
String expected="You successfuly clicked an alert";
        System.out.println(actual);
        Assert.assertEquals(actual,expected);
Assert.assertTrue(assertAlertSuccess.isDisplayed());



    }
    @Test
public void dissmissAlert(){
//click on the 2nd button and click cancel and verify that you clicked cancel
WebElement jsConfirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
jsConfirm.click();
driver.switchTo().alert().dismiss();

WebElement warningResult=driver.findElement(By.id("result"));
//warningResult.getText();
String actual=warningResult.getText();
String expected="You clicked: Cancel";
Assert.assertEquals(actual,expected);

Assert.assertTrue(warningResult.isDisplayed());



}@Test
public void sendKeysAlert(){
WebElement jsPrompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
jsPrompt.click();
        System.out.println(driver.switchTo().alert().getText());

driver.switchTo().alert().sendKeys("ozkan");
driver.switchTo().alert().accept();
WebElement actual=driver.findElement(By.xpath("//*[.='You entered: ozkan']"));
String isActual=actual.getText();
String expected="You entered: ozkan";

Assert.assertEquals(expected,isActual);

Assert.assertTrue(actual.isDisplayed());

}
@AfterClass
    public void tearDown(){
    //driver.quit();
}
}
