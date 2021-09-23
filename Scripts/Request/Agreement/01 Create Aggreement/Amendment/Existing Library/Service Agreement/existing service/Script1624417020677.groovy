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

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/a_011AgrKFIII2021'))

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

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/service agreement/label_Partner Candidate'), 0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/Checkbox_PartnerCandidate'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/btn_DeletePartner2'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/btn_editPartner1'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/service agreement/input_Partner_Partner'), 'PT. Enseval')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Manufacturing Agreement/button_EditPartner'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/label_Type of Services_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/service agreement/input_Type of Services_ServiceAgreement.Typ_ba0b36'), 
    'servis 1')

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/label_Duration_form-check-label'))

WebUI.click(findTestObject('Agreement Request/service agreement/select_Year(s)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/service agreement/input_Duration_ServiceAgreement.Duration2New'), 
    '1')

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/label_Auto Renewal_form-check-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/service agreement/select_Choose                    YES       _22e15d'), 
    'NO', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/service agreement/label_Term Of Payment'), 0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/label_Term Of Payment_form-check-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/service agreement/select_Choose your option                  _0805bd'), 
    'Transfer', true)

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/label_Duration of Payment (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/service agreement/textarea_Duration of Payment (days)_Service_bb03da'), 
    '5')

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/Checkbox_Penalty'))

WebUI.click(findTestObject('Object Repository/Agreement Request/service agreement/button_Value ()_btn btn-warning btn-sm btn-_a6c596'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/service agreement/input_Value ()_ValuePenalty'), '10')

WebUI.click(findTestObject('Object Repository/Agreement Request/service agreement/button_Edit'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/service agreement/label_Lead Time for Price Changes (days)'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/label_Lead Time for Price Changes (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/service agreement/input_Lead Time for Price Changes (days)_Se_02f9e7'), 
    '4')

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/label_Governing Law_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/service agreement/input_Governing Law_ServiceAgreement.Govern_7ddd91'), 
    'indonesia')

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/label_Dispute Resolution_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/service agreement/input_Dispute Resolution_ServiceAgreement.D_8599ce'), 
    'disp')

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/label_Notice of Termination (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/service agreement/input_Notice of Termination (days)_ServiceA_a9e88e'), 
    '5')

WebUI.scrollToElement(findTestObject('Agreement Request/Amendment/1/service agreement/label_Territory(ies)'), 0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/Checkbox_Territory'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/btn_DeleteTerritory2'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/service agreement/btn_DeleteTerritory1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/service agreement/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Agreement Request/service agreement/label_Country'))

WebUI.click(findTestObject('Object Repository/Agreement Request/service agreement/input__select-dropdown form-control (1)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/service agreement/input__search w-100 d-block (1)'), 'indonesia')

WebUI.click(findTestObject('Object Repository/Agreement Request/service agreement/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/service agreement/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.click(findTestObject('Object Repository/Agreement Request/service agreement/button_Add (1)'))

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

