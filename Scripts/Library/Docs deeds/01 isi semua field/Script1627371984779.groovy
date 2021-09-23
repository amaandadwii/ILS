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

WebUI.setText(findTestObject('Login/input_Username'), 'violitta.yustian@kalbe.co.id')

WebUI.setText(findTestObject('Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/button_LOG IN'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/Deeds/h3_My Task'))

WebUI.click(findTestObject('Object Repository/Library/Deeds/a_Library'))

WebUI.click(findTestObject('Object Repository/Library/Deeds/a_Comp. Docs. Deeds'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/Deeds/h3_List Of Docs. Deeds Library'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Library/Deeds/h3_Comp. Docs. Deeds Library'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/Deeds/label_Library No'), 0)

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add Library Without Request'))

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Legal Form No_RequestHeaderDeeds.LegalFormNo'), '001 Deeds 2021')

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Library/Deeds/input_Effective Date_RequestHeaderDeeds.Eff_cc3677'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-10-07\'', Arrays.asList(element))

WebUI.click(findTestObject('Object Repository/Library/Deeds/label_Duration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/Deeds/select_Day(s)                            Mo_03a9c6'), 
    'Months', true)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Duration_txtDurationNum'), '1')

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add Date'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/Deeds/h6_SBU For Approval'), 0)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/textarea_Purpose And Objective_RequestHeade_b5ffee'), '14.50 pm')

WebUI.setText(findTestObject('Object Repository/Library/Deeds/textarea_Notes_RequestHeaderDeeds.Notes'), 'lib deeds test ')

WebUI.scrollToElement(findTestObject('Object Repository/Library/Deeds/label_Detail'), 0)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Name Of Entity_NewEntityData.NameOfEntity'), 'Lib. deedss \' test ya')

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/Deeds/select_Choose                        PMA   _a48166'), 
    'PMA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/Deeds/select_Choose                        Privat_44005e'), 
    'Private', true)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Domicile_NewEntityData.Domicile'), 'Bogor')

WebUI.setText(findTestObject('Object Repository/Library/Deeds/textarea_Address_NewEntityData.Address'), 'jl. bogor raya no. 329 kec. asal')

WebUI.scrollToElement(findTestObject('Object Repository/Library/Deeds/label_Entity Province'), 0)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Entity Province_NewEntityData.EntityProvince'), 'Bogor Raya')

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Entity Regency_NewEntityData.EntityRegency'), 'Bogor')

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Entity Sub District_NewEntityData.Ent_5e278c'), 'Bogor aja')

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Entity Village_NewEntityData.EntityVillage'), 'Bogor village')

WebUI.click(findTestObject('Object Repository/Library/Deeds/input__select-dropdown form-control'))

WebUI.scrollToPosition(10, 0)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input__search w-100 d-block'), 'idr')

WebUI.click(findTestObject('Object Repository/Library/Deeds/span_IDR - Indonesian rupiah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/Deeds/select_ChooseAED - United Arab Emirates dir_faf5c4'), 
    'IDR', true)

WebUI.scrollToElement(findTestObject('Object Repository/Library/Deeds/label_Authorized Capital'), 0)

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add Authorized'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/Deeds/select_Choose                            Co_0577d5'), 
    'Seri A', true)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Amount Per Shares_AmountPerShares'), '15,000')

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Number of Shares_NumberofShares'), '10')

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add'))

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add Authorized'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/Deeds/select_Choose                            Co_0577d5'), 
    'Seri B', true)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Amount Per Shares_AmountPerShares'), '45,000')

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Number of Shares_NumberofShares'), '5')

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add'))

WebUI.click(findTestObject('Object Repository/Library/Deeds/a_Total Shares Amount Per Classification_bt_5b42cc'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/Deeds/select_Choose                            Co_0577d5'), 
    'Seri C', true)

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Edit'))

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add Authorized'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/Deeds/select_Choose                            Co_0577d5'), 
    'Seri A', true)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Amount Per Shares_AmountPerShares'), '50,000')

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Number of Shares_NumberofShares'), '10')

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add'))

WebUI.click(findTestObject('Object Repository/Library/Deeds/a_Total Shares Amount Per Classification_bt_5b42cc'))

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Amount Per Shares_AmountPerShares'), '1,000,000')

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Edit'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/Deeds/div_Paid-UpIssued Capital'), 0)

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add Paid-Up'))

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Shareholders_Shareholders'), 'KF')

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/Deeds/select_ChooseSeri CSeri BSeri A'), '1,000,000', 
    true)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Number of Shares_NumberofShares_1'), '9')

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add Director'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/Deeds/select_Choose                            Di_d6007d'), 
    'Director', true)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Name Of Director_NameOfDirector'), 'wonwo')

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add_1_2'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/Deeds/label_Board Of Commissioner'), 0)

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add Commissioner'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/Deeds/select_Choose                            Co_c297ec'), 
    'Commissioner', true)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Name Of Commissioner_NameOfCommissioner'), 'commissioner 1 / 2')

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add_1_2_3'))

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add_1_2_3_4'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/Deeds/label_Notification'), 0)

WebUI.click(findTestObject('Library/Deeds/label_Notification'))

WebUI.click(findTestObject('Library/Deeds/label_DurationNew'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Library/Deeds/select_Day(s)                        Month(_1b29d9'), 
    'Months', true)

WebUI.setText(findTestObject('Object Repository/Library/Deeds/input_Close_txtNumValue'), '1')

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Add Email'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/Deeds/td_A. FAJRI NUGRAHA'), 0)

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Ashwatu.Dipajanakalbe.co.id_btn btn-_574ab7'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/Deeds/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Submit'))

WebUI.scrollToElement(findTestObject('Object Repository/Library/Deeds/h3_Comp. Docs. Deeds Library'), 0)

WebUI.click(findTestObject('Object Repository/Library/Deeds/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(5)

WebUI.closeBrowser()

