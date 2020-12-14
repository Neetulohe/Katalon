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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//Open browser
WebUI.openBrowser("https://opensource-demo.orangehrmlive.com/index.php/auth/login")

//Maximize windows
WebUI.maximizeWindow()

//Check for logo
WebUI.verifyElementPresent(findTestObject('Object Repository/TC3_OR/Page_OrangeHRM/img'), 4)

//Enter username
WebUI.setText(findTestObject('Object Repository/TC3_OR/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

//Enter password
WebUI.setText(findTestObject('Object Repository/TC3_OR/Page_OrangeHRM/input_Username_txtPassword'), 'admin123')

//Click on login button
WebUI.click(findTestObject('Object Repository/TC3_OR/Page_OrangeHRM/input_Password_Submit'))

//CLick on welcome paul
WebUI.click(findTestObject('Object Repository/TC3_OR/Page_OrangeHRM/Page_OrangeHRM/a_Welcome Paul'))

//CLick on Logout
WebUI.click(findTestObject('Object Repository/TC3_OR/Page_OrangeHRM/Page_OrangeHRM/a_Logout'))

//Close browser
not_run:WebUI.closeBrowser()