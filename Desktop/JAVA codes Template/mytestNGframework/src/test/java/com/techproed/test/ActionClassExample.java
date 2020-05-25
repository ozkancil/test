package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionClassExample extends TestBase {

@Test
    public void contextClickMethod(){
    driver.get("http://the-internet.herokuapp.com/context_menu");

    WebElement rectangleBox=driver.findElement(By.id("hot-spot"));
    //create actions object
    Actions actions=new Actions(driver );
    actions.contextClick(rectangleBox).perform();


    String actualText=driver.switchTo().alert().getText();
    String expectedText="You selected a context menu";

    Assert.assertEquals(actualText,expectedText);
   driver.switchTo().alert().accept();


    // rectangleBox.click();



}


}
