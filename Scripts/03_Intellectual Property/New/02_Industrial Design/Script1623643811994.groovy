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

WebUI.navigateToUrl('http://stgsvr.onekalbe.com:8225/')

WebUI.setText(findTestObject('Object Repository/Create Intellectual Property/02/input_Your Username_Username'), 'BERNADETTE.FANNY@KALBE.CO.ID')

WebUI.setEncryptedText(findTestObject('Object Repository/Create Intellectual Property/02/input_Your Username_Password'), 
    'XA8EWhIfeOQ=')

WebUI.click(findTestObject('Object Repository/Create Intellectual Property/02/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Create Intellectual Property/02/i_Menu_fas fa-book'))

WebUI.click(findTestObject('Object Repository/Create Intellectual Property/02/a_Intellectual Property'))

WebUI.click(findTestObject('Object Repository/Create Intellectual Property/02/button_Create New'))

WebUI.click(findTestObject('Object Repository/Create Intellectual Property/02/label_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Intellectual Property/02/select_Choose your option                  _7e6882'), 
    'INDUSTRIAL DESIGN', true)

WebUI.setText(findTestObject('Object Repository/Create Intellectual Property/02/textarea_Notes_RequestHeader.Notes'), 'Tester')

WebUI.click(findTestObject('Object Repository/Create Intellectual Property/02/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Create Intellectual Property/02/input__search w-100 d-block'), 'kalbe farma')

WebUI.click(findTestObject('Object Repository/Create Intellectual Property/02/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Intellectual Property/02/select_Choose your option                  _6f27b8'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.setText(findTestObject('Object Repository/Create Intellectual Property/02/input_Industrial Design Name_IndustrialDesi_64a354'), 
    'AAAA')

WebUI.setText(findTestObject('Object Repository/Create Intellectual Property/02/textarea_Industrial Design Details_Industri_bb7b23'), 
    'BBBBB')

WebUI.setText(findTestObject('Object Repository/Create Intellectual Property/02/input__search w-100 d-block (1)'), 'ind')

WebUI.click(findTestObject('Object Repository/Create Intellectual Property/02/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Intellectual Property/02/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.click(findTestObject('Object Repository/Create Intellectual Property/02/button_Add Industrial Design Class'))

WebUI.click(findTestObject('Object Repository/Create Intellectual Property/02/a_1'))

WebUI.click(findTestObject('Object Repository/Create Intellectual Property/button_Save'))

WebUI.click(findTestObject('Object Repository/Create Intellectual Property/button_OK_1'))

