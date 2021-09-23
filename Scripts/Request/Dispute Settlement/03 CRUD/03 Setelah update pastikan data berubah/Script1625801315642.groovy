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

WebUI.setText(findTestObject('Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/button_LOG IN'))

WebUI.click(findTestObject('Home Page/a_Request'))

WebUI.click(findTestObject('Object Repository/dispute st/a_Dispute Settlement'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dispute st/h3_Dispute Settlement List'))

WebUI.click(findTestObject('Intellectual Property/td_1'))

WebUI.click(findTestObject('dispute st/a_0041Req.DisputeKFVII2021'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dispute st/h3_Create Dispute Settlement Request'))

WebUI.scrollToElement(findTestObject('dispute st/input_Expected Date of Finalization_DisputeHeader'), 0)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/dispute st/input_Expected Date of Finalization_DisputeHeader'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-30\'', Arrays.asList(element))

WebUI.scrollToElement(findTestObject('Object Repository/dispute st/label_Detail'), 0)

WebUI.setText(findTestObject('Object Repository/dispute st/input_Amount_DisputeHeader.Amount'), '3500 update')

WebUI.setText(findTestObject('Object Repository/dispute st/input_Amount_DisputeHeader.Amount'), '4000')

WebUI.scrollToElement(findTestObject('Object Repository/dispute st/h3_Create Dispute Settlement Request'), 0)

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/button_Back'))

WebUI.click(findTestObject('Intellectual Property/td_1'))

WebUI.click(findTestObject('dispute st/a_0041Req.DisputeKFVII2021'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dispute st/h3_Create Dispute Settlement Request'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Docs Comp Letter/update/label_Effective Date'), 0)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/dispute st/label_Detail'), 0)

WebUI.delay(5)

/*WebUI.scrollToElement(findTestObject('Docs Comp Letter/Create Docs.Letter Request/h3_Create Docs. Letter Request'), 0)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(13)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)
*/
WebUI.closeBrowser()

