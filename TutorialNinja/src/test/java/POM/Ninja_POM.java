package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ninja_POM {
	 WebDriver driver;
	 WebDriverWait wait;
	 
//	 Locators
//	 My Account Register
	 By accntDrop =  By.xpath("//span[text()='My Account']");
	 By regBtn = By.linkText("Register");
	 By fname = By.id("input-firstname");
	 By lname = By.id("input-lastname");
	 By email = By.id("input-email");
	 By phone = By.id("input-telephone");
	 By pass = By.id("input-password");
	 By cnfpass = By.id("input-confirm");
	 By continueBtn = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]");

//	 My Account Login
	 By loginEmailField = By.id("input-email");
	 By loginPassField = By.id("input-password");
	 By loginSubmitBtn = By.xpath("//input[@value='Login']");
	 
//	 Product
	 By searchInput = By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
	 
	 
	 // --- CONSTRUCTOR ---
	 public Ninja_POM(WebDriver driver) {
	     this.driver = driver;
	     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 }
	 
	//METHODS	
	 
	 public void navigateToRegisterPage() {
	      wait.until(ExpectedConditions.elementToBeClickable(accntDrop)).click();
	      wait.until(ExpectedConditions.elementToBeClickable(regBtn)).click();
	 }

	 public void navigateToLoginPage() {
	     wait.until(ExpectedConditions.elementToBeClickable(accntDrop)).click();
	     wait.until(ExpectedConditions.elementToBeClickable(loginEmailField)).click();
	 }
	 
	public void registration(String firstName, String lastName, String mail, String telephone, String password) throws InterruptedException {
		

        wait.until(ExpectedConditions.visibilityOfElementLocated(fname)).sendKeys(firstName);
        driver.findElement(lname).sendKeys(lastName);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(phone).sendKeys(telephone);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(cnfpass).sendKeys(password);
        
		System.out.println("Registration completed");
		
	}
	
	public void login(String email, String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginEmailField)).sendKeys(email);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(loginSubmitBtn).click();
    }
	
	public void searchProd(String prod)
	{
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		search.sendKeys(prod);
		search.sendKeys(Keys.ENTER);
	}
	 
	 
	
	 
	    
}
