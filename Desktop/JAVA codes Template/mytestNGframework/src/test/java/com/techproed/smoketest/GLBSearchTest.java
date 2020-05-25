package com.techproed.smoketest;

import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.Test;

public class GLBSearchTest {

    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("glb_url"));
        
    }

}
