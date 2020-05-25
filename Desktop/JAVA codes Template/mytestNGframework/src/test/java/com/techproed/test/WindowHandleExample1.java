package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleExample1 extends TestBase {

    @Test
    public void main(){
        driver.get("https://the-internet.herokuapp.com/windows ");
        String parentWindowHandle=driver.getWindowHandle();//PARENT WINDOW HANDLE
        System.out.println("Parent window handle"+parentWindowHandle);
        WebElement openingWindow=driver.findElement(By.xpath("//h3"));
        String actual=openingWindow.getText();
        String expected="Opening a new window";

        Assert.assertEquals(actual,expected);

        System.out.println(driver.getTitle());

        String actualTitle=driver.getTitle();
        String expectedTitle="The Internet";
        Assert.assertEquals(actualTitle,expectedTitle);



        WebElement clickHere=driver.findElement(By.linkText("Click Here"));
        clickHere.click();

        //Now we have two windows open so we are tryin to use window handles, not handle because we have two
        //windows open
        Set<String> allWindowHandles=driver.getWindowHandles();
        //Then user verifies the new window title is "New Window"
        //switching to child window
        for(String handle: allWindowHandles){
if(!handle.equals(parentWindowHandle)){
    driver.switchTo().window(handle);
    System.out.println("CHILD WINDOW HANDLE=>"+handle);
}
        }

        String newWindowTitle=driver.getTitle();
        Assert.assertEquals(newWindowTitle,"New Window");


        //when user goes back to the previous window and then verifies the title: "The Internet"
        //How do you go back to parent window?
driver.switchTo().window(parentWindowHandle);
Assert.assertEquals(driver.getTitle(),"The Internet");









//        WebElement newWindow=driver.findElement(By.xpath("//h3"));
//        String actual1=newWindow.getText();
//        String expected1="New Window";
//
//        Assert.assertEquals(actual1,expected1);
//
//        Assert.assertTrue(newWindow.isDisplayed());
    }
}
