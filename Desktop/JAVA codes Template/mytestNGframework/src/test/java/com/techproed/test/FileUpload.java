package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload  extends TestBase{


        @Test
        public void uploadTest(){
            driver.get("https://the-internet.herokuapp.com/upload");
//            WebElement upload = driver.findElement(By.id("file-upload"));
//            upload.sendKeys("/Users/fatihuludag/Downloads/data.csv");
//            driver.findElement(By.id("file-submit")).click();
//            Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(), "File Uploaded!");

            WebElement chooseFile=driver.findElement(By.xpath("//*[@id='file-upload']"));
            //chooseFile.click();/didnt work
            //find the path of the file you want to upload with the name
            //String filepath="/Users/ozkan/Downloads/upload.jpg";
            //now we are sending the file path to the choosefile button
            chooseFile.sendKeys("/Users/ozkan/Downloads/upload.jpg");

            WebElement fileSubmit=driver.findElement(By.id("file-submit"));
            fileSubmit.click();

            WebElement fileUploaded=driver.findElement(By.xpath("//h3"));
            Assert.assertTrue(fileUploaded.isDisplayed());

            Assert.assertTrue(fileUploaded.equals("File Uploaded!"));
        }
    }

