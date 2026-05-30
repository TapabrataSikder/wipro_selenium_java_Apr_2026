package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ninja_E2E_POM {
	WebDriver driver;
	 WebDriverWait wait;
	
//	My account locators
	By myAcc = By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[2]");
	By myAccLogin = By.linkText("Login");
	
//	Login Locators
	By emailField = By.id("input-email");
    By passwordField = By.id("input-password");
    By loginButton = By.xpath("//input[@value='Login']");

 // Search & Cart Locators
    By searchBox = By.name("search");
    By searchBtn = By.cssSelector("button.btn-default.btn-lg");
    By cartAddBtn = By.xpath("(//div[@class='button-group']/button[contains(@onclick, 'cart.add')])[1]");
    By blackCartWidget = By.id("cart-total");
    By viewCartLink = By.linkText("View Cart");
    
 // Quantity Modification & Checkout Locators
    By qtyInputField = By.xpath("//table[@class='table table-bordered']//input[contains(@name, 'quantity')]");
    By qtyUpdateSubmit = By.xpath("//button[@data-original-title='Update']");
    By checkoutBtn = By.linkText("Checkout");
    By logoutLink = By.linkText("Logout");
    
	
	
 // Constructor to initialize the driver instance
    public Ninja_E2E_POM(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    public void loginStep(String email, String password) {
    	wait.until(ExpectedConditions.elementToBeClickable(myAcc)).click();
    	wait.until(ExpectedConditions.elementToBeClickable(myAccLogin)).click();
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).clear();
        driver.findElement(emailField).sendKeys(email);
        
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
        
        driver.findElement(loginButton).click();
    }
    
    public void searchProduct(String item) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox)).clear();
        driver.findElement(searchBox).sendKeys(item);
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }
    
    public void clickAddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cartAddBtn)).click();
    }
    
    public void openCartPage() {
        wait.until(ExpectedConditions.elementToBeClickable(blackCartWidget)).click();
        wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();
    }
    
    public void updateCartQty(String qty) {
        WebElement qtyBox = wait.until(ExpectedConditions.visibilityOfElementLocated(qtyInputField));
        qtyBox.clear();
        qtyBox.sendKeys(qty);
        driver.findElement(qtyUpdateSubmit).click();
    }
    
    public void clickCheckout() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn)).click();
    }
    
    public void logoutUser() {
        wait.until(ExpectedConditions.elementToBeClickable(myAcc)).click();
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
    }
 
}
