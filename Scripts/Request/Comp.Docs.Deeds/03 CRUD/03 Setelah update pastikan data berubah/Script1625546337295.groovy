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

WebUI.verifyElementVisible(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/amendment/h3_Docs. Deeds Request'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/label_Address'), 0)

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/txtArea_Address'), 'tng raya update')

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Entity Province'), 'Banten update')

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Entity Regency'), 'Karawaci update')

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Entity Sub District'), 'kelapa dua update')

WebUI.scrollToElement(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/label_Entity Sub District'), 
    0)

WebUI.setText(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/input_Entity Village'), 'village 2 update')

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

WebUI.verifyElementVisible(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/amendment/h3_Docs. Deeds List'))

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/a_008Req.Co.Docs-Lgl.FormKFVII2021'))

WebUI.verifyElementVisible(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/amendment/h3_Docs. Deeds Request'))

WebUI.scrollToElement(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/label_Address'), 0)

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/h3_Create Docs. Deeds Request'), 
    0)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(7)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(15)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(7)

WebUI.closeBrowser()

