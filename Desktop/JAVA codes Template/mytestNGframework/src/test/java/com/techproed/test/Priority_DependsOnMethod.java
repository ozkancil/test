package com.techproed.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority_DependsOnMethod {



    //Make search() dependent on login(); Answer: we write dpende
    @Test(priority=-2)
    public void login(){
        System.out.println("This is login page");

    }
    @Test(priority=2)
    public void homePage(){
        System.out.println("This is homePage");

    }
@Test(priority=3, dependsOnMethods = "login")
    public void search(){
    System.out.println("This is search page");

    //Assert.assertTrue(false);
    Assert.assertEquals(3,5);//This method will fail
    //Since this method fails, result() "Test ignore" message will be shown


}
//To make result() depends on search(), we
@Test(priority=4, dependsOnMethods = "search")//result() is now dependent on result.
    public void result(){

    System.out.println("result page");


}

}
