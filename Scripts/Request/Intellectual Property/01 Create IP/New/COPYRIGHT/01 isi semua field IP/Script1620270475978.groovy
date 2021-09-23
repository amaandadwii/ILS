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

WebUI.click(findTestObject('Login/button_LOG IN'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Request/div_My TaskYOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Request/a_RequestSetelahMyTask'))

WebUI.click(findTestObject('Home Page/a_Intellectual Property'))

WebUI.verifyElementVisible(findTestObject('Intellectual Property/h3_Intellectual Property Listnew'))

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Intellectual Property/detail Intellectual Property/h3_Create Intellectual Property Request'))

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/label_New'))

WebUI.selectOptionByValue(findTestObject('Intellectual Property/detail Intellectual Property/select_Choose your option                  _7e6882'), 
    'COPYRIGHT', true)

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/textarea_Notes_RequestHeader.Notes'), 'test automation')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/input_select_dropDown_EntityIPOwner'))

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/input_search_EntityIPOwner'), 'kalbe farma')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Intellectual Property/detail Intellectual Property/select_Choose your option                  _6f27b8'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/label_Copyright Name'), 0)

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/input_Copyright Name_CopyrightDetail.Copyri_b4261a'), 
    'PT. ABC')

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/textarea_Copyright Details_CopyrightDetail._4f5140'), 
    'details')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/input_select_Territory'))

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/input_search_Territory_NEW'), 'Indonesia')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Intellectual Property/detail Intellectual Property/select_Territory'), 'Indonesia', 
    true)

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/label_Attachment'), 0)

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/label_Attachment'))

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Add Attachment'))

//WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Choose File'))
WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Intellectual Property/detail Intellectual Property/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(5)

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/textarea_Description_FileDescription'), 
    'test')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Add'))

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add Attachment'))

CustomKeywords.'com.test.letter.docsCompLetter.uploadFile'(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Choose File'), 
    'D:\\Panduan Internship Apps Site Supervisor Monitoring Learning Plan dan Log Book.pdf')

WebUI.delay(5)

WebUI.setText(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/textarea_Description_FileDescription'), 
    'attach 2')

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add'))

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add Attachment'))

CustomKeywords.'com.test.letter.docsCompLetter.uploadFile'(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(5)

WebUI.setText(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/textarea_Description_FileDescription'), 
    'attach 3')

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add'))

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/h3_Create Intellectual Property Request'), 
    0)

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Save'))

/*WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_OK'))

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Back'))

WebUI.verifyElementVisible(findTestObject('Intellectual Property/detail Intellectual Property/td_0009Req.IPKFV2021'))
*/
WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(13)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.closeBrowser()

