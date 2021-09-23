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

WebUI.openBrowser(GlobalVariable.link)

WebUI.setText(findTestObject('Object Repository/Login/input_Username'), 'VIOLITTA.YUSTIAN@KALBE.CO.ID')

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'))

WebUI.verifyElementVisible(findTestObject('new/main_My Task                                                                                                            YOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Docs Comp Letter/my task/label_Req. Docs. Letter'))

WebUI.click(findTestObject('Docs Comp Letter/my task/a_059Req.Co.Docs-LetterKFVIII2021'))

WebUI.verifyElementVisible(findTestObject('Docs Comp Letter/detail legal opinion/h3_Create Docs. Letter Request'))

WebUI.click(findTestObject('Agreement Request/approval melina/button_Acknowledge'))

WebUI.delay(4)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(10)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(7)

WebUI.click(findTestObject('new/a_RequestLegal'))

WebUI.click(findTestObject('new/a_Comp. Docs. LetterLegal'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comp Letter/Docs. Letter Request Home/h3_Request Docs. Letter List'))

WebUI.click(findTestObject('Docs Comp Letter/approval/a_009Req.Co.Docs-LetterKFVII2021'))

WebUI.verifyElementVisible(findTestObject('Docs Comp Letter/detail legal opinion/h3_Create Docs. Letter Request'))

WebUI.scrollToElement(findTestObject('Docs Comp Letter/approval/label_Approval Log'), 0)

WebUI.click(findTestObject('Docs Comp Letter/approval/label_Approval Log'))

WebUI.delay(5)

/*WebUI.verifyElementVisible(findTestObject('Object Repository/Docs Comp Letter/Docs. Letter Request Home/h3_Request Docs. Letter List'))

WebUI.click(findTestObject('Docs Comp Letter/approval/a_009Req.Co.Docs-LetterKFVII2021'))

WebUI.verifyElementVisible(findTestObject('Docs Comp Letter/detail legal opinion/h3_Create Docs. Letter Request'))

WebUI.scrollToElement(findTestObject('Intellectual Property/Acknowledge/label_Approval Log'), 0)

WebUI.click(findTestObject('Intellectual Property/Acknowledge/label_Approval Log'))

WebUI.setText(findTestObject('Intellectual Property/Acknowledge/input_Consultant_txtIPConsultant'), 'consultnt a')

WebUI.click(findTestObject('Intellectual Property/Acknowledge/button_Submit'))

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(10)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(5)
*/
WebUI.closeBrowser()

