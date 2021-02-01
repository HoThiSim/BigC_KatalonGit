@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario outline
    Given User navigate to home page
    When Click Regiter button
    And User enters <firstname> and <lastname> and <email> and <phone>
    And User choices <option>
    And User enters password <password> and confirm password <confirmPassword>
    And Click checkmark gender
    Then Click Continue button

    Examples: 
      | firstname | lastname | email                                        | phone      | option | password     | confirmPassword |
      | Ho        | Sim      | simho140200@gmail.com                        | 0395834333 |     15 | dVZ3mOA9R9w= | dVZ3mOA9R9w=    |
      | Nguyen    | Nga      | nga.nguyen@student.passerellesnumeriques.org | 0986755354 |     14 | cLCWEJFdVfI= | cLCWEJFdVfI=    |
