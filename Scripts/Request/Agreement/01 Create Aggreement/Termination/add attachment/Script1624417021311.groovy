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

WebUI.openBrowser('http://stgsvr.onekalbe.com:8225/')

WebUI.setText(findTestObject('Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/button_LOG IN'))

WebUI.click(findTestObject('Home Page/a_Request'))

WebUI.click(findTestObject('Home Page/a_Agreement'))

WebUI.verifyElementVisible(findTestObject('Agreement Request/h3_Request Agreement List'))

WebUI.click(findTestObject('Agreement Request/button_Create New Agreement'))

WebUI.verifyElementVisible(findTestObject('Agreement Request/h3_Create Agreement Request'))

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_DISTRIBUTION AGREE'), 'DISTRIBUTION AGREEMENT', true)

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_EntityinAgreement_PT.Dankos Farma'), 'PT. Dankos Farma', 
    true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Agreement Request/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-04-21\'', Arrays.asList(element))

WebUI.setText(findTestObject('Agreement Request/textarea_NotesAgreement'), 'Testing aja')

WebUI.scrollToElement(findTestObject('Agreement Request/attachment/label_AttachmentNew'), 0)

WebUI.click(findTestObject('Agreement Request/attachment/label_AttachmentNew'))

WebUI.click(findTestObject('Agreement Request/attachment/add_file1'))

//def filePath = RunConfiguration.getProjectDir() + '/1.jpg'
WebUI.uploadFile(findTestObject('Agreement Request/attachment/button_Choose File'), 'D:\\1.jpg')

WebUI.getAttribute(findTestObject('Agreement Request/attachment/button_Choose File'), 'D:\\1.jpg')

//D:\1.jpg = WebUI.getAttribute(findTestObject('Agreement Request/attachment/button_Choose File'), 'D:\\1.jpg')
WebUI.verifyMatch('D:\\1.jpg', 'D:\\1.jpg', false)

//WebUI.uploadFile (findTestObjectinput[type=‘file’]xpath,filePath,flowControl)
WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

WebUI.click(findTestObject('Agreement Request/attachment/button_Add Attachment'))

WebUI.uploadFile(findTestObject('Agreement Request/attachment/button_Choose File'), 'D:\\1.jpg')

WebUI.getAttribute(findTestObject('Agreement Request/attachment/button_Choose File'), 'D:\\1.jpg')

//D:\1.jpg = WebUI.getAttribute(findTestObject('Agreement Request/attachment/button_Choose File'), 'D:\\1.jpg')
WebUI.verifyMatch('D:\\1.jpg', 'D:\\1.jpg', false)

WebUI.setText(findTestObject('Agreement Request/attachment/FileDescription'), 'test')

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

WebUI.click(findTestObject('Page_Agreement Request - ILS 2021/button_delete_attachment'))

WebUI.click(findTestObject('Object Repository/Page_Agreement Request - ILS 2021/button_YES'))

WebUI.scrollToElement(findTestObject('Agreement Request/h3_Create Agreement Request'), 0)

WebUI.click(findTestObject('Agreement Request/button_Save'))

WebUI.delay(5)

WebUI.closeBrowser()

