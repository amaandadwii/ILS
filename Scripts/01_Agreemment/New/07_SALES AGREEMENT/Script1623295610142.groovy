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
import org.openqa.selenium.WebElement as WebElement
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

WebUI.openBrowser('')

WebUI.navigateToUrl('http://stgsvr.onekalbe.com:8225/')

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Your Username_Username'), 'BERNADETTE.FANNY@KALBE.CO.ID')

WebUI.setEncryptedText(findTestObject('Object Repository/Create Agreement/07/input_Your Username_Password'), 'XA8EWhIfeOQ=')

WebUI.click(findTestObject('Object Repository/Create Agreement/07/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Create Agreement/07/a_Request'))

WebUI.click(findTestObject('Object Repository/Create Agreement/07/a_Agreement'))

WebUI.click(findTestObject('Object Repository/Create Agreement/07/button_Create New'))

WebUI.click(findTestObject('Object Repository/Create Agreement/07/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/07/select_Choose your optionDISTRIBUTION AGREE_b55422'), 
    'SALES AGREEMENT', true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Create Agreement/MANUFACTURING AGREEMENT/Input_Date'),
	30)

WebUI.executeJavaScript('arguments[0].value=\'2021-06-10\'', Arrays.asList(element))

WebUI.rightClick(findTestObject('Object Repository/Create Agreement/07/input_Expected Date of Finalization_Request_5a164e'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/textarea_Notes_RequestHeader.Notes'), 'SALES AGREEMENT')

WebUI.click(findTestObject('Object Repository/Create Agreement/07/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input__search w-100 d-block'), 'kalbe farma')

WebUI.click(findTestObject('Object Repository/Create Agreement/07/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/07/select_Choose your optionInnogene Kalbiotec_f3d6d9'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.click(findTestObject('Object Repository/Create Agreement/07/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Partner_Partner'), 'ADS')

WebUI.click(findTestObject('Object Repository/Create Agreement/07/button_Add'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Duration_SalesAgreement.Duration2New'), '3')

WebUI.selectOptionByValue(findTestObject('Page_Agreement Request - ILS 2021/select_Choose                            Ye_0b68d1'), 
    'Days(s)', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/07/select_Choose                    YES       _22e15d'), 
    'NO', true)

WebUI.click(findTestObject('Object Repository/Create Agreement/07/label_Exclusive'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Product Registration Holder_SalesAgre_5e05bb'), 
    'NO')

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Product Registration Cost Responsibil_6955d6'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Intellectual Property Holder_SalesAgr_0f9665'), 
    'No')

WebUI.click(findTestObject('Object Repository/Create Agreement/07/label_NO'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Purchase Order Submission (days)_Sale_8a3b6c'), 
    '3')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/07/select_Choose your optionCFR  Cost and Frei_b3b292'), 
    'Others', true)

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/textarea_Delivery Terms_SalesAgreement.Inco_1085db'), 
    'RES')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/07/select_Choose your option                  _0805bd'), 
    'Others', true)

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/textarea_Term Of Payment_SalesAgreement.Ter_6cc667'), 
    'bitconin')

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/textarea_Duration of Payment (days)_SalesAg_e066c5'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Lead Time for Price Changes (days)_Sa_7c2e1c'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Days of Inventory (days)_SalesAgreeme_ed55ca'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Packaging  Artwork Responsibility_Sal_b66f9f'), 
    'A')

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Product Return  Nonconformity (days)__89e792'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Product Return  DamageExpired (days)__5a8654'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Governing Law_SalesAgreement.GoverningLawNew'), 
    'no')

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Dispute Resolution_SalesAgreement.Dis_3e57af'), 
    'no')

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Notice of Termination (days)_SalesAgr_b76c5c'), 
    '30')

WebUI.click(findTestObject('Object Repository/Create Agreement/07/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Product_Product'), 'Ayam')

WebUI.click(findTestObject('Object Repository/Create Agreement/07/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Create Agreement/07/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Create Agreement/07/label_Country'))

WebUI.click(findTestObject('Object Repository/Create Agreement/07/label_Area'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Territory_Teritory2'), 'ABC')

WebUI.click(findTestObject('Object Repository/Create Agreement/07/button_Add_1_2'))

WebUI.click(findTestObject('Object Repository/Create Agreement/07/button_CurrencyUnit_btn btn-warning btn-sm _be991a'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/07/input_Currency  Unit_CurrencyUnit'), '5000')

WebUI.click(findTestObject('Object Repository/Create Agreement/07/button_Edit'))

WebUI.click(findTestObject('Object Repository/Create Agreement/07/label_Attachment'))

WebUI.click(findTestObject('Object Repository/Create Agreement/MANUFACTURING AGREEMENT/Upload_Attachment_1'))

WebUI.delay(2)

CustomKeywords.'test.testclass.uploadFile'(findTestObject('Object Repository/Upload_Attachment/button_Choose File'), 'H:\\Magang\\ILS\\SS\\LibAggrement-01.jpg')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Upload_Attachment/button_Edit'))

WebUI.click(findTestObject('Create Agreement/button_Save_Create_Agrrement'))

WebUI.click(findTestObject('Create Agreement/OK_AfterSaveAggrement'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Create Agreement/label_Document Status  DRAFT'), 0)

WebUI.closeBrowser()


