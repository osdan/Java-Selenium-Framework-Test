package tests.Sprint_01.Test_Plan.HU_12345;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import core.base;
import core.webDriverWait;
import pages.contact_us.ContactUsWebElements;
import pages.home.HomeWebElements;
import utils.alerts;
import utils.asserts;
import utils.loadFile;


public class Test_Case_06_Contact_Us_Form {
	private base b;
	private WebDriver driver;
	private webDriverWait wdw;
	private alerts alerts;
	private HomeWebElements hwe;
	private ContactUsWebElements cuwe;
	private String email;
	private String password;
	private loadFile robot;
	private asserts a;
	private boolean t = true;
	
	@BeforeClass(groups = { "smoke" })
	public void setUp() {
		System.out.println("Test_Case_06_Contact_Us_Form");
		b = new base();
		driver = b.getWebDriverBase();
		wdw = new webDriverWait(driver, 10);
		hwe = new HomeWebElements(driver);
		cuwe = new ContactUsWebElements(driver);
		robot = new loadFile();
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
	private void s04_Click_on_Contact_Us_button() {
		hwe.getContactusButton().click();
	}
	
	@Test(enabled = true)
	private void s05_Verify_GET_IN_TOUCH_is_visible() {
		a.AssertVisibleElement(cuwe.getContactUsWebElement(),t);
	}
	
	@Test(enabled = true)
	private void s06_Enter_name_email_subject_and_message() {
		cuwe.getNameInputElement().sendKeys("chinchin");
		cuwe.getEmailInputElement().sendKeys("chinchin@gmail.com");
		cuwe.getSubjectInputElement().sendKeys("Subject Text...");
		cuwe.getMessageInputElement().sendKeys("Message Text...");
	}
	
	@Test(enabled = true)
	private void s07_Upload_file() throws AWTException {
		cuwe.getUploadFileButtonElement().click();
		robot.loadFileSystem("C:\\Workspace\\IntroductionJavaSelenium\\bin\\archivo.txt");
	}
	
	@Test(enabled = true)
	private void s08_Click_Submit_button() {
		cuwe.getSubmitButtonElement().click();
	}
	
	@Test(enabled = true)
	private void s09_Click_OK_button() {
		alerts = new alerts(driver);
		System.out.println("Alert = "+alerts.getAlertText());
		a.AssertEqualsText(alerts.getAlertText(), "Press OK to proceed!");
		alerts.alertAccept();
	}
	
	@Test(enabled = true)
	private void s10_Verify_success_message_Success_Your_details_have_been_submitted_successfully_is_visible() {
		a.AssertVisibleElement(cuwe.getSuccessMessageElement(), t);
	}
	
	@Test(enabled = true)
	private void s11_Click_Home_button_and_verify_that_landed_to_home_page_successfully() {
		a.AssertVisibleElement(cuwe.getHomeButtonElement(), t);
		cuwe.getHomeButtonElement().click();
		System.out.println("CurrentUrl: "+driver.getCurrentUrl());
		a.AssertEqualsText(driver.getCurrentUrl(), "https://www.automationexercise.com/");
	}
	
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}

	}
}