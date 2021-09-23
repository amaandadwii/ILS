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

WebUI.click(findTestObject('Agreement Request/a_Request'))

WebUI.click(findTestObject('Agreement Request/a_License'))

WebUI.verifyElementVisible(findTestObject('Object Repository/license/new/h3_License Request'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/license/new/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/license/new/h3_Create License Request'))

WebUI.scrollToElement(findTestObject('Object Repository/license/new/label_SBU For Approval'), 0)

WebUI.click(findTestObject('Object Repository/license/new/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/license/new/select_Choose your optionBUILDING LICENSEBU_8f723a'), 
    'WORKING PERMIT', true)

WebUI.click(findTestObject('Object Repository/license/new/label_Choose Territory'))

WebUI.click(findTestObject('Object Repository/license/new/input__select-dropdown form-control valid'))

WebUI.setText(findTestObject('Object Repository/license/new/input__search w-100 d-block'), 'indonesia')

WebUI.click(findTestObject('Object Repository/license/new/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/license/new/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/license/new/input_Expected Date of Finalization_License_414c12'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-17\'', Arrays.asList(element))

WebUI.setText(findTestObject('Object Repository/license/new/textarea_Notes_LicenseHeader.Notes'), 'testtttttttt')

WebUI.scrollToElement(findTestObject('Object Repository/license/new/label_Attachment'), 0)

WebUI.click(findTestObject('Object Repository/license/new/label_Attachment'))

WebUI.delay(2)

WebUI.click(findTestObject('license/new/button_Add Attachment'))

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

WebUI.scrollToElement(findTestObject('Object Repository/license/new/h3_Create License Request'), 0)

WebUI.click(findTestObject('Object Repository/license/new/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(7)

/*WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(7)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(15)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(7)*/
WebUI.closeBrowser()

