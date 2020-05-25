package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClassExample extends TestBase {

 @Test
 public void actionsClass(){
  driver.get("http://the-internet.herokuapp.com/context_menu");
  WebElement doubleClick=driver.findElement(By.id("hot-spot"));
  Actions actions=new Actions(driver);
  actions.contextClick(doubleClick).perform();
  String actuatText=driver.switchTo().alert().getText();
  System.out.println(actuatText);
  WebElement element=driver.findElement(By.xpath("//*[@target='_blank']"));
  //actions.contextClick(element).perform();
  element.click();
 }
}
