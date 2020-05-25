package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class HotelRoom extends TestBase {

    @Test
    public void roomcreation() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver,10);
        driver.get("http://www.fhctrip.com/admin/HotelRoomAdmin");
        //String userName="manager2";  String password="Man1ager2!";

        WebElement username=driver.findElement(By.id("UserName"));
        WebElement password=driver.findElement(By.id("Password"));
        username.sendKeys("manager2");
        password.sendKeys("Man1ager2!");


        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        //Add hotel button
        WebElement addHotel=driver.findElement(By.xpath("//span[@class='hidden-480']"));
        addHotel.click();

        //Select Hotel
        WebElement selectHotel=driver.findElement(By.id("IDHotel"));
        Select select=new Select(selectHotel);
        select.selectByIndex(3);
        WebElement thirdOption=select.getFirstSelectedOption();
        thirdOption.click();

        //enter code now
        WebElement code=driver.findElement(By.id("Code"));
        code.sendKeys("2030");

        //enter name
        WebElement name=driver.findElement(By.id("Name"));
        name.sendKeys("Open Breeze");

        //Enter description
        WebElement descriptionBox=driver.findElement(By.xpath("//textarea[@tabindex='0']"));
        descriptionBox.sendKeys("The best breezy room ever");



        //price
        WebElement nDrop=driver.findElement(By.xpath("//li[@data-id='700']"));
        WebElement targetElementBoxName=driver.findElement(By.id("Price"));
        //we can drag and drop using Actions because its a mouse action. we drag and drop.
        Actions actions=new Actions(driver);
        //action being implemented. Picking and dropping done by actions.dragAndDrop(source,toTarget);
         Thread.sleep(3000);
        //WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-id='700']")));
       // WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(actions.dragAndDrop(nDrop,targetElementBoxName).build().perform());
        actions.dragAndDrop(nDrop,targetElementBoxName).build().perform();
        //Wait until WebElement is dropped. Now we need to do put a time on it.

        //room type
        WebElement roomNumber=driver.findElement(By.id("IDGroupRoomType"));
        Select roomNum=new Select(roomNumber);
        roomNum.selectByIndex(9);
        WebElement eightOption=roomNum.getFirstSelectedOption();
        eightOption.click();



        //max number of people
        WebElement maxNumOfPeople=driver.findElement(By.id("MaxAdultCount"));
        maxNumOfPeople.sendKeys("1");
        WebElement maxChild=driver.findElement(By.id("MaxChildCount"));
        maxChild.sendKeys("0");

//checkbox
        WebElement checkBox=driver.findElement(By.id("IsAvailable"));
        actions.contextClick(checkBox).perform();

        //save button
        WebElement saveButton=driver.findElement(By.id("btnSubmit"));
        saveButton.click();

        //Verifying text is equal to "HotelRoom was inserted successfully"
        //Thread.sleep(3000);
       boolean text= wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='bootbox-body']") ,"HotelRoom was inserted successfully"));
        //WebElement text=driver.findElement(By.xpath("//div[@class='bootbox-body']"));
//         String actual=text.getText();
//         String expected="HotelRoom was inserted successfully";
        //we have wait issue
Assert.assertTrue(text);
        //Assert.assertEquals(actual,expected);

//driver.switchTo().alert().accept();
//press ok button
        WebElement okButton=driver.findElement(By.xpath("//button[@data-bb-handler='ok']"));
        okButton.click();

        //click on hotel rooms and verify if we added. cant use link text, because hotel has spaces that are called white spaces.
        //we can use partail link text. it skips the white spaces


        WebElement hotelrooms=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Hotel Rooms"))));
        Thread.sleep(3000);
        actions.doubleClick(hotelrooms).perform();
        hotelrooms.click();

    WebElement listOfHotelrooms= driver.findElement(By.xpath("//*[.='List Of Hotelroms])[2]"));
Assert.assertTrue(listOfHotelrooms.isDisplayed());


    }



}
