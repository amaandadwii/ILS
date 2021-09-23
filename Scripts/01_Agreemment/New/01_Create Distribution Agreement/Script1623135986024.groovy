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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Your Username_Username'), GlobalVariable.UserID)

WebUI.setEncryptedText(findTestObject('Object Repository/Create Agreement/input_Your Username_Password'), GlobalVariable.UserPassword)

WebUI.click(findTestObject('Object Repository/Create Agreement/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Create Agreement/a_Request'))

WebUI.click(findTestObject('Object Repository/Create Agreement/a_Agreement'))

WebUI.click(findTestObject('Object Repository/Create Agreement/button_Create New'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Create Agreement/label_Document Status  DRAFT'), 0)

WebUI.click(findTestObject('Object Repository/Create Agreement/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/select_Choose your optionDISTRIBUTION AGREE_b55422'), 
    'DISTRIBUTION AGREEMENT', true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Create Agreement/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-06-10\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/Create Agreement/textarea_Notes_RequestHeader.Notes'), 'Testing')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/select_Choose your option                  _e71160'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.click(findTestObject('Object Repository/Create Agreement/label_Detail'))

WebUI.click(findTestObject('Object Repository/Create Agreement/div_Partner Candidate                      _ccbeef'))

WebUI.click(findTestObject('Object Repository/Create Agreement/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Partner_Partner'), 'udin')

WebUI.click(findTestObject('Object Repository/Create Agreement/button_Add'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Duration_DistributionAgreement.Duration2New'), '5')

WebUI.scrollToElement(findTestObject('Create Agreement/select_Choose                            Ye_0b68d1'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/select_Choose                            Ye_0b68d1'), 
    'Month(s)', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/select_Choose                    YES       _22e15d'), 
    'NO', true)

WebUI.click(findTestObject('Object Repository/Create Agreement/label_Non-Exclusive'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Product Registration Holder_Distribut_797766'), 'AAAA')

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Product Registration Cost Responsibil_c0e9f6'), 'BBBB')

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Intellectual Property Holder_Distribu_f294db'), 'CCCC')

WebUI.click(findTestObject('Object Repository/Create Agreement/label_YES'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Fixed_DistributionAgreement.FixedNew'), '5')

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Rolling_DistributionAgreement.RollingNew'), '5')

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Purchase Order Submission (days)_Dist_68d7f4'), '5')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/select_Choose your option                CF_bcaa55'), 
    'CFR – Cost and Freight', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/select_Choose your option                  _0805bd'), 
    'Transfer', true)

WebUI.setText(findTestObject('Object Repository/Create Agreement/textarea_Duration of Payment (days)_Distrib_4fffa2'), '5')

WebUI.click(findTestObject('Object Repository/Create Agreement/a_Value ()_btn btn-warning btn-sm btn-round_c5ba1e'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Value ()_ValuePenalty'), '5')

WebUI.click(findTestObject('Object Repository/Create Agreement/button_Edit'))

WebUI.click(findTestObject('Object Repository/Create Agreement/a_Value ()_btn btn-warning btn-sm btn-round_c5ba1e'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Value ()_ValuePenalty'), '5')

WebUI.click(findTestObject('Object Repository/Create Agreement/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Lead Time for Price Changes (days)_Di_df581b'), '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Days of Inventory (days)_Distribution_b7f30d'), '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Packaging  Artwork Responsibility_Dis_4f41db'), 'aaaa')

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Product Return  Nonconformity (days)__9369c0'), '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Product Return  DamageExpired (days)__628e36'), '3')

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Governing Law_DistributionAgreement.G_02efa6'), 'NO')

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Dispute Resolution_DistributionAgreem_a29832'), 'Yes')

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Notice of Termination (days)_Distribu_28c180'), '3')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/select_Choose your option                  _934389'), 
    'NO', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/select_Choose your option                  _934389_1'), 
    'NO', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Agreement/select_Choose your option                  _934389_1_2'), 
    'YES', true)

WebUI.click(findTestObject('Object Repository/Create Agreement/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Product_Product'), 'ABC')

WebUI.click(findTestObject('Object Repository/Create Agreement/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Create Agreement/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Create Agreement/label_Area'))

WebUI.setText(findTestObject('Object Repository/Create Agreement/input_Territory_Teritory2'), 'tangerang')

WebUI.click(findTestObject('Object Repository/Create Agreement/button_Add_1_2'))

WebUI.click(findTestObject('Object Repository/Create Agreement/label_Attachment'))

WebUI.click(findTestObject('Upload_Attachment/Attachment_Button1'))

WebUI.delay(2)

CustomKeywords.'test.testclass.uploadFile'(findTestObject('Object Repository/Upload_Attachment/button_Choose File'), 'H:\\Magang\\ILS\\SS\\LibAggrement-01.jpg')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Upload_Attachment/button_Edit'))

//------------------------------------------
WebUI.click(findTestObject('Upload_Attachment/Attachment_Button2'))

WebUI.delay(2)

CustomKeywords.'test.testclass.uploadFile'(findTestObject('Object Repository/Upload_Attachment/button_Choose File'), 'H:\\Magang\\ILS\\SS\\LibAggrement-01.jpg')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Upload_Attachment/button_Edit'))

//--------------------------------------------
WebUI.click(findTestObject('Upload_Attachment/Attachment_Button3'))

WebUI.delay(2)

CustomKeywords.'test.testclass.uploadFile'(findTestObject('Object Repository/Upload_Attachment/button_Choose File'), 'H:\\Magang\\ILS\\SS\\LibAggrement-01.jpg')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Upload_Attachment/button_Edit'))

WebUI.click(findTestObject('Create Agreement/button_Save_Create_Agrrement'))

WebUI.click(findTestObject('Create Agreement/OK_AfterSaveAggrement'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Create Agreement/label_Document Status  DRAFT'), 0)

WebUI.closeBrowser()

