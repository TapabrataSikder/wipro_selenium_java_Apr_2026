package Testing_package;
 
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.time.Duration; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
 
public class NewTest {

	 WebDriver driver;
	 WebDriverWait wait ;
	 JavascriptExecutor js;

	 @BeforeTest
	  public void browsersetup() {
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     wait= new WebDriverWait(driver, Duration.ofSeconds(10));
 	     driver.get("https://testautomationpractice.blogspot.com/");

	  }

  @Test
  public void unit1() {

	js = (JavascriptExecutor) driver;
 
      // ================= FORM =================

      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Alice bob");
      driver.findElement(By.id("email")).sendKeys("alice@gmail.com");
      driver.findElement(By.id("phone")).sendKeys("9876543210");
      driver.findElement(By.id("textarea")).sendKeys("Bengal"); 
      driver.findElement(By.id("male")).click();
      driver.findElement(By.id("monday")).click();
  }

  @Test
  public void unit2()
  {

	  Select country = new Select(driver.findElement(By.id("country")));
      country.selectByVisibleText("India");
      // ================= DATE =================
      driver.findElement(By.id("datepicker")).sendKeys("05/19/2026"); 
//      // ================= ALERT =================
//      js.executeScript("window.scrollBy(0,1000)");
//
//      WebElement alertBtn = wait.until(
//              ExpectedConditions.elementToBeClickable(By.id("alertBtn"))
//      ); 
     // alertBtn.click();

  }

 
  @AfterTest
  public void afterTest() throws InterruptedException {
	  System.out.println("Successfully done");
	  Thread.sleep(3000);
	  driver.close();
  }
 
}

 