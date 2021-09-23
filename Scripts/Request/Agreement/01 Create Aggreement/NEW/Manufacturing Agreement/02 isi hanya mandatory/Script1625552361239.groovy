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

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/select_DISTRIBUTION AGREE'), 'MANUFACTURING AGREEMENT', 
    true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Agreement Request/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-17\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/Agreement Request/textarea_NotesAgreement'), 'test')

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input__search w-100 d-block'), 
    'Kalbe farma')

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/select_Choose your optionInnogene Kalbiotec_f3d6d9'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Partner Candidate'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Partner_Partner'), 'PT. Enseval')

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/button_Add'))

WebUI.click(findTestObject('Agreement Request/Manufacturing Agreement NEW/select_Month(s)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Duration_ManufacturingAgreement.Duration2New'), 
    '6')

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/select_Choose                    YES       _22e15d'), 
    'NO', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Exclusivity'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Exclusive'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Product Registration Holder_Manufactu_a35a52'), 
    'product A')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Product Registration Cost Responsibil_720c15'), 
    'cost Product')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Intellectual Property Holder_Manufact_9f02a7'), 
    'IP hoder')

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_NO'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Purchase Order Submission (days)_Manu_f6d0c1'), 
    '25')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Delivery Terms'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/select_Choose your optionCFR  Cost and Frei_b3b292'), 
    'CIP – Carriage and Insurance Paid', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/select_Choose your option                  _0805bd'), 
    'Transfer', true)

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/textarea_Duration of Payment (days)_Manufac_11ba4c'), 
    '12')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/div_Penalty'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/penalty2/button_Value ()_btn btn-warning btn-sm btn-rounded btn-edit-requestor edit-penalty'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Value ()_ValuePenalty'), 
    '5')

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/button_Edit'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/penalty2/button_true_btn btn-warning btn-sm btn-rounded btn-edit-requestor edit-penalty'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Value ()_ValuePenalty'), 
    '2')

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Lead Time for Price Changes (days)_Ma_a79ceb'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Days of Inventory (days)_Manufacturin_84ace9'), 
    '3')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Artwork Responsibility'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Raw Material Responsibility_Manufactu_1c9d63'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Artwork Responsibility_ManufacturingA_e335f1'), 
    'aaaa')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Raw Material Responsibility_Manufactu_1c9d63'), 
    'raw')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Packaging Responsibility_Manufacturin_9b9115'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Product Return  Nonconformity (days)__42b832'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Product Return  DamageExpired (days)__053d43'), 
    '3')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Governing Law'), 
    0)

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Governing Law_ManufacturingAgreement._7c67f7'), 
    'law')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Dispute Resolution_ManufacturingAgree_3d6f48'), 
    'aasd')

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Notice of Termination (days)_Manufact_892b3b'), 
    '3')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Product(s)'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Product_Product'), 'Hydro Coco')

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/label_Area'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input_Territory_Teritory2'), 
    'Jakarta Pusat')

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/button_Add_1_2'))

WebUI.scrollToElement(findTestObject('Agreement Request/h3_Create Agreement Request'), 0)

WebUI.click(findTestObject('Agreement Request/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.closeBrowser()

