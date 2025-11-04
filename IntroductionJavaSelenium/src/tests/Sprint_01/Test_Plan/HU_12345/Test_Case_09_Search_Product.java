package tests.Sprint_01.Test_Plan.HU_12345;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import core.base;
import core.webDriverWait;
import pages.home.HomeWebElements;
import pages.products.ProductsWebElements;
import utils.asserts;

public class Test_Case_09_Search_Product {
	private base b;
	private WebDriver driver;
	private webDriverWait wdw;
	private HomeWebElements hwe;
	private ProductsWebElements pwe;
	private asserts a;
	private boolean t = true;
	private String textToSearch = "Top";
	
	@BeforeClass(groups = { "smoke" })
	public void setUp() {
		System.out.println("Test_Case_09_Search_Product");
		b = new base();
		driver = b.getWebDriverBase();
		wdw = new webDriverWait(driver,10);
		hwe = new HomeWebElements(driver);
		pwe = new ProductsWebElements(driver);
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
	private void s04_Click_on_Products_button() {
		hwe.getProductsButtonElement().click();
	}
	
	@Test(enabled = true)
	private void s05_Verify_user_is_navigated_to_ALL_PRODUCTS_page_successfully() {
		a.AssertVisibleElement(pwe.getAllProductsPageElement(), t);
		System.out.println("CurrentUrl: "+driver.getCurrentUrl());
		a.AssertEqualsText(driver.getCurrentUrl(), "https://www.automationexercise.com/products");
	}
	
	@Test(enabled = true)
	private void s06_Enter_product_name_in_search_input_and_click_search_button() {
		pwe.getSearchInputElement().sendKeys(textToSearch);
		pwe.getSearchButtonElement().click();
	}
	
	@Test(enabled = true)
	private void s07_Verify_SEARCHED_PRODUCTS_is_visible() {
		a.AssertVisibleElement(pwe.getAllProductsPageElement(), t);
	}
	
	@Test(enabled = true)
	private void s08_Verify_all_the_products_related_to_search_are_visible() {
		List<WebElement> names = pwe.getNameProductLabelElement();
		final String B = "\u001B[1m";
	    final String R = "\u001B[0m";
		System.out.println("|||||||||| Input: "+B+textToSearch+R+" ||||||||||||||||||||||||||||||||||");
		for(int i = 0; i < names.size(); i++) {
			if(names.get(i).getText().contains(textToSearch)) {
				a.AssertVisibleElement(names.get(i), t);
				System.out.println("=|Ok     | "+B+names.get(i).getText()+R);
			}else {
				System.out.println("=|Missing| "+B+names.get(i).getText()+R);
			}
		}
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
	}
	
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
