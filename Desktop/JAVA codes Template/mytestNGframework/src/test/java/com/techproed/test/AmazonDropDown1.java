package com.techproed.test;

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

public class AmazonDropDown1 {

    WebDriver driver;
    @BeforeClass
    public  void setUp(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        driver.get("https://www.amazon.com/");

    }
    @Test
public void searchDownBox(){
        WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
        Select dropdownText=new Select(dropDown);
        String firstOption=dropdownText.getFirstSelectedOption().getText();
        Assert.assertEquals(firstOption,"All Departments");

        //select 4th option by index
        dropdownText.selectByIndex(3);
        String forthOption=dropdownText.getFirstSelectedOption().getText();
        Assert.assertEquals(forthOption,"Amazon Devices");

        List<WebElement> allOptions=dropdownText.getOptions();

         for (WebElement option:allOptions){
             System.out.println(option.getText());
         }
//check if Applieances is in the dropdown. Print true if it is . print false if not

        boolean flag=false;
    for (WebElement option: allOptions){
        if(option.getText().contains("Appliances")){
            flag=true;
        }

    }
        System.out.println(flag);


    }
}


