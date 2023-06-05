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

WebUI.navigateToUrl('https://myphamkissme.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Kissme Cosmetics/svg'))

WebUI.click(findTestObject('Object Repository/Page_Kissme Cosmetics/a_ng nhp'))

WebUI.setText(findTestObject('DangNhap/input_email'), 'ngoclan@gmail.com')

WebUI.setEncryptedText(findTestObject('DangNhap/input_matkhau'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('DangNhap/btDangNhap'))

WebUI.click(findTestObject('Page_Kissme Cosmetics/a_SON'))

WebUI.click(findTestObject('Page_Kissme Cosmetics/img'))

WebUI.click(findTestObject('Page_Son Tint Romand Dewyful Water Tint 5g _9e0f82/TangSoLuongg'))

WebUI.click(findTestObject('Page_Son Tint Romand Dewyful Water Tint 5g _9e0f82/TangSoLuongg'))

WebUI.click(findTestObject('Page_Son Tint Romand Dewyful Water Tint 5g _9e0f82/button_ThemGioHang'))

WebUI.click(findTestObject('Page_Son Tint Romand Dewyful Water Tint 5g _9e0f82/Gio hang'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Gio hang Kissme Cosmetics/span_540.000'), '540.000₫')

