package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutModule {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=40");
    }

    @Test
    public void testCheckoutAndOrderConfirmation() throws InterruptedException {

        driver.findElement(By.id("button-cart")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.linkText("Checkout")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("input[value='guest']")).click();
        driver.findElement(By.id("button-account")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("input-payment-firstname")).sendKeys("Jane");
        driver.findElement(By.id("input-payment-lastname")).sendKeys("Smith");
        driver.findElement(By.id("input-payment-email")).sendKeys("janesmith@gmail.com");
        driver.findElement(By.id("input-payment-telephone")).sendKeys("9876543210");
        driver.findElement(By.id("input-payment-address-1")).sendKeys("123 Testing Street");
        driver.findElement(By.id("input-payment-city")).sendKeys("New York");
        driver.findElement(By.id("input-payment-postcode")).sendKeys("10001");
        
        driver.findElement(By.id("input-payment-country")).sendKeys("India");
        Thread.sleep(1000);

        driver.findElement(By.id("input-payment-zone")).sendKeys("New York");
        
        driver.findElement(By.id("button-guest")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("button-shipping-method")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.id("button-payment-method")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("button-confirm")).click();
        Thread.sleep(2000);
        
        String expectedConfirmationText = "Your order has been placed!";
        String actualConfirmationText = driver.findElement(By.cssSelector("#content h1")).getText();
        
        Assert.assertEquals(actualConfirmationText, expectedConfirmationText, "Order was not confirmed!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}