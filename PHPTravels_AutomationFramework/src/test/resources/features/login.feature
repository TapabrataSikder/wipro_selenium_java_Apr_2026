Feature: PHPTravels Login Module

  @Smoke @Regression @Login
  Scenario Outline: Validate Login Functionality
    Given user launches browser
    When user enters "<username>" and "<password>"
    And clicks on login button
    Then validate login result

    Examples: 
      | username            | password            |
      | user@phptravels.com | demouser            |
      | invalid@gmail.com   | invalid             |
      | demouser            |                     |
      |                     | user@phptravels.com |
      
	
	@Registration
  	Scenario: Validate User Registration Functionality
    Given user navigates to the registration page
    When user enters mandatory registration details
    And selects country dynamically
    And clicks on register button
    Then validate successful registration
    
   @HotelSearch
  Scenario: Validate Hotel Search Functionality
    Given user is logged into the application
    When user navigates to the hotel search section
    And enters destination and booking configurations
    And clicks search button
    Then validate hotel search results are displayed
    
    @HotelFilter
  Scenario: Validate Hotel Search Filters and Dynamic Price Updates
    Given user is logged into the application
    When user navigates to the hotel search section
    And enters destination and booking configurations
    And clicks search button
    Then validate hotel search results are displayed
    When user applies a price filter or reads the room price
    Then validate that the displayed hotel price matches the expected value range
    
	@CompleteBooking
	Scenario: Validate complete end to end hotel booking workflow
	Given user is logged into the application
	When user navigates to the hotel search section
	And enters destination and booking configurations
	And clicks search button
	Then validate hotel search results are displayed
	When user selects price range and choose more details 
	And user enters traveler mandatory details
	And confirms booking order
	Then validate that the booking confirmation message is displayed
 
    