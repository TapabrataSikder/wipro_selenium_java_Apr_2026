package StepDefination;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import POM_test.ExcelHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ninja_E2E {
    WebDriver driver;
    Ninja_E2E_POM ninjaPage;
    
    String excelUser;
    String excelPass;
    String excelStatus;
    
    @Given("^login page should be open in default browser matching excel workflow$")
    public void login_page_should_be_open_in_default_browser_matching_excel_workflow() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        
        ninjaPage = new Ninja_E2E_POM(driver);
        
        // Fetch values from Excel Sheet1
        excelUser = ExcelHandler.getCellData(1, 0);
        excelPass = ExcelHandler.getCellData(1, 1);
        excelStatus = ExcelHandler.getCellData(1, 2);
    }
    
    @When("^click on email address field and add valid email \"([^\"]*)\" to excel field$")
    public void click_on_email_address_field_to_excel_field(String featureEmail) {
        // This single consolidated method logs you completely into the application
        ninjaPage.loginStep(excelUser, excelPass); 
    }

    // FIXED: Changed phrase mapping to match feature file uniquely
    @When("then click on password field and enter valid {string} to excel field")
    public void then_click_on_password_field_to_excel_field(String featurePass) {
        // Intentionally blank since loginStep handles this
    }

    // FIXED: Changed phrase mapping to match feature file uniquely
    @When("now click on login button {string} to excel field")
    public void now_click_on_login_button_to_excel_field(String featureStatus) {
        // Intentionally blank since loginStep handles this
    }

    @Then("^login successfully and redirect to ninja home page$")
    public void login_successfully_and_redirect_to_ninja_home_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Account"));
        Assert.assertEquals(driver.getTitle(), "My Account");
    }

    @When("^ninja search input field receives \"([^\"]*)\"$")
    public void ninja_search_input_field_receives(String product) {
        ninjaPage.searchProduct(product);
    }

    @Then("^ninja custom product list matches criteria$")
    public void ninja_custom_product_list_matches_criteria() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement resultHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//h2[text()='Products meeting the search criteria'] | //h1[contains(.,'Search')]")
        ));
        Assert.assertTrue(resultHeading.isDisplayed());
    }

    @When("^user clicks on add to cart button for the item$")
    public void user_clicks_on_add_to_cart_button_for_the_item() throws InterruptedException {
        ninjaPage.clickAddToCart();
        Thread.sleep(2000); 
    }

    @Then("^product should be added to cart successfully$")
    public void product_should_be_added_to_cart_successfully() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
        Assert.assertTrue(alert.getText().contains("Success"));
    }

    @When("^user clicks on the black shopping cart button$")
    public void user_clicks_on_the_black_shopping_cart_button() {
        ninjaPage.openCartPage();
    }

    @When("^user updates the item quantity in the cart view$")
    public void user_updates_the_item_quantity_in_the_cart_view() throws InterruptedException {
        ninjaPage.updateCartQty("3");
        Thread.sleep(2000);
    }

    @When("^clicks on the checkout option$")
    public void clicks_on_the_checkout_option() {
        ninjaPage.clickCheckout();
    }

    @Then("^user should be redirected to the checkout page$")
    public void user_should_be_redirected_to_the_checkout_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("checkout"));
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout"));
    }

    @Then("^user logs out from the application$")
    public void user_logs_out_from_the_application() {
        ninjaPage.logoutUser();
        if (driver != null) {
            driver.quit();
        }
    }
}