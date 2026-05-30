package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutModule {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Go to Login Page 
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    }

    @Test
    public void testUserLogout() throws InterruptedException {
        // Log in  
        driver.findElement(By.id("input-email")).sendKeys("validuser123@gmail.com"); 
        driver.findElement(By.id("input-password")).sendKeys("Password123");
        driver.findElement(By.cssSelector("input.btn-primary")).click();
        
        driver.findElement(By.linkText("My Account")).click();

        driver.findElement(By.linkText("Logout")).click();
        
        //Verify user arrives at Account Logout info page 
        String actualPageHeader = driver.findElement(By.cssSelector("#content h1")).getText();
        Assert.assertEquals(actualPageHeader, "Account Logout", "User logout failed!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}