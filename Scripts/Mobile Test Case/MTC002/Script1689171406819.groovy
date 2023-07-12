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
import com.github.javafaker.Faker as Faker

Faker faker = new Faker(new Locale("in-ID"))
String fullname = faker.name().fullName()
String address = faker.address().fullAddress()

Mobile.startExistingApplication(GlobalVariable.AppID)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Kemitraan'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Mitra Saya'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.ImageButton (add button)'), 
    0)

Mobile.swipe(56, 371, 56, 1657)

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nama Lengkap'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nama Lengkap'), fullname, 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nomor Telepon'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nomor Telepon'), 
    '08912812390', 0)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Pilih Provinsi'), 
    0)

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
    0)

Mobile.setText(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
    'Jawa Barat', 0)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.LinearLayout (search result)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Pilih Kota'), 
    0)

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
    0)

Mobile.setText(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
    'Kota cimahi', 0)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.LinearLayout (search result)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Pilih Kecamatan'), 
    0)

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
    0)

Mobile.setText(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
    'cimahi utara', 0)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.LinearLayout (search result)'), 
    0)

'swipe up'
Mobile.swipe(56, 1657, 56, 371)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Alamat Mitra'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Alamat Mitra'), 
    address, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Kode POS'), 
    0)

Mobile.setText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Kode POS'), 
    '0010', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile Repository/android.widget.EditText - Masukkan markup harga'), 0)

Mobile.setText(findTestObject('Mobile Repository/android.widget.EditText - Masukkan markup harga'), '10', 0)

Mobile.hideKeyboard()

Mobile.closeApplication()

