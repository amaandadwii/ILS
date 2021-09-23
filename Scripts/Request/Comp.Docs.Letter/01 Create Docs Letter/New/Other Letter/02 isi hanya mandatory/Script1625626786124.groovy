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

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comp Letter/Docs. Letter Request Home/h3_Request Docs. Letter List'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/Docs. Letter Request Home/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comp Letter/Create Docs.Letter Request/h3_Create Docs. Letter Request'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/Create Docs.Letter Request/Type docs.comp/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Docs Comp Letter/Create Docs.Letter Request/Letter Type/select_APPOINTMENT LETTER'), 
    'OTHER LETTER', true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Docs Comp Letter/Create Docs.Letter Request/input_Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-05\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/textarea_Notes_RequestHeaderDocsLetter.Notes'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/Create Docs.Letter Request/input__select-dropdown form-control valid'))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/Create Docs.Letter Request/input__search w-100 d-block'), 
    'kalbe farma')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/span_PT. Kalbe Farma Tbk (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Docs Comp Letter/Create Docs.Letter Request/select_Choose your option                  _e71160'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/label_Detail'), 0)

WebUI.setText(findTestObject('Docs Comp Letter/other letter/input_Attention_OtherLetter'), 'Test 123')

WebUI.setText(findTestObject('Docs Comp Letter/other letter/textarea_Objective_OtherLetter'), 'objective')

WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/Effective Date New'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-12\'', Arrays.asList(element1))

WebUI.click(findTestObject('Docs Comp Letter/other letter/select_year(s)'))

WebUI.setText(findTestObject('Docs Comp Letter/other letter/input_Duration_OtherLetter'), '1')

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/label_Duration'), 0)

WebUI.setText(findTestObject('Docs Comp Letter/other letter/textarea_Notes_OtherLetter'), 'notes')

WebUI.scrollToElement(findTestObject('Docs Comp Letter/Create Docs.Letter Request/h3_Create Docs. Letter Request'), 0)

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(10)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(10)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(20)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(10)

WebUI.closeBrowser()

