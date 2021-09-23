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

WebUI.setText(findTestObject('Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/button_LOG IN'))

WebUI.click(findTestObject('Request/a_Request'))

WebUI.click(findTestObject('Request/a_Agreement'))

WebUI.verifyElementVisible(findTestObject('Agreement Request/h3_Request Agreement List'))

WebUI.click(findTestObject('Agreement Request/button_Create New Agreement'))

WebUI.verifyElementVisible(findTestObject('Agreement Request/h3_Create Agreement Request'))

WebUI.click(findTestObject('Agreement Request/Type Agreement/label_New'))

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_DISTRIBUTION AGREE'), 'DISTRIBUTION AGREEMENT', true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Agreement Request/Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-17\'', Arrays.asList(element))

WebUI.setText(findTestObject('Agreement Request/textarea_NotesAgreement'), 'test')

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/input__search w-100 d-block'), 
    'Kalbe farma')

WebUI.click(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Manufacturing Agreement NEW/select_Choose your optionInnogene Kalbiotec_f3d6d9'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Partner Candidate'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/button_Add Partner'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Partner'), 'clement')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/button_SavePartner'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Duration/select_Year(s)'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/Duration/input_DurationDistribution'), '1')

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Exclusivity'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/label_Exclusive'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product Registration Holder'), 'Registration')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product Registration Cost'), 'Registration cost')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Intellectual Property Holder'), 'Intelectual')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/label_YES'))

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Fixed'), 0)

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Fixed_DistributionAgreement'), '2')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Rolling_DistributionAgreement'), '4')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Purchase Order Submission'), '5')

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_DeliveryTerms(other)'), 'Others', true)

WebUI.setText(findTestObject('Agreement Request/textarea_Delivery Terms'), 'eryDeliv')

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Term Of Payment'), 0)

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_TermofPayment(Transfer)'), 'Transfer', true)

WebUI.setText(findTestObject('Agreement Request/textarea_Duration of Payment'), '2')

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/div_Penalty'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/penalty2/btn_editLatepayment'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/Penalty/input_ValuePenalty'), '5')

WebUI.click(findTestObject('Agreement Request/button_Edit'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/penalty2/btn_editLateDelivery'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/Penalty/input_ValuePenalty'), '1')

WebUI.click(findTestObject('Agreement Request/button_Edit'))

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Lead Time for Price Changes'), 0)

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Lead Time for Price Changes'), '2')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Days of Inventory (Days)'), '1')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Packaging Artwork Responsibility'), 'aaa')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product Return Nonconformity'), '3')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product Return DamageExpired'), '2')

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Governing Law'), 0)

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Governing Law'), 'INDONESIA')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Dispute Resolution'), 'something')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Notice of Termination'), '5')

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_Manpower(YES)'), 'YES', true)

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Manpower'), 0)

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_OfficeSpace(YES)'), 'YES', true)

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_Activities_PromotionLine'), 'YES', true)

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/Product/label_Product(s)'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Product/button_New Product'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product_Product'), 'Snack')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Product/button_Add'))

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/Territory/div_Territory(ies)'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Territory/button_New Territory'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Territory/TerritoryType/label_Area'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/Territory/TerritoryType/input_TerritoryName'), 'Jakarta')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Territory/button_AddTerritory'))

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/SalesTarget/label_Sales Target'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/SalesTarget/btn_salesTarget1'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/SalesTarget/input_CurrencyUnit'), 'IDR')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/SalesTarget/input_CurrencyUnit_Year1'), '1000')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/SalesTarget/button_EditSalesTarget'))

WebUI.scrollToElement(findTestObject('Agreement Request/attachment/label_Attachment'), 0)

WebUI.click(findTestObject('Agreement Request/attachment/label_Attachment'))

//ADD FILE 1
WebUI.click(findTestObject('Agreement Request/attachment/add_file1'))

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

//ADD FILE 2
WebUI.click(findTestObject('Agreement Request/attachment/add_file2'))

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    'D:\\automation data.xlsx')

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

//ADD FILE 3
WebUI.click(findTestObject('Object Repository/Agreement Request/attachment/add_file3'))

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Agreement Request/attachment/button_Choose File'), 
    'D:\\Panduan Internship Apps Site Supervisor Monitoring Learning Plan dan Log Book.pdf')

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

WebUI.scrollToElement(findTestObject('Agreement Request/h3_Create Agreement Request'), 0)

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Save'))

/*WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_OK'))

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Back'))

WebUI.verifyElementVisible(findTestObject('Intellectual Property/detail Intellectual Property/td_0009Req.IPKFV2021'))
*/
WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(13)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button_Back'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Agreement Request/verify_data ada'))

WebUI.delay(3)

WebUI.closeBrowser()

