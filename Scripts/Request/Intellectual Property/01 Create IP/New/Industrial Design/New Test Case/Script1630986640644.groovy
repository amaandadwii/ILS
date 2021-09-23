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

WebUI.openBrowser('')

WebUI.click(findTestObject('Object Repository/Intellectual Property/territory/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Intellectual Property/territory/input__search w-100 d-block'), 'indonesia')

WebUI.click(findTestObject('Object Repository/Intellectual Property/territory/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/territory/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.click(findTestObject('Object Repository/Intellectual Property/territory/button_Add Industrial Design Class'))

WebUI.mouseOver(findTestObject('Object Repository/Intellectual Property/territory/a_1'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/territory/a_1'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/territory/button_Add Industrial Design Class'))

WebUI.mouseOver(findTestObject('Intellectual Property/territory/a_1 - Copy'))

WebUI.click(findTestObject('Intellectual Property/territory/a_1 - Copy'))

