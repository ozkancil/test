package com.techproed.smoketest;

import com.techproed.pages.FHCLoginPage1;
import com.techproed.pages.FHCReservationPage;
import com.techproed.pages.FaceLoginPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FHCReservationTest {
    FHCReservationPage fhcReservationPage=new FHCReservationPage();
    @Test
    public void RegistrationTest() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("fhc_registration_url"));


//        WebElement userNameBox=Driver.getDriver().findElement(By.id("UserName"));
//        WebElement passwordBox=Driver.getDriver().findElement(By.id("Password"));
//        WebElement loginButton=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
//
//        userNameBox.sendKeys("manager2");
//        passwordBox.sendKeys("Man1ager2!");
//        loginButton.click();


        FHCLoginPage1 fhcLoginPage1=new FHCLoginPage1();
        fhcLoginPage1.login("manager2","Man1ager2!");




        WebElement idUserSelectUser1=fhcReservationPage.idUserSelectUser;
        Select iduserSelect= new Select(idUserSelectUser1);
        iduserSelect.selectByIndex(1);
        //tables
        //row(0).cell(1)

        //selecting iduser2
        Select iduserSelect2=new Select(fhcReservationPage.idUserSelectRoom);
        iduserSelect2.selectByIndex(2);

        //entering the price
        fhcReservationPage.price.sendKeys("500");


        Thread.sleep(3000);
        //Enter start date
        fhcReservationPage.dateStart.sendKeys("04/24/2020");

        //Enter end date
        fhcReservationPage.dateEnd.sendKeys("04/25/2020");

        //entering adult amount
        fhcReservationPage.adultAmount.sendKeys("2");

        //children amount
        fhcReservationPage.childAmount.sendKeys("4");

        //contact name and surname
        fhcReservationPage.surname.sendKeys("Ozkan Cil");

        //contact phone numner
        fhcReservationPage.phone.sendKeys("7574883445");

        //entering contact email
        fhcReservationPage.email.sendKeys("ozkancil92@outofthisworld.com");

        //Notes:
        fhcReservationPage.notes.sendKeys("I want sea view only");

        //isApproved
        fhcReservationPage.isApproved.click();

        fhcReservationPage.isApproved.click();

        //submit button
        fhcReservationPage.submitButton.click();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        String message=fhcReservationPage.success_message.getText();

       // Thread.sleep(3000);
        Assert.assertTrue(message.equals("RoomReservation was inserted"));



//there are 8 locators
        //id, name, linkText, partialLinkText, tagName,xpath, css, selected
    }
}
