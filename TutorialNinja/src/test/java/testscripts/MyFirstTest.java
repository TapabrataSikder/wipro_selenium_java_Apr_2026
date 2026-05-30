package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

    public static void main(String[] args) {
        
        //  Open the Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        
        //Find the Search Box using its name attribute
        WebElement searchBox = driver.findElement(By.name("search"));
        
        // Type "Mac" into the search box
        searchBox.sendKeys("Mac");

        WebElement searchButton = driver.findElement(By.cssSelector("#search button"));
        searchButton.click();

        System.out.println("The page title is: " + driver.getTitle());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}