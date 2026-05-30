package Testing_package;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class LoginValidation_DemoQA {
	
    @DataProvider(name="data")
    public Object[][] dp1() {
        return new Object[][] {
            {"Tapa", "Sikder", "tapa@gmail.com", "2134567890"},
            {"John", "Cena", "john@gmail.com", "9134554890"},
            {"Virat", "Kohli", "virat@gmail.com", "9876543210"},
        };
    }
    
    @Test(dataProvider="data")
    public void f(String name1, String name2, String mail, String num) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demoqa.com/automation-practice-form");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement fname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
        fname.sendKeys(name1);
        
        WebElement lname = driver.findElement(By.id("lastName"));
        lname.sendKeys(name2);
        
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys(mail);
  
        WebElement genderRadio = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//label[@for='gender-radio-1']")));
        genderRadio.click();
        
        WebElement mob = driver.findElement(By.id("userNumber"));
        mob.sendKeys(num);

        WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        Assert.assertTrue(submitBtn.isDisplayed(), "Submit button is missing from the layout layout context");

        Actions actions = new Actions(driver);
        actions.moveToElement(submitBtn).perform();

        submitBtn.click();

        System.out.println("Submitted Data for: " + name1);

        Thread.sleep(2000);

        driver.quit();
    }
}