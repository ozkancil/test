package com.techproed.smoketest;

import com.techproed.pages.FHCPosNegLogInPage1;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class PositiveTest1 extends TestBase {


    @Test
    public void fhcLogInPage(){//this is a method creation
        driver.get("http://www.fhctrip.com/Account/Logon");

        FHCPosNegLogInPage1 fhcPosNegLogInPage1=new FHCPosNegLogInPage1(driver);

        fhcPosNegLogInPage1.username.sendKeys("");
        fhcPosNegLogInPage1.password.sendKeys("");
        fhcPosNegLogInPage1.login.click();

    }






}
