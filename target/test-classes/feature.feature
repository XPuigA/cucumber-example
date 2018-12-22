Feature: Arithmetic test
  Test some basic arithmetic operations
  
  Scenario: Addition
    When I add 9 and 3
    Then the result is 12
    
  Scenario: Subtraction
  	When I subtract 9 and 3
  	Then the result is 6
  	
  Scenario: Subtraction
  	When I multiply 9 and 3
  	Then the result is 27
  	
  Scenario: Division
  	When I divide 9 and 3
  	Then the result is 3
  	
  Scenario: Multiple operations
  	Given I have 19
  	When I subtract 9
  	And I multiply 5
  	And I divide 2
  	And I add 2
  	Then the result is 27