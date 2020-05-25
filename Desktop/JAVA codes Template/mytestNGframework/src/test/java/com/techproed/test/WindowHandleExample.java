package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowHandleExample extends TestBase {

    //driver.get("https://the-internet.herokuapp.com/windows");

@Test
    public void newWindowTest(){
   String parentWindowHandle= driver.getWindowHandle();
    System.out.println("ParentWindowHandle"+parentWindowHandle);

    String actualTxt=driver.findElement(By.xpath("//h3")).getText();
    String expectedTxt="Opening a new window";
    Assert.assertEquals(actualTxt,expectedTxt);

String actualTile=driver.getTitle();
String expectedTitle="The Internet";
Assert.assertEquals(actualTile,expectedTitle);

//WebElement clickeHere=driver.findElements(By.linkText("Click Here"));
//clickeHere.click();

String verify=driver.findElement(By.linkText("New Window")).getText();


}

}
