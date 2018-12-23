Feature: Background test

	Background: I start the result variable to 0
		Given I have 0
		
  Scenario: Scenario with background    
    When I add 5
    Then the result is 5

