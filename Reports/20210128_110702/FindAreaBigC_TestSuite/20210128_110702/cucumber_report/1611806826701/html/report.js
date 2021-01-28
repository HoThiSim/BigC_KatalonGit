$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/PNV/git/BigC_KatalonGit/BigC_KatalonGit/BigC_KatalonGit/BigC_KatalonGit/Include/features/FindAreaBigC/MienTrungBigC.feature");
formatter.feature({
  "name": "FindArea",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Usser navigate Big C hompage",
  "keyword": "Given "
});
formatter.step({
  "name": "Click Find Market button",
  "keyword": "And "
});
formatter.step({
  "name": "Click Mien Trung tag",
  "keyword": "And "
});
formatter.step({
  "name": "I verify Da Nang address \u003cdanang\u003e by \u003cdanangdetail\u003e and Hue address \u003chue\u003e by \u003chuedetail\u003e  and Nha Trang address \u003cnhatrang\u003e by \u003cnhatrangdetail\u003e and Quy Nhon address \u003cquynhon\u003e by \u003cquynhondetail\u003e in step",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "danang",
        "danangdetail",
        "hue",
        "huedetail",
        "nhatrang",
        "nhatrangdetail",
        "quynhon",
        "quynhondetail"
      ]
    },
    {
      "cells": [
        "Big C ĐÀ NẴNG",
        "Khu thương Mại Vĩnh Trung, 255-257 Hùng Vương, Quận Thanh Khê, TP. Đà Nẵng",
        "Big C HUẾ",
        "174 Bà Triệu, Phường Phú Hội, TP. Huế, Tỉnh Thừa Thiên Huế",
        "GO! NHA TRANG",
        "Lô số 4, đường 19/5, Khu đô thị Vĩnh Điềm Trung, Xã Vĩnh Hiệp, TP Nha Trang, Tỉnh Khánh Hòa",
        "Big C QUY NHƠN",
        "TTTM Kim Cúc, Khu đô thị Xanh Vũng Chua, Phường Ghềnh Ráng, TP. Quy Nhơn, Tỉnh Bình Định"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Usser navigate Big C hompage",
  "keyword": "Given "
});
formatter.match({
  "location": "MienTrungBigCSteps.navigatePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Find Market button",
  "keyword": "And "
});
formatter.match({
  "location": "MienTrungBigCSteps.Click_FindMarket_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Mien Trung tag",
  "keyword": "And "
});
formatter.match({
  "location": "MienTrungBigCSteps.Click_MienTrung_Tag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Da Nang address Big C ĐÀ NẴNG by Khu thương Mại Vĩnh Trung, 255-257 Hùng Vương, Quận Thanh Khê, TP. Đà Nẵng and Hue address Big C HUẾ by 174 Bà Triệu, Phường Phú Hội, TP. Huế, Tỉnh Thừa Thiên Huế  and Nha Trang address GO! NHA TRANG by Lô số 4, đường 19/5, Khu đô thị Vĩnh Điềm Trung, Xã Vĩnh Hiệp, TP Nha Trang, Tỉnh Khánh Hòa and Quy Nhon address Big C QUY NHƠN by TTTM Kim Cúc, Khu đô thị Xanh Vũng Chua, Phường Ghềnh Ráng, TP. Quy Nhơn, Tỉnh Bình Định in step",
  "keyword": "Then "
});
formatter.match({
  "location": "MienTrungBigCSteps.VerifyDataDisplay(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
});