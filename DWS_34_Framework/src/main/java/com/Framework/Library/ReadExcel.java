package com.Framework.Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements FrameworkConstants {
	static File file=new File(excel_Path);
	static FileInputStream fis;
	static Workbook workbook;
	static Sheet sheet;
	
	public static String readStringValue(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetName);
		
		return sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
	}
	
	public static double readNumberValue(String sheetName, int rowNum, int colNum ) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetName);
		
		return sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
	}
	
	public static boolean readBooleanValue(String sheetName, int rowNum, int colNum ) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetName);
		
		return sheet.getRow(rowNum).getCell(colNum).getBooleanCellValue();
		}
	
	public static Date readDateValue(String sheetName, int rowNum, int colNum ) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetName);
		
		return sheet.getRow(rowNum).getCell(colNum).getDateCellValue();
	}
	
	public static Object[][] multipleData(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetName);
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		int colCount=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowCount-1][colCount];
		for(int i=1; i<rowCount; i++){
			for(int j=0; j<colCount; j++){
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
}
