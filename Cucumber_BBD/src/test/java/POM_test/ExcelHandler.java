package POM_test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandler {
	public static String getCellData(int rowNum, int colNum) throws IOException {
	
//	FileInputStream file = new FileInputStream(
//			System.getProperty("user.dir")+"\\TestData\\LoginData.xlsx");
		
		// Replace the hardcoded backslashes with forward slashes
		FileInputStream file = new FileInputStream(
		        System.getProperty("user.dir") + "/TestData/LoginData.xlsx");
	
	XSSFWorkbook workbook =new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	XSSFRow row = sheet.getRow(rowNum);
    XSSFCell cell = row.getCell(colNum);
	
	int totalRows=sheet.getLastRowNum();
	int totalCells=sheet.getRow(1).getLastCellNum();
	
	DataFormatter formatter = new DataFormatter();
    String cellValue = formatter.formatCellValue(cell);
    
    workbook.close();
    file.close();
    
    return cellValue;
	
	
	}
}
