package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleExample2 extends TestBase {

    @Test
    public void windowHandle(){
        driver.get("https://the-internet.herokuapp.com/windows ");
        String parentWindowHandle=driver.getWindowHandle();
        System.out.println(parentWindowHandle);
        String actual=driver.getTitle();
        String expected="The Internet";
        Assert.assertEquals(actual,expected);
        WebElement clickHere=driver.findElement(By.linkText("Click Here"));
        clickHere.click();

        Set<String> allHandles=driver.getWindowHandles();

        for(String handles:allHandles){
            if(!handles.equals(allHandles)){
                driver.switchTo().window(handles);
                System.out.println("Handles"+handles);
            }
        }
        String newWindowTitle=driver.getTitle();
        System.out.println(newWindowTitle);

        String title=driver.findElement(By.xpath("//h3")).getText();
        String expectedText="New Window";
        Assert.assertEquals(title,expectedText);


    }

}
