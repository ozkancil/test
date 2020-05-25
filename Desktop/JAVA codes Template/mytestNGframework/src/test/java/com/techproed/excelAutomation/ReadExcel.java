package com.techproed.excelAutomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadExcel {

    @Test
    public void readExcelFile() throws IOException {

        String path="/Users/ozkan/Desktop/Capitals(1).xlsx";

        //open a file

        FileInputStream fileImputeStream= new FileInputStream(path);

        //we need to open the work book using fileinputstream
        Workbook workbook=WorkbookFactory.create(fileImputeStream);

        //go to the first worksheet.(index of 0)
        Sheet sheet=workbook.getSheetAt(0);
        //Go to the first row (index of 0)
        Row row=sheet.getRow(0);
        //now get the cell
        Cell cell1=row.getCell(0);
        System.out.println("PRINTING THE FIRST CELL: "+cell1);

        System.out.println("PRINTING THE SECOND CELL: "+row.getCell(1));

        //printing the second row and first cell

        Row row1=sheet.getRow(1); //getting the second row
        Cell cell2=row1.getCell(0);//getting the first cell
        System.out.println(cell2);

        //WE CAN CHAIN THE METHODS TOGHETER

        String france=workbook.getSheetAt(0).getRow(1).getCell(0).toString();
        System.out.println("Printing the string "+france.toUpperCase());
        //System.out.println(workbook.getSheetAt(0).getRow(1).getCell(0));

        //HOW DO YOU GET THE LAST ROW NUMBER?
       int rowCount=sheet.getLastRowNum();//The last number of row that is being used
        System.out.println(rowCount);

        //how do you get the number of row that is used?
        int numberOfPhysicalRows=sheet.getPhysicalNumberOfRows();
        System.out.println(numberOfPhysicalRows);

        //HashMap
        Map<String,String> capital=new HashMap<>();
        int countryColumn=0;
        int capitalColumn=1;

        for (int rowNumber = 1; rowNumber<=rowCount; rowNumber++ ){

            String country=sheet.getRow(rowNumber).getCell(countryColumn).toString();
            System.out.println(country);
            String capitals=sheet.getRow(rowNumber).getCell((capitalColumn)).toString();
            System.out.println(capitals);

            capital.put(country,capitals);

        }
        System.out.println(capital);






        }




    }

