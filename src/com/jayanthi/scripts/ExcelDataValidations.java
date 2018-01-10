package com.jayanthi.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelDataValidations {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("D:\\abc.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet1 = wb.getSheet("sheet1");
		for(int i=0; i<=sheet1.getLastRowNum(); i++)
		{
			Row row = sheet1.getRow(i);
			for(int j=0; j<=row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);
				if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
				{
					double d = cell.getNumericCellValue();
					System.out.println(d);
				}
				else if(cell.getCellType()==cell.CELL_TYPE_STRING)
				{
					String s = cell.getStringCellValue();
					System.out.println(s);
				}
				else
				{
					boolean b = cell.getBooleanCellValue();
					System.out.println(b);
					
				}
			}
		
			
			
		}
	}

}
