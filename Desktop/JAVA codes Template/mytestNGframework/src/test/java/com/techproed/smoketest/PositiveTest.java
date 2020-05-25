package com.techproed.smoketest;

import com.techproed.pages.FhcLoginPage;
import com.techproed.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTest extends TestBase {


@Test
        public void positiveLoginTest(){
    driver.get("http://www.fhctrip.com/Account/Logon");

    FhcLoginPage fhcLogInPage=new FhcLoginPage(driver);
    fhcLogInPage.username.sendKeys("manager2");
    fhcLogInPage.password.sendKeys("Man1ager2!");
    fhcLogInPage.login.click();

    Assert.assertTrue(fhcLogInPage.listOfUsers.isDisplayed());

}

}
