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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser(GlobalVariable.link)

WebUI.setText(findTestObject('Object Repository/Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'))

WebUI.verifyElementVisible(findTestObject('new/main_My Task                                                                                                            YOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Request/a_Request'))

WebUI.click(findTestObject('Request/a_Comp. Docs. Letter'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs. Letter Request - ILS 2021/h3_Request Docs. Letter List'), 
    0)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs. Letter Request - ILS 2021/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/h3_Create Docs. Letter Request'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/select_Choose your optionAPPOINTMENT LETTER_280570'), 
    'LEGAL OPINION', true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-09-07\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/textarea_Notes_RequestHeaderDocsLetter.Notes'), 
    'senin')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/body_Loading...                            _aa9ca1'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/input__search w-100 d-block'), 'kalbe farma')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/select_Choose your option                  _e71160'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/label_Detail'), 0)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/input_Partner_Partner'), 'PT. Toba')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/button_Add'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/input_Partner_Partner'), 'PT. Putih')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/button_Add'))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/textarea_Chronology_LegalOpinion.CronologiesNew'), 
    'chronology')

WebUI.scrollToElement(findTestObject('Docs Comp Letter/Create Docs.Letter Request/h3_Create Docs. Letter Request'), 0)

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(15)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(7)

WebUI.closeBrowser()

