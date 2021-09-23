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

WebUI.acceptAlert()

WebUI.openBrowser(GlobalVariable.link)

WebUI.setText(findTestObject('Object Repository/Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'))

WebUI.click(findTestObject('Request/a_Request'))

WebUI.click(findTestObject('Request/a_Agreement'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/h3_Request Agreement List'))

WebUI.click(findTestObject('Object Repository/Agreement Request/button_Create New Agreement'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/h3_Create Agreement Request'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Type Agreement/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/select_DISTRIBUTION AGREE'), 'REGISTRATION AGREEMENT', 
    true)

WebUI.scrollToElement(findTestObject('Agreement Request/attachment/label_Attachment'), 0)

WebUI.click(findTestObject('Agreement Request/attachment/label_Attachment'))

WebUI.click(findTestObject('Agreement Request/attachment/add_file1'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    GlobalVariable.uploadFile)

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

WebUI.click(findTestObject('Agreement Request/attachment/add_file2'))

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    'D:\\automation data.xlsx')

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Agreement Request/h3_Create Agreement Request'), 0)

WebUI.click(findTestObject('Agreement Request/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(13)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.closeBrowser()

