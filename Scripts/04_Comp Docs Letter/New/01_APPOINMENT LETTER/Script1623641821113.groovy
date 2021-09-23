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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Create Docs Letter Request/input_Your Username_Username'), GlobalVariable.UserID)

WebUI.setEncryptedText(findTestObject('Object Repository/Create Docs Letter Request/input_Your Username_Password'), GlobalVariable.UserPassword)

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/a_Request'))

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/a_Comp. Docs. Letter'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Create Docs Letter Request/h3_Request Docs. Letter List'), 
    0)

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/button_Create New'))

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Docs Letter Request/select_Choose your optionAPPOINTMENT LETTER_280570'), 
    'APPOINTMENT LETTER', true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Create Docs Letter Request/Date/input_Close_AppointmentLetter.EffectiveDateNew'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-05-5\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/Create Docs Letter Request/textarea_Notes_RequestHeaderDocsLetter.Notes'), 
    'Test 30 April')

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/input__select-dropdown form-control valid'))

WebUI.setText(findTestObject('Object Repository/Create Docs Letter Request/input__search w-100 d-block'), 'kalbe far')

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Docs Letter Request/select_Choose your option                  _e71160'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.setText(findTestObject('Object Repository/Create Docs Letter Request/input_Attention_AppointmentLetter.AttentionNew'), 
    'AAAA')

WebUI.setText(findTestObject('Object Repository/Create Docs Letter Request/input_Appointed_AppointmentLetter.AppointedNew'), 
    'Tester')

WebUI.setText(findTestObject('Object Repository/Create Docs Letter Request/textarea_Objective_AppointmentLetter.ObjectiveNew'), 
    'Test')

WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Create Docs Letter Request/Date/input_Expected Date of Finalization_RequestHeaderDocsLetter.ExpectedDate'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-05-5\'', Arrays.asList(element1))

WebUI.setText(findTestObject('Object Repository/Create Docs Letter Request/input_Duration_AppointmentLetter.Duration2New'), 
    '3')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Docs Letter Request/select_Choose                            ye_7eb08b'), 
    'days(s)', false)

WebUI.setText(findTestObject('Object Repository/Create Docs Letter Request/textarea_Notes_AppointmentLetter.NotesNew'), 
    'ASD')

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/button_Save'))

WebUI.delay(2)

WebUI.closeBrowser()

