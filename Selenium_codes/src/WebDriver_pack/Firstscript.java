package WebDriver_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) throws InterruptedException {
//		Step-1: paste url in default browser
//			 2:	verify after click on selenium -> redirect to home page

//		1. CREATE WEB DRIVER OBJECT
		WebDriver driver = new ChromeDriver();
		
//		2. Navigate to url(Webpage URL)
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(5000); // After 5s automatically redirect to the link 
		
//		3. Find Element
		driver.findElement(By.id("Layer_1")).click();
		Thread.sleep(5000);
		
//		4. Driver Close
		driver.close();
	}

}
