package Sprint_01.Test_Plan.HU_12345;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

import automationexercise.account_created.AccountCreatedWebElements;
import automationexercise.account_deleted.AccountDeletedWebElements;
import automationexercise.home.HomeWebElements;
import automationexercise.login.LoginWebElements;
import tools.GenerarCadenaAleatoria;

import tools.asserts;
import tools.base;
import tools.webDriverWait;

public class Test_Case_01_Register_User {
	private base b;
	private WebDriver driver;
	private webDriverWait wdw;
	private HomeWebElements hwe;
	private LoginWebElements lwe;
	private AccountCreatedWebElements acwe;
	private AccountDeletedWebElements adwe;
	private String email;
	private String password;
	private asserts Assert;
	private boolean t = true;
	private boolean f = false;

	@BeforeClass(groups = { "smoke" })
	public void setUp() {
		System.out.println("Test_Case_01_Register_User");
		GenerarCadenaAleatoria gca = new GenerarCadenaAleatoria();
		b = new base();
		driver = b.getWebDriverBase();
		wdw = new webDriverWait(driver,10);
		hwe = new HomeWebElements(driver);
		lwe = new LoginWebElements(driver);
		acwe = new AccountCreatedWebElements(driver);
		adwe = new AccountDeletedWebElements(driver);
		Assert = new asserts();

		email = "chinchin." + gca.generarCadenaAleatoria(3) + "@gmail.com";
		password = "chinchin." + gca.generarCadenaAleatoria(3);
		System.out.println("===============================================");
		System.out.println("===| Email: " + email);
		System.out.println("===| Password: " + password);
		System.out.println("===============================================");
	}

	@Test(enabled = true)
	public void s01_Launch_browser() {
		driver.manage().window().maximize();
	}

	@Test(enabled = true)
	private void s02_Navigate_to_url() {
		driver.get("https://www.automationexercise.com");
	}

	@Test(enabled = true)
	private void s03_Verify_that_home_page_is_visible_successfully() {
		wdw.waitForPageToLoad();
	}

	@Test(enabled = true)
	private void s04_Click_on_signup_login_button() {
		hwe.getSignuploginElement().click();
	}

	@Test(enabled = true)
	private void s05_Verify_new_user_signup_is_visible() {
		Assert.AssertVisibleElement(lwe.getNewUserSignupElement(), t );
	}

	@Test(enabled = true)
	private void s06_Enter_name_and_email_address() {
		lwe.getNameNewUserSignupElement().sendKeys("chinchin");
		lwe.getEmailNewUserSignupElement().sendKeys(email);
	}

	@Test(enabled = true)
	private void s07_Click_signup_button() {
		lwe.getSignupButtonElement().click();
	}

	@Test(enabled = true)
	private void s08_Verify_that_ENTER_ACCOUNT_INFORMATION_is_visible() {
		boolean t = true;
		Assert.AssertVisibleElement(lwe.getEnterAccountInformationElement(), t);
	}

	@Test(enabled = true)
	private void s09_Fill_details_Title_Name_Email_Password_Date_of_birth() {
		lwe.getTitleRadioButtonElement(1).click();
		lwe.getNameTextFieldElement().sendKeys("");
		Assert.AssertEnabledElement(lwe.getEmailTextFieldElement(),f);
		lwe.getPasswordTextFieldElement().sendKeys(password);
		lwe.setDateOfBirth("11", "12", "1995");
	}

	@Test(enabled = true)
	private void s10_Select_checkbox_sign_up_for_our_newsletter() {
		lwe.getNewsletterCheckboxElement().click();
	}

	@Test(enabled = true)
	private void s11_Select_checkbox_Receive_special_offers_from_our_partners() {
		lwe.getReceiveSpecialOffersCheckboxElement().click();
	}

	@Test(enabled = true)
	private void s12_Fill_details_First_name_Last_name_Company_Address_Address2_Country_State_City_Zipcode_Mobile_Number()
			throws InterruptedException {
		lwe.getFirstNameTextFieldElement().sendKeys("chinchin");
		lwe.getLastNameTextFieldElement().sendKeys("perrin");
		lwe.getCompanyTextFieldElement().sendKeys("chuchinesco");
		lwe.getAddressTextFieldElement().sendKeys("calle de chuchin");
		lwe.getAddress2TextFieldElement().sendKeys("colonia de chuchin");
		lwe.setCountry("Canada");
		lwe.getStateTextFieldElement().sendKeys("estado de chuchin");
		lwe.getCityTextFieldElement().sendKeys("ciudad de chuchin");
		lwe.getZipcodeTextFieldElement().sendKeys("12345");
		lwe.getMobileNumberTextFieldElement().sendKeys("0123456789");
	}

	@Test(enabled = true)
	private void s13_Click_Create_Account_button() {
		lwe.getCreateAccountButtonElement().click();
	}

	@Test(enabled = true)
	private void s14_Verify_that_ACCOUNT_CREATED_is_visible() {
		Assert.AssertVisibleElement(acwe.getVerifyAccountCreatedVisibleElement(),t);
	}

	@Test(enabled = true)
	private void s15_Click_continue_button() {
		acwe.getContinueButtonElement().click();
	}

	@Test(enabled = true)
	private void s16_Verify_that_logged_in_as_username_is_visible() {
		System.out.println("Property = " + hwe.getLoggedUser().getDomProperty("text"));
		Assert.AssertEqualsProperty(hwe.getLoggedUser(),"text"," Logged in as chinchin");
	}

	@Test(enabled = true)
	private void s17_Click_Delete_Account_button() {
		hwe.getDeleteAccountButton().click();
	}

	@Test(enabled = true)
	private void s18_Verify_that_ACCOUNT_DELETED_is_visible_and_click_continue_button() {
		Assert.AssertVisibleElement(adwe.getVerifyAccountDeletedVisibleElement(),t);
		adwe.getContinueButtonElement().click();
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}