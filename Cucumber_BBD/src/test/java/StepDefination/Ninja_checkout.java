//package StepDefination;
//
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Ninja_checkout {
//
//    @When("user clicks on the black shopping cart button")
//    public void user_clicks_on_the_black_shopping_cart_button() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(Ninja_Login.driver, Duration.ofSeconds(10));
// 
//        WebElement cartHeaderButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cart-total")));
//        cartHeaderButton.click();
//        System.out.println("Opened the header shopping cart widget dropdown.");
//        Thread.sleep(1000); 
//        
//        WebElement viewCart = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("View Cart")));
//        viewCart.click();
//        System.out.println("Opened cart");
//        Thread.sleep(1000);
//    }
//
//    @When("clicks on the checkout option")
//    public void clicks_on_the_checkout_option() {
//        WebDriverWait wait = new WebDriverWait(Ninja_Login.driver, Duration.ofSeconds(10));
//
//        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(
//            By.linkText("Checkout")
//        ));
//        checkoutButton.click();
//        System.out.println("Clicked on checkout button.");
//    }
//
//    @Then("user should be redirected to the checkout page")
//    public void user_should_be_redirected_to_the_checkout_page() {
//
//    	
//    	System.out.println("Checked Out Successfully.");
//    }
//}