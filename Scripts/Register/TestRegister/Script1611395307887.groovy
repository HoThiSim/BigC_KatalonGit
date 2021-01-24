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

WebUI.click(findTestObject('RegisterScript/Page_Gi lun lun thp  Big C Supercenter/a_NG K'))

WebUI.setText(findTestObject('RegisterScript/Page_Gi lun lun thp  Big C Supercenter/input_Bn ch mt cha y 60s  ng k. Mt ln thc h_9dd15d'), 
    'Nguyen Ngoc')

WebUI.setText(findTestObject('RegisterScript/Page_Gi lun lun thp  Big C Supercenter/input_Bn ch mt cha y 60s  ng k. Mt ln thc h_128395'), 
    'Thao')

WebUI.setText(findTestObject('RegisterScript/Page_Gi lun lun thp  Big C Supercenter/input_Bn ch mt cha y 60s  ng k. Mt ln thc h_0016b1'), 
    'thao.nguyen21@student.passerellesnumeriques.org')

WebUI.setText(findTestObject('RegisterScript/Page_Gi lun lun thp  Big C Supercenter/input_Bn ch mt cha y 60s  ng k. Mt ln thc h_671eff'), 
    '0836659172')

WebUI.selectOptionByValue(findTestObject('RegisterScript/Page_Gi lun lun thp  Big C Supercenter/select_Chn ca hng gn bn                    _d54a35'), 
    '16', true)

WebUI.setEncryptedText(findTestObject('RegisterScript/Page_Gi lun lun thp  Big C Supercenter/input_Bn ch mt cha y 60s  ng k. Mt ln thc h_b3d1e1'), 
    'HqF8MoZrB1A=')

WebUI.setEncryptedText(findTestObject('RegisterScript/Page_Gi lun lun thp  Big C Supercenter/input_Bn ch mt cha y 60s  ng k. Mt ln thc h_c6775d'), 
    'HqF8MoZrB1A=')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('RegisterScript/Page_Gi lun lun thp  Big C Supercenter/button_TIP TC'))

WebUI.click(findTestObject('RegisterScript/Page_Gi lun lun thp  Big C Supercenter/button_GI LI M KCH HOT'))

WebUI.click(findTestObject('RegisterScript/Page_Gi lun lun thp  Big C Supercenter/a_Tip tc duyt web'))

WebUI.click(findTestObject('RegisterScript/Page_Gi lun lun thp  Big C Supercenter/a_Thao'))

WebUI.closeBrowser()

