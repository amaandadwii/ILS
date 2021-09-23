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

WebUI.verifyElementVisible(findTestObject('Request/div_My TaskYOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Request/a_RequestSetelahMyTask'))

WebUI.click(findTestObject('Request/a_AgreementSetelahMyTask'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/h3_Request Agreement List'))

WebUI.click(findTestObject('Object Repository/Agreement Request/button_Create New Agreement'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/h3_Create Agreement Request'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Type Agreement/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/select_DISTRIBUTION AGREE'), 'SUPPLY AGREEMENT', 
    true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Agreement Request/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-07-17\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/Agreement Request/textarea_NotesAgreement'), 'test')

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input__search w-100 d-block'), 'Kalbe farma')

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/supply agreement/select_Choose your optionInnogene Kalbiotec_f3d6d9'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/supply agreement/label_Partner Candidate'), 0)

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Partner_Partner'), 'PT. Enseval')

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Add'))

WebUI.click(findTestObject('Agreement Request/supply agreement/select_Year(s)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Duration_SupplyAgreement.Duration2New'), 
    '2')

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/supply agreement/select_Choose                    YES       _22e15d'), 
    'NO', true)

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/label_Non-Exclusive'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Product Registration Holder_SupplyAgr_793cb4'), 
    'product')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/supply agreement/label_Product Registration Cost Responsibility'), 
    0)

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Product Registration Cost Responsibil_914d21'), 
    'regixtrf')

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Intellectual Property Holder_SupplyAg_50eabe'), 
    'njcdkvd')

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/label_NO'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Purchase Order Submission (days)_Supp_25c539'), 
    '3')

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/supply agreement/select_Choose your optionCFR  Cost and Frei_b3b292'), 
    'DAP – Delivered At Place', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/supply agreement/select_Choose your option                  _0805bd'), 
    'Transfer', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/supply agreement/label_Duration of Payment (days)'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Value ()_btn btn-warning btn-sm btn-_a6c596'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Value ()_ValuePenalty'), '10')

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Edit'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/supply agreement/label_Lead Time for Price Changes (days)'), 
    0)

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Lead Time for Price Changes (days)_Su_c0003d'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Days of Inventory (days)_SupplyAgreem_a62617'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Artwork Responsibility_SupplyAgreemen_39a827'), 
    'asafdsgfhdgh')

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Raw Material Responsibility_SupplyAgr_b94a0c'), 
    'adfsdgfnhh')

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Packaging Responsibility_SupplyAgreem_19cc02'), 
    'aSDFGBHJ')

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Product Return  Nonconformity (days)__a79652'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Product Return  DamageExpired (days)__380afd'), 
    '2')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/supply agreement/label_Governing Law'), 0)

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Governing Law_SupplyAgreement.Governi_89e2ac'), 
    'indonesia')

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Dispute Resolution_SupplyAgreement.Di_2e6afb'), 
    'disp')

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Notice of Termination (days)_SupplyAg_961758'), 
    '4')

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Product_Product'), 'a')

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Add (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/supply agreement/label_Territory(ies)'), 0)

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/label_Country'))

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/input__select-dropdown form-control (1)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input__search w-100 d-block (1)'), 'indonesia')

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/supply agreement/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/supply agreement/button_CurrencyUnit_btn btn-warning btn-sm _be991a'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Currency  Unit_CurrencyUnit'), 
    'IDR')

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Currency  Unit_Year1'), '127,623')

WebUI.setText(findTestObject('Object Repository/Agreement Request/supply agreement/input_Currency  Unit_Year2'), '4,573,876')

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

WebUI.click(findTestObject('Agreement Request/attachment/add_file2'))

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    'D:\\automation data.xlsx')

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

//ADD FILE 3
WebUI.click(findTestObject('Object Repository/Agreement Request/attachment/add_file3'))

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    'D:\\Panduan Internship Apps Site Supervisor Monitoring Learning Plan dan Log Book.pdf')

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

//ADD FILE 4
WebUI.click(findTestObject('Object Repository/Agreement Request/attachment/add_file4'))

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

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

