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

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/select_DISTRIBUTION AGREE'), 'SALES AGREEMENT', 
    true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Agreement Request/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-12-17\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/Agreement Request/textarea_NotesAgreement'), 'test')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input__search w-100 d-block'), 'Kalbe farma')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/sales agreement/select_Choose your optionInnogene Kalbiotec_f3d6d9'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sales agreement/label_Partner Candidate'), 0)

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Partner_Partner'), 'PT. Enseval')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Add'))

WebUI.click(findTestObject('Agreement Request/sales agreement/select_Year'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Duration_SalesAgreement.Duration2New'), 
    '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/sales agreement/select_Choose                    YES       _22e15d'), 
    'NO', true)

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/label_Exclusive'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sales agreement/label_Product Registration Holder'), 
    0)

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Product Registration Holder_SalesAgre_5e05bb'), 
    'product A')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Product Registration Cost Responsibil_6955d6'), 
    'cost respond')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Intellectual Property Holder_SalesAgr_0f9665'), 
    'intellectual')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/label_NO'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Purchase Order Submission (days)_Sale_8a3b6c'), 
    '4')

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/sales agreement/select_Choose your optionCFR  Cost and Frei_b3b292'), 
    'CPT – Carriage Paid To', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/sales agreement/select_Choose your option                  _0805bd'), 
    'Transfer', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sales agreement/label_Duration of Payment (days)'), 
    0)

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/textarea_Duration of Payment (days)_SalesAg_e066c5'), 
    '3')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_true_btn btn-warning btn-sm btn-roun_f65523'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Value ()_ValuePenalty'), '3')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Edit'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sales agreement/label_Lead Time for Price Changes (days)'), 
    0)

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Lead Time for Price Changes (days)_Sa_7c2e1c'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Days of Inventory (days)_SalesAgreeme_ed55ca'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Packaging  Artwork Responsibility_Sal_b66f9f'), 
    'packaging')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Product Return  Nonconformity (days)__89e792'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Product Return  DamageExpired (days)__5a8654'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Governing Law_SalesAgreement.GoverningLawNew'), 
    'indonesia')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sales agreement/label_Dispute Resolution'), 0)

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Dispute Resolution_SalesAgreement.Dis_3e57af'), 
    'resolution')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Notice of Termination (days)_SalesAgr_b76c5c'), 
    '5')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Product_Product'), 'hydro coco')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Add (1)'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Product_Product'), 'cerebrovit')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Add (1)'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/label_Country'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/input__select-dropdown form-control (1)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input__search w-100 d-block (1)'), 'indonesia')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/sales agreement/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/label_Area'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Territory_Teritory2'), 'Bekasi')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Add_1'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sales agreement/label_Sales Target'), 0)

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_CurrencyUnit_btn btn-warning btn-sm _be991a'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Currency  Unit_CurrencyUnit'), 'IDR')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Currency  Unit_Year1'), '200')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Edit_1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_IDR_btn btn-warning btn-sm btn-round_943963'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Currency  Unit_CurrencyUnit'), 'IDR')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Currency  Unit_Year1'), '100')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Edit_1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_IDR_btn btn-warning btn-sm btn-round_943963_1'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Currency  Unit_CurrencyUnit'), 'IDR')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Currency  Unit_Year1'), '500')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Edit_1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_IDR_btn btn-warning btn-sm btn-round_943963_1_2'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Currency  Unit_CurrencyUnit'), 'IDR')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sales agreement/input_Currency  Unit_Year1'), '350')

WebUI.click(findTestObject('Object Repository/Agreement Request/sales agreement/button_Edit_1'))

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

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(13)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.closeBrowser()

