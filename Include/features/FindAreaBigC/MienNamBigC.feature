@tag
Feature: FindArea
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Mien Nam
    Given Usser navigate Big C hompage mien nam
    And Click Find Market button to display mien nam
    And Click Mien Nam tag
    Then I verify Binh Duong <binhduong> by <binhduongdetail> and DaLat address <contho> by <conthodetail> and Da Lat address <dalat> by <dalatdetail> and Di An address <dian> by <diandetail> and Dong Nai address <dongnai> by <dongnaidetail>
    Examples: 
     
      | binhduong| binhduongdetail | contho | conthodetail | dalat | dalatdetail | dian |diandetail | dongnai | dongnaidetail |
      | Big C BÌNH DƯƠNG | Phường Hiệp Thành, TP. Thủ Dầu Một, Tỉnh Bình Dương |GO! CẦN THƠ | Lô số 1, Khu Dân Cư Hưng Phú 1, Phường Hưng Phú, Quận Cái Răng, TP. Cần Thơ | Big C ĐÀ LẠT |Quảng trường trung tâm Đà Lạt, Đường Trần Quốc Toản, Phường 1, Thành Phố Đà Lạt|GO! DĨ AN |Phường Đông Hòa, Thị Xã Dĩ An, Tỉnh Bình Dương | Big C ĐỒNG NAI |Số 833, Xa lộ Hà Nội, Phường Long Bình Tân, Thành Phố Biên Hòa, Tỉnh Đồng Nai ( Ngã 4 Vũng Tàu)|
      
      