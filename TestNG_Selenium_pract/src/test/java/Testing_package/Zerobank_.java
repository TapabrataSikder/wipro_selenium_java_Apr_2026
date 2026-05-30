package Testing_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Zerobank_ {
	WebDriver driver;
	

  @Test
  public void f() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://zero.webappsecurity.com/login.html");
		POM_impl page=new POM_impl(driver);
		page.login();
		
		Thread.sleep(3000);
  }
  
  @Test
  public void addaddress() throws InterruptedException {
	  driver=new ChromeDriver();
	  POM_impl page=new POM_impl(driver);
	  page.login();
	  Thread.sleep(2000);
  }
  
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
