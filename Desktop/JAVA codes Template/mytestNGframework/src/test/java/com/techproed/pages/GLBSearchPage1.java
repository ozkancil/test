package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GLBSearchPage1 {

    public GLBSearchPage1(){
        PageFactory.initElements(Driver.getDriver(),this);//this means connect this page elements only

    }
    @FindBy(css=".btn-warning")
    public WebElement searchButton;
    @FindBy(css=".product_hover")
    public List<WebElement> productList;



}
