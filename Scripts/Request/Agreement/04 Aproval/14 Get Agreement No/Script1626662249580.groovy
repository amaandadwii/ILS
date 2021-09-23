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

WebUI.setText(findTestObject('Object Repository/Login/input_Username'), 'VIOLITTA.YUSTIAN@KALBE.CO.ID')

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/button_LOG IN'))

WebUI.verifyElementVisible(findTestObject('new/main_My Task                                                                                                            YOU DONT HAVE ANY PENDING TASK'))

WebUI.click(findTestObject('Agreement Request/Mytask/label_Req. AgreementMyTask'))

WebUI.delay(3)

WebUI.click(findTestObject('Agreement Request/Mytask/a_0007Req.AgrKFVIII2021'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/approval melina/h3_Detail Agreement Request'))

WebUI.click(findTestObject('Agreement Request/confirmation/button_Get Agreement No'))

WebUI.delay(4)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/approval melina/h3_Detail Agreement Request'))

WebUI.scrollToElement(findTestObject('Object Repository/Agreement Request/acknowledgement/label_ReviewerConfirmation'), 
    0)

WebUI.click(findTestObject('Agreement Request/Reviewer/label_ReviewerConfirmation'))

WebUI.click(findTestObject('Agreement Request/confirmation/label_KF Group'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Agreement Request/confirmation/input_StartPeriodFinal'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-08-20\'', Arrays.asList(element))

WebElement elementEnd = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Agreement Request/confirmation/input_EndPeriodFinal'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2021-12-03\'', Arrays.asList(elementEnd))

WebUI.setText(findTestObject('Agreement Request/confirmation/textarea_ResumeFinal'), 'test aa')

WebUI.setText(findTestObject('Agreement Request/confirmation/textarea_ReviewerConfirmation'), 'oke 2')

CustomKeywords.'com.test.uploadFileILS.testclass.uploadFile'(findTestObject('Object Repository/Agreement Request/acknowledgement/button_Choose File'), 
    GlobalVariable.uploadFile)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Agreement Request/confirmation/textarea_ResumeFinal'), 0)

WebUI.click(findTestObject('Agreement Request/label_Approver'))

WebUI.click(findTestObject('Agreement Request/confirmation/button_Add Director  Signer'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Agreement Request/confirmation/td_ADELIA CP. KARUNA WOKAMAUW'), 0)

WebUI.click(findTestObject('Agreement Request/confirmation/btn_Signed 1'))

WebUI.click(findTestObject('Agreement Request/reviewer 1/button_Submit'))

WebUI.scrollToElement(findTestObject('Agreement Request/approval melina/h3_Detail Agreement Request'), 0)

WebUI.click(findTestObject('Agreement Request/confirmation/button_Final'))

WebUI.delay(7)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(7)

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/h3_Request Agreement List'))

WebUI.click(findTestObject('Agreement Request/a_0065Req.AgrKFVIII2021'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Agreement Request/approval melina/h3_Detail Agreement Request'))

WebUI.click(findTestObject('Agreement Request/confirmation/button_SubmitKFPartner'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_YES'))

WebUI.delay(8)

WebUI.click(findTestObject('Agreement Request/button ok/button_OKsave'))

WebUI.delay(8)

WebUI.closeBrowser()

