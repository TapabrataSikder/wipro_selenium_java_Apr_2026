package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationModuleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Directly navigating to the registration page
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
    }

    @Test
    public void testUserRegistration() {
        driver.findElement(By.id("input-firstname")).sendKeys("John");
        driver.findElement(By.id("input-lastname")).sendKeys("Doe");

        String uniqueEmail = "johndoe" + System.currentTimeMillis() + "@gmail.com";
        driver.findElement(By.id("input-email")).sendKeys(uniqueEmail);
        
        driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
        driver.findElement(By.id("input-password")).sendKeys("Password123");
        driver.findElement(By.id("input-confirm")).sendKeys("Password123");

        WebElement privacyPolicy = driver.findElement(By.name("agree"));
        privacyPolicy.click();

        driver.findElement(By.cssSelector("input.btn-primary")).click();

        String expectedHeading = "Your Account Has Been Created!";
        String actualHeading = driver.findElement(By.cssSelector("#content h1")).getText();
        
        Assert.assertEquals(actualHeading, expectedHeading, "Registration failed!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}