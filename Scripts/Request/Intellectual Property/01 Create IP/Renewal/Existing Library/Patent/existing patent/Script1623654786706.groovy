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

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/a_Request'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/a_Intellectual Property'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/h3_Intellectual Property List'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/h3_Create Intellectual Property Request'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/label_Renewal'))

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/label_Type'), 
    0)

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/button_Existing Library_btnExistLibrary'))

WebUI.click(findTestObject('Intellectual Property/Renewal/Existing Library/patent/a_DTL1604429504A2'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/label_Entity IP Owner_form-check-label'))

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/input_select_dropDown_EntityIPOwner'))

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/input_search_EntityIPOwner'), 'kalbe farma')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Intellectual Property/detail Intellectual Property/select_Choose your option                  _6f27b8'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/label_Patent Name'), 
    0)

WebUI.click(findTestObject('Intellectual Property/Renewal/Existing Library/patent/label_Patent Name_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/input_Patent Name_PatentDetail.PatentNameNew'), 
    'name')

WebUI.click(findTestObject('Intellectual Property/Renewal/Existing Library/patent/label_Patent Details_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/textarea_Patent Details_PatentDetail.Patent_01d642'), 
    'details')

WebUI.click(findTestObject('Intellectual Property/Renewal/Existing Library/patent/label_Patent Class_form-check-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/select_Choose your optionA Human Necessitie_f7ca00'), 
    'A', true)

WebUI.click(findTestObject('Intellectual Property/Renewal/Existing Library/patent/label_Territory_form-check-label'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/input__search w-100 d-block'), 
    'indonesia')

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

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

