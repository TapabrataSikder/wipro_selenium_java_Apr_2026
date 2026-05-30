Feature: verify ninja search functionality

@core
Scenario Outline: verify search buttons 
  Given login page should be open in default browser
  When click on email address field and add valid email "tapa@gmail.com"
  And then click on password field and enter valid "admin@123"
  And now click on login button "success"
  Then login successfully and redirect to ninja home page
  And ninja search input field receives "<input>"
  Then ninja custom product list matches criteria

Examples:
  | input   |
  | iphone |
  | pay     |