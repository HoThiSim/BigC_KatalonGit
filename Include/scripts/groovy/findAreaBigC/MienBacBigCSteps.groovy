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



class MienBacBigCSteps {
	@Given("Usser navigate Big C hompage mien bac")
	def navigatePage() {

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.bigc.vn/')
		WebUI.maximizeWindow()
	}

	@When("Click Find Market button to display mien bac")
	def Click_FindMarket_button() {
		WebUI.click(findTestObject('Object Repository/test/Page_Gi lun lun thp  Big C Supercenter/a_Tm siu th'))
	}

	@And("Click Mien Bac tag")
	def Click_MienTrung_Tag() {
		WebUI.click(findTestObject('Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/a_Min Bc'))
	}
	@Then("I verify Bac Giang (.*) by (.*) and Ha Long (.*) by (.*)")
	def VerifyDataDisplay_MienBac(String bacgiang, String bacgiangdetail, String halong, String halongdetail ){
		
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_Big C BC GIANG"))==bacgiang
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/p_X Tn Tin, Thnh Ph Bc Giang, Tnh Bc Giang"))==bacgiangdetail
		
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_GO H LONG"))==halong
		assert WebUI.getText(findTestObject("Object Repository/test/Page_Tm siu th  Tm a ch  Big C Supercenter/p_Ct 5, Phng Hng Hi, Thnh ph H Long, Tnh Qung Ninh"))==halongdetail
		
	
		WebUI.closeBrowser()
		
	}
}