package com.techproed.test;

import com.techproed.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonDropDown2 extends TestBase {

    WebDriver driver;
    @BeforeClass
    public  void setUp(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        driver.get("https://www.amazon.com/");

    }


    @Test
    public void dropDown(){

        WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(dropDown);
        String firstOption=select.getFirstSelectedOption().getText();
        System.out.println(firstOption);
        Assert.assertEquals(firstOption,"All Departments");



        select.selectByIndex(3);
        String fourthIndex=select.getFirstSelectedOption().getText();
        Assert.assertEquals(fourthIndex,"Amazon Devices");

        List<WebElement> list=select.getOptions();

        boolean flag=false;
        for(WebElement a:list){
            if(a.getText().equals("Appliances")){
                flag=true;
            }else{

            }
        }
        System.out.println(flag);





    }
}
