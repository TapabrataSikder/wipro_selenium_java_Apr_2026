package WebDriver_pack;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAutomation {

	public static void main(String[] args) {
		
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();
		
		// 1. Set up Global Waiting Guards (Implicit Wait)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Set up Explicit Wait instance (15-second timeout threshold)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		try {
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			// Text Inputs
			WebElement name = driver.findElement(By.id("name"));
			WebElement email = driver.findElement(By.id("email"));
			WebElement phone = driver.findElement(By.id("phone"));
			WebElement addr = driver.findElement(By.id("textarea"));
			
			name.sendKeys("Alice Bob");
			email.sendKeys("Alice123@gmail.com");
			phone.sendKeys("9876543210");
			addr.sendKeys("Dum Dum Road");
			
			// Gender (Radio Button)
			driver.findElement(By.id("male")).click(); 
			
			// Days (Checkboxes)
			driver.findElement(By.id("monday")).click();
			driver.findElement(By.id("wednesday")).click();
			driver.findElement(By.id("friday")).click();
			
			// Country Dropdown (Static text matching)
			WebElement country = driver.findElement(By.id("country")); 
			country.sendKeys("India");
			
			// Page Scroll 
			js.executeScript("window.scrollBy(0,900)");
			
			// Colors Dropdown
			WebElement colorsDropdown = driver.findElement(By.id("colors"));
			Select colorSelect = new Select(colorsDropdown);
			colorSelect.selectByValue("blue");
			
			// Sorted List Options - Kept your original XPaths as requested
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[7]/select/option[2]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[7]/select/option[8]")).click();
			
			// mm/dd/yyyy Datepicker
			WebElement date1 = driver.findElement(By.id("datepicker"));
			date1.sendKeys("04/15/2026");
			
			// dd/mm/yyyy Pop-up Datepicker
			WebElement date2 = driver.findElement(By.id("txtDate"));
			date2.click();
			
			// Explicitly wait for the calendar container elements to become completely visible
			WebElement monthDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-month")));
			Select selectMonth = new Select(monthDropdown);
			selectMonth.selectByVisibleText("May");
			
			WebElement yearDropdown = driver.findElement(By.className("ui-datepicker-year"));
			Select selectYear = new Select(yearDropdown);
			selectYear.selectByVisibleText("2026");
			
			// Select Day from pop-up calendar overlay
			driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[3]/td[6]/a")).click();
			
			// Page Scroll 
			js.executeScript("window.scrollBy(0,900)");
			
			// Date Range inputs (Date - 3)
			WebElement startDate = driver.findElement(By.id("start-date"));
			startDate.sendKeys("05-10-2026");
			
			WebElement endDate = driver.findElement(By.id("end-date"));
			endDate.sendKeys("05-20-2026");
			
			// Ensure submit button is clickable before interaction
			WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("submit-btn")));
			submitBtn.click();
					
			// Single File upload
			WebElement img = driver.findElement(By.id("singleFileInput"));
			img.sendKeys("C:\\Users\\TAPABRATA\\OneDrive\\Gambar\\virat.jpg");
			
			// Multiple Files upload
			WebElement imgs = driver.findElement(By.id("multipleFilesInput"));
			imgs.sendKeys("C:\\Users\\TAPABRATA\\OneDrive\\Gambar\\rupam.jpg");
			imgs.sendKeys("C:\\Users\\TAPABRATA\\OneDrive\\Gambar\\arijit.jpg");
			
			// Safe explicit hold instead of a blind Thread.sleep, waiting for files to process
			Thread.sleep(2000); 
			
			// Page Scroll UI adjustments
			js.executeScript("window.scrollBy(0,-400)");
			System.out.println("Page scrolled up.");

			js.executeScript("window.scrollTo(0, 0);");  
			System.out.println("Returned safely to the top of the page. Flow complete!");

		} catch (Exception e) {

			System.err.println("Automation pipeline run error encountered: " + e.getMessage());
			e.printStackTrace();
		} finally {

			
			driver.quit();
			System.out.println("Browser shut down successfully.");
		}
	}
}