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

WebUI.setText(findTestObject('Object Repository/Login/input_Username'), 'MELINA.KARAMOY@KALBE.CO.ID')

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'))

WebUI.verifyElementVisible(findTestObject('Agreement Request/approval melina/h1_Welcome'))

WebUI.click(findTestObject('Request/a_Request'))

WebUI.click(findTestObject('Request/a_Agreement'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/h3_Request Agreement List'))

WebUI.click(findTestObject('Agreement Request/approval melina/td_1'))

WebUI.click(findTestObject('Agreement Request/approval melina/a_206Req.AgrKFVI2021'))

WebUI.verifyElementVisible(findTestObject('Agreement Request/approval melina/h3_Detail Agreement Request'))

WebUI.click(findTestObject('Agreement Request/button_Revise1'))

WebUI.delay(4)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(10)

WebUI.setText(findTestObject('Agreement Request/textarea_Revise_Notes'), 'revise notes')

WebUI.click(findTestObject('Agreement Request/button_ReviseOK'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(10)

WebUI.closeBrowser()

