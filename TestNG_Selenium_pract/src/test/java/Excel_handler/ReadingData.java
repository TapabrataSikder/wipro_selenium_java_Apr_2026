package Excel_handler;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData {

	public static void main(String[] args) throws IOException {
		
		// Open excel file in reading mode
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\data.xlsx"); 

		// open workbook from the file
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//open the sheet using its name
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//open the sheet using its index
//		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalRows);  //5
		System.out.println(totalCells);  //4
		
		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
			for (int c=0; c<totalCells; c++)
			{
				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
