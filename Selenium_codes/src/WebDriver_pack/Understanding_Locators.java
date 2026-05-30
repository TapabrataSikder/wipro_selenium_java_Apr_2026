package WebDriver_pack;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_Locators {

	public static void main(String[] args) {
		
//		Interface				Class
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/"); // Open the url
		
		driver.findElement(By.name("search")).sendKeys("Mac");
	}

}
