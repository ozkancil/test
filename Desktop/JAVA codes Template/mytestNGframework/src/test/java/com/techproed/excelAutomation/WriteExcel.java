package com.techproed.excelAutomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;
//import org.junit.Test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    @Test
    public void WriteExcel() throws IOException {
    String path="./src/test/java/com/techproed/test/resources/Capitals (2).xlsx";
    FileInputStream file=new FileInputStream(path);//opening the file

        Workbook workbook= WorkbookFactory.create(file);//opening the workbook
        Sheet sheet= workbook.getSheetAt(0);//getting the first sheet
        Row row=sheet.getRow(0);//getting the first row
        //Cell cell=row.getCell(3);//getting column /cell
        Cell cell=row.createCell(3);//creating a cell
        cell.setCellValue("POPULATION");
        row.removeCell(row.getCell(4));


    //Opening a file to send data to the created cell

        FileOutputStream fileOutputStream=new FileOutputStream(path);

        //we are creating the cell on the second row and 4th cell, setting the value at 200000
        workbook.getSheetAt(0).getRow(1).createCell(3).setCellValue("200000");
        workbook.write(fileOutputStream);//writing on the cell and saving the file/workbook

        fileOutputStream.close();
        file.close();
        workbook.close();








    }
}
