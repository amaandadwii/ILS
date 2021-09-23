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

WebUI.setText(findTestObject('Object Repository/Login/input_Username'), 'VIOLITTA.YUSTIAN@KALBE.CO.ID')

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Request/div_My TaskYOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Object Repository/MytaskNew/label_Req. IP'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/a_0095Req.IPKFVII2021mytaskIP'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/h3_Create Intellectual Property Request'))

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/submit after acknowledge/label_Approval Log'), 
    0)

WebUI.click(findTestObject('Object Repository/Intellectual Property/submit after acknowledge/label_Approval Log'))

WebUI.setText(findTestObject('Object Repository/Intellectual Property/submit after acknowledge/input_Consultant_txtIPConsultant'), 
    'consultnt a')

WebUI.setText(findTestObject('Object Repository/Intellectual Property/submit after acknowledge/textarea_Notes_txtManualNotes'), 
    'test')

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Intellectual Property/input_Choose file_fileAprAttachment'), 
    'D:\\image1.jpg')

//WebUI.click(findTestObject('Object Repository/Intellectual Property/submit after acknowledge/input_Choose file_fileAprAttachment'))
WebUI.click(findTestObject('Object Repository/Intellectual Property/submit after acknowledge/button_Submit'))

WebUI.delay(4)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(4)

WebUI.closeBrowser()

