package tests.Sprint_01.Test_Plan.HU_12345;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import core.base;
import core.webDriverWait;
import pages.home.HomeWebElements;
import pages.login.LoginWebElements;
import utils.asserts;

public class Test_Case_05_Register_User_with_existing_email {
	private base b;
	private WebDriver driver;
	private webDriverWait wdw;
	private HomeWebElements hwe;
	private LoginWebElements lwe;
	private String email;
	private String password;
	private asserts a;
	private boolean t = true;

	@BeforeClass(groups = { "smoke" })
	public void setUp() {
		System.out.println("Test_Case_05_Register_User_with_existing_email");
		b = new base();
		driver = b.getWebDriverBase();
		wdw = new webDriverWait(driver,10);
		hwe = new HomeWebElements(driver);
		lwe = new LoginWebElements(driver);
		a = new asserts();

		email = "chinchin.real@gmail.com";
		password = "chinchin.real";
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
		a.AssertVisibleElement(lwe.getNewUserSignupElement(),t);
	}

	@Test(enabled = true)
	private void s06_Enter_name_and_already_registered_email_address() {
		lwe.getNameNewUserSignupElement().sendKeys("chinchin");
		lwe.getEmailNewUserSignupElement().sendKeys(email);
	}

	@Test(enabled = true)
	private void s07_Click_signup_button() {
		lwe.getSignupButtonElement().click();
	}

	@Test(enabled = true)
	private void s08_Verify_error_Email_Address_already_exist_is_visible() {
		a.AssertEqualsProperty(lwe.getEmailErrorLabelElement(),"textContent","Email Address already exist!");
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}

	}
}
