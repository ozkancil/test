package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonDropDown extends TestBase {
//WebDriver driver;
    @Test
    public void amazonTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement dropdownElement=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(dropdownElement);
        String firstOption=select.getFirstSelectedOption().getText();
        Assert.assertEquals(firstOption,"All Departments");
        //select 4th option by index
        select.selectByIndex(3);
        String forthOption=select.getFirstSelectedOption().getText();
        Assert.assertEquals(forthOption,"Amazon Devices");
        //printing all options
        List<WebElement> allOptions=select.getOptions();
        for (WebElement option : allOptions){
            System.out.println(option.getText());
        }
        //Check if Appliances id in the dropdown. Print True if it is. Print false if it isn't
        boolean flag=false;
        for (WebElement option : allOptions){
            if (option.getText().equals("Appliances")){
                flag=true;
                break;
            }
        }
        System.out.println(flag);
    }
}
