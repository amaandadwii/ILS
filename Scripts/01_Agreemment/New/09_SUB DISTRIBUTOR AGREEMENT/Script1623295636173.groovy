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

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Your Username_Username'), 'BERNADETTE.FANNY@KALBE.CO.ID')

WebUI.setEncryptedText(findTestObject('Object Repository/Create Agreement/09/input_Your Username_Password'), 'XA8EWhIfeOQ=')

WebUI.click(findTestObject('Object Repository/Create Agreement/09/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Create Agreement/09/a_Request'))

WebUI.click(findTestObject('Object Repository/Create Agreement/09/a_Agreement'))

WebUI.click(findTestObject('Object Repository/Create Agreement/09/button_Create New'))

WebUI.click(findTestObject('Object Repository/Create Agreement/09/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/09/select_Choose your optionDISTRIBUTION AGREE_b55422'), 
    'SUB DISTRIBUTOR AGREEMENT', true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Create Agreement/MANUFACTURING AGREEMENT/Input_Date'),
	30)

WebUI.executeJavaScript('arguments[0].value=\'2021-06-10\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/textarea_Notes_RequestHeader.Notes'), 'SUB DISTRIBUTOR')

WebUI.click(findTestObject('Object Repository/Create Agreement/09/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input__search w-100 d-block'), 'kalbe farma')

WebUI.click(findTestObject('Object Repository/Create Agreement/09/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/09/select_Choose your optionInnogene Kalbiotec_f3d6d9'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.click(findTestObject('Object Repository/Create Agreement/09/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Partner_Partner'), 'aSD')

WebUI.click(findTestObject('Object Repository/Create Agreement/09/button_Add'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Duration_SubDistributorAgreement.Dura_1ab20e'), 
    '3')

WebUI.selectOptionByValue(findTestObject('Page_Agreement Request - ILS 2021/select_Choose                            Ye_0b68d1'), 
    'Days(s)', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/09/select_Choose                    YES       _22e15d'), 
    'NO', true)

WebUI.click(findTestObject('Object Repository/Create Agreement/09/label_Non-Exclusive'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/09/select_Choose your option                  _0805bd'), 
    'Letter of Credit (L/C)', true)

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/textarea_Duration of Payment (days)_SubDist_39994d'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Lead Time for Price Changes (days)_Su_d7e106'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Days of Inventory (days)_SubDistribut_873f74'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Product Return  Nonconformity (days)__96c4f3'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Product Return  DamageExpired (days)__b0f74d'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Governing Law_SubDistributorAgreement_5613b8'), 
    'NO')

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Dispute Resolution_SubDistributorAgre_037035'), 
    'NO')

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Notice of Termination (days)_SubDistr_d76088'), 
    '3')

WebUI.click(findTestObject('Object Repository/Create Agreement/09/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Product_Product'), 'BAL')

WebUI.click(findTestObject('Object Repository/Create Agreement/09/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Create Agreement/09/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Create Agreement/09/label_Area'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Territory_Teritory2'), 'tangerang')

WebUI.click(findTestObject('Object Repository/Create Agreement/09/button_Add_1_2'))

WebUI.click(findTestObject('Object Repository/Create Agreement/09/button_CurrencyUnit_btn btn-warning btn-sm _be991a'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/09/input_Currency  Unit_CurrencyUnit'), '1000')

WebUI.click(findTestObject('Object Repository/Create Agreement/09/button_Edit'))

WebUI.click(findTestObject('Object Repository/Create Agreement/09/label_Attachment'))

WebUI.click(findTestObject('Object Repository/Create Agreement/09/button_Add Attachment'))

WebUI.delay(2)

CustomKeywords.'test.testclass.uploadFile'(findTestObject('Object Repository/Upload_Attachment/button_Choose File'), 'H:\\Magang\\ILS\\SS\\LibAggrement-01.jpg')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Upload_Attachment/button_Edit'))

WebUI.click(findTestObject('Create Agreement/button_Save_Create_Agrrement'))

WebUI.click(findTestObject('Create Agreement/OK_AfterSaveAggrement'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Create Agreement/label_Document Status  DRAFT'), 0)

WebUI.closeBrowser()

