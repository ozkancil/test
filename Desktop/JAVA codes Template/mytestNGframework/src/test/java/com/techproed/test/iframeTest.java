package com.techproed.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframeTest {
WebDriver driver;
@BeforeMethod
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/iframe");


}
@Test
    public void iframeTest(){
    String textPrint=driver.findElement(By.xpath("//h3")).getText();
    System.out.println(textPrint);

    System.out.println(driver.findElement(By.xpath("//h3")).getText());

    //WebElement textBox=driver.findElement(By.xpath("//*[.='Your content goes here.']"));


   // driver.switchTo().frame(0);//iframe must be before the webElement
    //driver.switchTo().frame("mce_0_ifr");//id value
    driver.switchTo().frame("");

    WebElement frameElement=driver.findElement(By.xpath("iframe[@id=['mce_0_ifr']"));
    driver.switchTo().frame(frameElement);//using ifram webElement to find box

    WebElement textBox=driver.findElement(By.xpath("//*[.='Your content goes here.']/p"));
textBox.clear();
    textBox.sendKeys("im here");

    //Print elemental selenium
    //we cant cuz i need to swithc back to parent frame
    driver.switchTo().parentFrame();//parentFrame takes you one back. 
  //  driver.switchTo().defaultContent();//default takes you all the way back
    WebElement seleniumText=driver.findElement(By.xpath("//*[.='_blank'"));
    System.out.println(seleniumText.getText());



}

}
