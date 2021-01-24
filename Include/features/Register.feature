
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
    And Click Continue button
    And Click profile button
    And Click duyetWeb 
    Then Click name 


    Examples: 
      | firstname | lastname  |email| phone| option| password| confirmPassword|
      | Tran  | Huyen Trang  |Trang.tran21@student.passerellesnumeriques.org| 354228661| 10| wxUm+suGloA= |wxUm+suGloA=| 
      | Ho  | Sim  |simho140200@gmail.com| 0395834333| 15| dVZ3mOA9R9w= | dVZ3mOA9R9w=| 