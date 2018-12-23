Feature: Arithmetic test
  Test some basic arithmetic operations

  Scenario: Addition
    When I add 9 and 3
    Then the result is 12

  Scenario: Subtraction
    When I subtract 9 and 3
    Then the result is 6

  Scenario: Multiplication
    When I multiply 9 and 3
    Then the result is 27

  Scenario: Division
    When I divide 9 and 3
    Then the result is 3

  Scenario: Division with datatable
    When I divide the following numbers
      | 14 | 2 |
    Then the result is 7

  Scenario: Multiplication with headed datatable
    When I multiply the following numbers represented as String
      | Number1 | Number2 |
      |       5 |       4 |
    Then the result is 20

  Scenario: Multiple operations
    Given I have 19
    When I subtract 9
    And I multiply 5
    And I divide 2
    And I add 2
    Then the result is 27

  Scenario Outline: Multiple operations using outline
    Given I have <original>
    When I subtract <subtract>
    And I multiply <multiply>
    And I divide <divide>
    And I add <add>
    Then the result is <result>

    Examples: 
      | original | subtract | multiply | divide | add | result |
      |       19 |        9 |        5 |      2 |   2 |     27 |
      |        2 |        1 |        1 |      1 |   0 |      1 |