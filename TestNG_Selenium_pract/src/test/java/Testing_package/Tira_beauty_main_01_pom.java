package Testing_package;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tira_beauty_main_01_pom {
    
    WebDriver driver;
    WebDriverWait wait;
    
    // --- LOCATORS ---
    // Search
   By searchInputLocator = By.id("search");
    
    // Filters 
   By brandAccordion = By.xpath("//div[@id='Brand']//button");
   By niveaFilter = By.xpath("//div[text()='Nivea']");
   By skinTypeAccordion = By.xpath("//div[@id='Skin Type']//button");
   By oilySkinFilter = By.xpath("//div[text()='Oily']");
   By appliedFilters = By.xpath("//div[@class='selectedItem--qwZEQ']");
    
    // Add to Cart
   By firstProductImage = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/div[1]/div[1]/picture[1]/img[1]");
   By addToBagButton = By.xpath("//button[./span[text()='Add To Bag']]");
   By cartIcon = By.cssSelector("a[href='/cart/bag']");
    
    // Login
   By initialLoginButton = By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/button");
   By phoneInputField = By.xpath("//input[@id='mobile-number-input' or @name='mobile-number']");
   By termsCheckbox = By.xpath("//div[contains(@class, 'filterCheckbox')] | //div[contains(@class, 'checkbox')]");
   By sendOtpButton = By.xpath("//button[text()='Send OTP']");
   By verifyOtpButton = By.xpath("//button[text()='Verify OTP']");
    
    // Add Address
   By addAddressButton = By.xpath("//button[text()='Add Address']");
   By houseField = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]");
   By streetField = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]");
   By pincodeField = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]");
   By homeChip = By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[5]/div[2]/div/div/div/form/div/div[7]/div[1]/div[2]/button[1]");
   By fullNameField = By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[5]/div[2]/div/div/div/form/div/div[7]/div[2]/div/input");
   By contactField = By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[5]/div[2]/div/div/div/form/div/div[7]/div[3]/div/input");
   By saveAndProceedBtn = By.xpath("//button[text()='Save & Proceed']");
   
    // --- CONSTRUCTOR ---
    public Tira_beauty_main_01_pom(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    
    
    //METHODSs
    
    public void searchProduct(String searchKey) throws InterruptedException {
        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(searchInputLocator));
        searchInput.click();
        searchInput.sendKeys(searchKey);
        Thread.sleep(2000);
        searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    
    public void applyFilters() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(brandAccordion)).click();
        System.out.println("Brand dropdown accordion opened successfully.");
        Thread.sleep(1500);

        wait.until(ExpectedConditions.elementToBeClickable(niveaFilter)).click();
        System.out.println("Nivea filter applied successfully!");
        Thread.sleep(2000);
        
        wait.until(ExpectedConditions.elementToBeClickable(skinTypeAccordion)).click();
        System.out.println("Skin Type dropdown accordion opened successfully.");
        
        wait.until(ExpectedConditions.elementToBeClickable(oilySkinFilter)).click();
        System.out.println("Oily filter applied successfully!");
        Thread.sleep(2000);
    }
    
    public List<WebElement> getAppliedFilters() {
        return driver.findElements(appliedFilters);
    }
    
    public void clickProductImage() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(firstProductImage)).click();
        System.out.println("Product clicked successfully.");
        Thread.sleep(2000);
    }
    
    public void handleWindowSwitch(String originalWindow) {
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        System.out.println("Switched focus to the product details tab successfully.");
    }
    
    public void addProductToBagAndGoToCart() throws InterruptedException {
        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(addToBagButton))).click();
        System.out.println("Product added to bag successfully!");
        Thread.sleep(2000);
        
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
        System.out.println("Cart Clicked");
        Thread.sleep(2000);
    }
    
    public void clickInitialLogin() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(initialLoginButton)).click();
        System.out.println("Login Clicked");
        Thread.sleep(2000);
    }
    
    public void enterPhoneAndAcceptTerms(String phone) throws InterruptedException {
        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneInputField));
        phoneInput.click();
        phoneInput.clear();
        phoneInput.sendKeys(phone);
        
        wait.until(ExpectedConditions.elementToBeClickable(termsCheckbox)).click();
        System.out.println("Terms checkbox verified and checked.");
        Thread.sleep(1000);
    }
    
    public WebElement getSendOtpButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(sendOtpButton));
    }
    
    public void clickVerifyOtp() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(verifyOtpButton)).click();
        System.out.println("Verify OTP button clicked.");
        Thread.sleep(5000);
    }
    
    public void fillAddress(String house, String street, String pin, String addressType, String fullName, String contactNum) throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(addAddressButton)).click();
    	System.out.println("Add Address button clicked.");
        Thread.sleep(3000);
        
        // Fill House details
        WebElement houseInp = wait.until(ExpectedConditions.visibilityOfElementLocated(houseField));
        houseInp.clear();
        houseInp.sendKeys(house);
        
        // Fill Street details
        WebElement streetInp = driver.findElement(streetField);
        streetInp.clear();
        streetInp.sendKeys(street);
        
        // Fill Pincode
        WebElement pinInp = driver.findElement(pincodeField);
        pinInp.clear();
        pinInp.sendKeys(pin);
        Thread.sleep(2000); 
        
        driver.findElement(homeChip).click();
        
        
        // Fill Full Name
        WebElement nameInp = driver.findElement(fullNameField);
        nameInp.clear();
        nameInp.sendKeys(fullName);
        
        // Fill Contact Phone Number
        WebElement contactInp = driver.findElement(contactField);
        contactInp.clear();
        contactInp.sendKeys(contactNum);
        Thread.sleep(1000);
        
        // Click Save & Proceed Button
        wait.until(ExpectedConditions.elementToBeClickable(saveAndProceedBtn)).click();
        System.out.println("Save & Proceed clicked successfully.");
        Thread.sleep(4000);
    }
}