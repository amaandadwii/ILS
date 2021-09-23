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

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/a_Request'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/a_Intellectual Property'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/h3_Intellectual Property List'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/h3_Create Intellectual Property Request'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/label_Renewal'))

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/label_Type'), 
    0)

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/button_Existing Library_btnExistLibrary'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/a_DTL1604429504A4'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/label_Entity IP Owner_form-check-label'))

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/input_select_dropDown_EntityIPOwner'))

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/input_search_EntityIPOwner'), 'kalbe farma')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Intellectual Property/detail Intellectual Property/select_Choose your option                  _6f27b8'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/label_Copyright Name'), 
    0)

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/label_Copyright Name_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/input_Copyright Name_CopyrightDetail.Copyri_b4261a'), 
    'copyright name')

WebUI.click(findTestObject('Intellectual Property/Renewal/Existing Library/Copyright/label_Copyright Details_form-check-label'))

WebUI.setText(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/textarea_Copyright Details_CopyrightDetail._4f5140'), 
    'details testt')

WebUI.click(findTestObject('Intellectual Property/Renewal/Existing Library/Copyright/label_Territory_form-check-label'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/input__search w-100 d-block'), 
    'indonesia')

WebUI.click(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/Renewal/Existing Library/Copyright/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/label_Attachment'), 0)

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/label_Attachment'))

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Add Attachment'))

//WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Choose File'))
WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Intellectual Property/detail Intellectual Property/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(3)

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/textarea_Description_FileDescription'), 
    'test')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Add'))

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/h3_Create Intellectual Property Request'), 
    0)

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Save'))

/*WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_OK'))

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Back'))

WebUI.verifyElementVisible(findTestObject('Intellectual Property/detail Intellectual Property/td_0009Req.IPKFV2021'))
*/
WebUI.delay(3)

WebUI.closeBrowser()
