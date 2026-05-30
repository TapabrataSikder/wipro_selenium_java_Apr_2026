package WebDriver_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_tira {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tirabeauty.com/");
		driver.findElement(By.id("search")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("search")).sendKeys("virat kholi"); // auto type in the search input
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER); // Pressing Enter Key from keyboard
//		Thread.sleep(3000);
//		driver.close();

	}

}
