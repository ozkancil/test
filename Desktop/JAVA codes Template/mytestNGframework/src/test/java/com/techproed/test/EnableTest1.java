package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableTest1 extends TestBase {

    @Test
    public void isEnabled(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //driver.findElements(By.)
        WebElement enable=driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enable.click();



        WebDriverWait wait=new WebDriverWait(driver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//p[@id='message']"))));
        //WebElement enabledmessage=driver.findElement(By.linkText("It's enabled!"));
        Assert.assertTrue(element.isDisplayed());

        boolean isEnable=element.isEnabled();
        Assert.assertTrue(isEnable);



        //Text box enabled
        WebElement textbox=driver.findElement(By.xpath("//input[@type='text']"));
        boolean textBox=textbox.isEnabled();
        Assert.assertTrue(textBox);
    }
}
