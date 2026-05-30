package Testing_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class CrossBrowser_test {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	SoftAssert soft;
	
  @Test(groups="smoke")
  public void chrome() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.selenium.dev/");
  }
  @Test(groups="regression")
  public void firefox() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.selenium.dev/");
  }
  @Test(groups="smoke")
  public void edge() {
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.selenium.dev/");
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
