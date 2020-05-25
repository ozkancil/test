package com.techproed.test;

import org.testng.annotations.*;

public class TestNGAnnotations {
//First TestNG class
    //create a method name: setUp() and use @BeforeMethod annotation
    @Ignore//this does not work on @BeforeMethod
    @BeforeMethod //in JUnit we learned some But in testNG there are more annotations.
    public void setUp(){
        //@BeforeMethod runs before each method that has @Test annotation
        System.out.println("This is before method");
    }
    @Ignore//doesnt work here here
    @BeforeClass
public void beforeClass(){//order does not matter
    System.out.println("this is before class");

}
    //
    @Test
    public void test1(){
        //@Test is used  to create test cases or test methods
        //@Test annotions help us  run the test
        System.out.println("This is test 1 method");
    }
    @Ignore
@Test
    public void test2(){
    System.out.println("Test is  @test 2 method");

}
@Ignore
@Test
    public void test3(){
    System.out.println("Test @test 3 method");


}
@Ignore
@AfterMethod
    public void afterMethod(){
    System.out.println("This is after method");
}

@AfterClass
    public void afterClass(){
        System.out.println("this is after class");
    }
}
