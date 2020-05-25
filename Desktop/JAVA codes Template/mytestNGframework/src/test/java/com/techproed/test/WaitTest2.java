package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTest2 extends TestBase {

    @Test
    public void implicitWait(){
        //We have implicit wait on our testbase class, our driver will automatically use implicit wait whenever we use driver
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement removeButton=driver.findElement(By.xpath("//button[@autocomplete='off']"));
        removeButton.click();
        WebElement gotIt=driver.findElement(By.id("message"));
        Assert.assertTrue(gotIt.isDisplayed());


    }@Test
    public void explicitWait(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement removeButton=driver.findElement(By.xpath("//button[@autocomplete='off']"));
        removeButton.click();
      //  WebElement gotIt=driver.findElement(By.id("message"));
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        Assert.assertTrue(element.isDisplayed());
//
//        //WebElement textBox1=driver.findElement(By.id("checkbox"));
//        WebElement textBox=driver.findElement(By.xpath("//*[@autocomplete='off']"));
//        //textBox1.click();
//        textBox.click();

    }
}
