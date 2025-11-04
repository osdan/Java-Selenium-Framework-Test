package Sprint_01.Test_Plan.HU_12345;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationexercise.home.HomeWebElements;
import tools.JavascriptExecutorDriver;
import tools.asserts;
import tools.base;
import tools.webDriverWait;

public class Test_Case_11_Verify_Subscription_in_Cart_page {
	private base b;
	private WebDriver driver;
	private webDriverWait wdw;
	private HomeWebElements hwe;
	private JavascriptExecutorDriver jse;
	private asserts a;
	private boolean t = true;
	
	@BeforeClass(groups = { "smoke" })
	public void setUp() {
		System.out.println("Test_Case_11_Verify_Subscription_in_Cart_page");
		b = new base();
		driver = b.getWebDriverBase();
		wdw = new webDriverWait(driver,10);
		hwe = new HomeWebElements(driver);
		jse = new JavascriptExecutorDriver(driver);
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
	private void s04_Click_Cart_button() {
		hwe.getCartButtonElement().click();
	}
	
	@Test(enabled = true)
	private void s05_Scroll_down_to_footer() {
		jse.ScrollToElement(hwe.getFooterElement());
	}
	
	@Test(enabled = true)
	private void s06_Verify_text_SUBSCRIPTION() {
		a.AssertEqualsText(hwe.getSubscriptionLabelElement().getDomProperty("innerText"), "SUBSCRIPTION");
	}
	
	@Test(enabled = true)
	private void s07_Enter_email_address_in_input_and_click_arrow_button() {
		hwe.getEmailInputElement().sendKeys("chinchin@gmail.com");
		hwe.getSubmitButtonElement().click();
	}
	
	@Test(enabled = true)
	private void s08_Verify_success_message_You_have_been_successfully_subscribed_is_visible() {
		a.AssertVisibleElement(hwe.getSuccessMessageLabelElement(), t);
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
