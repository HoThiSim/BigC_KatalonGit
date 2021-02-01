package login
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



class LoginFailAlertSteps {
	@Given("Navigate to login form Alert")
	def NavigatLoginForm() {

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.bigc.vn/')
		WebUI.maximizeWindow()
	}

	@When("Click login tag Alert")
	def ClickLoginTag() {
		WebUI.click(findTestObject('Object Repository/LoginFail/Page_Gi lun lun thp  Big C Supercenter/a_NG NHP'))
	}

	@And("Input username (.*) and password (.*) to Login Alert")
	def InputDataLogin(String username, String password){
		WebUI.setText(findTestObject('Object Repository/LoginScript/Page_Gi lun lun thp  Big C Supercenter/input_NG K_email'), username)

		WebUI.setEncryptedText(findTestObject('Object Repository/LoginScript/Page_Gi lun lun thp  Big C Supercenter/input_NG K_password'),password)
	}
	@And("Click Login button Alert")
	def ClickLoginButton(){
		WebUI.click(findTestObject('Object Repository/LoginFail/Page_Gi lun lun thp  Big C Supercenter/button_NG NHP'))
	}

	@Then("I verify the error message (.*) in step Alert")
	def VerifyErrorMessage(String errorAlert) {
		assert WebUI.getText(findTestObject("Object Repository/LoginFailAlert/Page_Gi lun lun thp  Big C Supercenter/div_exception_error"))==errorAlert
		WebUI.closeBrowser()
	}
}