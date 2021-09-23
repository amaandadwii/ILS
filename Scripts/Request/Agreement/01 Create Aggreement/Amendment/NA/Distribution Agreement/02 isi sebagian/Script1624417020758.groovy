import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import com.kms.katalon.keyword.uploadfile.UploadFile as UploadFile
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser(GlobalVariable.link)

WebUI.setText(findTestObject('Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/button_LOG IN'))

WebUI.click(findTestObject('Home Page/i_Menu_Bar'))

WebUI.click(findTestObject('Home Page/a_Agreement'))

WebUI.click(findTestObject('Agreement Request/button_Create New Agreement'))

WebUI.click(findTestObject('Agreement Request/Type Agreement/label_Amendment'))

WebUI.click(findTestObject('Agreement Request/Amendment/1/label_NA'))

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_DISTRIBUTION AGREE'), 'DISTRIBUTION AGREEMENT', true)

WebUI.selectOptionByValue(findTestObject('Agreement Request/Amendment/1/select_entityinAgreement'), 'PT. Kalbe Farma Tbk.', 
    true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Agreement Request/Expected Date of Finalization'), 
    30)

WebUI.setText(findTestObject('Agreement Request/textarea_NotesAgreement'), 'tes')

WebUI.scrollToElement(findTestObject('Agreement Request/Amendment/1/label_Detail'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/button_Add Partner'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Partner'), 'clement')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/button_SavePartner'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/button_Add Partner'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Partner'), 'mauve')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/button_SavePartner'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Duration/select_Month(s)'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/Duration/input_DurationDistribution'), '6')

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Exclusivity'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/label_Exclusive'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product Registration Holder'), 'asd')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product Registration Cost'), 'dsf')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Intellectual Property Holder'), 'hyi')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/label_YES'))

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Fixed'), 0)

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Fixed_DistributionAgreement'), '0')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Rolling_DistributionAgreement'), '0')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Purchase Order Submission'), '5')

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_DeliveryTerms(other)'), 'Others', true)

WebUI.setText(findTestObject('Agreement Request/textarea_Delivery Terms'), 'ggg')

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Term Of Payment'), 0)

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_TermofPayment(Transfer)'), 'Transfer', true)

WebUI.setText(findTestObject('Agreement Request/textarea_Duration of Payment'), '2')

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/div_Penalty'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Penalty/button_editPenalty'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/Penalty/input_ValuePenalty'), '5')

WebUI.click(findTestObject('Agreement Request/button_Edit'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Penalty/button_LatePenalty'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/Penalty/input_ValuePenalty'), '1')

WebUI.click(findTestObject('Agreement Request/button_Edit'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Penalty/button_Add Penalty'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/Penalty/textarea_DescriptionPenalty'), 'test')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/Penalty/input_ValuePenalty (1)'), '3')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Penalty/addPenalty'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Penalty/button_deletePenalty'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Penalty/button_YESdeletePenalty'))

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Lead Time for Price Changes'), 0)

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Lead Time for Price Changes'), '2')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Days of Inventory (Days)'), '1')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Packaging Artwork Responsibility'), 'qqq')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product Return Nonconformity'), '3')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product Return DamageExpired'), '2')

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Governing Law'), 0)

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Governing Law'), 'aaq')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Dispute Resolution'), 'swa')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Notice of Termination'), '5')

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_Manpower(YES)'), 'YES', true)

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Manpower'), 0)

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_OfficeSpace(YES)'), 'YES', true)

WebUI.selectOptionByValue(findTestObject('Agreement Request/select_Activities_PromotionLine'), 'YES', true)

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/Product/label_Product(s)'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Product/button_New Product'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product_Product'), 'Snack')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Product/button_Add'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Product/button_New Product'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product_Product'), 'Drink')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Product/button_Add'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Product/button_New Product'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product_Product'), 'test')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Product/button_Add'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Product/button_DeleteProduct'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Product/button_YESdeleteProduct'))

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/Territory/div_Territory(ies)'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Territory/button_New Territory'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Territory/TerritoryType/label_Area'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/Territory/TerritoryType/input_TerritoryName'), 'Jakarta')

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Territory/button_AddTerritory'))

WebUI.scrollToElement(findTestObject('Agreement Request/h3_Create Agreement Request'), 0)

WebUI.click(findTestObject('Agreement Request/button_Save'))

WebUI.delay(5)

WebUI.closeBrowser()

