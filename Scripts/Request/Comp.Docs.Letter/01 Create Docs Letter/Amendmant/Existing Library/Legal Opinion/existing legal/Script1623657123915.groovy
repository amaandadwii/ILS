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

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/Amendment/appointmrent/button_LOG IN'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/Amendment/appointmrent/h1_Welcome'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/Amendment/appointmrent/i_Menu_fas fa-book'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/Amendment/appointmrent/a_Comp. Docs. Letter'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/Amendment/appointmrent/h3_Docs. Letter List'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/Amendment/appointmrent/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/Amendment/appointmrent/h3_Docs. Letter Request'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/Amendment/appointmrent/label_Amendment'))

WebUI.mouseOver(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/Amendment/appointmrent/label_Existing Library'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/Amendment/appointmrent/button_Existing Library_btnExistLibrary'))

WebUI.click(findTestObject('Docs Comp Letter/Create Appointment Letter/Amendment/legal/a_003Lib.Co.Docs-LetterKFIV2021'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Docs Comp Letter/Create Docs.Letter Request/input_Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-07-07\'', Arrays.asList(element))

WebUI.click(findTestObject('Docs Comp Letter/Create Appointment Letter/Amendment/appointmrent/label_Entity In Letter_form-check-label'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/Create Docs.Letter Request/input__select-dropdown form-control valid'))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/Create Docs.Letter Request/input__search w-100 d-block'), 
    'kalbe farma')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/span_PT. Kalbe Farma Tbk (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Docs Comp Letter/Create Docs.Letter Request/select_Choose your option                  _e71160'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/label_Detail'), 0)

WebUI.click(findTestObject('Docs Comp Letter/Create Appointment Letter/Amendment/legal/label_Change'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/input_Partner_Partner'), 'PT. Toba')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/button_Add'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/input_Partner_Partner'), 'PT. Putih')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/button_Add'))

WebUI.click(findTestObject('Docs Comp Letter/Create Appointment Letter/Amendment/legal/label_Chronology_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/detail legal opinion/textarea_Chronology_LegalOpinion.CronologiesNew'), 
    'chronology')

WebUI.scrollToElement(findTestObject('Agreement Request/attachment/label_Attachment'), 0)

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/label_Attachment'))

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add Attachment'))

CustomKeywords.'com.test.letter.docsCompLetter.uploadFile'(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Choose File'), 
    GlobalVariable.uploadFile)

WebUI.delay(2)

WebUI.setText(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/textarea_Description_FileDescription'), 
    '123')

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add'))

WebUI.scrollToElement(findTestObject('Docs Comp Letter/Create Docs.Letter Request/h3_Create Docs. Letter Request'), 0)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/button_Save'))

WebUI.delay(3)

WebUI.closeBrowser()

