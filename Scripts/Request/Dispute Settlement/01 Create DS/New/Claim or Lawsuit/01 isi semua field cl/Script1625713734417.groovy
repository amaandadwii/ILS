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

WebUI.verifyElementVisible(findTestObject('Library/letter/appointment/main_My Task                               _9cc305'))

WebUI.click(findTestObject('new/a_Request'))

WebUI.click(findTestObject('dispute st/new/a_Dispute Settlement'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dispute st/h3_Dispute Settlement List'))

WebUI.click(findTestObject('Object Repository/dispute st/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dispute st/h3_Create Dispute Settlement Request'))

WebUI.click(findTestObject('Object Repository/dispute st/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/dispute st/select_Choose your optionCLAIM  LAWSUITSETT_9610c4'), 
    'CLAIM / LAWSUIT', true)

WebUI.setText(findTestObject('Object Repository/dispute st/textarea_Chronologies_DisputeHeader.Chronologies'), 'test test test')

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/dispute st/input_Expected Date of Finalization_DisputeHeader'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-11-20\'', Arrays.asList(element))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/dispute st/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/dispute st/input__search w-100 d-block'), 'kalbe farma')

WebUI.click(findTestObject('Object Repository/dispute st/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/dispute st/select_Choose your option                  _6f27b8'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/dispute st/label_Detail'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/dispute st/new/select_Choose your option                  _934389'), 
    'YES', true)

WebUI.click(findTestObject('Object Repository/dispute st/claim suite/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/dispute st/claim suite/input__search w-100 d-block'), 'idr')

WebUI.click(findTestObject('Object Repository/dispute st/claim suite/span_IDR - Indonesian rupiah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/dispute st/neww/select_Choose your option                AE_449152'), 
    'IDR - Indonesian rupiah', true)

WebUI.setText(findTestObject('Object Repository/dispute st/new/input_Amount_DisputeHeader.AmountNew'), '1,000,000')

WebUI.selectOptionByValue(findTestObject('Object Repository/dispute st/new/select_Choose your option                  _934389_1'), 
    'YES', true)

WebUI.setText(findTestObject('Object Repository/dispute st/claim suite/input_Name_CounterpartDetail.CounterpartNew'), 'Test aja 1')

WebUI.scrollToElement(findTestObject('Object Repository/dispute st/claim suite/b_Counterpart'), 0)

WebUI.setText(findTestObject('Object Repository/dispute st/claim suite/textarea_Address_CounterpartDetail.AddressNew'), 
    'tnagerng village')

WebUI.setText(findTestObject('Object Repository/dispute st/claim suite/input_Province_CounterpartDetail.ProvinceNew'), 'banten')

WebUI.setText(findTestObject('Object Repository/dispute st/claim suite/input_Regency_CounterpartDetail.RegencyNew'), 'ho-dong gu')

WebUI.setText(findTestObject('Object Repository/dispute st/claim suite/input_Sub District_CounterpartDetail.SubDis_48d3e1'), 
    'ho - dong')

WebUI.setText(findTestObject('Object Repository/dispute st/claim suite/input_Village_CounterpartDetail.VillageNew'), 'seochong')

WebUI.click(findTestObject('Object Repository/dispute st/claim suite/label_Please check if counterpart is indivi_3d832a'))

WebUI.click(findTestObject('Object Repository/dispute st/claim suite/label_Please check if counterpart is indivi_3d832a'))

WebUI.setText(findTestObject('Object Repository/dispute st/claim suite/input_Name_OwnerDirectorDetail.OwnerDirectorNew'), 
    'Test aja 2')

WebUI.scrollToElement(findTestObject('Agreement Request/attachment/label_Attachment'), 0)

WebUI.click(findTestObject('Agreement Request/attachment/label_Attachment'))

//ADD FILE 1
WebUI.click(findTestObject('dispute st/claim suite/attachment_WarningLetter'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Docs Comps Deeds/attachmeny/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

//ADD FILE 2
WebUI.click(findTestObject('dispute st/claim suite/attachment_Invoice'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Docs Comps Deeds/attachmeny/button_Choose File'), 
    'D:\\automation data.xlsx')

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

//ADD FILE 3
WebUI.click(findTestObject('dispute st/claim suite/attachment_DebtDetails'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Docs Comps Deeds/attachmeny/button_Choose File'), 
    'C:\\Users\\User\\Downloads\\PrintInitialForm (2).pdf')

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

//ADD FILE 4
WebUI.click(findTestObject('dispute st/claim suite/attachment_ReceiptofWarningLetter'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Docs Comps Deeds/attachmeny/button_Choose File'), 
    'C:\\Users\\User\\Downloads\\PrintInitialForm (1).pdf')

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/attachment/button_EditAttachment'))

WebUI.scrollToElement(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/h3_Create Docs. Deeds Request'), 
    0)

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(7)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(15)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(7)

WebUI.closeBrowser()

