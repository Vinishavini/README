package com.tripillar.filehandling.excel;

import org.apache.poi.ss.usermodel.*;
        import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    public static void main(String[] args) {
        String fileName = "example.xlsx";
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("SampleSheet");

        // Creating a row and adding data
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("Name");
        row.createCell(1).setCellValue("Age");

        Row row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("John Doe");
        row1.createCell(1).setCellValue(25);

        // Writing to file
        try (FileOutputStream fileOut = new FileOutputStream(fileName)) {
            workbook.write(fileOut);
            System.out.println("Excel file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}