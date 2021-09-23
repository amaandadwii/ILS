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

WebUI.verifyElementVisible(findTestObject('Request/div_My TaskYOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('MytaskNew/label_Req. Docs. Deeds'))

WebUI.click(findTestObject('My Task/a_009Req.Co.Docs-Lgl.FormKFVIII2021'))

WebUI.verifyElementVisible(findTestObject('Object Repository/My Task/final submit to legal/h3_Docs. Deeds Request'))

WebUI.scrollToElement(findTestObject('Object Repository/My Task/final submit to legal/label_Approval Log'), 0)

WebUI.click(findTestObject('Object Repository/My Task/final submit to legal/label_Approval Log'))

WebUI.selectOptionByValue(findTestObject('Object Repository/My Task/final submit to legal/select_Execution legal form                _207885'), 
    'Deed to be uploaded', true)

WebUI.setText(findTestObject('Object Repository/My Task/final submit to legal/input_Notary_txtNotary'), 'deeds ok ')

WebUI.setText(findTestObject('Object Repository/My Task/final submit to legal/textarea_Notes_txtManualNotes'), 'notes deeds \'')

WebUI.click(findTestObject('Object Repository/My Task/final submit to legal/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(15)

WebUI.verifyElementVisible(findTestObject('Request/div_My TaskYOU DONT HAVE ANY PENDING TASK'))

WebUI.closeBrowser()

