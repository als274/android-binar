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

Mobile.callTestCase(findTestCase('Register/Verify Element Visible'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Register/Click_register'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Register/Input_alamat'), [('alamat') : "Jalan-Jalan"], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Register/Input_email'), [('email') : "alda123@gmail.com"], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Register/Input_kota'), [('kota') : "bandung"], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Register/Input_nama'), [('nama') : "aal"], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Register/Input_password'), [('password') : "11223344"], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Register/Input_phone'), [('phone') : "0811223344"], FailureHandling.STOP_ON_FAILURE)

