package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class KeysUpDown extends TestBase {


    @Test
    public void upDownActions(){
        driver.get("https://www.google.com/");

        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("iphone x prices");
       // searchBox.sendKeys(Keys.SHIFT+"iphone x prices"); one way of doing it


         actions.doubleClick(searchBox).perform();



    }
    @Test
    public void scrollUpNDown(){
        driver.get("https://www.amazon.com/");
        //for scrolling down the page
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //scrolling down the page with Arrow_Down
        //actions.sendKeys(Keys.ARROW_DOWN)
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        //scroll up a page using keys.page_up
        actions.sendKeys(Keys.PAGE_DOWN).perform();




    }

}
