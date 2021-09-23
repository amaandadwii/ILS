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

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/a_007AgrKFIII2021'))

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

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Partner Candidate'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/Checkbox_PartnerCandidate'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/btn_editPartner1'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Partner_Partner'), 'PT. Enseval')

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/button_EditPartnerOK1'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/label_Duration_form-check-label'))

WebUI.click(findTestObject('Agreement Request/sub distributor agreement/select_Year(s)'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Duration_SubDistributorAgreement.Dura_1ab20e'), 
    '2')

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/label_Auto Renewal_form-check-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/sub distributor agreement/select_Choose                    YES       _22e15d'), 
    'NO', true)

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/label_Exclusivity_form-check-label'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Exclusive'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Term Of Payment'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/label_Term Of Payment_form-check-label'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/sub distributor agreement/select_Choose your option                  _0805bd'), 
    'Others', true)

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/textarea_Term Of Payment_SubDistributorAgre_c47d3c'), 
    'gopay')

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/label_Duration of Payment (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/textarea_Duration of Payment (days)_SubDist_39994d'), 
    '3')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Penalty'), 0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/Checkbox_Penalty'))

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/button_true_btn btn-warning btn-sm btn-roun_f65523'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Value ()_ValuePenalty'), 
    '10')

WebUI.click(findTestObject('Object Repository/Agreement Request/sub distributor agreement/button_Edit'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/label_Lead Time for Price Changes (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Lead Time for Price Changes (days)_Su_d7e106'), 
    '10')

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/label_Days of Inventory (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Days of Inventory (days)_SubDistribut_873f74'), 
    '5')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Product Return  Nonconformity (days)'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/label_Product Return  Nonconformity (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Product Return  Nonconformity (days)__96c4f3'), 
    '3')

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/label_Product Return  DamageExpired (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Product Return  DamageExpired (days)__b0f74d'), 
    '2')

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/label_Governing Law_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Governing Law_SubDistributorAgreement_5613b8'), 
    'law')

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/label_Dispute Resolution_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Dispute Resolution_SubDistributorAgre_037035'), 
    'dispute')

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/label_Notice of Termination (days)_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Notice of Termination (days)_SubDistr_d76088'), 
    '4')

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Product(s)'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/Checkbox_Products'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/btn_Editproduct1'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/sub distributor agreement/input_Product_Product'), 'product A')

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/button_EditProductOK'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/Checkbox_Territory'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/btn_deleteTerritory2'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/btn_deleteTerritory1'))

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

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/sub distributor agreement/label_Sales Target'), 
    0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/sub distribution/Checkbox_SalesTarget'))

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

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Agreement Request/h3_Create Agreement Request'), 0)

WebUI.click(findTestObject('Agreement Request/button_Save'))

WebUI.delay(2)

WebUI.closeBrowser()

