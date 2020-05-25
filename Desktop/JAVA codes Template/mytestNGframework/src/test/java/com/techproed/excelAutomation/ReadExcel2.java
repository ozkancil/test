package com.techproed.excelAutomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadExcel2 {

    @Test
    public void readExcelFile() throws IOException {
        String path="/Users/ozkan/Desktop/Capitals(3).xlsx";

        //open a file. How do we open a file?
        FileInputStream fileInputStream=new FileInputStream(path);
        //what do we need to do first?
        //open workbook file input stream
        Workbook workbook=WorkbookFactory.create(fileInputStream);

        //go to first worksheet.index of 0
        Sheet sheet=workbook.getSheetAt(0);
        //go to first row index of 0
        Row row=sheet.getRow(0);
        //now we can read the cell(test data)
        Cell cell1=row.getCell(0);
        System.out.println(cell1);

        System.out.println(row.getCell(1));

        //now getting the second row
        Row row1=sheet.getRow(1);
        Cell cell2=row1.getCell(0);//getting the first cell
        System.out.println(cell2);

        //we can chain the methods
//need to add toString if u turn in to a string
        String france=workbook.getSheetAt(0).getRow(1).getCell(0).toString();

        System.out.println("Printing the string"+france.toUpperCase());

        //how do you get the las row number?
        int rowCount=sheet.getLastRowNum();
        System.out.println(rowCount);

        //how do you get the number of row that is used
        int numberOfPhsicalRows=sheet.getPhysicalNumberOfRows();

        Map<String,String> capital=new HashMap<>();
        int countryColumn=0;
        int capitalColumn=1;

        for (int rowNumber=1; rowNumber<=rowCount;rowNumber++){
            String country=sheet.getRow(rowNumber).getCell(countryColumn).toString();
            System.out.println(country);
            String capitals=sheet.getRow(rowNumber).getCell(capitalColumn).toString();
            System.out.println(capitals);
         }

        System.out.println(capital);


    }


}
