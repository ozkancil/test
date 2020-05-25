package com.techproed.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iFrameExample {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
    }

        @Test
        public void iframe(){

        String iframeTxt=driver.findElement(By.xpath("//h3")).getText();
            System.out.println(iframeTxt);

            driver.switchTo().frame(0);

            WebElement iframeBox=driver.findElement(By.xpath("//p"));
            iframeBox.clear();
            iframeBox.sendKeys("ya");

            driver.switchTo().parentFrame();
            String iframeTxt1=driver.findElement(By.xpath("//h3")).getText();
            System.out.println(iframeTxt1);

        }

        }

