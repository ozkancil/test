package com.techproed.smoketest;

import com.techproed.pages.FHCPosNegLogInPage1;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest1 extends TestBase {

@Test
    public void negativeLogInTest(){
    driver.get(ConfigReader.getProperty("fhc_login_url"));
    FHCPosNegLogInPage1 fhcPosNegLogInPage1=new FHCPosNegLogInPage1(driver);
//"Man2ager2"
    //minagr2
    fhcPosNegLogInPage1.username.sendKeys("invalid_username");
    fhcPosNegLogInPage1.password.sendKeys("invalid_password");
    fhcPosNegLogInPage1.login.click();

   Assert.assertTrue(fhcPosNegLogInPage1.error_message.getText().contains(ConfigReader.getProperty("login_error_message")));


}
@Test
    public void invalidID(){

    driver.get(ConfigReader.getProperty("fhc_login_url"));

    FHCPosNegLogInPage1 fhcPosNegLogInPage1=new FHCPosNegLogInPage1(driver);

    fhcPosNegLogInPage1.username.sendKeys("invalid_username");
    fhcPosNegLogInPage1.password.sendKeys("valid_password");
    fhcPosNegLogInPage1.login.click();


}

}
