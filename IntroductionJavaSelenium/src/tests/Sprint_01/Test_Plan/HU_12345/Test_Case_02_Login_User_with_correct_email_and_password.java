package tests.Sprint_01.Test_Plan.HU_12345;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import core.base;
import core.webDriverWait;
import pages.account_deleted.AccountDeletedWebElements;
import pages.home.HomeWebElements;
import pages.login.LoginWebElements;
import utils.asserts;

public class Test_Case_02_Login_User_with_correct_email_and_password {
	private base b;
	private WebDriver driver;
	private webDriverWait wdw;
	private HomeWebElements hwe;
	private LoginWebElements lwe;
	private AccountDeletedWebElements adwe;
	private asserts a;
	private String email;
	private String password;
	private boolean t = true;
	
	@BeforeClass(groups = { "smoke" })
	public void setUp() {
		System.out.println("Test_Case_02_Login_User_with_correct_email_and_password");
		b = new base();
		driver = b.getWebDriverBase();
		wdw = new webDriverWait(driver,10);
		hwe = new HomeWebElements(driver);
		lwe = new LoginWebElements(driver);
		adwe = new AccountDeletedWebElements(driver);
		a = new asserts();

		email = "chinchin.real@gmail.com";
		password = "chinchin.real";
		System.out.println("===============================================");
		System.out.println("===| Email: "+email);
		System.out.println("===| Password: "+password);
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
	private void s05_Verify_Login_to_your_account_is_visible() {
		a.AssertVisibleElement(lwe.getLoginToYourAccountElement(),t);
	}

	@Test(enabled = true)
	private void s06_Enter_correct_email_address_and_password() {
		lwe.getEmailLoginElement().sendKeys(email);
		lwe.getPasswordLoginElement().sendKeys(password);
	}
	
	@Test(enabled = true)
	private void s07_Click_login_button() {
		lwe.getLoginButtonElement().click();
	}
	
	@Test(enabled = true)
	private void s08_Verify_that_logged_in_as_username_is_visible() {
		System.out.println("Property = "+ hwe.getLoggedUser().getDomProperty("text"));
		a.AssertEqualsProperty(hwe.getLoggedUser(),"text"," Logged in as chinchin");
	}
	
	@Test(enabled = true)
	private void s09_Click_Delete_Account_button() {
		hwe.getDeleteAccountButton().click();
	}
	
	@Test(enabled = true)
	private void s10_Verify_that_ACCOUNT_DELETED_is_visible() {
		a.AssertVisibleElement(adwe.getVerifyAccountDeletedVisibleElement(),t);
	}
	
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}

	}
}
