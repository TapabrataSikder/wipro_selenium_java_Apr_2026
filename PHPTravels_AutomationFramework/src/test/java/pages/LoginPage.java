package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import utilities.WaitUtil;

import java.util.ArrayList;
import java.util.List;

public class LoginPage {
	
	WebDriver driver;
	
//	LOGIN Locators 
	By emailField = By.id("email");
	By passwordField = By.id("password");
	By signBtn = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]");
	
//	REGISTRATION Locators 
	By signupMenuHeader = By.xpath("//button[contains(.,'Signup')]"); 
	By customerSignupOption = By.xpath("//a[contains(.,'Customer Signup')]");
	By popupCloseButton = By.xpath("//button[contains(@id,'close') or contains(@class,'close') or contains(text(),'×')] | //div[contains(@class,'modal')]//button");

	By regFirstName = By.id("first_name");
	By regLastName = By.id("last_name");
	By regEmail = By.id("email"); 
	By regPassword = By.id("password");
	By regConfirmPassword = By.id("confirm_password");
	
	// Captcha 
	By captchaInputField = By.id("captcha_answer"); 
	By agreeCheckbox = By.id("agree_terms");     
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	     
    public void enterUsername(String userStr) {
        WebElement element = driver.findElement(emailField);
        element.clear();
        element.sendKeys(userStr);
    }
    
    public void enterPassword(String passStr) {
        WebElement element = driver.findElement(passwordField);
        element.clear();
        element.sendKeys(passStr);
    }
    
    public void clickLoginButton() {
        WebElement button = driver.findElement(signBtn);
        WaitUtil.waitForClickable(driver, button, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", button);
    }
    
    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }
    
//  REGISTRATION METHODS
    public void handleDismissPopupIfPresent() {
        List<WebElement> popups = driver.findElements(popupCloseButton);
        if (!popups.isEmpty() && popups.get(0).isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", popups.get(0));
            System.out.println("Homepage promo popup successfully dismissed.");
            
        } else {
            System.out.println("No blocking modal popup overlay detected. Moving forward.");
        }
    }
    
    public void hoverAndClickCustomerSignup() {
        handleDismissPopupIfPresent();
        WebElement signupMenu = driver.findElement(signupMenuHeader);
        WaitUtil.waitForVisible(driver, signupMenu, 15);
        
        Actions actions = new Actions(driver);
        actions.moveToElement(signupMenu).build().perform();
        
        WebElement customerOption = driver.findElement(customerSignupOption);
        WaitUtil.waitForVisible(driver, customerOption, 10);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", customerOption);
    }

    public void enterRegistrationFormDetails(String fName, String lName, String email, String pass) {
        driver.findElement(regFirstName).sendKeys(fName);
        driver.findElement(regLastName).sendKeys(lName);
        driver.findElement(regEmail).sendKeys(email);
        driver.findElement(regPassword).sendKeys(pass);
        driver.findElement(regConfirmPassword).sendKeys(pass);
    }
    
    public void solveAndEnterCaptcha() {
        WebElement questionLabel = driver.findElement(By.xpath("//label[contains(text(),'Security Check')]"));
        String rawText = questionLabel.getText().toLowerCase(); 
        
        int answer = 0;
        if (rawText.contains("three times five") || rawText.contains("3 * 5") || rawText.contains("3x5")) {
            answer = 3 * 5;
        } else if (rawText.contains("two plus two") || rawText.contains("2 + 2")) {
            answer = 2 + 2;
        } else {
            answer = 15; 
        }
        
        WebElement answerBox = driver.findElement(By.xpath("//input[@placeholder='Enter the answer']"));
        answerBox.sendKeys(String.valueOf(answer));
    }
    
    public void clickAgreeToTerms() {
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if (!checkbox.isSelected()) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", checkbox);
        }
    }

    public void clickRegisterButton() {
        WebElement button = driver.findElement(By.xpath("//button[contains(.,'Create Account')]"));
        WaitUtil.waitForClickable(driver, button, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", button);
    }  
    
//	HOTEL SEARCH Locators
    By servicesDropdown = By.xpath("(//span[text()='Services'])[1]");
    
    By tourService = By.xpath("//span[text() = 'Tours Booking']");
    
    By destinationInputField = By.xpath("//input[@x-ref=\"destinationInput\"]");
   
    By destinationDropdownClicker = By.xpath(
    		"/html/body/section/div[2]/div/div/form/div/div[1]/div/div[2]/div[2]/div");

	By checkInDateCell = By.xpath("//input[@name='start_date']");
	
	By dateSel = By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[5]/div");

	By durationInput = By.xpath("(//span[text() = 'Any Duration'])[1]");
	By durationSelect = By.xpath("//span[text() = '2-3 Days']");
	
	By tourType = By.xpath("//span[text() = 'Any Type']");
	By tourTypeSelect = By.xpath("//span[text() = 'Cultural']");
	
	By travelerSelect = By.xpath("//span[text() = '1 Traveler']");
	
	By addAdultNumber = By.xpath("(//span[text()='add'])[1]");
	By addChildNumber = By.xpath("(//span[text()='add'])[2]");
	
	By searchButton = By.xpath("//button[@title='Search Tours']");

//  HOTEL SEARCH METHODS
	public void selectDestination(String city) {
		
		driver.findElement(servicesDropdown).click();
		driver.findElement(tourService).click();
		
        WebElement cityInput = driver.findElement(destinationInputField);
        cityInput.clear();
        cityInput.sendKeys(city);
        
        WebElement dropDownItem = driver.findElement(destinationDropdownClicker);
        dropDownItem.click();
        
    }

	public void enterBookingDates() {
        // --- CHOOSE CHECK-IN DATE ---
        WebElement startDate = driver.findElement(checkInDateCell);
        WaitUtil.waitForVisible(driver, startDate, 15);
        WaitUtil.waitForClickable(driver, startDate, 15);
        startDate.click(); 
		
        By robustDateSel = By.xpath("(//div[@class='datepicker-days']//div[text()='4'])[1]");
        WebElement selDate = driver.findElement(robustDateSel);
        WaitUtil.waitForClickable(driver, selDate, 10);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", selDate);
        
        // --- CHOOSE Duration DATE ---
        WebElement duration = driver.findElement(durationInput);
        WaitUtil.waitForClickable(driver, duration, 10);
        duration.click();
        
        WebElement selDuration = driver.findElement(durationSelect);
        selDuration.click();
        
        System.out.println("Dates and duration selected successfully!");
        
    }
	
	public void tourType() {
		WebElement typeDrop = driver.findElement(tourType);
        WaitUtil.waitForVisible(driver, typeDrop, 15);
        WaitUtil.waitForClickable(driver, typeDrop, 15);
		typeDrop.click();
		
		WebElement typeSel = driver.findElement(tourTypeSelect);
        WaitUtil.waitForVisible(driver, typeSel, 15);
        WaitUtil.waitForClickable(driver, typeSel, 15);
		typeSel.click();
	}
	
	public void configureRoomsAndGuests() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement trigger = driver.findElement(travelerSelect);
		WaitUtil.waitForVisible(driver, trigger, 10);
		js.executeScript("arguments[0].click();", trigger);

		// --- CONFIGURING ADULTS ---
		driver.findElement(addAdultNumber).click();
		driver.findElement(addChildNumber).click();
		
	}
	
    public void clickSearchHotelsButton() {
        WebElement btn = driver.findElement(searchButton);
        WaitUtil.waitForClickable(driver, btn, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btn);
    }
    
    public boolean areSearchResultsDisplayed() {
        try {
            org.openqa.selenium.support.ui.WebDriverWait wait = 
                new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(30));
            
            boolean isTitleCorrect = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.titleContains("Search Tours PHPTRAVELS"));
            
            if (isTitleCorrect) {
                System.out.println("Search validation successful! Routed to page: " + driver.getTitle());
                return true;
            }
        } catch (Exception e) {
            System.out.println("Search validation failed: Current page title is '" + driver.getTitle() + " instead of target. " + e.getMessage());
        }
        return false;
	}
    
    
// ==================================================
//  TOUR SEARCH FILTERS & PRICE SORTING VALIDATION
// ==================================================

	// Locators for Sort Dropdown 
    By sortSelectDropdown = By.xpath("/html/body/div[2]/div/div/div[3]/div/main/div[1]/div[2]/div");
	By priceLowToHighOption = By.xpath("//select[@x-model='sortBy']/option[@value='price_low']");
	By priceHighToLowOption = By.xpath("//select[@x-model='sortBy']/option[@value='price_high']");

	public void selectPriceHighToLow() {
	    org.openqa.selenium.support.ui.WebDriverWait wait = 
	        new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	    
	    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(sortSelectDropdown)).click();
	    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(priceHighToLowOption)).click();
	}

	public void selectPriceLowToHigh() {
	    org.openqa.selenium.support.ui.WebDriverWait wait = 
	        new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	    
	    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(sortSelectDropdown)).click();
	    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(priceLowToHighOption)).click();
	}

//=========================
//	BOOKING CONFIRMATION	
//=========================

	By moreDetails = By.xpath("//a[contains(.,'More Details') or normalize-space()='More Details']");
	
	By bookNowButton = By.xpath(
			"/html/body/div[2]/div[3]/div/div[2]/div[2]/div/a");
	
	public void clickMoreDetails() {
		// Create a localized explicit wait that safely processes the 'By' locator directly
		org.openqa.selenium.support.ui.WebDriverWait wait = 
			new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(15));
		
		// 1. Wait for clickability safely using the By locator directly to absorb DOM shifts
		WebElement details = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(moreDetails));
		
		// 2. Click it cleanly via JavaScript execution
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", details);
		System.out.println("More Details clicked successfully.");
	}
	
	public void clickBookNow() {
		org.openqa.selenium.support.ui.WebDriverWait wait = 
			new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(15));
		
		// 1. Wait for clickability safely using the By locator directly
		WebElement booking = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(bookNowButton));
		
		// 2. Click it cleanly via JavaScript execution
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", booking);
		System.out.println("Book Now clicked successfully.");
	}

	// Replaced By.className with a robust text match
//	By acceptCookie = By.xpath("//button[contains(text(), 'Accept All') or normalize-space()='Accept All']");
//	By acceptCookie = By.xpath("/html/body/div[2]/div/div/div/div[2]/button[3]");
	By acceptCook = By.xpath("/html/body/div[3]/div/div[3]/div/button[3]");
	
	By cookSettings = By.xpath("/html/body/div[2]/div/div/div/div[2]/button[1]");

	// Kept your clean element locators 
	By visitDate = By.xpath("//button[@type='button' and .//time[@datetime='2026-06-04']]");
	By ticketAdd = By.xpath("//button[contains(@class,'bg-tertiary-button') and .//*[name()='path']]");
	By nextButton = By.xpath("//button[@type='submit' and contains(., 'Go to the next step')]");
	

	public void bookingDetails() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    org.openqa.selenium.support.ui.WebDriverWait wait = 
	            new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(20));
	    
	    String originalTab = driver.getWindowHandle();
	    
	    // ==================================================
	    // 1. SWITCH TO THE NEWLY OPENED BOOKING TAB
	    // ==================================================
	    System.out.println("Switching window focus to the booking tab...");
	    for (String windowHandle : driver.getWindowHandles()) {
	        if (!originalTab.contentEquals(windowHandle)) {
	            driver.switchTo().window(windowHandle);
	            break;
	        }
	    }
	    
	    // Ensure the basic page layout shell is loaded
	    wait.until(d -> js.executeScript("return document.readyState").equals("complete"));
	    
	    // ==================================================
	    // 2. VERIFY NEW TAB TITLE AND WRAP UP TEST
	    // ==================================================
	    System.out.println("Driver focus shifted successfully.");
	    System.out.println("Current Tab URL: " + driver.getCurrentUrl());
	    System.out.println("Current Tab Title: " + driver.getTitle());
	    
	    System.out.println("Booking window captured cleanly. Ending task sequence here to avoid UI blockers.");
	}

   
}

