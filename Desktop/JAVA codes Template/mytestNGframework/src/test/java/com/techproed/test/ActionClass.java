package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionClass extends TestBase {

    @Test
    public void contextClickMethod(){
        driver.get("http://the-internet.herokuapp.com/context_menu");
        //when user click on the box
        //identify the webelement
        WebElement rectangle1=driver.findElement(By.id("hot-spot"));
        //create actions object
        Actions actions=new Actions(driver);
        //3.Now you can rightClick
        //We needed to get actions object before we could take any action
        //actions.contextClick().perform();//This is not right
        actions.contextClick(rectangle1).perform();

        //Verify the alert message
        String actualText=driver.switchTo().alert().getText();
        String expectedText="You selected a context menu";
        Assert.assertEquals(actualText,expectedText);
        //Now Right Click On the Element selenium==>HomeWork

        driver.switchTo().alert().accept();
driver.quit();
        //actions.contextClick(rectangle1).perform();
        driver.close();
    }

    @Test
    public void hoverOver(){
        driver.get("https://www.amazon.com/");

        WebElement signInBox=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
        //Click on your Account
        actions.moveToElement(signInBox).perform();

        WebElement yourAccount=driver.findElement(By.linkText("Your Account"));
        yourAccount.click();

        //Then verify your title
        String actualTitle=driver.getTitle();
        String expectedTitle="Your Account";

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        Assert.assertEquals(actualTitle,expectedTitle);


    }
    @Test
    public void imageTest(){
        driver.get("https://www.amazon.com/");
        WebElement tryPrime=driver.findElement(By.id("nav-link-prime"));
        actions.moveToElement(tryPrime).perform();
        driver.findElements(By.id("nav-flyout-prime"));

        Assert.assertTrue(driver.findElement(By.id("nav-flyout-prime")).isDisplayed());



    }
}
