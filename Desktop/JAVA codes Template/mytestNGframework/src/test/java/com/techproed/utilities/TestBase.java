package com.techproed.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
public abstract class TestBase {
    public WebDriver driver;//or it can be protected
//abstract class is =>
    //where did you use abstract in your framework?=> I use abstract in my TestBase class
    //I have TestBase in my framework, that is an abstract class.
//The purpose of that is not to create an object, but just to use its method.
protected Actions actions;//Make sure to create this in the class level.


    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        //driver.getText("");
       // driver.get("https://the-internet.herokuapp.com/windows");

       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);

driver.manage().window().maximize();
driver.manage().window().maximize();
driver.manage().window().maximize();
driver.manage().window().maximize();


actions=new Actions(driver);

    }
@AfterClass
    public void tearDown(){

}
}
