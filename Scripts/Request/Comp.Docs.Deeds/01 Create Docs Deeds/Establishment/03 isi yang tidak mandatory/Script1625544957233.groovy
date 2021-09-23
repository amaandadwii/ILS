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

WebUI.setText(findTestObject('Login/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/button_LOG IN'))

WebUI.click(findTestObject('Request/a_Request'))

WebUI.click(findTestObject('Request/a_Comp. Docs. Deeds'))

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/button_Create New'))

WebUI.scrollToElement(findTestObject('Agreement Request/attachment/label_Attachment'), 0)

WebUI.click(findTestObject('Agreement Request/attachment/label_Attachment'))

//ADD FILE 1
WebUI.click(findTestObject('Docs Comps Deeds/attachmeny/button_Add Attachment'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Docs Comps Deeds/attachmeny/button_Choose File'), 
    'D:\\image1.jpg')

WebUI.delay(2)

WebUI.setText(findTestObject('Docs Comps Deeds/attachmeny/textarea_FileDescription'), 'attach 1')

WebUI.click(findTestObject('Docs Comps Deeds/attachmeny/button_Add'))

//ADD FILE 2
WebUI.click(findTestObject('Docs Comps Deeds/attachmeny/button_Add Attachment'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Docs Comps Deeds/attachmeny/button_Choose File'), 
    'D:\\automation data.xlsx')

WebUI.delay(2)

WebUI.setText(findTestObject('Docs Comps Deeds/attachmeny/textarea_FileDescription'), 'attach 2')

WebUI.click(findTestObject('Docs Comps Deeds/attachmeny/button_Add'))

//ADD FILE 3
WebUI.click(findTestObject('Docs Comps Deeds/attachmeny/button_Add Attachment'))

WebUI.delay(2)

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Docs Comps Deeds/attachmeny/button_Choose File'), 
    'D:\\Panduan Internship Apps Site Supervisor Monitoring Learning Plan dan Log Book.pdf')

WebUI.delay(2)

WebUI.setText(findTestObject('Docs Comps Deeds/attachmeny/textarea_FileDescription'), 'attach 3')

WebUI.click(findTestObject('Docs Comps Deeds/attachmeny/button_Add'))

WebUI.scrollToElement(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/h3_Create Docs. Deeds Request'), 
    0)

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(7)

WebUI.click(findTestObject('Agreement Request/button ok/button_Submit'))

WebUI.delay(7)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(15)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(7)

/*WebUI.delay(5)

//WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_OK'))
WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_Submitdeeds'))

WebUI.delay(8)

WebUI.click(findTestObject('Docs Comps Deeds/Docs. Deeds Request/Create Docs.Deeds/button_YES_submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))
*/
WebUI.closeBrowser()

