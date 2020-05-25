package com.techproed.GlobalTest;

import com.techproed.pages.GlobalRegistrationPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlobalResgistrationTest {

    @Test
     public void positiveTest(){
        Driver.getDriver().get(ConfigReader.getProperty("glb_login_url"));

        GlobalRegistrationPage globalRegistrationPage=new GlobalRegistrationPage();

        //WebDriverWait wait=new WebDriverWait(,10);

        globalRegistrationPage.email1.sendKeys(ConfigReader.getProperty("test_glb_email"));
        globalRegistrationPage.username1.sendKeys(ConfigReader.getProperty("test_username"));
        globalRegistrationPage.phone.sendKeys(ConfigReader.getProperty("test_gln_phone"));
        globalRegistrationPage.password1.sendKeys(ConfigReader.getProperty("test_glb_password"));

        globalRegistrationPage.repassword1.sendKeys("12345");
        globalRegistrationPage.signup1.click();

        System.out.println(globalRegistrationPage.message1.getText());
        Assert.assertTrue(globalRegistrationPage.message1.getText().equals("Success! !"));
        //this will fail. Expected=Success! Actual = Success!!
    }

}
