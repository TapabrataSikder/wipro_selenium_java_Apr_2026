package WebDriver_pack;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAutomation_actions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		// Set up Global Waiting Guards (Implicit Wait)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Set up Explicit Wait instance (15-second timeout threshold)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions ac = new Actions(driver);
		
		try {
			// Navigate to application
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			System.out.println("Title: " + driver.getTitle());

			// PART 1: FORM INPUTS, DROPDOWNS & FILE UPLOADS

			WebElement name = driver.findElement(By.id("name"));
			WebElement email = driver.findElement(By.id("email"));
			WebElement phone = driver.findElement(By.id("phone"));
			WebElement addr = driver.findElement(By.id("textarea"));
			
			name.sendKeys("Alice Bob");
			email.sendKeys("Alice123@gmail.com");
			phone.sendKeys("9876543210");
			addr.sendKeys("Dum Dum Road");
			
			driver.findElement(By.id("male")).click(); // Gender Selection
			
			// Days Selection
			driver.findElement(By.id("monday")).click();
			driver.findElement(By.id("wednesday")).click();
			driver.findElement(By.id("friday")).click();
			
			WebElement country = driver.findElement(By.id("country")); 
			country.sendKeys("India");
			
			js.executeScript("window.scrollBy(0,900)");
			
			// Colors Dropdown selection
			WebElement colorsDropdown = driver.findElement(By.id("colors"));
			Select colorSelect = new Select(colorsDropdown);
			colorSelect.selectByValue("blue");
			
			// Sorted List Selections
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[7]/select/option[2]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[7]/select/option[8]")).click();
			
			// First Datepicker (mm/dd/yyyy)
			WebElement date1 = driver.findElement(By.id("datepicker"));
			date1.sendKeys("04/15/2026");
			
			// Second Datepicker Calendar Popup (dd/mm/yyyy)
			WebElement date2 = driver.findElement(By.id("txtDate"));
			date2.click();
			
			WebElement monthDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-month")));
			Select selectMonth = new Select(monthDropdown);
			selectMonth.selectByVisibleText("May");
			
			WebElement yearDropdown = driver.findElement(By.className("ui-datepicker-year"));
			Select selectYear = new Select(yearDropdown);
			selectYear.selectByVisibleText("2026");
			
			driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[3]/td[6]/a")).click(); // Choose specific calendar cell day
			
			js.executeScript("window.scrollBy(0,900)");
			
			// Date Range Fields (Date - 3)
			WebElement startDate = driver.findElement(By.id("start-date"));
			startDate.sendKeys("05-10-2026");
			
			WebElement endDate = driver.findElement(By.id("end-date"));
			endDate.sendKeys("05-20-2026");
			
			WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("submit-btn")));
			submitBtn.click();
					
			// Media File Attachments
			WebElement img = driver.findElement(By.id("singleFileInput"));
			img.sendKeys("C:\\Users\\TAPABRATA\\OneDrive\\Gambar\\virat.jpg");
			
			WebElement imgs = driver.findElement(By.id("multipleFilesInput"));
			imgs.sendKeys("C:\\Users\\TAPABRATA\\OneDrive\\Gambar\\rupam.jpg");
			imgs.sendKeys("C:\\Users\\TAPABRATA\\OneDrive\\Gambar\\arijit.jpg");
			
			Thread.sleep(2000); // Retained minimal rest pause to let background attachment processes buffer cleanly
			System.out.println("Form submission and file upload steps complete.");
			
			// RETURN TO TOP BEFORE EXECUTING ACTION CHAINS
			js.executeScript("window.scrollTo(0, 0);");  
			System.out.println("Returned safely to the top of the page. Initiating action components pipeline...");
			Thread.sleep(1500);

			// PART 2: ADVANCED ALERTS, POP-UPS, MOUSE INTERACTIONS & SLIDERS	
			// Dynamic Start Button click
			WebElement strt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='start'])")));
			strt.click();
			System.out.println("Start actions sequence processed.");
			
			// 1. Simple Browser Alert Processing
			WebElement alertBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("alertBtn")));
			alertBtn.click();
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			System.out.println("Simple Alert confirmation accepted.");
			
			// 2. Confirmation Alert Box Processing
			WebElement confirmBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmBtn")));
			confirmBtn.click();
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().dismiss();
			System.out.println("Confirmation Alert dismissed successfully.");
			
			// 3. Prompt Text Alert Processing
			WebElement promptBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("promptBtn")));
			promptBtn.click();		
			wait.until(ExpectedConditions.alertIsPresent());
			Alert promptAlert = driver.switchTo().alert();
			promptAlert.sendKeys("Welcome");
			promptAlert.accept();
			System.out.println("Prompt Input Alert text handled and submitted.");
			
			// 4. Multi-Window Handling 
						WebElement popUpBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("PopUp")));
						popUpBtn.click();	
						
						String originWindow = driver.getWindowHandle();
						

						wait.until(ExpectedConditions.numberOfWindowsToBe(1)); 
						
						Set<String> windows = driver.getWindowHandles();
						System.out.println("Total windows detected in system memory: " + windows.size());

						for(String w : windows) {
							if(!w.equals(originWindow)) {
								driver.switchTo().window(w);
								System.out.println("Closing child window handle: " + w);
								driver.close(); 
							}
						}
						
						// Safely return focus to the root container workspace 
						driver.switchTo().window(originWindow); 
						System.out.println("Pop-ups successfully cleared. Returned focus back to main window.");
						Thread.sleep(1500);
			System.out.println("Pop-up tabs safely isolated and shut down.");
			
			// Advance down the script flow area grid
			js.executeScript("window.scrollBy(0,900)");
			
			// 5. Mouse Hover (Actions class hover routines)
			WebElement hoverDropdownBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='dropbtn']")));
			WebElement laptopSubMenuOption = driver.findElement(By.xpath("//a[text()='Laptops']"));
			
			ac.moveToElement(hoverDropdownBtn).perform();
			System.out.println("Hover context applied to main product menu selection link.");
			
			ac.moveToElement(laptopSubMenuOption).perform();
			System.out.println("Hover context successfully extended over targeted 'Laptops' layer.");
			
			// 6. Action Double Click Execution
			WebElement doubleClickBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Copy Text']")));
			ac.doubleClick(doubleClickBtn).perform();
			System.out.println("Target block double-clicked cleanly.");
			
			js.executeScript("window.scrollBy(0,200)");
			
			// 7. Interactive Drag and Drop UI components
			WebElement sourceDraggable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
			WebElement targetDroppable = driver.findElement(By.id("droppable"));
			ac.dragAndDrop(sourceDraggable, targetDroppable).perform();
			System.out.println("Draggable node safely dropped into target bounding zone container box layout.");
			
			js.executeScript("window.scrollBy(0,200)");
			
			// 8. Horizontal Slider Adjustment Tracking
			WebElement horizontalSliderHandle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class, 'ui-slider-handle')])[1]")));
			ac.dragAndDropBy(horizontalSliderHandle, 50, 0).perform(); // Transform position vector coordinates to right offset margin
			System.out.println("Slider handle adjusted horizontally to the right.");
			
			js.executeScript("window.scrollBy(0,400)");
			
			// 9. Custom Combo Box Interaction Routine
			WebElement customComboBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("comboBox")));
			customComboBox.click();
			
			WebElement dropdownTargetItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='dropdown']/div[text()='Item 2']")));
			dropdownTargetItem.click();
			System.out.println("Target combo collection Item chosen successfully. Execution flow complete!");

		} catch (Exception e) {
			System.err.println("Fatal execution pipeline disruption encountered: " + e.getMessage());
			e.printStackTrace();
		} finally {
			driver.quit();
			System.out.println("WebDriver sequence terminated safely.");
		}
	}
}