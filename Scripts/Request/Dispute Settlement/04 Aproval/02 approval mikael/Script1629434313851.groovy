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

WebUI.setText(findTestObject('Object Repository/Login/input_Username'), 'MIKAEL.PRANANTA@KALBE.CO.ID')

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'))

WebUI.verifyElementVisible(findTestObject('Request/div_My TaskYOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Agreement Request/Mytask/label_Req. AgreementMyTask'))

WebUI.click(findTestObject('Agreement Request/Mytask/a_0007Req.AgrKFVIII2021'))

WebUI.verifyElementVisible(findTestObject('Agreement Request/approval melina/h3_Detail Agreement Request'))

WebUI.click(findTestObject('Agreement Request/approval melina/button_Approve'))

WebUI.delay(4)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(10)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(10)

//WebUI.setText(findTestObject('Agreement Request/approval melina/input_SearchAgreement'), '213/Req.Agr/KF/VI/2021')
WebUI.click(findTestObject('Agreement Request/approval melina/td_1'))

WebUI.click(findTestObject('Agreement Request/approval melina/a_206Req.AgrKFVI2021'))

WebUI.verifyElementVisible(findTestObject('Agreement Request/approval melina/h3_Detail Agreement Request'))

WebUI.scrollToElement(findTestObject('Agreement Request/button ok/label_Approval Log'), 0)

WebUI.click(findTestObject('Agreement Request/button ok/label_Approval Log'))

WebUI.delay(5)

WebUI.closeBrowser()

