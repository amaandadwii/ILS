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

WebUI.setText(findTestObject('Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/button_LOG IN'))

WebUI.verifyElementVisible(findTestObject('new/main_My Task                                                                                                            YOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Request/a_Request'))

WebUI.click(findTestObject('Request/a_Comp. Docs. Letter'))

WebUI.waitForElementVisible(findTestObject('Docs Comp Letter/baru/Page_Docs. Letter Request - ILS 2021/h3_Request Docs. Letter List'), 
    0)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs. Letter Request - ILS 2021/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/h3_Create Docs. Letter Request'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/select_Choose your optionAPPOINTMENT LETTER_280570'), 
    'AUTHORIZATION LETTER', true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-09-07\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/textarea_Notes_RequestHeaderDocsLetter.Notes'), 
    'kamis')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/body_Loading...                            _aa9ca1'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/input__search w-100 d-block'), 
    'kalbe farma')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/select_Choose your option                  _e71160'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/label_Detail'), 
    0)

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/input_Authorizer_AuthorizationLetter.AuthorizerNew'), 
    'text')

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/input_Authorized_AuthorizationLetter.AuthorizedNew'), 
    'text letter')

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/textarea_Objective_AuthorizationLetter.Obje_86e849'), 
    'test')

WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/Effective Date New'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-07\'', Arrays.asList(element1))

WebUI.click(findTestObject('Docs Comp Letter/baru/Page_Docs. Letter Request - ILS 2021/select_year'))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/input_Duration_AuthorizationLetter.Duration2New'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/textarea_Notes_AuthorizationLetter.NotesNew'), 
    'testing')

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/h3_Create Docs. Letter Request'), 
    0)

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

