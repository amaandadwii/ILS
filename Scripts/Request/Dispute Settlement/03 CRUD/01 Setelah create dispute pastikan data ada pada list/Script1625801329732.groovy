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

WebUI.verifyElementVisible(findTestObject('Object Repository/dispute st/h1_Welcome'))

WebUI.click(findTestObject('Home Page/i_Menu_Bar'))

WebUI.click(findTestObject('Object Repository/dispute st/a_Dispute Settlement'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dispute st/h3_Dispute Settlement List'))

WebUI.click(findTestObject('Object Repository/dispute st/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dispute st/h3_Create Dispute Settlement Request'))

WebUI.click(findTestObject('Object Repository/dispute st/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/dispute st/select_Choose your optionCLAIM  LAWSUITSETT_9610c4'), 
    'SETTLEMENT', true)

WebUI.setText(findTestObject('Object Repository/dispute st/textarea_Chronologies_DisputeHeader.Chronologies'), 'test test test test test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test test')

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/dispute st/input_Expected Date of Finalization_DisputeHeader'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-20\'', Arrays.asList(element))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/dispute st/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/dispute st/input__search w-100 d-block'), 'kalbe farma')

WebUI.click(findTestObject('Object Repository/dispute st/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/dispute st/select_Choose your option                  _6f27b8'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/dispute st/label_Detail'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/dispute st/select_Choose your option                YE_894c11'), 
    'YES', true)

WebUI.click(findTestObject('Agreement Request/dispute settlement/new/claim lawsuit/input__select-dropdownCurrency'))

WebUI.setText(findTestObject('Agreement Request/dispute settlement/new/claim lawsuit/input__searchCurrency'), 'IDR')

WebUI.click(findTestObject('Agreement Request/dispute settlement/new/claim lawsuit/span_IDR - Indonesian rupiah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/dispute st/new/select_Choose your option            AED - _792f46'), 
    'IDR', true)

WebUI.setText(findTestObject('Object Repository/dispute st/input_Amount_DisputeHeader.Amount'), '1,500')

WebUI.selectOptionByValue(findTestObject('Object Repository/dispute st/select_Choose your option                YE_894c11_1'), 
    'YES', true)

WebUI.setText(findTestObject('Object Repository/dispute st/input_Name_CounterpartDetail.CounterpartNew'), 'name')

WebUI.scrollToElement(findTestObject('Object Repository/dispute st/b_Counterpart'), 0)

WebUI.setText(findTestObject('Object Repository/dispute st/textarea_Address_CounterpartDetail.AddressNew'), 'name st 1')

WebUI.setText(findTestObject('Object Repository/dispute st/input_Province_CounterpartDetail.ProvinceNew'), 'province gu')

WebUI.setText(findTestObject('Object Repository/dispute st/input_Regency_CounterpartDetail.RegencyNew'), 'dong-gu')

WebUI.setText(findTestObject('Object Repository/dispute st/input_Sub District_CounterpartDetail.SubDis_48d3e1'), 'district V')

WebUI.setText(findTestObject('Object Repository/dispute st/input_Village_CounterpartDetail.VillageNew'), 'edkihdbvs')

WebUI.scrollToElement(findTestObject('Object Repository/dispute st/b_Owner  Director'), 0)

WebUI.click(findTestObject('Object Repository/dispute st/label_Please check if counterpart is indivi_3d832a'))

WebUI.click(findTestObject('Object Repository/dispute st/label_Please check if counterpart is indivi_3d832a'))

WebUI.setText(findTestObject('Object Repository/dispute st/input_Name_OwnerDirectorDetail.OwnerDirectorNew'), 'name 2')

WebUI.scrollToElement(findTestObject('Agreement Request/attachment/label_Attachment'), 0)

WebUI.click(findTestObject('Agreement Request/attachment/label_Attachment'))

//ADD FILE 1
WebUI.click(findTestObject('Docs Comps Deeds/attachmeny/button_Add Attachment'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Docs Comps Deeds/attachmeny/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(2)

WebUI.setText(findTestObject('Docs Comps Deeds/attachmeny/textarea_FileDescription'), 'attach 1')

WebUI.click(findTestObject('Docs Comps Deeds/attachmeny/button_Add'))

//ADD FILE 2
WebUI.click(findTestObject('Docs Comps Deeds/attachmeny/button_Add Attachment'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Docs Comps Deeds/attachmeny/button_Choose File'), 
    'D:\\automation data.xlsx')

WebUI.delay(2)

WebUI.setText(findTestObject('Docs Comps Deeds/attachmeny/textarea_FileDescription'), 'attach 2')

WebUI.click(findTestObject('Docs Comps Deeds/attachmeny/button_Add'))

//ADD FILE 3
WebUI.click(findTestObject('Docs Comps Deeds/attachmeny/button_Add Attachment'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Docs Comps Deeds/attachmeny/button_Choose File'), 
    'D:\\Panduan Internship Apps Site Supervisor Monitoring Learning Plan dan Log Book.pdf')

WebUI.delay(2)

WebUI.setText(findTestObject('Docs Comps Deeds/attachmeny/textarea_FileDescription'), 'attach 3')

WebUI.click(findTestObject('Docs Comps Deeds/attachmeny/button_Add'))

WebUI.scrollToElement(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/h3_Create Docs. Deeds Request'), 
    0)

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(7)

/*
WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(7)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(15)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(7)
*/
WebUI.closeBrowser()

WebUI.click(findTestObject('Object Repository/Docs Comp Letter/baru/Page_Docs.Letter Request - ILS 2021/button_Back'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dispute st/h3_Dispute Settlement List'))

WebUI.verifyElementVisible(findTestObject('dispute st/verify_docAda'))

WebUI.delay(3)

WebUI.closeBrowser()

