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

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Home Page/i_Menu_Bar'))

WebUI.click(findTestObject('Object Repository/Home Page/a_Intellectual Property'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/h3_Create Intellectual Property Request'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/select_Choose your option                  _7e6882'), 
    'PATENT', true)

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/textarea_Notes_RequestHeader.Notes'), 
    'patent tst')

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/input_select_dropDown_EntityIPOwner'))

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/input_search_EntityIPOwner'), 
    'kalbe farma')

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/select_Choose your option                  _6f27b8'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/label_Patent Name'), 
    0)

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/input_Patent Name_PatentDetail.PatentNameNew'), 
    'name')

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/textarea_Patent Details_PatentDetail.Patent_01d642'), 
    'details')

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/select_Choose your optionA Human Necessitie_f7ca00'), 
    'A', true)

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/territory/input__select_Territory_PATENT'))

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/territory/input__search_Territory_PATENT'), 
    'indonesia')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/territory/span_Indonesia_PATENT'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/patent/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.scrollToElement(findTestObject('Docs Comp Letter/Create Docs.Letter Request/h3_Create Docs. Letter Request'), 0)

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

WebUI.delay(11)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(5)

WebUI.closeBrowser()

