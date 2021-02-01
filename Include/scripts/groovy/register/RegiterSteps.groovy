package register
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



class RegiterSteps {
	@Given("User navigate to home page")
	def navigateHomePage() {

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.bigc.vn/')
		WebUI.maximizeWindow()
	}

	@When("Click Regiter button")
	def ClickRegiterbutton() {

		WebUI.click(findTestObject('Object Repository/Register/Page_Gi lun lun thp  Big C Supercenter/a_NG K'))
	}

	@And("User enters (.*) and (.*) and (.*) and (.*)")
	def enterData(String firstname, String lastname, String email, String phone){
		
		WebUI.setText(findTestObject('Object Repository/Register/Page_Gi lun lun thp  Big C Supercenter/input_Bn ch mt cha y 60s  ng k. Mt ln thc h_9dd15d'),firstname)
		WebUI.setText(findTestObject('Object Repository/Register/Page_Gi lun lun thp  Big C Supercenter/input_Bn ch mt cha y 60s  ng k. Mt ln thc h_128395'),lastname)
		WebUI.setText(findTestObject('Object Repository/Register/Page_Gi lun lun thp  Big C Supercenter/input_Bn ch mt cha y 60s  ng k. Mt ln thc h_0016b1'),email)
		WebUI.setText(findTestObject('Object Repository/Register/Page_Gi lun lun thp  Big C Supercenter/input_a ch email khng hp l._phone'),phone)
	}

	@And("User choices (.*)")
	def ChoiceOptionAddress(String option){
		println ("here is ChoiceOptionAddress")
		WebUI.selectOptionByValue(findTestObject('Object Repository/Register/Page_Gi lun lun thp  Big C Supercenter/select_Chn ca hng gn bn                    _d54a35'),option, true)
	}

	@And("User enters password (.*) and confirm password (.*)")
	def EnterPassword(String password, String confirmPassword){

		WebUI.setEncryptedText(findTestObject('Object Repository/Register/Page_Gi lun lun thp  Big C Supercenter/input_Bn ch mt cha y 60s  ng k. Mt ln thc h_b3d1e1'),password)
		WebUI.setEncryptedText(findTestObject('Object Repository/Register/Page_Gi lun lun thp  Big C Supercenter/input_Bn ch mt cha y 60s  ng k. Mt ln thc h_c6775d'),confirmPassword)
	}

	@And("Click checkmark gender")
	def ClickCheckmarkGender() {
		println ("\n here is ClickCheckmarkGender ")
		WebUI.click(findTestObject('Object Repository/Register/Page_Gi lun lun thp  Big C Supercenter/span_Bn ch mt cha y 60s  ng k. Mt ln thc hi_4ca467'))
	}

	@Then("Click Continue button")
	def ClickContinuebutton() {
		println ("\n here is ClickContinuebutton button ")
		WebUI.click(findTestObject('Object Repository/Register/Page_Gi lun lun thp  Big C Supercenter/button_TIP TC'))
		WebUI.closeBrowser()
	}
	

}