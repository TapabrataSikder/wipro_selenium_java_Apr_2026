package WebDriver_pack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
//		Web element using id
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Alice");
		
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("Boss");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("Abc123@gmail.com");	
		
//		Accessing radio btns
		driver.findElement(By.id("gender-radio-1")).click(); 
		
		WebElement mob = driver.findElement(By.id("userNumber"));
		mob.sendKeys("9876543210");	
				
//		Selecting Date from date dropdown
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement yr = driver.findElement(By.className("react-datepicker__year-select"));
		WebElement mt = driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
	
		// 2. select/de-select options 
		Select sel = new Select(yr);
		sel.selectByIndex(100);
		Select sel1=new Select(mt);
		sel1.selectByValue("4");

		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/select/option[118]")).click();
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[1]/div/div[1]/select/option[12]")).click();
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[4]/div[2]")).click();

		Thread.sleep(2000);
		
		// Page Scroll using Js
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
				
		Thread.sleep(2000);
		
		// enter texts in the list input field (Subject)
		WebElement sub = driver.findElement(By.id("subjectsInput"));
		sub.click();
		sub.sendKeys("Comp");
		sub.sendKeys(Keys.ARROW_DOWN);
		sub.sendKeys(Keys.ENTER);
		
		sub.sendKeys("Eco");
		sub.sendKeys(Keys.ARROW_DOWN);
		sub.sendKeys(Keys.ENTER);		
		
//		Access multi-select checkbox
		driver.findElement(By.id("hobbies-checkbox-1")).click();
		driver.findElement(By.id("hobbies-checkbox-3")).click();

		
		// Upload files
		WebElement img=driver.findElement(By.id("uploadPicture"));
		img.sendKeys("C:\\Users\\TAPABRATA\\OneDrive\\Gambar\\virat.jpg");
		
		WebElement adr = driver.findElement(By.id("currentAddress"));
		adr.sendKeys("Kolkata,\nBengal");
		
		WebElement state = driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("Haryana");
		state.sendKeys(Keys.ENTER);
		
		WebElement city = driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Karnal");
		city.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
		
//		File handling - taking screenshot
		TakesScreenshot tc = (TakesScreenshot)driver;
		File sc=tc.getScreenshotAs(OutputType.FILE);
		File dest = new File("DemoQAform.png");
		FileHandler.copy(sc,  dest);
//		
		Thread.sleep(5000);
		driver.quit();		
	}

}
