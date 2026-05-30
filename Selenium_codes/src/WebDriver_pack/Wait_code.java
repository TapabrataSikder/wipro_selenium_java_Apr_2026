//package WebDriver_pack;
//
//import java.util.NoSuchElementException;
//import java.util.function.Function;
//
//import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//
//public class Wait_code {
//
//	public static void main(String[] args) {
//		
//		WebDriver driver = new ChromeDriver();
//		
//		//		implicit wait - used for all element(global)
////		explicit wait - used for particular element(element based)
////		fluent wait - used for specific eWebDriver		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(NoSuchElementException.class);
//		
//		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.id("dynamicElement"));
//			}
//		})
//	}
//
//}
