//package StepDefination;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginStep {
//	WebDriver driver;
//	
//	@Given("login page should be open i default browser")
//	public void login_page_should_be_open_i_default_browser() {
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://zero.webappsecurity.com/login.html");
//		
////		driver.get("https://tutorialsninja.com/demo/");		
////		WebElement accntDrop =  driver.findElement(By.xpath("//span[text()='My Account']"));
////		accntDrop.click();
////		WebElement loginBtn = driver.findElement(By.linkText("Login"));
////		loginBtn.click();
//	}
//
//	@When("^click on username field and add valid user (.*)$")
//	public void click_on_username_field_and_add_valid_user_username1(String username1) {
//		WebElement user=driver.findElement(By.id("user_login"));
//		user.sendKeys(username1);
//		System.out.println("Username= "+username1);
//		
////		WebElement loginEmailField = driver.findElement(By.id("input-email"));
////		loginEmailField.clear();
////		loginEmailField.sendKeys("sikder@gmail.com");
//		 
//		
//	}
//
//	@And("^then click on password button and enter valid (.*)$")
//	public void then_click_on_password_button_and_enter_valid_password1(String password1) {
//		WebElement pass=driver.findElement(By.id("user_password"));
//		pass.sendKeys(password1);
//		System.out.println("Password1= "+password1);
//		
////		WebElement loginPasswordField  = driver.findElement(By.id("input-password"));
////		loginPasswordField.clear();
////	    loginPasswordField.sendKeys("Admin@123");
//	}
//
//	@And("^now click on submit button(.*)$")
//	public void now_click_on_submit_button_Status(String status) {
//		driver.findElement(By.name("submit")).click();
//		System.out.println("Test Case Status= "+status);
//		System.out.println("*************************************");
//		
////		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
////		loginButton.click();
//	}
//
//	@Then("login successfully and redirect to home page")
//	public void login_successfully_and_redirect_to_home_page() {
//		
////		System.out.println("Login successfully done");
//		driver.quit();
//	}
//
//}
