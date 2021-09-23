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

WebUI.click(findTestObject('Object Repository/Library/IP lib/a_Intellectual Property'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/IP lib/h3_Intellectual Property List'))

WebUI.click(findTestObject('Object Repository/Library/IP lib/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/IP lib/h3_Create Library Intellectual Property'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/IP lib/label_Library No'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/IP lib/select_NON ACTIVE                    ACTIVE'), 
    'true', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/IP lib/select_Choose your option                CO_502fe0'), 
    'INDUSTRIAL DESIGN', true)

WebUI.click(findTestObject('Object Repository/Library/IP lib/button_Add Library Without Request'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/IP lib/h5_Library Intellectual Property'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/IP lib/label_Registration No'), 0)

WebUI.setText(findTestObject('Object Repository/Library/IP lib/input_Registration No._RequestHeader.Regist_3715dd'), 'test')

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Library/IP lib/input_Date of Registration_RequestHeader.Da_b702d5'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-07-20\'', Arrays.asList(element))

WebUI.click(findTestObject('Object Repository/Library/IP lib/label_Calendar'))

WebElement elementExp = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Library/IP lib/input_Expiration Date_RequestHeader.ExpirationDate'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-20\'', Arrays.asList(elementExp))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/IP lib/select_Choose your option                  _f967c2'), 
    '01', true)

WebUI.setText(findTestObject('Object Repository/Library/IP lib/textarea_Notes_RequestHeader.Notes'), 'test lib ip')

WebUI.scrollToElement(findTestObject('Object Repository/Library/IP lib/label_Intellectual Property'), 0)

WebUI.click(findTestObject('Object Repository/Library/IP lib/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Library/IP lib/input__search w-100 d-block'), 'kalbe farma')

WebUI.click(findTestObject('Object Repository/Library/IP lib/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/IP lib/select_Choose your option                  _6bec0f'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Library/IP lib/label_Detail'), 0)

WebUI.setText(findTestObject('Object Repository/Library/industrial design/input_Industrial Design Name'), 'industrial name')

WebUI.setText(findTestObject('Object Repository/Library/industrial design/textarea_Industrial Design Details'), 'industrial design')

WebUI.click(findTestObject('Object Repository/Library/industrial design/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Library/industrial design/input__search w-100 d-block'), 'indon')

WebUI.click(findTestObject('Object Repository/Library/industrial design/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/industrial design/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.scrollToElement(findTestObject('Library/industrial design/button_Add Industrial Design Class'), 0)

WebUI.click(findTestObject('Object Repository/Library/industrial design/button_Add Industrial Design Class'))

WebUI.click(findTestObject('Object Repository/Library/industrial design/a_1a'))

WebUI.click(findTestObject('Object Repository/Library/industrial design/button_Add Industrial Design Class'))

WebUI.click(findTestObject('Object Repository/Library/industrial design/a_1b'))

WebUI.click(findTestObject('Object Repository/Library/industrial design/button_Add Industrial Design Class'))

WebUI.click(findTestObject('Object Repository/Library/industrial design/a_1c'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/IP lib/label_Attachment'), 0)

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
    'C:\\Users\\User\\Downloads\\PrintInitialForm.pdf')

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

WebUI.scrollToElement(findTestObject('Object Repository/Library/IP lib/button_Add'), 0)

WebUI.click(findTestObject('Object Repository/Library/IP lib/button_Add'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/IP lib/label_Notification'), 0)

WebUI.click(findTestObject('Object Repository/Library/IP lib/label_Notification'))

WebUI.click(findTestObject('Object Repository/Library/IP lib/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/IP lib/select_Day(s)                        Month(_1b29d9'), 
    'Months', true)

WebUI.setText(findTestObject('Object Repository/Library/IP lib/input_Close_txtNumValue'), '1')

WebUI.click(findTestObject('Object Repository/Library/IP lib/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Library/IP lib/button_Add Email'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/IP lib/td_TMdankosfarma.com_text-center'), 0)

WebUI.click(findTestObject('Object Repository/Library/IP lib/button_TMdankosfarma.com_btn btn-primary-da_d5dcd9'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/IP lib/button_TMdankosfarma.com_btn btn-primary-da_d5dcd9'), 
    0)

WebUI.click(findTestObject('Object Repository/Library/IP lib/button_TMdankosfarma.com_btn btn-primary-da_d5dcd9'))

WebUI.click(findTestObject('Object Repository/Library/IP lib/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/IP lib/h3_Create Library Intellectual Property'))

WebUI.click(findTestObject('Object Repository/Library/IP lib/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.closeBrowser()
