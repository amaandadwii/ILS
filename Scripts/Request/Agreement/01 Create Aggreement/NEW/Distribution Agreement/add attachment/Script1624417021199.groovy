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

WebUI.openBrowser('http://stgsvr.onekalbe.com:8225/')

WebUI.setText(findTestObject('Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/button_LOG IN'))

WebUI.click(findTestObject('Home Page/a_Request'))

WebUI.click(findTestObject('Home Page/a_Agreement'))

WebUI.verifyElementVisible(findTestObject('Agreement Request/h3_Request Agreement List'))

WebUI.click(findTestObject('Agreement Request/button_Create New Agreement'))

WebUI.verifyElementVisible(findTestObject('Agreement Request/h3_Create Agreement Request'))

WebUI.click(findTestObject('Agreement Request/Type Agreement/label_New'))

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_DISTRIBUTION AGREE'), 'DISTRIBUTION AGREEMENT', true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Agreement Request/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-06-29\'', Arrays.asList(element))

WebUI.setText(findTestObject('Agreement Request/textarea_NotesAgreement'), 'Testing aja')

//WebUI.selectOptionByValue(findTestObject('Object Repository/temp/Page_Agreement Request - ILS 2021/select_Choose your option                  _e71160'), 
//  'PT. Kalbe Farma Tbk.', true)
WebUI.scrollToElement(findTestObject('Agreement Request/attachment/label_AttachmentNew'), 0)

WebUI.click(findTestObject('Agreement Request/attachment/label_AttachmentNew'))

//ADD FILE 1
WebUI.click(findTestObject('Agreement Request/attachment/add_file1'))

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

//ADD FILE 2
WebUI.click(findTestObject('Agreement Request/attachment/add_file2'))

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    'D:\\automation data.xlsx')

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

//ADD FILE 3
WebUI.click(findTestObject('Object Repository/Agreement Request/attachment/add_file3'))

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    'D:\\Panduan Internship Apps Site Supervisor Monitoring Learning Plan dan Log Book.pdf')

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

//ADD FILE 4
WebUI.click(findTestObject('Object Repository/Agreement Request/attachment/add_file4'))

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

WebUI.scrollToElement(findTestObject('Agreement Request/h3_Create Agreement Request'), 0)

WebUI.click(findTestObject('Agreement Request/button_Save'))

WebUI.delay(5)

WebUI.closeBrowser()

