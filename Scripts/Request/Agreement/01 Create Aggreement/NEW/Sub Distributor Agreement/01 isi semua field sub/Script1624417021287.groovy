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

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/select_DISTRIBUTION AGREE'), 'SUB DISTRIBUTOR AGREEMENT', 
    true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Agreement Request/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-12-17\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/Agreement Request/textarea_NotesAgreement'), 'Senin Pagi')

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input__search w-100 d-block'), 
    'Kalbe farma')

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/sub distributor agreement/select_Choose your optionInnogene Kalbiotec_f3d6d9'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Partner Candidate'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/button_Add Partner'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Partner_Partner'), 'PT. Enseval')

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/button_Add'))

WebUI.click(findTestObject('Agreement Request/sub distributor agreement/select_Year(s)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Duration_SubDistributorAgreement.Dura_1ab20e'), 
    '2')

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/sub distributor agreement/select_Choose                    YES       _22e15d'), 
    'NO', true)

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Exclusive'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Term Of Payment'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/sub distributor agreement/select_Choose your option                  _0805bd'), 
    'Others', true)

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/textarea_Term Of Payment_SubDistributorAgre_c47d3c'), 
    'gopay')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/textarea_Duration of Payment (days)_SubDist_39994d'), 
    '3')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Penalty'), 0)

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/button_true_btn btn-warning btn-sm btn-roun_f65523'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Value ()_ValuePenalty'), 
    '10')

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Lead Time for Price Changes (days)_Su_d7e106'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Days of Inventory (days)_SubDistribut_873f74'), 
    '5')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Product Return  Nonconformity (days)'), 
    0)

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Product Return  Nonconformity (days)__96c4f3'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Product Return  DamageExpired (days)__b0f74d'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Governing Law_SubDistributorAgreement_5613b8'), 
    'law')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Dispute Resolution_SubDistributorAgre_037035'), 
    'dispute')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Notice of Termination (days)_SubDistr_d76088'), 
    '4')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Product(s)'), 
    0)

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Product_Product'), 'product A')

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/button_Add (1)'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Country'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input__select-dropdown form-control (1)'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/span__search-wrap ml-2'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input__search w-100 d-block (1)'), 
    'indonesia')

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/sub distributor agreement/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/button_Add_1'))

WebUI.mouseOver(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Sales Target'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/button_CurrencyUnit_btn btn-warning btn-sm _be991a'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Currency  Unit_CurrencyUnit'), 
    'IDR')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Currency  Unit_Year1'), 
    '1,500')

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Currency  Unit_Year2'), 
    '5,000')

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/button_Edit_1'))

WebUI.scrollToElement(findTestObject('Agreement Request/attachment/label_Attachment'), 0)

WebUI.click(findTestObject('Agreement Request/attachment/label_Attachment'))

WebUI.click(findTestObject('Agreement Request/sub distributor agreement/button_Add Attachment'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    GlobalVariable.uploadFile)

WebUI.delay(2)

WebUI.setText(findTestObject('Agreement Request/sub distributor agreement/textarea_Description_FileDescription'), 'asdf')

WebUI.click(findTestObject('Agreement Request/sub distributor agreement/span_Add'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Agreement Request/h3_Create Agreement Request'), 0)

WebUI.click(findTestObject('Agreement Request/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(10)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(10)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(20)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(10)

WebUI.closeBrowser()

