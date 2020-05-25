package com.techproed.test;

import com.techproed.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserStory007 extends TestBase {
    WebDriver driver;
@BeforeClass
public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get("http://www.fhctrip.com/");



    }@Test
    public void officialLogIn() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, 5);
        //login();
        driver.get("http://www.fhctrip.com/");
        //driver.get("http://www.fhctrip.com/");

        WebElement logIn=driver.findElement(By.linkText("Log in"));
        logIn.click();

        WebElement logIn2=driver.findElement(By.id("UserName"));
        logIn2.sendKeys("manager2");

        WebElement userName=driver.findElement(By.id("Password"));
        userName.sendKeys("Man1ager2!");

        WebElement logInButton=driver.findElement(By.id("btnSubmit"));
        logInButton.click();

        Thread.sleep(3000);
       WebElement hotelmanagement=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Hotel Management"))));
        hotelmanagement.click();

        Thread.sleep(5000);
        WebElement roomReserv=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Room reservations"))));
        roomReserv.click();


         Thread.sleep(3000);

        WebElement detail=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='datatable_ajax']/tbody/tr[10]/td[14]/a"))));
        //WebElement detail=driver.findElement(By.xpath("//tbody//tr[2]//td[14]")); (//a[@target='_blank'])[2]   //tbody//tr[2]//td[14]
        //        //*[text()=‘DETAILS’]
        Thread.sleep(3000);

       detail.click();


        WebElement generalData=driver.findElement(By.xpath("//a[@data-toggle='tab']"));
        String actual =generalData.getText();
        String expected="General Data";
        Assert.assertTrue(actual.equals(expected));
        System.out.println(actual);

        WebElement properties=driver.findElement(By.linkText("Properties"));
        String actual1=properties.getText();
        String expected1="Properties";
        Assert.assertEquals(actual1,expected1);
        System.out.println(actual1);

        WebElement name=driver.findElement(By.id("ContactNameSurname"));
        name.clear();
        Thread.sleep(3000);
        name.sendKeys("ozkan");

        WebElement phone=driver.findElement(By.id("ContactPhone"));
        phone.clear();
        Thread.sleep(3000);
        phone.sendKeys("75738484844");




        //click on the check box
        WebElement checkBox= driver.findElement(By.id("Approved"));
        checkBox.click();

        //click the approved check box
        WebElement approved=driver.findElement(By.id("IsPaid"));
        approved.click();



        WebElement saveButton=driver.findElement(By.xpath("//i[@class='fa fa-check']"));
        // WebElement saveButton=wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.xpath("//i[@class='fa fa-check']"))));
        //WebElement hotelrooms=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Hotel Rooms"))));
        //"//*[@class='btn green']"]
        saveButton.click();

        //Pop up Ok Button
       Thread.sleep(3000);
//        WebElement okButton=driver.findElement(By.xpath("button[@data-bb-handler='ok']"));
//        okButton.click();

        WebElement okButton1=driver.findElement(By.xpath("(//button[@type='button'])[8]"));
        // WebElement detail=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='datatable_ajax']/tbody/tr[10]/td[14]/a"))));
        okButton1.click();



    }

}
