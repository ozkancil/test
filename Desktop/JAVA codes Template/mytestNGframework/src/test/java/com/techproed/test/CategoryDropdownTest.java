package com.techproed.test;

import com.techproed.pages.GlbHomePage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoryDropdownTest {
GlbHomePage obj=new GlbHomePage();
@Test
    public void hasCategory(){
    Driver.getDriver().get(ConfigReader.getProperty("glb_login_url"));
    Select options=new Select(obj.glbTraderHomePageDropDown);
    System.out.println(options.getOptions());

    boolean flag;//flag is false by default
    for(WebElement e: options.getOptions() ){
        if(e.getText().equals("Furniture")){

            System.out.println("dropdown has furniture");
            flag=true;
            break;


        }

    }
   //Assert.assertTrue(flag);

}
}
