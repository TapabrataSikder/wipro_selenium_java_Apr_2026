package StepDefinitions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import POM.Ninja_POM;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ninja_steps {
	Ninja_POM ninja;
	WebDriver driver;
	
	public static String savedEmail = "rahul@gmail.com";
		
	 @Before
	 public void setUp() {
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	     // Initialize POM class and pass the driver instances
	     ninja = new Ninja_POM(driver);
  
	 }
	 @After
	 public void endScenario() {
		 driver.quit();
	 }
	
	
	@Given("user open registration page")
	public void user_open_registration_page() {
		driver.get("https://tutorialsninja.com/demo/");
        ninja.navigateToRegisterPage();
	}

	@When("^user register with first name (.*) last name (.*) phone (.*) password (.*)$")
    public void user_register_with_details(String firstname, String lastname, String phone, String password) throws InterruptedException {
        ninja.registration(firstname, lastname, savedEmail, phone, password);
    }

	@Then("Successfull registration")
	public void successfull_registration() {
		System.out.println("Registration Done");
	}

	@When("user log out after register")
	public void user_log_out_after_register() {
	
	}

	@Given("user open login page")
	public void user_open_login_page() {
		driver.get("https://tutorialsninja.com/demo/");
        ninja.navigateToLoginPage();
	}

	@When("^user login with password (.*)$")
	public void user_login_with_password_admin(String password) {
		ninja.login(savedEmail, password);
	}

	@Then("successfull login")
	public void successfull_login() {
		System.out.println("Logged in");
	}

	@Given("user on home page")
	public void user_on_home_page() {
	    
	}

	@When("user search product iphone")
	public void user_search_product_iphone() {
	  
	}

	@Then("product should be displayed")
	public void product_should_be_displayed() {
	
	}

	@When("user search product samsung")
	public void user_search_product_samsung() {
	  
	}

	@When("user search product pay")
	public void user_search_product_pay() {
	   
	}

	@When("user add product to cart")
	public void user_add_product_to_cart() {
	    
	}

	@Then("product added successfully")
	public void product_added_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user open the cart")
	public void user_open_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on view cart option")
	public void click_on_view_cart_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("cart page open successfully")
	public void cart_page_open_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
