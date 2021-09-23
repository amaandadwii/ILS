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

WebUI.click(findTestObject('Object Repository/Home Page/i_Menu_Bar'))

WebUI.click(findTestObject('Object Repository/Home Page/a_Agreement'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/h3_Request Agreement List'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/button_Create New Agreement'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/h3_Create Agreement Request'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/label_AmendmentAddendumRenewal'))

WebUI.scrollToElement(findTestObject('Object Repository/Docs Comp Letter/Create Appointment Letter/Amendment/appointmrent/label_Existing Library'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/button_Existing Library_btnExistLibrary'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Other Agreement/a_008AgrKFIII2021'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Agreement Request/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-07-17\'', Arrays.asList(element))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Entity In Agreement'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/input__search w-100 d-block'), 
    'kalbe farma')

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/select_Choose your optionInnogene Kalbiotec_f3d6d9'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Partner Candidate'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/Checbox_PartnerCandidate'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/edit_partner1'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Partner_Partner'), 'PT. Enseval')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/button_EditPartner'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Other Agreement/delete_partner2'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Other Agreement/label_Name of Agreement_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/other agreement/input_Name of Agreement_OtherAgreement.Name_5078b4'), 
    'Gareement A')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Other Agreement/label_Duration_form-check-label'))

WebUI.click(findTestObject('Agreement Request/other agreement/select_Year(s)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/other agreement/input_Duration_OtherAgreement.Duration2New'), 
    '2')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Other Agreement/label_Other Notes_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/other agreement/textarea_Other Notes_OtherAgreement.OthersNew'), 
    'other ')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/other agreement/label_Territory(ies)'), 0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Other Agreement/checkbox_Territory'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Other Agreement/delete_Territory2'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Other Agreement/delete_Territory1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/other agreement/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Agreement Request/other agreement/label_Area'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/other agreement/input_Territory_Teritory2'), 'Jakarta')

WebUI.click(findTestObject('Object Repository/Agreement Request/other agreement/button_Add (1)'))

WebUI.click(findTestObject('Object Repository/Agreement Request/other agreement/button_Add Territory'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/other agreement/input_Territory_Teritory2'), 'Tangerang')

WebUI.click(findTestObject('Object Repository/Agreement Request/other agreement/button_Add (1)'))

WebUI.scrollToElement(findTestObject('Agreement Request/attachment/label_Attachment'), 0)

WebUI.click(findTestObject('Agreement Request/attachment/label_Attachment'))

WebUI.click(findTestObject('Agreement Request/attachment/add_file1'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    GlobalVariable.uploadFile)

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Agreement Request/h3_Create Agreement Request'), 0)

WebUI.click(findTestObject('Agreement Request/button_Save'))

WebUI.delay(2)

WebUI.closeBrowser()

