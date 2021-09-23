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

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_Req. AgreementMyTask'))

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/a_0007Req.AgrKFVIII2021'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/upload agreement to lib/h5_Library Agreement'))

WebElement elementReg = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/input_Date of Agreement_RequestHeader.DateO_0b9dff'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-17\'', Arrays.asList(elementReg))

//WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/input_Date of Agreement_RequestHeader.DateO_0b9dff'))
WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/upload agreement to lib/select_Day(s)                            Mo_03a9c6'), 
    'Years', true)

WebUI.setText(findTestObject('Object Repository/Agreement Request/upload agreement to lib/input_Duration_txtDurationNum'), 
    '1')

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/button_Add Date'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_Agreement'), 0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_Detail'), 0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_Product Registration Holder'), 
    0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_Delivery Terms'), 
    0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_Attachment'), 0)

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_Attachment'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_ReviewerConfirmation'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_ReviewerConfirmation'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_Approval Log'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/button_Add'), 0)

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/button_Add'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/h3_Create Library Agreement'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/upload agreement to lib/h3_Create Library Agreement'))

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_Notification'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/label_Expiration Date'), 
    0)

WebUI.click(findTestObject('Agreement Request/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/upload agreement to lib/select_Day(s)                        Month(_1b29d9'), 
    'Years', true)

WebUI.setText(findTestObject('Object Repository/Agreement Request/upload agreement to lib/input_Close_txtNumValue'), '1')

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/button_Add Email'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/i_Ashwatu.Dipajanakalbe.co.id_fas fa-plus'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/button_Ashwatu.Dipajanakalbe.co.id_btn btn-_574ab7'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/button_Ashwatu.Dipajanakalbe.co.id_btn btn-_574ab7'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/i_Ashwatu.Dipajanakalbe.co.id_fas fa-plus'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/upload agreement to lib/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/upload agreement to lib/h3_Create Library Agreement'))

WebUI.click(findTestObject('Object Repository/Agreement Request/upload agreement to lib/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(15)

WebUI.closeBrowser()

