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

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/a_Comp. Docs. Letter'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/letter/appointment/h3_List Of Docs. Letter Library'))

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/letter/appointment/h3_Comp. Docs. Letter Library'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/appointment/label_Data'), 0)

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/button_Add Library Without Request'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/letter/appointment/h5_Data Request Comp. Docs. Letter'))

WebUI.setText(findTestObject('Object Repository/Library/letter/appointment/input_Letter No._RequestHeaderLetter.DocsLetterNo'), 
    '001 letter 2021')

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Library/letter/appointment/input_Effective Date_RequestHeaderLetter.Ef_fdbaba'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-07-20\'', Arrays.asList(element))

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/letter/appointment/select_Day(s)                            Mo_03a9c6'), 
    'Years', true)

WebUI.setText(findTestObject('Object Repository/Library/letter/appointment/input_Duration_txtDurationNum'), '1')

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/button_Add Date'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/appointment/h6_SBU For Approval'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/letter/appointment/select_Choose your optionAPPOINTMENT LETTER_280570'), 
    'APPOINTMENT LETTER', true)

WebUI.setText(findTestObject('Object Repository/Library/letter/appointment/textarea_Notes_RequestHeaderLetter.Notes'), 'test lib letter ')

WebUI.click(findTestObject('Library/letter/appointment/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Library/letter/appointment/input__search w-100 d-block'), 'kalbe farma')

WebUI.click(findTestObject('Library/letter/appointment/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/select_Choose your option                  _e71160'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/appointment/label_Detail'), 0)

WebUI.setText(findTestObject('Object Repository/Library/letter/appointment/input_Attention_AppointmentLetter.Attention'), 
    '\'attention \'')

WebUI.setText(findTestObject('Object Repository/Library/letter/appointment/input_Appointed_AppointmentLetter.Appointed'), 
    '\'appointed\'')

WebUI.setText(findTestObject('Object Repository/Library/letter/appointment/textarea_Objective_AppointmentLetter.Objective'), 
    '\'Objective\' oke123')

WebElement elementEffective = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Library/letter/appointment/input_Effective Date_AppointmentLetter'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-07-20\'', Arrays.asList(elementEffective))

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/appointment/label_Duration'), 0)

WebUI.click(findTestObject('Library/letter/appointment/select_month(s)'))

WebUI.setText(findTestObject('Object Repository/Library/letter/appointment/input_Duration_AppointmentLetter.Duration2'), 
    '6')

WebUI.setText(findTestObject('Object Repository/Library/letter/appointment/textarea_Notes_AppointmentLetter.Notes'), 'gimme gimme')

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/appointment/label_Attachment'), 0)

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/label_Attachment'))

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/button_Add Attachment'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Intellectual Property/detail Intellectual Property/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(5)

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/textarea_Description_FileDescription'), 
    'test')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Add'))

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add Attachment'))

CustomKeywords.'com.test.letter.docsCompLetter.uploadFile'(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(5)

WebUI.setText(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/textarea_Description_FileDescription'), 
    'attach 2')

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/appointment/button_Add'), 0)

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/button_Add'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/appointment/label_Notification'), 0)

WebUI.click(findTestObject('Object Repository/Library/IP lib/label_Notification'))

WebUI.click(findTestObject('Object Repository/Library/IP lib/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/letter/appointment/select_Day(s)                        Month(_1b29d9'), 
    'Months', true)

WebUI.setText(findTestObject('Object Repository/Library/letter/appointment/input_Close_txtNumValue'), '6')

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/button_Add Email'))

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/button_nj210793gmail.com_btn btn-primary-da_51508b'))

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/button_nj210793gmail.com_btn btn-primary-da_51508b'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/appointment/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/button_Submit'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/letter/appointment/h3_Comp. Docs. Letter Library'), 0)

WebUI.click(findTestObject('Object Repository/Library/letter/appointment/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.closeBrowser()

