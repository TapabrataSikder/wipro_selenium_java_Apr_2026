//package StepDefination;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.After;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Ninja_Login {
//	public static WebDriver driver;
//	String expectedStatus;
//	
//	@Given("login page should be open in default browser")
//	public void login_page_should_be_open_in_default_browser() throws InterruptedException {
//	    driver=new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.get("https://tutorialsninja.com/demo/");		
//		WebElement accntDrop =  driver.findElement(By.xpath("//span[text()='My Account']"));
//		accntDrop.click();
//		WebElement loginBtn = driver.findElement(By.linkText("Login"));
//		loginBtn.click();
////		Thread.sleep(3000);
//		System.out.println("Site Opened and Login button clicked.");
//	}
//
//	@When("click on email address field and add valid email {string}")
//	public void click_on_email_address_field_and_add_valid_email_tapa_gmail_com(String email) throws InterruptedException {
//		WebElement loginEmailField = driver.findElement(By.id("input-email"));
//		loginEmailField.clear();
//		loginEmailField.sendKeys(email);
////		Thread.sleep(3000);
//		System.out.println("Email entered..");
//	}
//
//	@When("then click on password field and enter valid {string}")
//	public void then_click_on_password_field_and_enter_valid_admin(String pass) throws InterruptedException {
//		WebElement loginPasswordField  = driver.findElement(By.id("input-password"));
//		loginPasswordField.clear();
//	    loginPasswordField.sendKeys(pass);
////	    Thread.sleep(3000);
//		System.out.println("Password entered..");
//	}
//
//	@When("now click on login button {string}")
//	public void now_click_on_login_button_success(String status) throws InterruptedException {
//		this.expectedStatus = status;
//		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
//		loginButton.click();
//		System.out.println("Login button clicked.."+status);
//	}
//
//	
//    @Then("login successfully and redirect to ninja home page")
//    public void login_successfully_and_redirect_to_home_page() throws InterruptedException {
////    	Thread.sleep(2000); 
//        String actualTitle = driver.getTitle();
//        
//        if (expectedStatus.equalsIgnoreCase("success")) {
//            Assert.assertEquals(actualTitle, "My Account");
//            System.out.println("Assertion passed: Successfully logged into dashboard.");
//        } else {
//            Assert.assertEquals(actualTitle, "Account Login");
//            
//            boolean isWarningDisplayed = driver.findElement(By.cssSelector(".alert-danger")).isDisplayed();
//            Assert.assertTrue(isWarningDisplayed, "Expected login error warning message, but none appeared.");
//            System.out.println("Assertion passed: Negative login handled correctly.");
//        }
//        
//    }
//    
//    @After
//    public void tearDown() {
//    	if (driver != null) {
//            try {
//                driver.quit();
//            } catch (Exception e) {
//                System.out.println("Exception encountered while closing driver: " + e.getMessage());
//            } finally {
//                driver = null; // Forces a fresh invocation context if next scenarios execute
//                System.out.println("Browser closed successfully.");
//            }
//        }
//}}
