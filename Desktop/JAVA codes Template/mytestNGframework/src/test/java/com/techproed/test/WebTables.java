package com.techproed.test;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables extends TestBase {



    public void login() {


        driver.get("http://www.fhctrip.com/admin/HotelRoomAdmin");
        WebElement userNameBox = driver.findElement(By.id("UserName"));
        WebElement passwordBox = driver.findElement(By.id("Password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        userNameBox.sendKeys("manager2");
        passwordBox.sendKeys("Man1ager2!");
        loginButton.click();


    }
    @Test
    public void entireTable(){
        login();
        WebElement tBody=driver.findElement(By.xpath("//tbody"));
        System.out.println(tBody.getText());

        //Find the total number of cells
        List<WebElement>table=driver.findElements(By.xpath("//tbody//td"));
        System.out.println(table.size());//size of the table

        System.out.println(driver.findElements(By.tagName("//tbody//td")).size());//we can use tag name to find the data

        //print headers
        System.out.println(driver.findElements(By.tagName("th")).size());

List<WebElement>allHeader=driver.findElements(By.tagName("th"));
for (WebElement header:allHeader){
    System.out.println(header.getText());



}


    }
    @Test
    public void printRows(){
login();
        //find the total number of rows in the table body
        System.out.println(driver.findElements(By.xpath("//tbody//tr")));
//print the rows, elements in side the rows
        List<WebElement>allRows=driver.findElements(By.xpath("//tbody//tr"));
        for (WebElement row:allRows){
            System.out.println(row.getText());
        }

//print fourth row. So we would do //tr[4] for the fourth row, and //td for each cell thats at 4th row. //tr[4]//td
List<WebElement>elements4th=driver.findElements(By.xpath("//tr[4]//td"));
        for (WebElement elments:elements4th){
            System.out.println(elments.getText());
        }






    }@Test
    public void printCells(){
        //print number of cells
        login();
        System.out.println("there are "+driver.findElements(By.xpath("tbody//td"))+" cells");//td is the name of the cell

        List<WebElement>allCells=driver.findElements(By.xpath("tbody//td"));
        for (WebElement cell:allCells){
            System.out.println(cell.getText());
        }

    }
    @Test
    public void printColumns(){
        login();
        //print number of columns
        System.out.println("There are "+driver.findElements(By.xpath("//tr[3]//td")).size()+" column in the table body");
List<WebElement> allColumns=driver.findElements(By.xpath("//tr[3]//td"));
for (WebElement columns:allColumns){
    System.out.println(columns.getText());
}

//print price on fifth column
        List<WebElement> price=driver.findElements(By.xpath("//tbody//td[5]"));
for (WebElement elements:price){
    System.out.println(elements.getText());

        }





    }
    public void printData(int row, int column){

        String xpath="//tbody//tr["+row+"]//td["+column+"]";
        //String xpath="//tbody//tr["+row+"]//td["+column+"]";
WebElement data=driver.findElement(By.xpath(xpath));
//we are printing the data
        System.out.println(data);

    }@Test
    public void printDataTest(){
        login();
printData(3,4);
printData(5,2);
printData(8,6 );


driver.quit();

    }

}