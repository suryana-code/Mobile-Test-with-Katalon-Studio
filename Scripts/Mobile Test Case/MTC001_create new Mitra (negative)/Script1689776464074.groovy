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
import com.google.common.collect.ImmutableMap as ImmutableMap
import com.github.javafaker.Faker as Faker

Faker faker = new Faker(new Locale('in-ID' //call javaFaker
))

String fullname = faker.name().fullName( //generate random name
    )

String phonenum = faker.phoneNumber().phoneNumber( //generate random phonenumber
    )

phonenum = phonenum.replace('-', '' //replace if any '-' becomes empty string ''
    )

phonenum = phonenum.replace('+62', '0' //replace if there is '+62' it becomes empty string '0'
    )

phonenum = phonenum.replace('080', '088' //replace if there is '080' it becomes empty string '088'
    )

String address = faker.address().fullAddress( //generate random address
    )

Mobile.startExistingApplication(GlobalVariable.AppID)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Kemitraan'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Mitra Saya'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.ImageButton (add button)'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Tambahkan Mitra'), 
    'Tambahkan Mitra')

Mobile.verifyElementText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Nama Lengkap'), 
    'Nama Lengkap')

Mobile.verifyElementVisible(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nama Lengkap'), 
    0)

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/android.widget.TextView - Nomor Telepon'), 'Nomor Telepon')

Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nomor Telepon'), 
    0)

Mobile.verifyElementVisible(findTestObject('Mobile Repository/Create New Mitra/android.widget.ImageButton (contact book button)'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Provinsi'), 
    'Provinsi')

Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Pilih Provinsi'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Kota'), 
    'Kota')

Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Pilih Kota'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Kecamatan'), 
    'Kecamatan')

Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Pilih Kecamatan'), 
    0)

'swipe up'
Mobile.swipe(56, 1657, 56, 371)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Alamat Mitra'), 
    'Alamat Mitra')

Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Alamat Mitra'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Kode POS'), 
    'Kode POS')

Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Kode POS'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Markup Harga'), 
    'Markup Harga')

Mobile.verifyElementVisible(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan markup harga'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.Button - Simpan'), 
    0)

'swipe down'
Mobile.swipe(56, 371, 56, 1657)

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nama Lengkap'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nama Lengkap'), 'A', 
    0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/android.widget.TextView - (validasi Nama Lengkap)'), 
    'Isi minimal 3 karakter', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nama Lengkap'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nama Lengkap'), 0, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/android.widget.TextView - (validasi Nama Lengkap)'), 
    'Nama harus diisi', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nama Lengkap'), fullname, 
    0)

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/android.widget.ImageButton (contact book button)'), 0, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Mobile Repository/Create New Mitra/android.widget.Button - IZINKAN (button izinkan read contact)'), 
    3, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/android.widget.Button - IZINKAN (button izinkan read contact)'), 
        0)

    String command = 'mobile:changePermissions'

    Map<String, Object> args = ImmutableMap.of('action', 'grant', 'appPackage', GlobalVariable.AppID, 'permissions', 'android.permission.READ_CONTACTS')

    Object result = Mobile.executeMobileCommand(command, args)
}

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nomor Telepon'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nomor Telepon'), 
    '089', 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/android.widget.TextView - (validasi Nomor Telepon)'), 
    'Minimal 6 Digit', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nomor Telepon'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nomor Telepon'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/android.widget.TextView - (validasi Nomor Telepon)'), 
    'Nomor Telepon harus diisi', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Nomor Telepon'), 
    phonenum, 0)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.TextView - Pilih Provinsi'), 
    0)

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
    0)

Mobile.setText(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
    'dummy', 0)

Mobile.waitForElementPresent(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.ImageView (data illustration not found)'), 
    10)

Mobile.verifyElementVisible(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.ImageView (data illustration not found)'), 
    0)

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.TextView - Data xXx tidak ditemukan (provinsi,kota,kecamatan)'), 
    'Data provinsi tidak ditemukan')

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
    0)

Mobile.clearText(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
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
    'dummy', 0)

Mobile.waitForElementPresent(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.ImageView (data illustration not found)'), 
    10)

Mobile.verifyElementVisible(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.ImageView (data illustration not found)'), 
    0)

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.TextView - Data xXx tidak ditemukan (provinsi,kota,kecamatan)'), 
    'Data kota tidak ditemukan')

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
    0)

Mobile.clearText(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
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
    'dummy', 0)

Mobile.waitForElementPresent(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.ImageView (data illustration not found)'), 
    10)

Mobile.verifyElementVisible(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.ImageView (data illustration not found)'), 
    0)

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.TextView - Data xXx tidak ditemukan (provinsi,kota,kecamatan)'), 
    'Data kecamatan tidak ditemukan')

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
    0)

Mobile.clearText(findTestObject('Mobile Repository/Create New Mitra/Province,city,district/android.widget.EditText (search bar)'), 
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
    'Ad', 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/android.widget.TextView - (validasi Alamat Mitra)'), 
    'Isi minimal 10 karakter', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Alamat Mitra'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Alamat Mitra'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/android.widget.TextView - (validasi Alamat Mitra)'), 
    'Alamat harus diisi', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Alamat Mitra'), 
    address, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Kode POS'), 
    0)

Mobile.setText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Kode POS'), 
    '99', 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/android.widget.TextView - (validasi Alamat Mitra)'), 
    'Isi minimal 3 karakter', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Kode POS'), 
    0)

Mobile.clearText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Kode POS'), 
    0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/android.widget.TextView - (validasi Alamat Mitra)'), 
    'Kode Pos harus diisi', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan Kode POS'), 
    '45102', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan markup harga'), 0)

Mobile.setText(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan markup harga'), '1', 
    0)

Mobile.clearText(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan markup harga'), 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Mobile Repository/Create New Mitra/android.widget.TextView - (valdiasi Makup Harga)'), 
    'Markup Harga harus disi', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile Repository/Create New Mitra/android.widget.EditText - Masukkan markup harga'), '10', 
    0)

Mobile.hideKeyboard()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

