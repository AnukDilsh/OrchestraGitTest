import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/login.jsp')

WebUI.setText(findTestObject('Page_Qmatic Platform Login page/input_Username_username'), 'superadmin')

WebUI.setEncryptedText(findTestObject('Page_Qmatic Platform Login page/input_Password_password'), 'E4Yl+YHwWj4=')

WebUI.click(findTestObject('Page_Qmatic Platform Login page/button_Log in'))

WebUI.click(findTestObject('Page_Qmatic Platform/span_System Administration'))

WebUI.click(findTestObject('Object Repository/Page_System Administration/button_Add Unit Type (1)'))

WebUI.click(findTestObject('Object Repository/Page_System Administration/img_Version 2.2.0_GJKAPQADNO (1)'))

WebUI.click(findTestObject('Object Repository/Page_System Administration/button_Add Unit Type (1)'))

WebUI.click(findTestObject('Object Repository/Page_System Administration/img_Version 7.0.0.0_GJKAPQADNO (1)'))

WebUI.click(findTestObject('Object Repository/Page_System Administration/button_Add Unit Type (1)'))

WebUI.click(findTestObject('Object Repository/Page_System Administration/img_Version 7.0.2.0_GJKAPQADNO (1)'))

WebUI.click(findTestObject('Object Repository/Page_System Administration/button_Save (1)'))

