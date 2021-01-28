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
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Usser navigate Big C hompage")
		def navigatePage() {
		
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.bigc.vn/')
		WebUI.maximizeWindow()
	}


	@When("Click Login button in Homepage")
	def Click_Login_button() {
		WebUI.click(findTestObject('Object Repository/MienTrungBigC/Page_Gi lun lun thp  Big C Supercenter/a_NG NHP'))
	}
	

	@And("Input username (.*) and password (.*) to Login")
	def InputData(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/MienTrungBigC/Page_Gi lun lun thp  Big C Supercenter/input_NG K_email'),username)
		WebUI.setEncryptedText(findTestObject('Object Repository/MienTrungBigC/Page_Gi lun lun thp  Big C Supercenter/input_NG K_password'),password)
	}
	
	@And("Click Submit button to Login")
	def Click_Submit_button() {
		WebUI.click(findTestObject('Object Repository/MienTrungBigC/Page_Gi lun lun thp  Big C Supercenter/button_NG NHP'))
	}
	
	@And("Click Find Market button")
	def Click_FindMarket_button() {
		WebUI.click(findTestObject('Object Repository/MienTrungBigC/Page_Gi lun lun thp  Big C Supercenter/a_Tm siu th'))
	}
	
	@And("Click Mien Trung tag")
	def Click_MienTrung_Tag() {
		WebUI.click(findTestObject('Object Repository/MienTrungBigC/Page_Tm siu th  Tm a ch  Big C Supercenter/a_Min Trung'))
	}
	
	@Then("I verify the (.*) and (.*) in step")
	def VerifyDataDisplay(String title, String description ) {
		assert WebUI.getText(findTestObject("Object Repository/MienTrungBigC/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_Big C  NNG"))==title
		assert WebUI.getText(findTestObject("Object Repository/MienTrungBigC/Page_Tm siu th  Tm a ch  Big C Supercenter/p_Khu thng Mi Vnh Trung, 255-257 Hng Vng, Q_092fcc"))==description
		WebUI.closeBrowser()
	}
}