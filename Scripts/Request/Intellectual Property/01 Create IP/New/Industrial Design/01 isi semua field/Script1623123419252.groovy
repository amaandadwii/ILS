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

WebUI.setText(findTestObject('Object Repository/Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Request/div_My TaskYOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Request/a_RequestSetelahMyTask'))

WebUI.click(findTestObject('Object Repository/Home Page/a_Intellectual Property'))

WebUI.verifyElementVisible(findTestObject('Intellectual Property/h3_Intellectual Property Listnew'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/button_Create New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/h3_Create Intellectual Property Request'))

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/Industrial design/label_Type1'), 
    0)

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/Industrial design/label_New1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/select_Choose your option                  _7e6882'), 
    'INDUSTRIAL DESIGN', true)

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/textarea_Notes_RequestHeader.Notes'), 
    'test Industrial Design New')

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/input_select_dropDown_EntityIPOwner'))

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/input_search_EntityIPOwner'), 
    'kalbe farma')

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/span_PT. Kalbe Farma Tbk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/select_Choose your option                  _6f27b8'), 
    'PT. Kalbe Farma Tbk.', true)

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/label_Industrial Design Name'), 
    0)

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/input_Industrial Design Name_IndustrialDesi_64a354'), 
    'industrial name')

WebUI.setText(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/textarea_Industrial Design Details_Industri_bb7b23'), 
    'industrial design')

WebUI.click(findTestObject('Object Repository/Intellectual Property/territory/input__select-dropdown form-control'))

WebUI.setText(findTestObject('Object Repository/Intellectual Property/territory/input__search w-100 d-block'), 'indonesia')

WebUI.click(findTestObject('Object Repository/Intellectual Property/territory/span_Indonesia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intellectual Property/territory/select_Choose your optionAfghanistanAlbania_c3513b'), 
    'Indonesia', true)

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/label_Industrial Design Class'), 
    0)

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/button_Add Industrial Design Class'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/detail Intellectual Property/Industrial design/a_1'))

WebUI.click(findTestObject('Object Repository/Intellectual Property/territory/button_Add Industrial Design Class'))

WebUI.scrollToElement(findTestObject('Object Repository/Intellectual Property/territory/a_1'), 0)

WebUI.click(findTestObject('Object Repository/Intellectual Property/territory/a_1'))

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/label_Attachment'), 0)

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/label_Attachment'))

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Add Attachment'))

//WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Choose File'))
WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Intellectual Property/detail Intellectual Property/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(5)

WebUI.setText(findTestObject('Intellectual Property/detail Intellectual Property/textarea_Description_FileDescription'), 
    'attach 1')

WebUI.click(findTestObject('Intellectual Property/detail Intellectual Property/button_Add'))

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add Attachment'))

CustomKeywords.'com.test.letter.docsCompLetter.uploadFile'(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Choose File'), 
    'C:\\Users\\User\\Downloads\\PrintInitialForm.pdf')

WebUI.delay(5)

WebUI.setText(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/textarea_Description_FileDescription'), 
    'attach 2')

WebUI.click(findTestObject('Docs Comp Letter/Create Docs.Letter Request/Detail docs.letter/Docs.Letter Request/button_Add'))

WebUI.scrollToElement(findTestObject('Intellectual Property/detail Intellectual Property/h3_Create Intellectual Property Request'), 
    0)

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

