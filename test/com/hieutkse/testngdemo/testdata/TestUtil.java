/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutkse.testngdemo.testdata;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author Admin
 */
public class TestUtil {
    
    static XSSFWorkbook book;
    static XSSFSheet sheet;
    
    public static String TESTDATA_SHEET_PATH = "D:\\hieutk-se\\FPT\\"
            + "Summer2021\\SWT301\\CODE\\TestNGDemo\\test\\com\\"
            + "hieutkse\\testngdemo\\testdata\\Testdata.xlsx";
    public static Object[][] getTestData() throws Exception{
        
        FileInputStream file = new FileInputStream(TESTDATA_SHEET_PATH);

        book = new XSSFWorkbook(file);
        sheet = book.getSheetAt(0);
        
        
        
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        System.out.println("Test:"+sheet.getLastRowNum() + "----" + sheet.getRow(0).getLastCellNum());
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
            }
        }
        return data;
    }
}
