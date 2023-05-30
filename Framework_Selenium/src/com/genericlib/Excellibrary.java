package com.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellibrary {
     String filepath="C:\\Users\\SUDHIR\\Desktop\\TestScanrio_01.xlsx";
     public String ReadExceldata(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, IOException {
    	 FileInputStream fis=new FileInputStream(filepath);
    	Workbook wb=WorkbookFactory.create(fis);
    	Sheet sh=wb.getSheet(sheetname);
    	Row rw=sh.getRow(rownum);
    	String data=rw.getCell(colnum).getStringCellValue();
    	return data; 
    	
     }
public int getnumberofcount(String sheetname) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(filepath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetname);
	int rowcount=sh.getLastRowNum();
	return rowcount;
}
@SuppressWarnings("deprecation")
public void writedatainexcel(String sheetname,int rownum,int colnum,String data) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(filepath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetname);
	Row rw=sh.getRow(rownum);
	Cell cell=rw.createCell(colnum);
	cell.setCellType(CellType.STRING);
	FileOutputStream fos=new FileOutputStream(filepath);
	cell.setCellValue(data);
	wb.write(fos);
	wb.close();
}
}
