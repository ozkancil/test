package com.techproed.smoketest;

import com.techproed.pages.GLBSearchPage;
import com.techproed.pages.GLBSearchPage1;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GLBSearchTest1 {

    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("glb_url"));
        GLBSearchPage1 glbSearchPage1=new GLBSearchPage1();
        glbSearchPage1.searchButton.click();

        boolean hasCamera=false;
        for (WebElement w:glbSearchPage1.productList){
            System.out.println(w.getText());
            if(w.getText().contains("Camera")){
                hasCamera=true;
                break;
            }

        }
        System.out.println(glbSearchPage1.productList.size());
        Assert.assertTrue(hasCamera);
    }

}
