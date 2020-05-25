package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverOver extends TestBase {

@Test
    public void amazonHover(){
    driver.get("https://www.amazon.com/");
    WebElement hoverOver=driver.findElement(By.id("nav-link-accountList"));
    Actions actions=new Actions(driver);
    actions.moveToElement(hoverOver).perform();

    WebElement yourAccount=driver.findElement(By.linkText("Your Account"));
    yourAccount.click();


}
@Test
    public void imageTest(){
    driver.get("https://www.amazon.com/");
    WebElement imageHover=driver.findElement(By.id("nav-link-prime"));
    Actions actions=new Actions(driver);
    actions.moveToElement(imageHover).perform();

//    WebElement tryPrimeButton=driver.findElement(By.xpath("div[@class='prime-button-try']"));
//    tryPrimeButton.click();
    Assert.assertTrue(driver.findElement(By.id("nav-flyout-prime")).isDisplayed());


}
}
