package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandlesExamples extends TestBase {



    @Test
            public void test(){
        driver.get("https://the-internet.herokuapp.com/windows");
        String parentWindowHandle=driver.getWindowHandle();
        System.out.println("Parent window handle"+parentWindowHandle);
        String actualText=driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals(actualText,"Opening a new window");


        String gettitle=driver.getTitle();
        String expexted="The Internet";
        Assert.assertEquals(gettitle,expexted);
        WebElement clickHere=driver.findElement(By.xpath("//*[@target='_blank']"));
        clickHere.click();
        Set<String>allWindowHandles=driver.getWindowHandles();
// switching to child window
        for(String each:allWindowHandles){
            if(!each.equals(parentWindowHandle)){

                driver.switchTo().window(each);
            }
        }
        System.out.println();

    //new child window title
        String newWindowTitle=driver.getTitle();
        System.out.println(newWindowTitle);
        Assert.assertEquals(newWindowTitle,"New Window");

        //How do you go back to parent window?
        driver.switchTo().window(parentWindowHandle);
        driver.getTitle();
        Assert.assertEquals(driver.getTitle(),"The Internet");

    }

}
