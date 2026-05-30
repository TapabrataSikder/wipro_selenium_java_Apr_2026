package WebDriver_pack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tira_beauty_automate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		try {
			// Navigate  to Tira Beauty Homepage
			driver.get("https://www.tirabeauty.com/");
			System.out.println("Navigated to Tira Beauty.");
			Thread.sleep(3000); 

			// STEP 1: LOCATE AND ENTER THE SKIN/HAIR QUIZ FINDER

			// Locating using a visible text anchor or direct header navigation link
			WebElement quizBtn = wait.until(ExpectedConditions.elementToBeClickable(
					By.id("haptik-chatbot-icon-tag")));
			quizBtn.click();
			System.out.println("Successfully opened the Quiz.");
			Thread.sleep(2000);

			// ====================================================================
			// STEP 2: INTERACT WITH THE DYNAMIC CONSULTATION QUIZ
			// ====================================================================
			// Start Button Interaction
//			WebElement startQuizBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("start-quiz-button")));
//			startQuizBtn.click();
//			Thread.sleep(1500);
//
//			// Question 1: Skin Type Identification (e.g., Selecting 'Oily' or 'Acne-Prone')
//			// Using beginner friendly attribute-based XPaths
//			WebElement skinTypeOption = wait.until(ExpectedConditions.elementToBeClickable(
//					By.xpath("//div[@data-quiz-option='oily'] | //span[contains(text(), 'Oily')]/parent::div")));
//			skinTypeOption.click();
//			System.out.println("Selected Skin Profile Type: Oily / Acne-Prone.");
//			Thread.sleep(1500);
//			
//			// Click the Next button navigation
//			driver.findElement(By.xpath("//button[text()='Next' or contains(@class, 'next-btn')]")).click();
//			Thread.sleep(1500);
//
//			// Question 2: Primary Skin Concerns (e.g., Selecting 'Acne & Blemishes')
//			WebElement concernOption = wait.until(ExpectedConditions.elementToBeClickable(
//					By.xpath("//span[contains(text(), 'Acne') or contains(text(), 'Blemishes')]/ancestor::div[contains(@class, 'card')]")));
//			concernOption.click();
//			System.out.println("Selected Skin Concern: Acne and Core Blemishes.");
//			Thread.sleep(1500);
//			
//			driver.findElement(By.xpath("//button[text()='Next' or contains(@class, 'next-btn')]")).click();
//			Thread.sleep(1500);
//
//			// Question 3: Budget Boundaries selection
//			WebElement budgetOption = wait.until(ExpectedConditions.elementToBeClickable(
//					By.xpath("//span[contains(text(), 'Mid-Range') or contains(text(), 'Budget Friendly')]")));
//			budgetOption.click();
//			System.out.println("Selected Budget Tier Criteria.");
//			Thread.sleep(1500);
//
//			// Finalizing the Assessment
//			WebElement submitQuizBtn = driver.findElement(By.xpath("//button[contains(text(), 'Submit') or contains(text(), 'Results')]"));
//			submitQuizBtn.click();
//			System.out.println("Form sent. Compiling tailored product configurations...");
//			Thread.sleep(4000); // Give the system engine extra time to generate personalized recommendation arrays
//
//			// ====================================================================
//			// STEP 3: REFINE RECOMMENDED ROUTINE VIEWS (Cleanser + Serum + Sunscreen)
//			// ====================================================================
//			// Verify curated catalog header presence
//			WebElement resultsHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(
//					By.xpath("//h1[contains(text(), 'Your Recommended Routine') or contains(@class, 'results-title')]")));
//			System.out.println("Results validated successfully: " + resultsHeader.getText());
//
//			// Target and collect the top matched elements matching the routine cards
//			List<WebElement> recommendedProducts = driver.findElements(By.className("product-card-container"));
//			System.out.println("Total curated routine items discovered: " + recommendedProducts.size());
//
//			// ====================================================================
//			// STEP 4: APPLY EXTRA REFINEMENT FILTERS (Price / Brand Filter)
//			// ====================================================================
//			WebElement brandFilterAccordion = wait.until(ExpectedConditions.elementToBeClickable(
//					By.xpath("//div[text()='Brand' or contains(text(), 'Brands')]")));
//			js.executeScript("arguments[0].scrollIntoView({block: 'center'});", brandFilterAccordion);
//			brandFilterAccordion.click();
//			Thread.sleep(1500);
//
//			// Select a specific trusted brand filter checkbox
//			WebElement targetBrandCheckbox = wait.until(ExpectedConditions.elementToBeClickable(
//					By.xpath("//label[contains(text(), 'The Derma Co') or contains(text(), 'Minimalist')]/preceding-sibling::input | //span[contains(text(), 'Minimalist')]")));
//			targetBrandCheckbox.click();
//			System.out.println("Brand filtration criteria successfully matched.");
//			Thread.sleep(3000); // Let layout update cleanly
//
//			// ====================================================================
//			// STEP 5: ADD THE TAILORED REQUISITE TO THE BAG CART
//			// ====================================================================
//			// Locate the first relevant recommended items action trigger button container
//			WebElement primaryAddToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(
//					By.xpath("(//button[contains(text(), 'Add to Bag') or contains(text(), 'Add to Cart')])[1]")));
//			
//			// Scroll into view safely to avoid intersecting layered mobile wrappers
//			js.executeScript("arguments[0].scrollIntoView({block: 'center'});", primaryAddToCartBtn);
//			Thread.sleep(1000);
//			
//			primaryAddToCartBtn.click();
//			System.out.println("Curated recommendation successfully added to the Shopping Bag!");
//			Thread.sleep(3000);
//
		} catch (Exception e) {
			System.out.println("An unexpected layout error halted the script validation: " + e.getMessage());
			e.printStackTrace();
		} finally {
//			driver.quit();
			System.out.println("Browser shut down successfully.");
		}
	}

}
