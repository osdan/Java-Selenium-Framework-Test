package tests.Sprint_01.Test_Plan.HU_12345;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import core.base;
import core.webDriverWait;
import pages.home.HomeWebElements;
import pages.test_cases.TestCasesWebElements;
import utils.asserts;

public class Test_Case_07_Verify_Test_Cases_Page {
	private base b;
	private WebDriver driver;
	private webDriverWait wdw;
	private HomeWebElements hwe;
	private asserts a;
	private boolean t = true;
	private TestCasesWebElements tcwe;
	
	@BeforeClass(groups = { "smoke" })
	public void setUp() {
		System.out.println("Test_Case_07_Verify_Test_Cases_Page");
		b = new base();
		driver = b.getWebDriverBase();
		wdw = new webDriverWait(driver,10);
		hwe = new HomeWebElements(driver);
		tcwe = new TestCasesWebElements(driver);
		a = new asserts();
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
	private void s04_Click_on_Test_Cases_button() {
		hwe.getTestCasesButtonElement().click();
	}
	
	@Test(enabled = true)
	private void s05_Verify_user_is_navigated_to_test_cases_page_successfully() {
		a.AssertVisibleElement(tcwe.getTestCasesContainerElement(), t);
	}
	
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
