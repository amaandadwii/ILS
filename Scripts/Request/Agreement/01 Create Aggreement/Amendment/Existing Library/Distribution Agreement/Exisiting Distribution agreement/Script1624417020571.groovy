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

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/a_001AgrKFIII2021'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Agreement Request/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-05-17\'', Arrays.asList(element))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Entity In Agreement'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/input__search w-100 d-block'), 
    'kalbe farma')

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Amendment/1/Distribution agreemtn/select_Choose your optionInnogene Kalbiotec_f3d6d9'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_Partner Candidate'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/checkbox_PartnerCandidate'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Partner_Partner'), 
    'PArtner A')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/button_SavePartner'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Partner_Partner'), 
    'Partner B')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/button_SavePartner'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Duration'))

WebUI.click(findTestObject('Agreement Request/Amendment/NA/Distribution Agreement/select_Year(s)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Duration_DistributionAgreement.Duration2New'), 
    '2')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_Auto Renewal'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Auto Renewal'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/select_Choose                    YES       _22e15d'), 
    'NO', true)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Exclusivity'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_Exclusive'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Product Registration Holder'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Product Registration Holder_Distribut_797766'), 
    'product')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Product Registration Cost Responsibility'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Product Registration Cost Responsibil_c0e9f6'), 
    'product cost')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Intellectual Property Holder'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Intellectual Property Holder_Distribu_f294db'), 
    'IP holder')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_Rolling Forecast (months)'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Rolling Forecast (months)'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_YES'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Fixed_DistributionAgreement.FixedNew'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Rolling_DistributionAgreement.RollingNew'), 
    '10')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Purchase Order Submission (days)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Purchase Order Submission (days)_Dist_68d7f4'), 
    '32')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Delivery Terms'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/select_Choose your optionCFR  Cost and Frei_b3b292'), 
    'CIF – Cost, Insurance & Freight', true)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Term Of Payment'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/select_Choose your option                  _0805bd'), 
    'Others', true)

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/textarea_Term Of Payment_DistributionAgreem_d0ec70'), 
    'gopay')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_Duration of Payment (days)'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Duration of Payment (days)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/textarea_Duration of Payment (days)_Distrib_4fffa2'), 
    '5 days')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Change2'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Value ()_btn btn-warning btn-sm btn-_a6c596'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Value ()_ValuePenalty'), 
    '10')

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Edit'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_Lead Time for Price Changes (days)'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Lead Time for Price Changes (days)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Lead Time for Price Changes (days)_Di_df581b'), 
    '234')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Days of Inventory (days)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Days of Inventory (days)_Distribution_b7f30d'), 
    '7')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Packaging  Artwork Responsibility'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Packaging  Artwork Responsibility_Dis_4f41db'), 
    'artwork<>.&%#$@!')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Product Return  Nonconformity (days)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Product Return  Nonconformity (days)__9369c0'), 
    '5')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/CheckboxProduct Return  DamageExpired (days)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Product Return  DamageExpired (days)__628e36'), 
    '30')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Governing Law'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Governing Law_DistributionAgreement.G_02efa6'), 
    'Indonesia')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_Dispute Resolution'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Dispute Resolution'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Dispute Resolution_DistributionAgreem_a29832'), 
    'resolution')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Notice of Termination (days)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Notice of Termination (days)_Distribu_28c180'), 
    '14')

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Manpower'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/select_Choose your option                  _934389'), 
    'NO', true)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Office Space'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/select_Choose your option                  _934389_1'), 
    'YES', true)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_Activities  Promotion Line'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/select_Choose your option                  _934389_1_2'), 
    'YES', true)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_ChangeProducts'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_Product(s)'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Product_Product'), 
    'Hydro Coco')

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Product_Product'), 
    'Xon-Ce')

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Add_1'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_ChangeTerritorys'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_Area'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Territory_Teritory2'), 
    'Jabodetabek')

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Add_1_2'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_Country'))

WebUI.click(findTestObject('Agreement Request/Amendment/NA/Distribution Agreement/input__select-dropdown form-control1'))

WebUI.setText(findTestObject('Agreement Request/Amendment/NA/Distribution Agreement/input__search w-100 d-block1'), 'outside')

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/span_Outside Of Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Outside Of Indonesia', true)

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Add_1_2'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_Sales Target'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/Checkbox_ChangeSalesTarget'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_CurrencyUnit_btn btn-warning btn-sm _be991a'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Currency  Unit_CurrencyUnit'), 
    'IDR')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Currency  Unit_Year1'), 
    '540,000')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Currency  Unit_Year2'), 
    '768,900')

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Edit_1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_IDR_btn btn-warning btn-sm btn-round_943963'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Currency  Unit_CurrencyUnit'), 
    'IDR')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Currency  Unit_Year1'), 
    '10,000,000')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Currency  Unit_Year2'), 
    '15,000,000')

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Edit_1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_IDR_btn btn-warning btn-sm btn-round_943963_1'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Currency  Unit_CurrencyUnit'), 
    'IDR')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Currency  Unit_Year1'), 
    '900,000')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Currency  Unit_Year2'), 
    '1,500,000')

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Edit_1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_IDR_btn btn-warning btn-sm btn-round_943963_1_2'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Currency  Unit_CurrencyUnit'), 
    'IDR')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Currency  Unit_Year1'), 
    '150,000')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Currency  Unit_Year2'), 
    '298,000')

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Edit_1'))

WebUI.scrollToElement(findTestObject('Agreement Request/attachment/label_Attachment'), 0)

WebUI.click(findTestObject('Agreement Request/attachment/label_Attachment'))

WebUI.click(findTestObject('Agreement Request/attachment/add_file1'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    GlobalVariable.uploadFile)

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Agreement Request/h3_Create Agreement Request'), 0)

WebUI.click(findTestObject('Agreement Request/button_Save'))

WebUI.delay(2)

WebUI.closeBrowser()

