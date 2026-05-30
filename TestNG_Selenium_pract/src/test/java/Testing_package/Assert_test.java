package Testing_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assert_test {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	SoftAssert soft;
	
  @BeforeTest
   public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  driver.get("https://www.selenium.dev/");
   }
	
  @Test
  public void titlevalidation() {
	  soft=new SoftAssert();
	  String expTitle = "Selenium dev";
	  String actTitle = driver.getTitle();	  
	  soft.assertEquals(actTitle, expTitle, "Title validation failded.");
	  
	  String expUrl= "Selenium";
	  String actUrl= driver.getCurrentUrl();	  
	  soft.assertEquals(actUrl, expUrl, "URL validation failded.");
	  
	  Assert.assertTrue(true, "Pause execution");
  }
  
//  @Test
//  public void urlvalidation() {
//	  
//  }


  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
