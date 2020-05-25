package com.techproed.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.techproed.pages.GlbHomePage;
import com.techproed.pages.GlbRegisterPage;
import com.techproed.smoketest.GlbRegistrationTest;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReportsTest {
    GlbRegistrationTest glbRegistrationTest=new GlbRegistrationTest();

    GlbHomePage glbHomePage=new GlbHomePage();

    public ExtentReports extentReports;
    public ExtentHtmlReporter extentHtmlReporter;
    public ExtentTest extentTest;
    @BeforeTest
    public void setUp(){

        //starting the reporter and setting the path. Folder:reports. File name: Extentreport.html
        extentHtmlReporter=new ExtentHtmlReporter("./reports/extentreport.html");
        //create a folder in the root folder level. also create a file

        //doing some configuration with extentHtmlReporter (optional)
        extentHtmlReporter.config().setReportName("FHC TRIP AUTOMATION REPORTS");
        extentHtmlReporter.config().setTheme(Theme.STANDARD);
        extentHtmlReporter.config().setDocumentTitle("FHC TRIP REPORT");
        extentHtmlReporter.config().setEncoding("utf-8");

        //creating extent reports.
        extentReports=new ExtentReports();
        extentReports.attachReporter(extentHtmlReporter);

        //we can give some more configuration
        extentReports.setSystemInfo("Automation Engineer","Ahmet");
        extentReports.setSystemInfo("Environment","Test Environment");
        extentReports.setSystemInfo("Browser",ConfigReader.getProperty("browser"));


    }

 @AfterTest
 public void endReport(){
        extentReports.flush();
 }
    @Test
    public void signUp() throws InterruptedException{

        extentTest=extentReports.createTest("FHC REGISTRATION TEST ","Testing FHC functionality");
        extentTest.info("Opening the URL");
        Driver.getDriver().get(ConfigReader.getProperty("fhc_login_url"));
        extentTest.info("Clicking on Join Now Button");
        glbHomePage.joinNowButton.click();


        GlbRegisterPage glbRegisterPage=new GlbRegisterPage(Driver.getDriver());

        extentTest.info("sending the user email");
        glbRegisterPage.email.sendKeys(ConfigReader.getProperty("test_glb_email"));
        extentTest.info("sending the user ID");
        glbRegisterPage.name.sendKeys(ConfigReader.getProperty("test_username"));

        extentTest.info("entering the phone number");
        glbRegisterPage.mobile.sendKeys(ConfigReader.getProperty("test_gln_phone"));

        glbRegisterPage.password.sendKeys(ConfigReader.getProperty("test_glb_password"));
        glbRegisterPage.repassword.sendKeys("12345");//hard coded
        glbRegisterPage.signup.click();

        Assert.assertTrue(glbRegisterPage.message.getText().equals("Success!"));


        GlbHomePage glbHomePage=new GlbHomePage();




    }

}
