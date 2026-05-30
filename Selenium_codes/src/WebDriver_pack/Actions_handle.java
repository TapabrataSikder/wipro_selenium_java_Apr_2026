package WebDriver_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_handle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://demoqa.com/buttons");
//		
////		--- DOuble CLick ---
//		WebElement dc = driver.findElement(By.id("doubleClickBtn"));
//		Thread.sleep(2000);
//		Actions ac = new Actions(driver);
//		ac.doubleClick(dc).perform();
//		Thread.sleep(2000);
//		
////		--- RIght Click ---
//		WebElement rc = driver.findElement(By.id("rightClickBtn"));
//		Thread.sleep(2000);
//		ac.contextClick(rc).perform();
//		Thread.sleep(2000);
//		
////		--- Dynamic Click ---
//		WebElement dyc = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
//		Thread.sleep(2000);
//		ac.moveToElement(dyc).click().perform();
//		Thread.sleep(2000);
		
//		--- Drag & Drop ---
//		driver.get("https://demoqa.com/droppable");
//		WebElement src = driver.findElement(By.id("draggable"));
//		WebElement tgt = driver.findElement(By.id("droppable"));
//		Actions ac = new Actions(driver);
//		Thread.sleep(2000);
//		ac.dragAndDrop(src, tgt).perform();
		
//		--- SLIDER ---
//		driver.get("https://demoqa.com/slider");
//		WebElement sl = driver.findElement(By.id("slider"));
//		Actions ac1 = new Actions(driver);
//		Thread.sleep(2000);
//		ac1.dragAndDropBy(sl, 0, 50).perform(); // move right
//		Thread.sleep(2000);
//		ac1.dragAndDropBy(sl, -20, 0).perform(); // move left
		
//		--- MOUSE HOVER ---
		driver.get("https://testautomationpractice.blogspot.com/");
        WebElement sr=driver.findElement(By.xpath("(//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[1]"));
        Actions ac=new Actions(driver);
        WebElement moc=driver.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"));
        Thread.sleep(2000);
        ac.moveToElement(moc).perform();
        Thread.sleep(2000);
        

	}

}
