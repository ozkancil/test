package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowHandles extends TestBase {

    @Test
    public void handles(){
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement window=driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(window.isDisplayed());

       String title= driver.getTitle();
        String expected="The Internet";
        Assert.assertEquals(title,expected);

        WebElement clickHere=driver.findElement(By.xpath("//*[@target='_blank']"));
        clickHere.click();

        WebElement newwindow=driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(newwindow.isDisplayed());

    }
}
