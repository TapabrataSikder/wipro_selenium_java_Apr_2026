package WebDriver_pack;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Amazon_automate {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
		JavascriptExecutor js = (JavascriptExecutor) driver;

//		Login 
		driver.get("https://www.amazon.in/");
				
		
//		Search
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		String searchKeyword = "samsung phone";
		searchBox.sendKeys(searchKeyword);
		searchBox.sendKeys(Keys.ENTER);	
	
		// Filters
//		1. Brand
		WebElement brandFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/span/div[1]/span/div/div[3]/div[3]/ul/span/span[1]/li/span/a/div/label/i")));
		brandFilter.click();
		Thread.sleep(2000);
//		
//		2. By price
		WebElement feature = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/span/div/h1/div/div[4]/div/div/form/span/span/span/span/span[2]")));
		feature.click();
		Thread.sleep(2000);
	
		WebElement priceFilter = wait.until(ExpectedConditions.elementToBeClickable(By.id("s-result-sort-select_2")));
		priceFilter.click();
		Thread.sleep(2000);

//		3. Select Product Image
		WebElement img = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-component-type='s-search-result']//img)[1]")));
		String originalWindow = driver.getWindowHandle(); // Get window ID of current page before click
		img.click();
		Thread.sleep(2000);
		
//		Next Tab Switch
		Set<String> newWindow = driver.getWindowHandles();
		for(String s : newWindow) {
			if(!s.equals(originalWindow)) {
				driver.switchTo().window(s);
				break;
			}
		}
		String productTabUrl = driver.getCurrentUrl();
		System.out.println("The dynamic product URL is: " + productTabUrl);
				

//		Add To CArt
		WebElement cartInput = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//input[@id='add-to-cart-button'] | //input[@name='submit.add-to-cart']")));

		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", cartInput);
		Thread.sleep(2000);

		try {
			cartInput.click();
			System.out.println("Form submitted successfully using native input click.");
		} catch (Exception e) {
			System.out.println("Native click intercepted. Forcing form action directly...");
			
			// Fallback: This forces the underlying input to trigger its native form submission script
			js.executeScript("arguments[0].click();", cartInput);
			System.out.println("Form forced successfully via JavaScript Input Submitter!");
		}
		
		Thread.sleep(5000);

//		Sign in
		WebElement sign = wait.until(ExpectedConditions.elementToBeClickable(By.id("rcx-sc-sign-in")));
		sign.click();

		WebElement mob = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email_login")));
		mob.sendKeys("7439073905");
		mob.sendKeys(Keys.ENTER);		
		Thread.sleep(2000);
		
//		OTP
		WebElement otp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/div[3]/form/span/span/input")));
		otp.sendKeys(Keys.ENTER);		
		Thread.sleep(2000);
		
		
		
//		5. Take Screen Shot
		TakesScreenshot tc = (TakesScreenshot)driver;
		File sc=tc.getScreenshotAs(OutputType.FILE);
		File dest = new File("amazon_cart2.png");
		FileHandler.copy(sc,  dest);
		Thread.sleep(2000);
				
		driver.quit();
	}

}
