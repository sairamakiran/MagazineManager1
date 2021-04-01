package utilities;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
public String[][] getExcelData(String fileName, String sheetName) {
	String[][] arrayExcelData = null;
	try {
		FileInputStream fs = new FileInputStream(fileName);
		 XSSFWorkbook wb= new XSSFWorkbook(fs);
		 XSSFSheet sheet = wb.getSheetAt(1);

		 XSSFRow row = null;
		 
		int totalNoOfRows =  sheet.getPhysicalNumberOfRows();
		int totalNoOfCells = row.getPhysicalNumberOfCells();
		
		arrayExcelData = new String[totalNoOfRows-1][totalNoOfCells];
		
		for (int i= 1 ; i < totalNoOfRows; i++) {

			for (int j=0; j < totalNoOfCells; j++) {
			//	arrayExcelData[i-1][j] = sheet.getCellComment(j,i)
			}

		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
		e.printStackTrace();
	} 

	return arrayExcelData;
}
}