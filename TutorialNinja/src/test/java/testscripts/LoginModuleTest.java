package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginModuleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
            { "validuser123@gmail.com", "Password123", "valid" },
            { "wronguser@gmail.com", "WrongPass", "invalid" }
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String email, String password, String type) {
        driver.findElement(By.id("input-email")).sendKeys(email);
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.cssSelector("input.btn-primary")).click();

        if (type.equals("valid")) {
            Assert.assertEquals(driver.getTitle(), "My Account", "Valid login failed!");
        } else {
            boolean isWarningDisplayed = driver.findElement(By.cssSelector(".alert-danger")).isDisplayed();
            Assert.assertTrue(isWarningDisplayed, "Error message not displayed for invalid login!");
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}