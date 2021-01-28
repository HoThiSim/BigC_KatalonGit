@tag
Feature: FindArea
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Mien Nam
    Given Usser navigate Big C hompage mien bac
    When Click Find Market button to display mien bac
    And Click Mien Bac tag
    Then I verify Bac Giang <bacgiang> by <bacgiangdetail> and Ha Long <halong> by <halongdetail>
    Examples: 
     
      | bacgiang| bacgiangdetail |halong | halongdetail |
      | Big C BẮC GIANG | Xã Tân Tiến, Thành Phố Bắc Giang, Tỉnh Bắc Giang |GO! HẠ LONG | Cột 5, Phường Hồng Hải, Thành phố Hạ Long, Tỉnh Quảng Ninh|
      
      