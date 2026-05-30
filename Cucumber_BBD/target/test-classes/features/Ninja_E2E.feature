@NinjaEndToEndOnly
Feature: TutorialsNinja E-Commerce End-to-End Flow

  Scenario Outline: Successful E2E purchase cycle from login to checkout
    Given login page should be open in default browser matching excel workflow
    When click on email address field and add valid email "<email>" to excel field
    And then click on password field and enter valid "<password>" to excel field
    And now click on login button "<status>" to excel field
    Then login successfully and redirect to ninja home page

    When ninja search input field receives "<product>"
    Then ninja custom product list matches criteria

    When user clicks on add to cart button for the item
    Then product should be added to cart successfully

    When user clicks on the black shopping cart button
    And user updates the item quantity in the cart view
    And clicks on the checkout option
    Then user should be redirected to the checkout page
    And user logs out from the application

    Examples: 
      | email          | password  | status  | product |
      | tapa@gmail.com | admin@123 | success | MacBook |