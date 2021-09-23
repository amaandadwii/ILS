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

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Your Username_Username'), 
    'BERNADETTE.FANNY@KALBE.CO.ID')

WebUI.setEncryptedText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Your Username_Password'), 
    'z+9Ecq4+MFA=')

WebUI.sendKeys(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input_Your Username_Password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/i_Menu_fas fa-book'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/a_Agreement'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/i_Request Agreement List_fas fa-plus ic pr-2'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_AmendmentAddendumRenewal'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_NA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/select_Choose your optionDISTRIBUTION AGREE_b55422'), 
    'DISTRIBUTION AGREEMENT', true)

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Add Territory'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/label_Country'))

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/input__search w-100 d-block'), 
    'outside')

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/span_Outside Of Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Outside Of Indonesia', true)

WebUI.click(findTestObject('Object Repository/Agreement Request/Amendment/NA/Distribution Agreement/button_Add'))

