package com.techproed.test;

import com.techproed.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts extends TestBase {

WebDriver driver;

    @BeforeClass
    public  void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }
    @Test
    public void alerts() {
        //driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();

        driver.switchTo().alert().accept();

        WebElement resultVerify = driver.findElement(By.id("result"));//.getText();
        Assert.assertTrue(resultVerify.isDisplayed());
    }
    @Test
    public void dismiss(){
        WebElement jsconfirmButton=driver.findElement(By.xpath("//*[@onclick='jsConfirm()']"));
        jsconfirmButton.click();
        driver.switchTo().alert().dismiss();
        WebElement result1=driver.findElement(By.id("result"));
        Assert.assertTrue(result1.isDisplayed());

    }@Test
    public void jsPrompt(){
        WebElement promptButton=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        promptButton.click();
        driver.switchTo().alert().sendKeys("we did it");
        driver.switchTo().alert().accept();

        WebElement result1=driver.findElement(By.id("You entered: we did it"));
        Assert.assertTrue(result1.isDisplayed());

    }
        @AfterClass
        public void tearDown(){
            //driver.quit();
        }

}
