package findAreaBigC
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class MienTrungBigCSteps {

	@Given("Usser navigate Big C hompage mien trung")
	def navigatePage() {

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.bigc.vn/')
		WebUI.maximizeWindow()
	}

	@Then("Click Find Market button to display mien trung")
	def Click_FindMarket_button() {
		WebUI.click(findTestObject('Object Repository/test/Page_Gi lun lun thp  Big C Supercenter/a_Tm siu th'))
	}

	@And("Click Mien Trung tag")
	def Click_MienTrung_Tag() {
		WebUI.click(findTestObject('Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/a_Min Trung'))
	}

	@Then("I verify Da Nang address (.*) by (.*) and Hue address (.*) by (.*)  and Nha Trang address (.*) by (.*) and Quy Nhon address (.*) by (.*) in step")
	def VerifyDataDisplay(String danang,String danangdetail, String hue, String huedetail, String nhatrang, String nhatrangdetail , String quynhon, String quynhondetail) {

		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_Big C  NNG"))==danang
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/p_Khu thng Mi Vnh Trung, 255-257 Hng Vng, Q_092fcc"))==danangdetail

		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_Big C HU"))==hue
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/p_174 B Triu, Phng Ph Hi, TP. Hu, Tnh Tha Thin Hu"))==huedetail

		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_GO NHA TRANG"))==nhatrang
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/p_L s 4, ng 195, Khu  th Vnh im Trung, X Vn_ac84f4"))==nhatrangdetail

		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_Big C QUY NHN"))==quynhon
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/p_TTTM Kim Cc, Khu  th Xanh Vng Chua, Phng _153ac7"))==quynhondetail

		WebUI.closeBrowser()
	}
}