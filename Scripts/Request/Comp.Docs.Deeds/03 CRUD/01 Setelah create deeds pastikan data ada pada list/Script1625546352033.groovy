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

WebUI.click(findTestObject('Request/a_Comp. Docs. Deeds'))

WebUI.verifyElementVisible(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/amendment/h3_Docs. Deeds List'))

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/amendment/h3_Docs. Deeds Request'))

WebUI.delay(3)

//WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/label_Establishment'))
WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/txt_PurposeAndObjective'), 'siang')

//WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/label_Share Classification'))
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Expected Date of Finalization'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-20\'', Arrays.asList(element))

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/txtarea_Notes'), 'automation test')

WebUI.scrollToElement(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/label_Detail'), 0)

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Name Of Entity'), 'Entity')

WebUI.selectOptionByValue(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/select_Choose PMA'), 'PMA', 
    true)

WebUI.selectOptionByValue(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/select_Choose Privat'), 
    'Public', true)

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Domicile'), 'Tangerang')

WebUI.scrollToElement(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/label_Address'), 0)

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/txtArea_Address'), 'tng raya')

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Entity Province'), 'Banten')

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Entity Regency'), 'Karawaci')

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Entity Sub District'), 'kelapa dua')

WebUI.scrollToElement(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/label_Entity Sub District'), 
    0)

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Entity Village'), 'village 2')

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input__selectCurrency'))

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input__searchCurrency'), 'idr')

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/span_IDR - Indonesian rupiah'))

WebUI.selectOptionByValue(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/select_SharesCurrency'), 
    'IDR', true)

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/authorized capital/button_Add Authorized'))

WebUI.selectOptionByValue(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/authorized capital/select_SharesClassification'), 
    'Seri A', true)

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/authorized capital/input_Amount PerShares'), 
    '100')

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/authorized capital/input_NumberPerShares'), 
    '4')

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/authorized capital/button_Add'))

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/authorized capital/button_Add Authorized'))

WebUI.selectOptionByValue(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/authorized capital/select_SharesClassification'), 
    'Seri B', true)

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/authorized capital/input_Amount PerShares'), 
    '50')

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/authorized capital/input_NumberPerShares'), 
    '3')

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/authorized capital/button_Add'))

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/PaidUp/button_Add Paid-Up'))

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/PaidUp/input_Shareholders'), 'satu')

WebUI.selectOptionByValue(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/PaidUp/select_ChooseSeri ASeri B'), 
    '100', true)

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/PaidUp/input_NumberPerShares1'), '2')

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/PaidUp/button_Add_1'))

WebUI.scrollToElement(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/label_Board Of Director'), 
    0)

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_Add Director'))

WebUI.selectOptionByValue(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/select_Choose_Director'), 
    'Director', true)

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Name Of Director'), 'terry')

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_Add_1_2'))

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_Add Commissioner'))

WebUI.selectOptionByValue(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/select_Choose_Commissioner'), 
    'Independent Commissioner', true)

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Name Of Commissioner'), 'commissioner 1')

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_Add_1_2_3'))

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

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(7)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(15)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(7)

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/button_Back'))

WebUI.verifyElementVisible(findTestObject('Docs Comps Deeds/verify_docTerCreate'))

WebUI.delay(3)

/*WebUI.delay(5)

//WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_OK'))
WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_Submitdeeds'))

WebUI.delay(8)

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_YES_submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))
*/
WebUI.closeBrowser()

