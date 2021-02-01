@tag
Feature: FindArea
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Mien Trung
    Given Usser navigate Big C hompage mien trung
    Then Click Find Market button to display mien trung
    And Click Mien Trung tag
    Then I verify Da Nang address <danang> by <danangdetail> and Hue address <hue> by <huedetail>  and Nha Trang address <nhatrang> by <nhatrangdetail> and Quy Nhon address <quynhon> by <quynhondetail> in step

    Examples: 
      | danang        | danangdetail                                                               | hue       | huedetail                                                  | nhatrang      | nhatrangdetail                                                                              | quynhon        | quynhondetail                                                                            |
      | Big C ĐÀ NẴNG | Khu thương Mại Vĩnh Trung, 255-257 Hùng Vương, Quận Thanh Khê, TP. Đà Nẵng | Big C HUẾ | 174 Bà Triệu, Phường Phú Hội, TP. Huế, Tỉnh Thừa Thiên Huế | GO! NHA TRANG | Lô số 4, đường 19/5, Khu đô thị Vĩnh Điềm Trung, Xã Vĩnh Hiệp, TP Nha Trang, Tỉnh Khánh Hòa | Big C QUY NHƠN | TTTM Kim Cúc, Khu đô thị Xanh Vũng Chua, Phường Ghềnh Ráng, TP. Quy Nhơn, Tỉnh Bình Định |
