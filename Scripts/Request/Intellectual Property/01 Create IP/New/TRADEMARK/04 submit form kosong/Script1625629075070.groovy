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

WebUI.setText(findTestObject('Object Repository/Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Home Page/i_Menu_Bar'))

WebUI.click(findTestObject('Object Repository/Home Page/a_Intellectual Property'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/trqdemark/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/trqdemark/h3_Create Intellectual Property Request'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/trqdemark/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/trqdemark/select_Choose your option                  _7e6882'), 
    'TRADEMARK', true)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(10)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(10)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(20)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(10)

WebUI.closeBrowser()

