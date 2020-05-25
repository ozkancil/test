package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelRoomCreation extends TestBase {
    /*
    Username=>manager2
Password=>Man1ager2!
Create a class: HotelRoomCreation
Create a Method: RoomCreateTest()
When user goes to http://www.fhctrip.com/admin/HotelRoomAdmin
And fills out all of the required fields
Then click on save button
And Verify the text message on the pop up “HotelRoom was inserted successfully”
     */
    @Test
    public void RoomCreateTest() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver,10);
        driver.get("http://www.fhctrip.com/admin/HotelRoomAdmin");
        WebElement userNameBox=driver.findElement(By.id("UserName"));
        WebElement passwordBox=driver.findElement(By.id("Password"));
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        userNameBox.sendKeys("manager2");
        passwordBox.sendKeys("Man1ager2!");
        loginButton.click();
        WebElement addHotelRoomButton=driver.findElement(By.xpath("//span[@class='hidden-480']"));
        addHotelRoomButton.click();
        //Verify if Create Hotel Room Page is displayed
        WebElement createHotelRoomText=driver.findElement(By.xpath("//div[@class='caption']"));
        Assert.assertTrue(createHotelRoomText.isDisplayed());
        //IdHotel
        WebElement idHotel=driver.findElement(By.id("IDHotel"));
        Select select=new Select(idHotel);
        select.selectByIndex(1);//selecting the first dropdown option
      //  select.selectByVisibleText("Hilton Hotel");
        //Code
        driver.findElement(By.id("Code")).sendKeys("Royal");
        //Name
        driver.findElement(By.id("Name")).sendKeys("347");
        //Description
        driver.findElement(By.xpath("//div[@id='cke_1_contents']//textarea")).sendKeys("This room is only for Royal families");
        //Price
        WebElement source = driver.findElement(By.xpath("//li[@data-id='700']"));
        WebElement target=driver.findElement(By.name("Price"));
        //We can drag and drop using Actions class
        //Drag and Drop takes twp parameter, first one is Source, second one is Target
        Thread.sleep(3000);//Since there is a Sycnronization issue, We have to use wait
        //Thread.sleep works, but not recommended.
        //implicitly wait is not also working properly
        //HOMEWORK: Solve This issue using Explicit wait. Do not use Thread.sleep
        actions.dragAndDrop(source,target).perform();
        //room type
        WebElement roomType=driver.findElement(By.id("IDGroupRoomType"));
        Select options=new Select(roomType);
        options.selectByIndex(6);
        //max adult count
        driver.findElement(By.id("MaxAdultCount")).sendKeys("2");
        //max children count
        driver.findElement(By.id("MaxChildCount")).sendKeys("5");
        //click on save button
        driver.findElement(By.id("btnSubmit")).click();
        //Verifying text is equal to HotelRoom was inserted successfully
        //Thread.sleep(5000);//This is not good way to solve the issue.
        //Implicit wait also didn't work. I alrady have 10 seconds
        //So I will try explicit wait fir this condition
        boolean isTrue=wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='bootbox-body']"),"HotelRoom was inserted successfully"));
        Assert.assertTrue(isTrue);
        //WebElement popUpMessage=driver.findElement(By.xpath("//div[@class='bootbox-body']"));
        //String actualTextMessage=popUpMessage.getText();
        //String expectedTestMessage="HotelRoom was inserted successfully";
        //Assert.assertEquals(actualTextMessage,expectedTestMessage);

        WebElement okButtton=driver.findElement(By.xpath("(//button[@type='button'])[6]"));
        okButtton.click();

        Thread.sleep(3000);
        WebElement hotelRoom=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText("Hotel Rooms"))));

        actions.doubleClick(hotelRoom).perform();
        hotelRoom.click();


        WebElement listOfRooms=driver.findElement(By.xpath("//*[.='list Of Hotelrooms']"));
        Assert.assertTrue(listOfRooms.isDisplayed());

        String myHotelName=driver.findElement(By.xpath("//tr[10]//td[2]")).getText();
        Assert.assertTrue(myHotelName.equals("Hilton Hotel-1"));


}

}
