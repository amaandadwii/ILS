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

WebUI.setText(findTestObject('Object Repository/Login/input_Username'), 'yona.apriliani@kalbe.co.id')

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'))

WebUI.verifyElementVisible(findTestObject('new/main_My Task                                                                                                            YOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Docs Comp Letter/my task/label_Req. Docs. Letter'))

WebUI.click(findTestObject('Docs Comp Letter/my task/a_059Req.Co.Docs-LetterKFVIII2021'))

WebUI.verifyElementVisible(findTestObject('Docs Comp Letter/detail legal opinion/h3_Create Docs. Letter Request'))

WebUI.scrollToElement(findTestObject('Agreement Request/Reviewer/label_ReviewerConfirmation'), 0)

WebUI.click(findTestObject('Agreement Request/Reviewer/label_ReviewerConfirmation'))

WebUI.click(findTestObject('1st draft/Btn_actionReview1'))

WebUI.setText(findTestObject('Agreement Request/Reviewer/textarea_Description_Reviewer4'), 'reviewer ok')

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Agreement Request/reviewer 1/button_Choose File'), 
    GlobalVariable.uploadFile)

WebUI.click(findTestObject('Agreement Request/Reviewer/button_SubmitReviewer4'))

WebUI.delay(10)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.closeBrowser()

