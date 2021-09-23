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

WebUI.click(findTestObject('Object Repository/MytaskNew/label_Req. License'))

WebUI.click(findTestObject('Object Repository/license/new/a_0006Req.LicenseKFVIII2021'))

WebUI.verifyElementVisible(findTestObject('Object Repository/license/license to be uploaded/h5_Library License'))

WebElement elementReg = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/license/license to be uploaded/input_Date of Registration_LicenseHeader.Da_016030'),
	30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-17\'', Arrays.asList(elementReg))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/license/license to be uploaded/input_Expiration Date_LicenseHeader.ExpirationDate'),
	30)

WebUI.executeJavaScript('arguments[0].value=\'2021-10-17\'', Arrays.asList(element))

WebUI.scrollToElement(findTestObject('Object Repository/license/license to be uploaded/label_Attachment'), 0)

WebUI.click(findTestObject('Object Repository/license/license to be uploaded/label_Approval Log'))

WebUI.scrollToElement(findTestObject('Object Repository/license/license to be uploaded/button_Add'), 0)

WebUI.click(findTestObject('Object Repository/license/license to be uploaded/button_Add'))

WebUI.verifyElementVisible(findTestObject('Object Repository/license/license to be uploaded/h3_Create Library License'))

WebUI.selectOptionByValue(findTestObject('Object Repository/license/license to be uploaded/select_NON ACTIVE                    ACTIVE'), 
    'true', true)

WebUI.click(findTestObject('Object Repository/license/license to be uploaded/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(5)

WebUI.closeBrowser()

