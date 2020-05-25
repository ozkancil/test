package com.techproed.test;

import com.techproed.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonDropDownMenu extends TestBase {
WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }
    @Test
    public void dropDown(){
        WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
       Select select =new Select(dropDown);
       String firstOption=select.getFirstSelectedOption().getText();
       String expected="All Departments";
        Assert.assertEquals(firstOption,expected);


        //now lets get the fourth item on the drop down
        select.selectByIndex(3);//its third index because index is one less then the length
        String fourhtItem=select.getFirstSelectedOption().getText();
        System.out.println(fourhtItem);
        Assert.assertEquals(fourhtItem,"Amazon Devices");


        //lets check if Appliances is in the drop down list
        boolean flag=false;
        List<WebElement> list=select.getOptions();
        for(WebElement e:list){
            if(e.getText().equals("Appliances")){
                flag=true;
            }

        }
        System.out.println(flag);

    }
}
