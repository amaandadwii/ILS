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

WebUI.click(findTestObject('Object Repository/MytaskNew/label_Req. Docs. Deeds'))

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/a_009Req.Co.Docs-Lgl.FormKFVIII2021'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/h5_Data Request Comp. Docs. Deeds'))

WebElement elementReg = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/input_Effective Date_RequestHeaderDeeds.Eff_cc3677'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-17\'', Arrays.asList(elementReg))

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/select_Day(s)                            Mo_03a9c6'), 
    'Years', true)

WebUI.setText(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/input_Duration_txtDurationNum'), 
    '1')

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/button_Add Date'))

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/label_Detail'), 0)

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/label_Detail'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/label_Attachment'), 0)

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/label_Attachment'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/label_Approval Log'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/button_Add'), 0)

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/button_Add'))

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/label_Notification'))

WebUI.click(findTestObject('Agreement Request/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/select_Day(s)                        Month(_1b29d9'), 
    'Years', true)

WebUI.setText(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/input_Close_txtNumValue'), '1')

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/button_Add Email'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/h5_Add Email'))

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/button_Email_btn btn-primary-dark btn-round_2e8d7d'))

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/h3_Comp. Docs. Deeds Library'))

WebUI.click(findTestObject('Object Repository/Docs Comps Deeds/upload deeds to library/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(15)

WebUI.closeBrowser()

