package com.techproed.test;

import com.techproed.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alerts1 extends TestBase {
    WebDriver driver;

    @BeforeClass
    public  void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }
    @Test
    public void alerts() {
        //switchTo
        WebElement jsAlert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();
        driver.switchTo().alert().accept();
        //   "//button[@onclick='jsAlert()']"

        WebElement jsConfirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirm.click();
        driver.switchTo().alert().dismiss();


        WebElement jsPrompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPrompt.click();
        driver.switchTo().alert().sendKeys("We did it");
        driver.switchTo().alert().accept();

    }
@AfterClass
    public void tearDown(){

}

}
