package com.techproed.pageobjecttest;

import com.techproed.pages.FaceLogInPage1;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FaceLogintest1 extends TestBase {
    //FaceLogInPage1 faceLogInPage1=new FaceLogInPage1(driver);//good to make class level so we do not use it again. waste of time and memory

    @Test
    public void firstPageObjectTest(){
        driver.get("https://www.facebook.com/");
        FaceLogInPage1 faceLogInPage1=new FaceLogInPage1(driver);
        faceLogInPage1.email.sendKeys("fakeusername");
        faceLogInPage1.password.sendKeys("fakepass");
        faceLogInPage1.signIn.click();

        //NullPointerException==? what is it? if ur locater is correct u still get nullpointerexception
        //it means initializing issue. driver is not initialized properly.
        //

    }



}
