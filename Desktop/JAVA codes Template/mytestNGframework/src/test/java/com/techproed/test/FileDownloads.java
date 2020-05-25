package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class FileDownloads extends TestBase {

    @Test
    public void isExist(){
//to get the path of the current folder
        String currentFolder=System.getProperty("user.dir");
        System.out.println("current folder"+currentFolder);

        String userFolder=System.getProperty("user.home");
        System.out.println("User folder"+userFolder);

        String pathOfFile=userFolder+"/Downloads/logo9.png";

       boolean isFileExist= Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isFileExist);
    }@Test
    public void downloadTest(){

        driver.get("https://the-internet.herokuapp.com/download");
        WebElement download=driver.findElement(By.linkText("upload.jpg"));
        download.click();

        //Thread.sleep(5000);
        String userFolder=System.getProperty("user.home");
        String pathOfFile=userFolder+"/Downloads/upload.jpg";
        boolean isDownloaded=Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isDownloaded);


    }

}
