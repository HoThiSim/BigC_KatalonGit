
@tag
Feature: News

  @tag1
  Scenario Outline: Title of your scenario outline
    Given Navigate to homepage to display news
    When Click News BigC tag
    Then I verify poster including Div <hotnews> and Div <date>

    Examples: 
      |hotnews|date|
      |TIN NỔI BẬT | 01 THÁNG 10, 2020 |