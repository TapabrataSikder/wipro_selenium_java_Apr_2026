package Testing_package;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tira_beauty_main_01 {
    WebDriver driver;
    Tira_beauty_main_01_pom tiraPage;
    
    @DataProvider(name="searchData")
    public Object[][] searchDP() {
        return new Object[][] {
            {"Men's facewash"}
        };
    }
    
    @DataProvider(name="loginData")
    public Object[][] loginDP() {
        return new Object[][] {
            {"7439073905"}
        };
    }
    
 // Data Provider tailored exactly to match the fields shown in your images
    @DataProvider(name="addressData")
    public Object[][] addressDP() {
        return new Object[][] {
            {
                "302, Apartments", 
                "Dum Dum",     
                "700050",                         
                "Home",                           
                "Rahul Sik",                     
                "7439073905"                      
            }
        };
    }
    
    @BeforeTest(alwaysRun=true)
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        // Initialize POM class and pass the driver instances
        tiraPage = new Tira_beauty_main_01_pom(driver);
        
        driver.get("https://www.tirabeauty.com/");
    }

    @Test(priority=1, groups="smoke", dataProvider="searchData")
    public void multiple_search(String searchKey) throws InterruptedException {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Tira"), "Title Mismatch!");
        

        tiraPage.searchProduct(searchKey);
    }
  
    @Test(priority=2, dependsOnMethods = {"multiple_search"}, groups="smoke")
    public void product_details() throws InterruptedException {
        tiraPage.applyFilters();

        List<WebElement> filters = tiraPage.getAppliedFilters();
        Assert.assertFalse(filters.isEmpty(), "Filters not applied!");
    }
  
    @Test(priority=3, dependsOnMethods = {"product_details"}, groups="regression")
    public void add_to_cart() throws InterruptedException {
        String originalWindow = driver.getWindowHandle();
        
        tiraPage.clickProductImage();
        tiraPage.handleWindowSwitch(originalWindow);

        Assert.assertNotEquals(driver.getWindowHandle(), originalWindow, "Failed to switch window!");
        
        tiraPage.addProductToBagAndGoToCart();
    }
  
    @Test(priority=4, dependsOnMethods = {"add_to_cart"}, groups="regression", dataProvider="loginData")
    public void login(String phone) throws InterruptedException {
        tiraPage.clickInitialLogin();
        tiraPage.enterPhoneAndAcceptTerms(phone);
        
        WebElement sendOtpBtn = tiraPage.getSendOtpButton();
        Assert.assertTrue(sendOtpBtn.isEnabled(), "The Send OTP Button is disabled or hidden!");
        
        sendOtpBtn.click();
        System.out.println("Send OTP button clicked successfully!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter OTP in the browser and hit ENTER here to continue...");
        scanner.nextLine(); 
        scanner.close();
      
        tiraPage.clickVerifyOtp();
    }
    
    @Test(priority=5, dependsOnMethods = {"login"}, groups="regression", dataProvider="addressData")
    public void address(String house, String street, String pin, String addressType, String fullName, String contactNum) throws InterruptedException {
    	tiraPage.fillAddress(house, street, pin, addressType, fullName, contactNum);
        
        
        boolean isFormClosed = tiraPage.wait.until(ExpectedConditions.invisibilityOfElementLocated(tiraPage.fullNameField));
        Assert.assertTrue(isFormClosed, "Address form submit failed: Form window is still visible on screen.");
    }
 
    @AfterTest(alwaysRun=true)
    public void afterTest() {
//        if (driver != null) {
//            driver.quit();
//        }
    }
}