package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableTest extends TestBase {
    /*when user goes to https://the-internet.herokuapp.com/dynamic_controls
    and clicks on Enable button then verify that textbox is enabled-I can type in
     */
    @Test
    public void isEnabled(){


        //I am creating a webdriverwait object
        WebDriverWait wait=new WebDriverWait(driver,10);
        //going to the page
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //location enable button
        WebElement enableButton=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        //clicking on enable button
        enableButton.click();
        //waiting for the enabled message because it takes time to load.
        //Explicit wait will wait for that enabled message up to 10 seconds. If it locates in less than 10 sec, then it go to the next line
        //If that element is not found in 10 seconds, then this line will fail
        //We have implicit wait and its not working. I cant send key until enabled and it takes more time to enable and send key goes before enable and it does not work. Causes problems.
        WebElement enabledMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        //Verifying the enabled text message
        Assert.assertEquals(enabledMessage.getText(),"It's enabled!");
        //Locating textbox element
        WebElement textBox=driver.findElement(By.xpath("//input[@type='text']"));
        //To test is an element Enabled or Not, we can use isEnabled() method.
        //isDisplayed=>if an element displayed or not
        //isSelected=>radio button or checkbox
        //isEnabled=>to check if an element enabled or not.
        //checking the condition of the textbox. If it is enabled or not
        boolean isEnable=textBox.isEnabled();
        //Asserting if above statement is true or not
        Assert.assertTrue(isEnable);









    }
}
