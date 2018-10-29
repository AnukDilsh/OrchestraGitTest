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

WebUI.click(findTestObject('Page_Qmatic Platform/span_Business Configuration'))

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/a_Services (1)'))

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/button_Create service (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Business Configuration/input_Internal name_internalNa (1)'), 'Service 01')

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/input_Mobile enabled_gwt-uid-4 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/input_Booking enabled_bookingE (1)'))

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/button_Save (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Business Configuration/span_Service successfully save (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/a_Services (1)'))

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/button_Create service (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Business Configuration/input_Internal name_internalNa (1)'), 'Service 02')

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/input_Mobile enabled_gwt-uid-8'))

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/input_Booking enabled_bookingE_1'))

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/button_Save (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Business Configuration/span_Service successfully save (1)'))

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/a_Services (1)'))

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/button_Create service (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Business Configuration/input_Internal name_internalNa (1)'), 'Service 03')

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/input_Mobile enabled_gwt-uid-1'))

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/input_Booking enabled_bookingE_2'))

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/button_Save (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Business Configuration/span_Service successfully save (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Business Configuration/img_Logout_gwt-Image'))

