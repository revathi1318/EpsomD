package com.EpsomD.ExcelFileLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.EpsomD.GenericLibrary.FrameworkConstant;

public class ReadExcelFile implements FrameworkConstant {

	public FileInputStream fis=null;
	public  FileOutputStream fos=null;
	public  Workbook wb =null;
	public  String readSingleData(String sheetname, int row, int cell) {
	//1.Convert the Physical File into Java Readable file
	try {
		fis=  new FileInputStream(excelpath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//2.Create the WorkBook using workBook factory
	try {
		wb = WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//3.using workbook reference get the sheet control
	String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return data;
	//4. using sheet get the Row control
	
	
	//5.Using Row get the Cell/column control
	//6. using cell/column get the cell Data
		
	}
	public void readMultipleData(String sheetname) {
		
		//1.Convert the Physical File into Java Readable file
		try {
			fis=  new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2.Create the WorkBook using workBook factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3.using workbook reference get the sheet control
		String data = wb.getSheet(sheetname).getRow(0).getCell(0).getStringCellValue();
		
		//4. using sheet get the Row control
		
		
		//5.Using Row get the Cell/column control
		int rowcount = wb.getSheet(sheetname).getLastRowNum();
		for(int i=0;i<rowcount;i++) {
		 data =wb.getSheet(sheetname).getRow(0).getCell(0).getStringCellValue();
		}
		
		//6. using cell/column get the cell Data
		
		
			
		}
	public void writeData(int row, int cell, String sheetname, String data) {
		//1.Convert the Physical File into Java Readable file
		try {
			fis=  new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2.Create the WorkBook using workBook factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3.using cell/column set Data
		 wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(data);
		 
		//4. using sheet get the Row control
		
		
		//5.Using Row create the Cell/column 
		//6. Converting java readable file into physical file
		 try {
			new FileOutputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		//7.Write the data
		 try {
			wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 //8.Close the workbook
		 try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
