import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.bigc.vn/')

WebUI.click(findTestObject('Object Repository/MienTrung/Page_Gi lun lun thp  Big C Supercenter/a_NG NHP'))

WebUI.setText(findTestObject('Object Repository/MienTrung/Page_Gi lun lun thp  Big C Supercenter/input_NG K_email'), 'sim.ho21@student.passerellesnumeriques.org')

WebUI.setEncryptedText(findTestObject('Object Repository/MienTrung/Page_Gi lun lun thp  Big C Supercenter/input_NG K_password'), 
    'NaFUB8oFyj+OWAgcwJhycg==')

WebUI.click(findTestObject('Object Repository/MienTrung/Page_Gi lun lun thp  Big C Supercenter/button_NG NHP'))

WebUI.click(findTestObject('Object Repository/MienTrung/Page_Gi lun lun thp  Big C Supercenter/a_Tm siu th'))

WebUI.click(findTestObject('Object Repository/MienTrung/Page_Tm siu th  Tm a ch  Big C Supercenter/a_Min Trung'))

WebUI.click(findTestObject('Object Repository/MienTrung/Page_Tm siu th  Tm a ch  Big C Supercenter/h5_Big C  NNG'))

WebUI.click(findTestObject('Object Repository/MienTrung/Page_Tm siu th  Tm a ch  Big C Supercenter/p_Khu thng Mi Vnh Trung, 255-257 Hng Vng, Q_092fcc'))

WebUI.closeBrowser()

