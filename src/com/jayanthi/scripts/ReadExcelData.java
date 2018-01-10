package com.jayanthi.scripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("D:\\abc.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet1 = wb.getSheet("sheet1");
		Row row0 = sheet1.getRow(0);
		Cell cell00 = row0.getCell(0);
		String cellValue00 = cell00.getStringCellValue();
		System.out.println("cell00 value is:"+cellValue00);
		Cell cell01 = row0.getCell(1);
		String cellValue01 = cell01.getStringCellValue();
		System.out.println("cell01 value is:"+cellValue01);
		Row row1 = sheet1.getRow(1);
		String cellValue10 = row1.getCell(0).getStringCellValue();
		System.out.println("cell10 value is:"+cellValue10);
		
	}

}
