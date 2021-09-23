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

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/a_005AgrKFIII2021'))

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

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/supply agreement/label_Partner Candidate'), 0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/Checkbox_PartnerCandidate'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/btn_editPartner1'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Partner_Partner'), 'PT. Enseval')

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/button_EditPartnerOK1'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Duration_form-check-label'))

WebUI.click(findTestObject('Agreement Request/supply agreement/select_Year(s)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Duration_SupplyAgreement.Duration2New'), 
    '1')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Auto Renewal_form-check-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/supply agreement/select_Choose                    YES       _22e15d'), 
    'NO', true)

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Exclusivity_form-check-label'))

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/label_Non-Exclusive'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Product Registration Holder_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Product Registration Holder_SupplyAgr_793cb4'), 
    'product')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/supply agreement/label_Product Registration Cost Responsibility'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Product Registration Cost Responsibility_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Product Registration Cost Responsibil_914d21'), 
    'regixtrf')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Intellectual Property Holder_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Intellectual Property Holder_SupplyAg_50eabe'), 
    'njcdkvd')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Rolling Forecast (months)_form-check-label'))

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/label_NO'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Purchase Order Submission (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Purchase Order Submission (days)_Supp_25c539'), 
    '3')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Delivery Terms_form-check-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/supply agreement/select_Choose your optionCFR  Cost and Frei_b3b292'), 
    'DAP – Delivered At Place', true)

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Term Of Payment_form-check-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/supply agreement/select_Choose your option                  _0805bd'), 
    'Transfer', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/supply agreement/label_Duration of Payment (days)'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Duration of Payment (days)_form-check-label'))

WebUI.setText(findTestObject('Agreement Request/Amendment/1/supply agreemenet/Duration of Payment (days)_SupplyAgreement.DurationPaymentNew'), 
    '14 days')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/Checkbox_PenaltyNew'))

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Value ()_btn btn-warning btn-sm btn-_a6c596'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Value ()_ValuePenalty'), '10')

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Edit'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/supply agreement/label_Lead Time for Price Changes (days)'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Lead Time for Price Changes (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Lead Time for Price Changes (days)_Su_c0003d'), 
    '4')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Days of Inventory (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Days of Inventory (days)_SupplyAgreem_a62617'), 
    '3')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Artwork Responsibility_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Artwork Responsibility_SupplyAgreemen_39a827'), 
    'asafdsgfhdgh')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Raw Material Responsibility_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Raw Material Responsibility_SupplyAgr_b94a0c'), 
    'adfsdgfnhh')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Packaging Responsibility_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Packaging Responsibility_SupplyAgreem_19cc02'), 
    'aSDFGBHJ')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Product Return  Nonconformity (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Product Return  Nonconformity (days)__a79652'), 
    '3')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Product Return  DamageExpired (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Product Return  DamageExpired (days)__380afd'), 
    '2')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/supply agreement/label_Governing Law'), 0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Governing Law_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Governing Law_SupplyAgreement.Governi_89e2ac'), 
    'indonesia')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Dispute Resolution_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Dispute Resolution_SupplyAgreement.Di_2e6afb'), 
    'disp')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/label_Notice of Termination (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Notice of Termination (days)_SupplyAg_961758'), 
    '4')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/Checkbox_Products'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/btn_editProduct1'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Product_Product'), 'a')

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/button_EditProductOK'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/supply agreement/label_Territory(ies)'), 0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/Checkbox_Territory'))

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/btn_deleteterritory3'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/btn_deleteterritory2'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/btn_deleteterritory1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/label_Country'))

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/input__select-dropdown form-control (1)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input__search w-100 d-block (1)'), 'indonesia')

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/supply agreement/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Add_1'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/supply agreemenet/Checkbox_MinOrder'))

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_CurrencyUnit_btn btn-warning btn-sm _be991a'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Currency  Unit_CurrencyUnit'), 
    'IDR')

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Currency  Unit_Year1'), '127,623')

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Edit_1'))

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

