package Testing_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Tira_beauty_groups {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	// 1. DATA PROVIDERS
	@DataProvider(name="searchData")
	public Object[][] searchDP() {
		return new Object[][] {
			{"Men's facewash"}
		};
	}
	
	@DataProvider(name="loginData")
	public Object[][] loginDP() {
		return new Object[][] {
			{"7439073905"}
		};
	}
	
//	Before Test
  @BeforeTest(alwaysRun=true)
   public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  driver.get("https://www.tirabeauty.com/");
   }

  @Test(priority=1, groups="smoke", dataProvider="searchData")
  public void multiple_search(String searchKey) throws InterruptedException {
	  
	  //  Validate title of the page
	  String title = driver.getTitle();
	  Assert.assertTrue(title.contains("Tira"), "Title Mismatch!");
	  
	  WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
			     By.id("search")));
	  searchInput.click();
	  searchInput.sendKeys(searchKey);
	  Thread.sleep(2000);
	  searchInput.sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  
  }
  
  @Test(priority=2, dependsOnMethods = {"multiple_search"}, groups="smoke")
  public void product_details() throws InterruptedException {
	  WebElement opnBrnd = wait.until(ExpectedConditions.elementToBeClickable(
			  By.xpath("//div[@id='Brand']//button")));
	  opnBrnd.click();
	  System.out.println("Brand dropdown accordion opened successfully.");

	  Thread.sleep(1500);

	  WebElement selBrnd = wait.until(ExpectedConditions.elementToBeClickable(
			  By.xpath("//div[text()='Nivea']")));
	  selBrnd.click();
	  System.out.println("Nivea filter applied successfully!");
	  Thread.sleep(2000);
	  
	  WebElement opnType = wait.until(ExpectedConditions.elementToBeClickable(
			  By.xpath("//div[@id='Skin Type']//button")));
	  opnType.click();
	  System.out.println("Skin Type dropdown accordion opened successfully.");
	  
	  WebElement skin = wait.until(ExpectedConditions.elementToBeClickable(
			  By.xpath("//div[text()='Oily']")));
	  skin.click();
	  System.out.println("Oily filter applied successfully!");
	  Thread.sleep(2000);
	  
	  // Basic Assert: Confirm at least one active filter element exists
	  List<WebElement> filters = driver.findElements(
			  By.xpath("//div[@class='selectedItem--qwZEQ']"));
	  Assert.assertFalse(filters.isEmpty(), "Filters not applied!");
  }
  
  @Test(priority=3, dependsOnMethods = {"product_details"}, groups="regression")
  public void add_to_cart() throws InterruptedException {
	  WebElement addProd = wait.until(ExpectedConditions.elementToBeClickable(
			  By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/div[1]/div[1]/picture[1]/img[1]")));
	  addProd.click();
	  System.out.println("Bagegd successfully.");
	  Thread.sleep(2000);
	  
	  String originalWindow = driver.getWindowHandle();

	  wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	  for (String windowHandle : driver.getWindowHandles()) {
		  if (!originalWindow.contentEquals(windowHandle)) {
			  driver.switchTo().window(windowHandle);
			  break;
		  }
	  }
	  System.out.println("Switched focus to the product details tab successfully.");
	  
	  // Window switch validation
	  Assert.assertNotEquals(driver.getWindowHandle(), originalWindow, "Failed to switch window!");
	  
	  WebElement addToBag = wait.until(ExpectedConditions.refreshed(
			  ExpectedConditions.elementToBeClickable(By.xpath("//button[./span[text()='Add To Bag']]"))));
	  addToBag.click();
	  System.out.println("Product added to bag successfully!");
	  Thread.sleep(2000);
	  
	  WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(
			  By.cssSelector("a[href='/cart/bag']")));
	  cart.click();
	  System.out.println("Cart Clicked");
	  Thread.sleep(2000);
	  
	  
  }
  
  @Test(priority=4, dependsOnMethods = {"add_to_cart"}, groups="regression", dataProvider="loginData")
  public void login(String phone) throws InterruptedException {
	  WebElement login = wait.until(ExpectedConditions.elementToBeClickable(
			  By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/button")));
	  login.click();
	  System.out.println("Login Clicked");
	  Thread.sleep(2000);
	  
		WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
	     By.xpath("//input[@id='mobile-number-input' or @name='mobile-number']")));

		phoneInput.click();
		phoneInput.clear();
		phoneInput.sendKeys(phone);
		
		WebElement termsCheckbox = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[contains(@class, 'filterCheckbox')] | //div[contains(@class, 'checkbox')]")));
		termsCheckbox.click();
		System.out.println("Terms checkbox verified and checked.");
		Thread.sleep(1000); 

		WebElement sendOtpBtn = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//button[text()='Send OTP']")));
		
		// Basic Assert: Verify the Send OTP button is enabled before interacting
		Assert.assertTrue(sendOtpBtn.isEnabled(), "The Send OTP Button is disabled or hidden!");
		  
		sendOtpBtn.click();
		System.out.println("Send OTP button clicked successfully!");
//		Thread.sleep(2000);
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine(); // Script freezes here waiting for you
		scanner.close();
	  
		WebElement verifybtn = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[text()='Verify OTP']")));
		verifybtn.click();
		System.out.println("Verify OTP button clicked.");
		Thread.sleep(5000);
  }
  
//  @Test(priority=5, dependsOnMethods = {"login"}, groups="regression")
//  public void manage_cart( ) {
//	  
//  }
 
  

 
  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  driver.quit();
  }
 
}
