//package StepDefination;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class SearchStep {
//	WebDriver driver;
//	@When("^go to search button and click add inputs (.*)$")
//	public void go_to_search_button_and_click_add_inputs(String input) {
//		driver = new ChromeDriver();
//        driver.get("http://zero.webappsecurity.com/");  
//        driver.manage().window().maximize();       
//        driver.findElement(By.id("searchTerm")).click();   
//        driver.findElement(By.id("searchTerm")).sendKeys(input);
//        
//        driver.findElement(By.id("searchTerm")).submit();
//		
//		
////		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
////		WebElement searchBox = driver.findElement(By.name("search"));     
////		searchBox.clear();
////        searchBox.sendKeys("iphone");
////		WebElement searchButton = driver.findElement(By.xpath("//div[@id='search']//button"));
////		searchButton.click();
//	}
//
//	@Then("list of products")
//	public void list_of_products() {
//		System.out.println("Search completed successfully");
//		if (driver != null) {
//			driver.quit();
//		}
//	}
//
//}
