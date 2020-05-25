package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.Set;

public class WindowHandleClass extends TestBase {


//    @Test
//    public void openNewWindow(){
//        WebElement openWindow=driver.findElement(By.xpath("//h3"));
//       // openWindow.getText();
//        String parentWindowHandle=driver.getWindowHandle();
//        System.out.println("PARENT WINDOW HANDLE =>"+parentWindowHandle);
//
//        //WebElement titleCheck=driver.findElement(By.xpath("//html/head/title"));
//
//        String actual=driver.getTitle();
//        String expectedTitle="The Internet";
//
//        WebElement clickHere=driver.findElement(By.linkText("Click Here"));
//        clickHere.click();//now i have to windows open
//        Set<String>allWindowHandles= driver.getWindowHandles();
//        //Switching to child window
//        for(String handle:allWindowHandles){
//            if(!handle.equals(parentWindowHandle)){
//                driver.switchTo().window(handle);
//                System.out.println("CHILD WINDOW HANDLE => "+handle);
//            }
//        }
//        Assert.assertTrue(openWindow.isDisplayed());
//        Assert.assertEquals(actual,expectedTitle);
//        //Assert.assertEquals(titleCheck, expectedTitle);
//
//        //Then user verifies the new window title is new window
//
//        String newWindowTitle=driver.getTitle();
//        Assert.assertEquals(newWindowTitle,"New Window");
//
//        String actualNewWindowText=driver.findElement(By.xpath("//h3")).getText();
//        Assert.assertEquals(actualNewWindowText,"New Window");
//
//        //when user goes back to the previous window and then verifies the title:"The Internet"
//        //How do you go back to the parent window
//        driver.switchTo().window(parentWindowHandle);
//        Assert.assertEquals(driver.getTitle(),"The Internet");


        @Test
        public void newWindowTest(){
            //Given user is on the https://the-internet.herokuapp.com/windows
            driver.get("https://the-internet.herokuapp.com/windows");

//first determine parent window.
            String paretnWindowHandle=driver.getWindowHandle();
            System.out.println("parent window handle "+paretnWindowHandle);

//<h3>Opening a new window</h3>
            //Then user verifies the text : “Opening a new window”
            Assert.assertTrue(driver.findElement(By.tagName("h3")).getText().equals("Opening a new window"));

            //Then user verifies the title of the page is “The Internet”
            Assert.assertTrue(driver.getTitle().equals("The Internet"));

//When user clicks on the Click Here button
//<a href="/windows/new" ,="" target="_blank">Click Here</a>
            driver.findElement(By.linkText("Click Here")).click();
//after clicking i have 2 windows.
            Set<String> allWindowHandles=driver.getWindowHandles();// to pass to new page we can
//use iterator, for loop, for each loop,

            System.out.println(allWindowHandles);
            for (String w:allWindowHandles){
                if (!w.equals(paretnWindowHandle)){
                    driver.switchTo().window(w);
                }
            }
//Then user verifies the new window title is “New Window”
            Assert.assertTrue(driver.getTitle().equals("New Window"));
            System.out.println(driver.findElement(By.tagName("h3")).getText());

//When user goes back to the previous window and then verifies the title : “The Internet”
//how do you go back to parent window?
            driver.switchTo().window(paretnWindowHandle);//i switched to parent window.
            Assert.assertTrue(driver.getTitle().equals("The Internet"));//if i did not
//switch it to parent, it would fail.

    }

}
