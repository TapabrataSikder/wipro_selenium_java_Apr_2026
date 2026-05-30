Feature: verify search functionality
Scenario Outline: verify search buttons 
Given login page should be open i default browser
When click on username field and add valid user name
And then click on password button and enter valid password
And now click on submit button
And go to search button and click add inputs <input>
Then list of products
Examples:
|input|
|account|
|pay|
|state|