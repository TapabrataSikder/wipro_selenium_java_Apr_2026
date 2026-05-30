package Testing_package;

import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// create file(write file)
// sheet
// row
// column
public class Excel_Write_Data {

    // Global variables to keep the workbook and row position tracked in memory
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    int currentRow = 0; 

    // 1. Initialize the new file structure in memory before data starts coming in
    @BeforeClass
    public void setupNewExcel() {
        workbook = new XSSFWorkbook(); // Creates a blank workbook in memory
        sheet = workbook.createSheet("Sheet1"); // Creates a new sheet named Sheet1
        
        // Optional: Create a header row (Row 0)
        XSSFRow headerRow = sheet.createRow(currentRow++);
        headerRow.createCell(0).setCellValue("Username");
        headerRow.createCell(1).setCellValue("Password");
        
        System.out.println("Blank Excel structure and headers initialized.");
    }

    // 2. DataProvider Method (Supplies the data rows to be written)
    @DataProvider(name = "writeLoginData") 
    public Object[][] getWriteData() { 
        // Returning a basic 2D array with test data
        return new Object[][] {
            {"User1", "pass1"},
            {"User2",  "pass2"},
            {"User3", "pass3"}
        };
    }
 
    // 3. Test Method (Receives rows from DataProvider and writes them sequentially)
    @Test(dataProvider = "writeLoginData") 
    public void writeTest(String user1, String pass1) {
        // Create a new row at the current tracking index
        XSSFRow row = sheet.createRow(currentRow);
        
        // Create cells and write data into them
        XSSFCell cell1 = row.createCell(0);
        cell1.setCellValue(user1);
        
        XSSFCell cell2 = row.createCell(1);
        cell2.setCellValue(pass1);
        
        System.out.println("Writing row " + currentRow + " -> Username: " + user1 + " | Password: " + pass1);
        
        // Increment the index so the next DataProvider row moves down to the next row
        currentRow++;
    }
    
    // 4. Save and close the file after all data rows are written
    @AfterClass
    public void saveAndCloseExcel() throws Exception {
        // Define the destination path for your brand new file
        String filepath = "C:\\Users\\TAPABRATA\\Desktop\\SDET JAVA\\TestData\\NewLoginData.xlsx";
        
        // FileOutputStream physically creates the blank file on your storage disk
        FileOutputStream fileOut = new FileOutputStream(filepath);
        
        // Push all accumulated memory rows into the physical file layout
        workbook.write(fileOut);
        
        // Clean up and close resources safely
        workbook.close();
        fileOut.close();
        
        System.out.println("SUCCESS: Brand new Excel file created and saved to disk!");
    }
}