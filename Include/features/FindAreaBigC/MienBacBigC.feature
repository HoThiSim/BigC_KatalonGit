@tag
Feature: FindArea
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Mien Nam
    Given Usser navigate Big C hompage mien bac
    When Click Find Market button to display mien bac
    And Click Mien Bac tag
    Then I verify Bac Giang <bacgiang> by <bacgiangdetail> and Ha Long <halong> by <halongdetail> and Hai Duong <haiduong> by <haiduongdetail> and Hai Phong <haiphong> by <haiphongdetail>

    Examples: 
      | bacgiang        | bacgiangdetail                                   | halong      | halongdetail                                               | haiduong        | haiduongdetail                                                     | haiphong        | haiphongdetail                                                                                                            |
      | Big C BẮC GIANG | Xã Tân Tiến, Thành Phố Bắc Giang, Tỉnh Bắc Giang | GO! HẠ LONG | Cột 5, Phường Hồng Hải, Thành phố Hạ Long, Tỉnh Quảng Ninh | Big C HẢI DƯƠNG | Khu TTTM Ngọc Châu, Phường Nhị Châu, TP. Hải Dương, Tỉnh Hải Dương | Big C HẢI PHÒNG | Lô 1/20, Khu Đô Thị Mới Ngã Năm, Sân Bay Cát Bi, Quận Ngô Quyền, TP. Hải Phòng (Ngã Tư Lê Hồng Phong - Nguyễn Bỉnh Khiêm) |
