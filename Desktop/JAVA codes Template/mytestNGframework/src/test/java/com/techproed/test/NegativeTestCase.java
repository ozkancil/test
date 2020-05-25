package com.techproed.test;

import com.techproed.pages.FhcLoginPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBaseFinal;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTestCase extends TestBaseFinal {


//parameter
//

        @Test()
        public void invalidPass() throws InterruptedException {
            extentTest=extentReports.createTest("NEGATIVE TEST CASE","DOING NEGATIVE TEST CASES FOR LOG IN");
            extentTest.info("Opening the URL");
            Driver.getDriver().get(ConfigReader.getProperty("fhc_login_url"));
            extentTest.info("creating page object");
            FhcLoginPage fhcLoginPage = new FhcLoginPage(Driver.getDriver());
            //correct username but incorrect pass
            fhcLoginPage.username.sendKeys(ConfigReader.getProperty("valid_username"));
            fhcLoginPage.password.sendKeys(ConfigReader.getProperty("invalid_password"));
            extentTest.info("clicking");
            fhcLoginPage.login.click();
            Thread.sleep(3000);
            extentTest.info("verifying");
            Assert.assertFalse(fhcLoginPage.error_message.getText().contains(ConfigReader.getProperty("login_error_message")));
            extentTest.pass("PASSED");


        }

        //we can use multiple parameter on single test
        //For example tehre are two parameters on this test case
        //This test case will runs two times
        @Test(groups = "regression1",invocationCount = 2, priority = 1)
        public void invalidID(){

            Driver.getDriver().get(ConfigReader.getProperty("fhc_login_url"));
            FhcLoginPage fhcLoginPage = new FhcLoginPage(Driver.getDriver());
            // Correct pass but inccorrect username
            fhcLoginPage.username.sendKeys(ConfigReader.getProperty("invalid_username"));
            fhcLoginPage.password.sendKeys(ConfigReader.getProperty("valid_password"));
            fhcLoginPage.login.click();
            //Assertion
            Assert.assertTrue(fhcLoginPage.error_message.getText().contains(ConfigReader.getProperty("login_error_message2")));
        }

        @Test(groups = "regression1")
        public void invalidIDAndPass(){
            Driver.getDriver().get("http://www.fhctrip.com/Account/Logon");
            FhcLoginPage fhcLoginPage = new FhcLoginPage(Driver.getDriver());
            //Both incorrect username password
            fhcLoginPage.username.sendKeys("minagr2");
            fhcLoginPage.password.sendKeys("Man2ager2");
            fhcLoginPage.login.click();
            //Assertion
            Assert.assertTrue(fhcLoginPage.error_message.getText().contains("Try again please"));

        }
}
