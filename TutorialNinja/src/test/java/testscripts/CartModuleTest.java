package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartModuleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=40");
    }

    @Test
    public void testAddAndRemoveProduct() throws InterruptedException {

        WebElement addToCartButton = driver.findElement(By.id("button-cart"));
        addToCartButton.click();
        
        Thread.sleep(2000);
        
        WebElement successAlert = driver.findElement(By.cssSelector(".alert-success"));
        Assert.assertTrue(successAlert.getText().contains("Success"), "Product was not added to cart!");

        driver.findElement(By.id("cart-total")).click();
        Thread.sleep(1000);
        
        // Click the red 'x' button to remove the item
        driver.findElement(By.cssSelector("button[title='Remove']")).click();
        Thread.sleep(2000);
        
  
        String cartText = driver.findElement(By.id("cart-total")).getText();
        Assert.assertTrue(cartText.contains("0 item(s)"), "Product was not removed from cart!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}