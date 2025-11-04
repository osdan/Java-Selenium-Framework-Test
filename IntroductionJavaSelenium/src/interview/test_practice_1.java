package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import tools.base;
import tools.webDriverWait;

public class test_practice_1 {
	private base b;
	private WebDriver driver;
	private webDriverWait wdw;

	@BeforeClass(groups = { "smoke" })
	public void setUp() {
		b = new base();
		driver = b.getWebDriverBase();
		wdw = new webDriverWait(driver,10);
	}
	
	@Test(enabled = true,groups = { "smoke" })
	public void s01_Launch_browser() {
		driver.manage().window().maximize();
	}

	@Test(enabled = true)
	private void s02_Navigate_to_url() {
		driver.get("https://www.salesforce.com/mx/");
	}

	@Test(enabled = true)
	private void s03_Verify_that_home_page_is_visible_successfully() {
		wdw.waitForPageToLoad();
	}
	
	@Test(enabled = true)
	private void s04_Loggin() {
		//hwe.getSignuploginElement().click();
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	}
	
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
