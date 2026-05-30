package WebDriver_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField {

	public static void main(String[] args) throws InterruptedException {
//		1. CREATE WEB DRIVER OBJECT
		WebDriver driver = new ChromeDriver();
		
//		2. Navigate to url(Webpage URL)
		driver.get("https://www.selenium.dev/downloads/"); // Current Page
		Thread.sleep(5000); // After 5s automatically redirect to the link 
		
		String expectedtitle = "Selenium Download";
		String actualtitle = driver.getTitle(); // Get title of the page.
		
		System.out.println("Expected: "+expectedtitle);
		System.out.println("Actual: "+actualtitle);
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Title pass!");
		}
		else
		{
			System.out.println("Title failed!");
		}
		
		Thread.sleep(3000);
//		Driver Close
		driver.close();

	}

}
