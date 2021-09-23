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

WebUI.setText(findTestObject('Object Repository/Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'))

WebUI.click(findTestObject('Request/a_Request'))

WebUI.click(findTestObject('Request/a_Agreement'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/h3_Request Agreement List'))

WebUI.click(findTestObject('Object Repository/Agreement Request/button_Create New Agreement'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/h3_Create Agreement Request'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Type Agreement/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/select_DISTRIBUTION AGREE'), 'QUALITY AGREEMENT', 
    true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Agreement Request/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-07-17\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/Agreement Request/textarea_NotesAgreement'), 'test')

WebUI.click(findTestObject('Object Repository/Agreement Request/other agreement/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/other agreement/input__search w-100 d-block'), 'Kalbe farma')

WebUI.click(findTestObject('Object Repository/Agreement Request/other agreement/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/other agreement/select_Choose your optionInnogene Kalbiotec_f3d6d9'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/other agreement/label_Partner Candidate'), 0)

WebUI.click(findTestObject('Object Repository/Agreement Request/other agreement/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/other agreement/input_Partner_Partner'), 'PT. Enseval')

WebUI.click(findTestObject('Object Repository/Agreement Request/other agreement/button_Add'))

WebUI.click(findTestObject('Agreement Request/Quality Agreement/select_Year(s)'))

WebUI.setText(findTestObject('Agreement Request/Quality Agreement/input_Duration_QualityAgreement.Duration2New'), '2')

WebUI.setText(findTestObject('Agreement Request/Quality Agreement/textarea_Other Notes_QualityAgreement.OthersNew'), 'other ')

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

