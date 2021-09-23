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

WebUI.verifyElementVisible(findTestObject('Request/div_My TaskYOU DONT HAVE ANY PENDING TASK'))

WebUI.setText(findTestObject('My Task/input_searchMyTaskDeeds'), '009')

WebUI.click(findTestObject('My Task/a_009Req.Co.Docs-Lgl.FormKFVIII2021'))

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Partner Candidate'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/Duration/select_Year(s)'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/Duration/input_DurationDistribution'), '2')

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Exclusivity'), 0)

WebUI.click(findTestObject('Agreement Request/Detail Agreement/label_Exclusive'))

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product Registration Holder'), 'Registration Update')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Product Registration Cost'), 'Registration cost Update')

WebUI.setText(findTestObject('Agreement Request/Detail Agreement/input_Intellectual Property Holder'), 'Intelectual Update')

WebUI.scrollToElement(findTestObject('Agreement Request/h3_Create Agreement Request'), 0)

WebUI.click(findTestObject('Agreement Request/Amendment/1/button_Save'))

/*WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_OK'))

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Back'))

WebUI.verifyElementVisible(findTestObject('Intellectual Property/detail Intellectual Property/td_0009Req.IPKFV2021'))
*/
WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(2)

WebUI.click(findTestObject('Agreement Request/button_Back'))

WebUI.verifyElementVisible(findTestObject('Agreement Request/Amendment/1/Distribution agreemtn/h3_Request Agreement List'))

WebUI.click(findTestObject('Agreement Request/Detail Agreement/delete file/td_expandFile'))

WebUI.click(findTestObject('Agreement Request/a_015Req.AgrKFVII2021'))

WebUI.scrollToElement(findTestObject('Agreement Request/Detail Agreement/label_Partner Candidate'), 0)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Agreement Request/h3_Create Agreement Request'), 0)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(13)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.closeBrowser()

