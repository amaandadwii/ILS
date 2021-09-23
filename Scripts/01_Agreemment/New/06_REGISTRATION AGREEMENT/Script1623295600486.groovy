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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

WebUI.openBrowser('')

WebUI.navigateToUrl('http://stgsvr.onekalbe.com:8225/')

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Your Username_Username'), 'BERNADETTE.FANNY@KALBE.CO.ID')

WebUI.setEncryptedText(findTestObject('Object Repository/Create Agreement/06/input_Your Username_Password'), 'XA8EWhIfeOQ=')

WebUI.click(findTestObject('Object Repository/Create Agreement/06/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Create Agreement/06/a_Request'))

WebUI.click(findTestObject('Object Repository/Create Agreement/06/a_Agreement'))

WebUI.click(findTestObject('Object Repository/Create Agreement/06/button_Create New'))

WebUI.click(findTestObject('Object Repository/Create Agreement/06/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/06/select_Choose your optionDISTRIBUTION AGREE_b55422'), 
    'REGISTRATION AGREEMENT', true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Create Agreement/MANUFACTURING AGREEMENT/Input_Date'),
	30)

WebUI.executeJavaScript('arguments[0].value=\'2021-06-10\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/textarea_Notes_RequestHeader.Notes'), 'REGISTRATION AGREEMENT')

WebUI.click(findTestObject('Object Repository/Create Agreement/06/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input__search w-100 d-block'), 'kalbe far')

WebUI.click(findTestObject('Object Repository/Create Agreement/06/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/06/select_Choose your optionInnogene Kalbiotec_f3d6d9'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.click(findTestObject('Object Repository/Create Agreement/06/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Partner_Partner'), 'Tester')

WebUI.click(findTestObject('Object Repository/Create Agreement/06/button_Add'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Duration_RegistrationAgreement.Duration2New'), 
    '5')

WebUI.selectOptionByValue(findTestObject('Page_Agreement Request - ILS 2021/select_Choose                            Ye_0b68d1'), 
    'Days(s)', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/06/select_Choose                    YES       _22e15d'), 
    'YES', true)

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Auto Renewal_RegistrationAgreement.Au_4af8a9'), 
    '5')

WebUI.selectOptionByValue(findTestObject('Page_Agreement Request - ILS 2021/select_Choose                            Ye_0b68d1_1'), 
    'Days(s)', false)

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Product Registration Holder_Registrat_9b8e0c'), 
    'no')

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Intellectual Property Holder_Registra_541d74'), 
    'no')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/06/select_Choose your option                  _0805bd'), 
    'Others', true)

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/textarea_Term Of Payment_RegistrationAgreem_cc17d4'), 
    'duit')

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/textarea_Duration of Payment (days)_Registr_4700bd'), 
    '5')

WebUI.click(findTestObject('Object Repository/Create Agreement/06/button_Value ()_btn btn-warning btn-sm btn-_a6c596'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Value ()_ValuePenalty'), '3')

WebUI.click(findTestObject('Object Repository/Create Agreement/06/button_Edit'))

WebUI.click(findTestObject('Object Repository/Create Agreement/06/button_true_btn btn-warning btn-sm btn-roun_f65523'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Value ()_ValuePenalty'), '3')

WebUI.click(findTestObject('Object Repository/Create Agreement/06/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Lead Time for Price Changes (days)_Re_939be0'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Governing Law_RegistrationAgreement.G_576250'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Dispute Resolution_RegistrationAgreem_c70f33'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Notice of Termination (days)_Registra_c769c8'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/textarea_Other_RegistrationAgreement.OthersNew'), 'no')

WebUI.click(findTestObject('Object Repository/Create Agreement/06/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Product_Product'), 'ABC')

WebUI.click(findTestObject('Object Repository/Create Agreement/06/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Create Agreement/06/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Create Agreement/06/label_Area'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/06/input_Territory_Teritory2'), 'jakarta')

WebUI.click(findTestObject('Object Repository/Create Agreement/06/button_Add_1_2'))

WebUI.click(findTestObject('Object Repository/Create Agreement/06/label_Attachment'))

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

