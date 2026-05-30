Feature: verify ninja cart checkout functionality

@core
Scenario Outline: verify cart button 
  Given login page should be open in default browser
  When click on email address field and add valid email "tapa@gmail.com"
  And then click on password field and enter valid "admin@123"
  And now click on login button "success"
  Then login successfully and redirect to ninja home page
  And ninja search input field receives "<input>"
  Then ninja custom product list matches criteria
  When user clicks on add to cart button for the item
  Then product should be added to cart successfully
  When user clicks on the black shopping cart button
  And clicks on the checkout option
  Then user should be redirected to the checkout page

Examples:
  | input   |
  | iphone |
