package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchModuleTest {
    
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
    }

    // DATA PROVIDER
    @DataProvider(name = "searchData")
    public Object[][] getSearchData() {
        return new Object[][] {
            { "Mac" },
            { "iPhone" },
            { "Samsung" }
        };
    }

    @Test(dataProvider = "searchData")
    public void testProductSearch(String productName) {
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys(productName);
        
        // Click the search button
        WebElement searchButton = driver.findElement(By.cssSelector("#search button"));
        searchButton.click();
        
        // Verification: Get the actual page title and check i it contains product name
        String actualTitle = driver.getTitle();
        String expectedTitleContains = "Search - " + productName;
        
        System.out.println("Verifying search results for: " + productName);
        
        // Assert checks if our test actually passed or failed
        Assert.assertTrue(actualTitle.contains(expectedTitleContains), 
                "Title did not match the searched product!");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}