//package StepDefination;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Ninja_search {
//
//    @When("ninja search input field receives {string}")
//    public void go_to_search_button_and_click_add_inputs(String searchKeyword) throws InterruptedException {
//
//        WebElement searchBar = Ninja_Login.driver.findElement(By.name("search"));
//        searchBar.clear();
//        searchBar.sendKeys(searchKeyword);
//
//        WebElement searchButton = Ninja_Login.driver.findElement(By.cssSelector("button.btn-default.btn-lg"));
//        searchButton.click();
//        Thread.sleep(2000);
//        System.out.println("Search executed for: " + searchKeyword);
//    }
//
//    @Then("ninja custom product list matches criteria")
//    public void list_of_products() {
//        boolean isResultHeaderDisplayed = Ninja_Login.driver.findElement(By.xpath("//h2[text()='Products meeting the search criteria']")).isDisplayed();
//        Assert.assertTrue(isResultHeaderDisplayed, "Search results page failed to display.");
//        System.out.println("Search results verified successfully.");
//    }
//}