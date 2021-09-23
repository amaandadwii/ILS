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

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/a_009AgrKFIII2021'))

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

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/delete_Partner2a'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Duration_form-check-label'))

WebUI.click(findTestObject('Agreement Request/Manufacturing Agreement NEW/select_Month(s)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Duration_ManufacturingAgreement.Duration2New'), 
    '6')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Auto Renewal_form-check-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/select_Choose                    YES       _22e15d'), 
    'NO', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Exclusivity'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Exclusivity_form-check-label'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Exclusive'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Product Registration Holder_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Product Registration Holder_Manufactu_a35a52'), 
    'product A')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Product Registration Cost Responsibility_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Product Registration Cost Responsibil_720c15'), 
    'cost Product')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Intellectual Property Holder_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Intellectual Property Holder_Manufact_9f02a7'), 
    'IP hoder')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Rolling Forecast (months)_form-check-label'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_NO'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Purchase Order Submission (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Purchase Order Submission (days)_Manu_f6d0c1'), 
    '25')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Delivery Terms'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Delivery Terms_form-check-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/select_Choose your optionCFR  Cost and Frei_b3b292'), 
    'CIP – Carriage and Insurance Paid', true)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Term Of Payment_form-check-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/select_Choose your option                  _0805bd'), 
    'Transfer', true)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Duration of Payment (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/textarea_Duration of Payment (days)_Manufac_11ba4c'), 
    '12')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/div_Penalty'), 0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/Checkbox_Penalty'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/button_Value ()_btn btn-warning btn-sm btn-_a6c596'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Value ()_ValuePenalty'), 
    '10')

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/button_Edit'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Lead Time for Price Changes (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Lead Time for Price Changes (days)_Ma_a79ceb'), 
    '4')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Days of Inventory (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Days of Inventory (days)_Manufacturin_84ace9'), 
    '3')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Artwork Responsibility'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Artwork Responsibility_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Artwork Responsibility_ManufacturingA_e335f1'), 
    'artwork')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Raw Material Responsibility_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Raw Material Responsibility_Manufactu_1c9d63'), 
    'raw')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Packaging Responsibility_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Packaging Responsibility_Manufacturin_9b9115'), 
    'resp')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Product Return  Nonconformity (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Product Return  Nonconformity (days)__42b832'), 
    '2')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Product Return  DamageExpired (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Product Return  DamageExpired (days)__053d43'), 
    '3')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Governing Law'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Governing Law_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Governing Law_ManufacturingAgreement._7c67f7'), 
    'law')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Dispute Resolution_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Dispute Resolution_ManufacturingAgree_3d6f48'), 
    'dispute')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/label_Notice of Termination (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Notice of Termination (days)_Manufact_892b3b'), 
    '3')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Product(s)'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/Checkbox_Products'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/delete_ProductXon-Ce'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/Checkbox_Territory'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/delete_Territory1'))

/*WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Minimum Order Quantity'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/button_CurrencyUnit_btn btn-warning btn-sm _be991a'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Currency  Unit_CurrencyUnit'), 
    'IDR')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Currency  Unit_Year1'), 
    '2')

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/button_Edit_1'))
*/
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

