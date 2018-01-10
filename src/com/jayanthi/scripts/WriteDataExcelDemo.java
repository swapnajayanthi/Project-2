package com.jayanthi.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataExcelDemo {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("D:\\abc.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet1= wb.getSheet("sheet1");
		Row row0 = sheet1.createRow(0);
		Cell cell00 = row0.createCell(0);
		cell00.setCellValue("welcome to ramesh soft");
		row0.createCell(1).setCellValue("masters in selenium");
		Row row1 = sheet1.createRow(1);
		Cell cell10 = row1.createCell(0);
		cell10.setCellValue("Java with selenium");
		FileOutputStream fos = new FileOutputStream("D:\\abc.xlsx");
		wb.write(fos);
	}

}
