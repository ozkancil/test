package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownload extends TestBase {
   /* Create a class:FileDownload
    Create two test method: isExist() and downloadTest()
    In the downloadTest() method, do the following test:
    Go to https://the-internet.herokuapp.com/download
    Download text.txt file
    Then verify if the file downloaded successfully.

    */


   //Selenium cant test windows applications
    //we need to use JAVA concept to verify if a file exist
    //
   @Test
   public void isExist(){
String currentFolder=System.getProperty("user.dir");//gives me the path of the current folder
       System.out.println("Current folder=> "+currentFolder);

String userFolder=System.getProperty("user.home");//gives us the path of the folder.
       System.out.println(userFolder);
//
String pathOfFile=userFolder+"/Downloads/logo9.png";
//string pathOfile=userFolder+/Downloads/logo9.png

       //Now I have the path of the file, I can verify if the file exist or not, using JAVA
      boolean isFileExist=Files.exists(Paths.get(pathOfFile));
       Assert.assertTrue(isFileExist);//If file exist, this will be true. if file doesn't exist this will be true. If file doesn't exist this will fail


   }
   @Test
    public void downloadTest() throws InterruptedException {
driver.get("https://the-internet.herokuapp.com/download");
//finding the element that i want to download
       WebElement file=driver.findElement(By.linkText("upload.jpg"));
file.click();
//we need to put wait for download
Thread.sleep(5000);

       //getting the user folder
String userFolder=System.getProperty("user.home");
//finding the path of the downloaded file
String pathOfFile=userFolder+"/Downloads/logo9.png";
//String pathOfFile=userFolder+"/Downloads/logo9.png";

       //checking if the file path exist or not
      boolean isDownloaded= Files.exists(Paths.get(pathOfFile));
       Assert.assertTrue(isDownloaded);



    }

}
