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

WebUI.click(findTestObject('Page_Qmatic Platform Login page/span_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Qmatic Platform/span_Notification Admin'))

WebUI.click(findTestObject('Object Repository/Page_Qmatic Orchestra/a_SMS'))

WebUI.click(findTestObject('Object Repository/Page_Qmatic Orchestra/input_Beepsend_GWTYPE'))

WebUI.setText(findTestObject('Object Repository/Page_Qmatic Orchestra/input_API-Key_QmaticSMSAPIKey'), 'LlIRthnu3357rYUELN2Dw6hhakStZV0JaxhHk1NF')

WebUI.setText(findTestObject('Object Repository/Page_Qmatic Orchestra/input_From_QmaticSMSFrom'), 'Qmatic')

WebUI.click(findTestObject('Object Repository/Page_Qmatic Orchestra/input_URL Shortener_gatewayQma'))

WebUI.click(findTestObject('Object Repository/Page_Qmatic Orchestra/div_Qmatic SMS Gateway Setting_1'))

WebUI.verifyTextPresent('Qmatic SMS Gateway Settings saved.', false)

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/img_Logout_gwt-Image'))

