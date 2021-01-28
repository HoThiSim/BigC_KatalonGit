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



class MienNamBigCSteps {

	@Given("Usser navigate Big C hompage mien nam")
	def navigatePage() {

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.bigc.vn/')
		WebUI.maximizeWindow()
	}

	@And("Click Find Market button to display mien nam")
	def Click_FindMarket_button() {
		WebUI.click(findTestObject('Object Repository/test/Page_Gi lun lun thp  Big C Supercenter/a_Tm siu th'))
	}

	@And("Click Mien Nam tag")
	def Click_MienTrung_Tag() {
		WebUI.click(findTestObject('Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/a_Min Nam'))
	}
	@Then("I verify Binh Duong (.*) by (.*) and DaLat address (.*) by (.*) and Da Lat address (.*) by (.*) and Di An address (.*) by (.*) and Dong Nai address (.*) by (.*)")
	def VerifyDataDisplay(String binhduong, String binhduongdetail, String contho, String conthodetail, String dalat, String dalatdetail, String dian, String diandetail, String dongnai, String dongnaidetail ){
		
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_Big C BNH DNG"))==binhduong
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/p_Phng Hip Thnh, TP. Th Du Mt, Tnh Bnh Dng"))==binhduongdetail
		
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_GO CN TH"))==contho
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/p_L s 1, Khu Dn C Hng Ph 1, Phng Hng Ph, Qu_73f97c"))==conthodetail
		
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_Big C  LT"))==dalat
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/p_Qung trng trung tm  Lt, ng Trn Quc Ton, P_652dc8"))==dalatdetail
		
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_GO D AN"))==dian
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/p_Phng ng Ha, Th X D An, Tnh Bnh Dng"))==diandetail
		
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_Big C NG NAI"))==dongnai
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/p_S 833, Xa l H Ni, Phng Long Bnh Tn, Thnh _ca2d99"))==dongnaidetail
		
		WebUI.closeBrowser()
		
	}
}