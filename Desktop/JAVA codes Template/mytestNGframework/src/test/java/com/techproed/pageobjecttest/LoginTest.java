package com.techproed.pageobjecttest;

import com.techproed.pages.FaceLoginPage;
import com.techproed.test.FaceLogin;
import com.techproed.utilities.TestBase;
import org.junit.Test;

public class LoginTest extends TestBase {

    //FaceLoginPage faceLoginPage=new FaceLoginPage(driver);
@Test
    public void firstPageObjectTets(){
    driver.get("https://www.facebook.com/");
    FaceLoginPage faceLoginPage=new FaceLoginPage(driver);
    faceLoginPage.username.sendKeys("fakeusername");
    faceLoginPage.pass.sendKeys("password");
    faceLoginPage.login.click();




}
}
