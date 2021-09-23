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

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/library/input_Username'), 'VIOLITTA.YUSTIAN@KALBE.CO.ID')

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/library/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/library/button_LOG IN'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Request/div_My TaskYOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/library/label_Req. Docs. Letter'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/library/a_059Req.Co.Docs-LetterKFVIII2021'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comp Letter/library/h5_Data Request Comp. Docs. Letter'))

WebElement elementReg = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Docs Comp Letter/library/input_Effective Date_RequestHeaderLetter.Ef_fdbaba'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-17\'', Arrays.asList(elementReg))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/library/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Docs Comp Letter/library/select_Day(s)                            Mo_03a9c6'), 
    'Years', true)

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/library/input_Duration_txtDurationNum'), '1')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/library/button_Add Date'))

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/library/label_Detail'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/library/label_Effective Date'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/library/label_Attachment'), 0)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/library/label_Attachment'))

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/library/label_Approval Log'), 0)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/library/label_Approval Log'))

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/library/button_Add'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/button_Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Docs Comp Letter/select_ACTIVE                    NON ACTIVE'), 
    'true', true)

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/button_Add Library Without Request'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/label_Notification'), 0)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/label_Notification'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Docs Comp Letter/select_Day(s)                        Month(_1b29d9'), 
    'Years', true)

WebUI.setText(findTestObject('Object Repository/Docs Comp Letter/input_Close_txtNumValue'), '01')

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/button_Add (1)'))

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/button_Add Email'))

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/button_ahmad.sugantoenseval.com_btn btn-pri_0f46a7'), 
    0)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/button_ahmad.sugantoenseval.com_btn btn-pri_0f46a7'))

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/span_Submit'), 0)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comp Letter/h3_Comp. Docs. Letter Library'))

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/h3_Comp. Docs. Letter Library'), 0)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(5)

WebUI.closeBrowser()

