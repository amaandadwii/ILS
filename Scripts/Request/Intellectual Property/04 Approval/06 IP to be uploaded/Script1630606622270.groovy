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

WebUI.setText(findTestObject('Object Repository/Login/input_Username'), 'VIOLITTA.YUSTIAN@KALBE.CO.ID')

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Request/div_My TaskYOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Object Repository/MytaskNew/label_Req. IP'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/a_0095Req.IPKFVII2021mytaskIP'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/h5_Library Intellectual Property'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Intellectual Property/IP to be uploaded/input_Registration No._RequestHeader.RegistrationNo'), 
    '0002-IP2021-VIII')

WebElement elementReg = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/input_Date of Registration'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-12-17\'', Arrays.asList(elementReg))

WebUI.click(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/select_Day(s)                            Mo_03a9c6'), 
    'Years', true)

WebUI.setText(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/input_Duration_txtDurationNum'), 
    '1')

WebUI.click(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/button_Add Date'))

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/button_Add'), 0)

WebUI.click(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/span_Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/select_NON ACTIVE                    ACTIVE'), 
    'true', true)

WebUI.click(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/label_Notification'))

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/label_Notification'), 0)

WebUI.click(findTestObject('Intellectual Property/label_Duration1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/select_Day(s)                        Month(_1b29d9'), 
    'Years', true)

WebUI.setText(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/input_Close_txtNumValue'), '1')

WebUI.click(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/button_Add Email'))

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/button_garnis.krisdinawangsarikalbe.co.id_b_6a1b8d'), 
    0)

WebUI.click(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/button_garnis.krisdinawangsarikalbe.co.id_b_6a1b8d'))

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/button_garnis.krisdinawangsarikalbe.co.id_b_6a1b8d'), 
    0)

WebUI.click(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/button_garnis.krisdinawangsarikalbe.co.id_b_6a1b8d'))

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/h3_Create Library Intellectual Property'))

WebUI.click(findTestObject('Object Repository/license/license to be uploaded/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.verifyElementVisible(findTestObject('Intellectual Property/library IP/h3_List of Intellectual Property Library'))

WebUI.click(findTestObject('Intellectual Property/library IP/a_0005Lib.IPIX2021'))

WebUI.verifyElementVisible(findTestObject('Intellectual Property/library IP/h3_Intellectual Property Library'))

WebUI.scrollToElement(findTestObject('Intellectual Property/library IP/label_Data'), 0)

WebUI.click(findTestObject('Intellectual Property/library IP/button_DocNo'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Intellectual Property/IP to be uploaded/h5_Library Intellectual Property'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Intellectual Property/library IP/label_Detail'), 0)

WebUI.click(findTestObject('Intellectual Property/library IP/label_Detail'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Intellectual Property/library IP/label_Attachment'), 0)

WebUI.click(findTestObject('Intellectual Property/library IP/label_Attachment'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Intellectual Property/library IP/label_Approval Log'), 0)

WebUI.click(findTestObject('Intellectual Property/library IP/label_Approval Log'))

WebUI.delay(2)

WebUI.click(findTestObject('Intellectual Property/library IP/button_Close'))

WebUI.verifyElementVisible(findTestObject('Intellectual Property/library IP/h3_Intellectual Property Library'))

WebUI.delay(2)

WebUI.closeBrowser()

