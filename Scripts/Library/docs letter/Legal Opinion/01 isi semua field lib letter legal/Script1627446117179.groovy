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

WebUI.setText(findTestObject('Object Repository/Library/IP lib/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Library/IP lib/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Library/IP lib/button_LOG IN'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/Deeds/h3_My Task'))

WebUI.click(findTestObject('Object Repository/Library/Deeds/a_Library'))

WebUI.click(findTestObject('Object Repository/Library/letter/legal/a_Comp. Docs. Letter'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/letter/legal/h3_List Of Docs. Letter Library'))

WebUI.click(findTestObject('Object Repository/Library/letter/a_0074Lib.Co.Docs-LetterVII2021'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/letter/legal/h3_Comp. Docs. Letter Library'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/legal/label_Data'), 0)

WebUI.click(findTestObject('Object Repository/Library/letter/legal/button_Add Library Without Request'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/letter/legal/h5_Data Request Comp. Docs. Letter'))

WebUI.setText(findTestObject('Object Repository/Library/letter/legal/input_Letter No._RequestHeaderLetter.DocsLetterNo'), 
    '003 letter 2021')

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Library/letter/legal/input_Effective Date_RequestHeaderLetter.Ef_fdbaba'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-07-20\'', Arrays.asList(element))

WebUI.click(findTestObject('Object Repository/Library/letter/legal/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/letter/legal/select_Day(s)                            Mo_03a9c6'), 
    'Years', true)

WebUI.setText(findTestObject('Object Repository/Library/letter/legal/input_Duration_txtDurationNum'), '1')

WebUI.click(findTestObject('Object Repository/Library/letter/legal/button_Add Date'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/legal/h6_SBU For Approval'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/letter/legal/select_Choose your optionAPPOINTMENT LETTER_280570'), 
    'LEGAL OPINION', true)

WebUI.setText(findTestObject('Object Repository/Library/letter/legal/textarea_Notes_RequestHeaderLetter.Notes'), 'test lib letter ')

WebUI.click(findTestObject('Object Repository/Library/letter/legal/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Library/letter/legal/input__search w-100 d-block'), 'kalbe farma')

WebUI.click(findTestObject('Object Repository/Library/letter/legal/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/select_Choose your option                  _e71160'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/legal/label_Detail'), 0)

WebUI.click(findTestObject('Object Repository/Library/letter/legal/label_NA'))

WebUI.click(findTestObject('Object Repository/Library/letter/legal/label_NA'))

WebUI.click(findTestObject('Object Repository/Library/letter/legal/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Library/letter/legal/input_Partner_Partner'), 'swwa ')

WebUI.click(findTestObject('Object Repository/Library/letter/legal/span_Add'))

WebUI.click(findTestObject('Object Repository/Library/letter/legal/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Library/letter/legal/input_Partner_Partner'), 'right')

WebUI.click(findTestObject('Object Repository/Library/letter/legal/button_Add'))

WebUI.click(findTestObject('Object Repository/Library/letter/legal/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Library/letter/legal/input_Partner_Partner'), 'left')

WebUI.click(findTestObject('Object Repository/Library/letter/legal/button_Add'))

WebUI.click(findTestObject('Library/letter/legal/btn_editPartner'))

WebUI.setText(findTestObject('Object Repository/Library/letter/legal/input_Partner_Partner'), 'update')

WebUI.click(findTestObject('Library/letter/legal/button_Edit'))

WebUI.click(findTestObject('Library/letter/legal/btn_deletePartner'))

WebUI.setText(findTestObject('Object Repository/Library/letter/legal/textarea_Chronology_LegalOpinion.Cronologies'), 'chronology A')

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/appointment/button_Add'), 0)

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/button_Add'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/authorization/label_Data'), 0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/appointment/h3_Comp. Docs. Letter Library'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Library/letter/authorization/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.closeBrowser()

