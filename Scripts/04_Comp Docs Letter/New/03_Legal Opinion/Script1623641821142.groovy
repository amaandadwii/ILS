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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

WebUI.openBrowser('')

WebUI.navigateToUrl('http://stgsvr.onekalbe.com:8225/')

WebUI.setText(findTestObject('Object Repository/Create Docs Letter Request/03/input_Your Username_Username'), 'BERNADETTE.FANNY@KALBE.CO.ID')

WebUI.setEncryptedText(findTestObject('Object Repository/Create Docs Letter Request/03/input_Your Username_Password'), 'XA8EWhIfeOQ=')

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/03/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/03/a_Request'))

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/03/a_Comp. Docs. Letter'))

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/03/button_Create New'))

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/03/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Docs Letter Request/03/select_Choose your optionAPPOINTMENT LETTER_280570'), 
    'LEGAL OPINION', true)

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

WebUI.setText(findTestObject('Object Repository/Create Docs Letter Request/03/textarea_Notes_RequestHeaderDocsLetter.Notes'), 
    'LEGAL')

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/03/label_NA'))

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/03/label_NA'))

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/03/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Create Docs Letter Request/03/input_Partner_Partner'), 'ABC')

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/03/button_Add'))

WebUI.setText(findTestObject('Object Repository/Create Docs Letter Request/03/textarea_Chronology_LegalOpinion.CronologiesNew'), 
    'aasdalkdsalkdmlsknfdsknadfnldkafndlafdlkflkdsafkdlsfjdfnaklfsadfldsfklasflaknfklda')

WebUI.click(findTestObject('Object Repository/Create Docs Letter Request/button_Save'))

WebUI.delay(2)

WebUI.closeBrowser()

