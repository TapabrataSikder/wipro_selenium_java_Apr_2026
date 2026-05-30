//package StepDefination;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Ninja_cart {
//
//	@When("user clicks on add to cart button for the item")
//    public void user_clicks_on_add_to_cart_button_for_the_item() throws InterruptedException {
//        WebElement addToCartButton = Ninja_Login.driver.findElement(By.xpath("(//div[@class='button-group']/button[contains(@onclick, 'cart.add')])[1]"));
//        addToCartButton.click();
//        Thread.sleep(2000); 
//        System.out.println("Clicked Add to Cart button.");
//    }
//	
//	@Then("product should be added to cart successfully")
//    public void product_should_be_added_to_cart_successfully() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(Ninja_Login.driver, Duration.ofSeconds(10));
//        
//        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(
//            By.cssSelector(".alert-success, .alert.alert-success")));
//        
//        Thread.sleep(3000);
//        String alertText = successAlert.getText();
//        System.out.println(alertText);
//        
//        Assert.assertTrue(alertText.contains("Success") || alertText.contains("added"));
//    }
//}
