package com.techproed.smoketest;

import com.techproed.pages.GlbHomePage;
import com.techproed.pages.GlbRegisterPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlbRegistrationTest {

    @Test
    public void signUp(){

        Driver.getDriver().get(ConfigReader.getProperty("fhc_login_url"));
        GlbRegisterPage glbRegisterPage=new GlbRegisterPage(Driver.getDriver());

        glbRegisterPage.email.sendKeys(ConfigReader.getProperty("test_glb_email"));
        glbRegisterPage.name.sendKeys(ConfigReader.getProperty("test_username"));
        glbRegisterPage.mobile.sendKeys(ConfigReader.getProperty("test_gln_phone"));
        glbRegisterPage.password.sendKeys(ConfigReader.getProperty("test_glb_password"));
        glbRegisterPage.repassword.sendKeys("12345");//hard coded
        glbRegisterPage.signup.click();

        Assert.assertTrue(glbRegisterPage.message.getText().equals("Success!"));


        GlbHomePage glbHomePage=new GlbHomePage();
        glbHomePage.joinNowButton.click();



    }
}
