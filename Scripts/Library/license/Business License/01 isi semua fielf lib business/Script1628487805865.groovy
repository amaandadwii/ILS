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

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/a_License'))

WebUI.verifyElementVisible(findTestObject('Library/lib license/building license/h3_Library License'))

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/lib license/building license/h3_Create Library License'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/lib license/building license/label_Data'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/lib license/building license/select_NON ACTIVE                    ACTIVE'), 
    'true', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/lib license/building license/select_Choose your option                BU_3d0c94'), 
    'BUSINESS LICENSE', true)

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/button_Add Library Without Request'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/lib license/building license/h5_Library License'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Library/lib license/building license/input_Date of Registration_LicenseHeader.Da_016030'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-09-20\'', Arrays.asList(element))

WebElement elementExpDate = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Library/lib license/building license/input_Expiration Date_LicenseHeader.ExpirationDate'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-10-20\'', Arrays.asList(elementExpDate))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/lib license/building license/select_Choose your option                  _e3009c'), 
    '01', true)

WebUI.scrollToElement(findTestObject('Object Repository/Library/lib license/building license/label_Type'), 0)

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/label_Choose Territory'))

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Library/lib license/building license/input__search w-100 d-block'), 'indonesia')

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/lib license/building license/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.setText(findTestObject('Object Repository/Library/lib license/building license/textarea_Notes_LicenseHeader.Notes'), 
    'Test lib license ')

WebElement elementExpected = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Library/lib license/building license/input_Expected Date_LicenseHeader.ExpectedDate'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-10-20\'', Arrays.asList(elementExpected))

WebUI.scrollToElement(findTestObject('Object Repository/Library/lib license/building license/label_Attachment'), 0)

WebUI.click(findTestObject('Object Repository/Library/IP lib/label_Attachment'))

WebUI.click(findTestObject('Object Repository/Library/IP lib/button_Add Attachment'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Intellectual Property/detail Intellectual Property/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(5)

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/textarea_Description_FileDescription'), 
    'test')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Add'))

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add Attachment'))

CustomKeywords.'com.test.letter.docsCompLetter.uploadFile'(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Choose File'), 
    'D:\\Panduan Internship Apps Site Supervisor Monitoring Learning Plan dan Log Book.pdf')

WebUI.delay(5)

WebUI.setText(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/textarea_Description_FileDescription'), 
    'attach 2')

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add'))

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add Attachment'))

CustomKeywords.'com.test.letter.docsCompLetter.uploadFile'(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Choose File'), 
    'D:\\automation data.xlsx')

WebUI.delay(5)

WebUI.setText(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/textarea_Description_FileDescription'), 
    'attach 3')

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/lib license/building license/button_Add_1'), 0)

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/button_Add_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/lib license/building license/h3_Create Library License'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/lib license/building license/label_Notification'), 0)

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/label_Notification'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/lib license/building license/label_Expiration Date'), 0)

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/lib license/building license/select_Day(s)                        Month(_1b29d9'), 
    'Months', true)

WebUI.setText(findTestObject('Object Repository/Library/lib license/building license/input_Close_txtNumValue'), '6')

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/button_Add_1_2'))

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/button_Date_btn btn-danger-dark btn-rounded_39baf6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/lib license/building license/select_Day(s)                        Month(_1b29d9'), 
    'Years', true)

WebUI.setText(findTestObject('Object Repository/Library/lib license/building license/input_Close_txtNumValue'), '2')

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/button_Add_1_2'))

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/button_Add Email'))

WebUI.scrollToElement(findTestObject('Library/lib license/building license/btn_email1'), 0)

WebUI.click(findTestObject('Library/lib license/building license/btn_email1'))

WebUI.scrollToElement(findTestObject('Library/lib license/building license/btn_email2'), 0)

WebUI.click(findTestObject('Library/lib license/building license/btn_email2'))

WebUI.scrollToElement(findTestObject('Library/lib license/building license/btn_email3'), 0)

WebUI.click(findTestObject('Library/lib license/building license/btn_email3'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/lib license/building license/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/button_Submit'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/lib license/building license/h3_Create Library License'), 
    0)

WebUI.click(findTestObject('Object Repository/Library/lib license/building license/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.closeBrowser()

