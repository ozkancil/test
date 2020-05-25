package com.techproed.test;

import com.techproed.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Soft_Hard_Assertions extends TestBase {
    //WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");



    }@Test (priority=1)
    public void login() {
        WebElement emailText = driver.findElement(By.className("form-control"));
        emailText.sendKeys("testtechproed@gmail.com");

        WebElement passworBox = driver.findElement(By.id("session_password"));
        passworBox.sendKeys("Test1234!");

        WebElement signIn = driver.findElement(By.name("commit"));
        signIn.click();
    }
@Test(dependsOnMethods = "login")
    public void homePage(){
        WebElement wellcomeMessage=driver.findElement(By.xpath("//h1"));
    System.out.println(wellcomeMessage.getText());
    Assert.assertTrue(wellcomeMessage.isDisplayed());//Hard assertion
    System.out.println("This messae will not run if the code stops running becuase this is hard assertion");



    //SOFT ASSERT
    //create the object
    SoftAssert softAssert=new SoftAssert();
    //step 2. use that object for assertion
    softAssert.assertTrue(wellcomeMessage.isDisplayed());//PASS
softAssert.assertTrue(wellcomeMessage.isDisplayed());//Fail. even though it failed u still see the result.
    softAssert.assertAll();//Fails
    System.out.println("This is after assert all assertion");


    WebElement emailID=driver.findElement(By.className("navbar-text"));
    String actual=emailID.getText();
    String expected="testtechproed@gmail.com";
    Assert.assertEquals(actual,expected);

    softAssert.assertEquals(actual,expected);
}
@AfterClass
    public void tearDown(){
        driver.close();
}
}
