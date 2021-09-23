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

WebUI.openBrowser(GlobalVariable.link)

WebUI.setText(findTestObject('Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/button_LOG IN'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Request/div_My TaskYOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Request/a_RequestSetelahMyTask'))

WebUI.click(findTestObject('Home Page/a_Intellectual Property'))

WebUI.verifyElementVisible(findTestObject('Intellectual Property/h3_Intellectual Property List'))

WebUI.click(findTestObject('Intellectual Property/a_0035Req.IPKFVIII2021dilist'))

WebUI.verifyElementVisible(findTestObject('Intellectual Property/detail Intellectual Property/h3_Create Intellectual Property Request'))

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/textarea_Notes_RequestHeader.Notes'), 
    0)

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/textarea_Notes_RequestHeader.Notes'), 'test update')

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/label_Copyright Name'), 0)

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/input_Copyright Name_CopyrightDetail.Copyri_b4261a'), 
    'PT.  XYZ')

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/h3_Create Intellectual Property Request'), 
    0)

WebUI.click(findTestObject('Intellectual Property/button_SaveIP'))

/*WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_OK'))

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Back'))

WebUI.verifyElementVisible(findTestObject('Intellectual Property/detail Intellectual Property/td_0009Req.IPKFV2021'))
*/
WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Intellectual Property/detail Intellectual Property/h3_Create Intellectual Property Request'))

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/textarea_Notes_RequestHeader.Notes'), 
    0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/label_Copyright Name'), 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/h3_Create Intellectual Property Request'), 
    0)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(13)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.closeBrowser()

