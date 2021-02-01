@tag
Feature: Login

  @tag1
  Scenario Outline: Login Fail Alert
    Given Navigate to login form Alert
    When Click login tag Alert
    And Input username <username> and password <password> to Login Alert
    And Click Login button Alert
    Then I verify the error message <errorAlert> in step Alert

    Examples: 
      | username                                   | password     | errorAlert      |
      | sim.ho21@student.passerellesnumeriques.org | HqF8MoZrB1A= |×|
