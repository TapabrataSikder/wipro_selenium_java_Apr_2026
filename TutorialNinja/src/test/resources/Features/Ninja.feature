Feature: Tutorial Ninja Test validation

@Smoke
Scenario Outline: Reister user with valid details
	
	Given user open registration page
	When user register with first name <firstname> last name <lastname> phone <phone> password <password>
	Then Successfull registration
	When user log out after register
	
	Examples:
	|firstname|lastname|phone|password|
	|Tapa|Sikder|7439073905|admin@123|

@Regression
Scenario Outline: login with register user
	Given user open login page
	When user login with password <password>
	Then successfull login
	
	Examples:
	|password|
	|admin@123|

@Regression	
Scenario Outline: search products
	Given user on home page
	When user search product <product>
	Then product should be displayed
	
	Examples:
	|product|
	|iphone|
	|samsung|
	|pay|

@regression
Scenario Outline: add product to cart
	Given user on home page
	When user search product <product>
	And user add product to cart
	Then product added successfully
	
	Examples:
	|product|
	|iphone|

@regression	
Scenario Outline: view cart
	When user open the cart
	And click on view cart option
	Then cart page open successfully

@Regression	
Scenario Outline: Checkout and Logout
	Given user is on the cart page
	When user clicks on the checkout button
	And completes the checkout process details
	Then order should be placed successfully
	And user logs out from the application
