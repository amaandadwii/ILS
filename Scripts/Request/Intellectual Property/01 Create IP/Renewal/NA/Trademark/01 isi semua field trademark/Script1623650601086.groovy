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

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/NA/Copyright/a_Request'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/NA/Copyright/a_Intellectual Property'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/NA/Copyright/button_Create New'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/NA/Copyright/label_Renewal'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/NA/Copyright/label_NA'))

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/Renewal/NA/Copyright/label_Intellectual Property'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/Renewal/NA/Copyright/select_Choose your option                  _7e6882'), 
    'TRADEMARK', true)

WebUI.setText(findTestObject('Object Repository/Intellectual Property/Renewal/NA/Copyright/textarea_Notes_RequestHeader.Notes'), 
    'test Renewal N/A')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/input_select_dropDown_EntityIPOwner'))

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/input_search_EntityIPOwner'), 'kalbe farma')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Intellectual Property/detail Intellectual Property/select_Choose your option                  _6f27b8'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/trqdemark/input_Trademark Name_TrademarkDetail.Tradem_96b9eb'), 
    'trade name')

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/trqdemark/select_Choose your option                  _65df14'), 
    'Wordmark', true)

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/trqdemark/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/trqdemark/input__search w-100 d-block'), 
    'indonesia')

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/trqdemark/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/trqdemark/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/trqdemark/button_Add Trademark Class'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/trqdemark/a_Class 1'))

WebUI.scrollToElement(findTestObject('Agreement Request/attachment/label_Attachment'), 0)

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/label_Attachment'))

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add Attachment'))

CustomKeywords.'com.test.letter.docsCompLetter.uploadFile'(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Choose File'), 
    GlobalVariable.uploadFile)

WebUI.delay(3)

WebUI.setText(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/textarea_Description_FileDescription'), 
    '123')

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add'))

WebUI.scrollToElement(findTestObject('Docs Comp Letter/Create Docs.Letter Request/h3_Create Docs. Letter Request'), 0)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/button_Save'))

WebUI.delay(3)

WebUI.closeBrowser()

