package tests.Sprint_01.Test_Plan.HU_12345;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import core.base;
import core.webDriverWait;
import pages.home.HomeWebElements;
import pages.products.ProductsWebElements;
import pages.view_cart.view_cart_WebElements;
import utils.actions;
import utils.asserts;

public class Test_Case_12_Add_Products_in_Cart {
	private base b;
	private WebDriver driver;
	private webDriverWait wdw;
	private HomeWebElements hwe;
	private ProductsWebElements pwe;
	private view_cart_WebElements vcwe;
	private asserts a;
	private actions act;
	
	@BeforeClass(groups = { "smoke" })
	public void setUp() {
		System.out.println("Test_Case_12_Add_Products_in_Cart");
		b = new base();
		driver = b.getWebDriverBase();
		wdw = new webDriverWait(driver,10);
		hwe = new HomeWebElements(driver);
		pwe = new ProductsWebElements(driver);
		vcwe = new view_cart_WebElements(driver);
		a = new asserts();
		act = new actions(driver);
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
	private void s05_Hover_over_first_product_and_click_Add_to_cart() {
		act.Hover(pwe.getNameProductLabelElement().get(0));
		System.out.println("First product selected: "+pwe.getNameProductLabelElement().get(0).getText());
		pwe.getAddToCartButtonsElement().get(0).click();
	}
	
	@Test(enabled = true)
	private void s06_Click_Continue_Shopping_button() {
		pwe.getContinueShoppingButtonElement().click();
	}
	
	@Test(enabled = true)
	private void s07_Hover_over_second_product_and_click_Add_to_cart() {
		act.Hover(pwe.getNameProductLabelElement().get(1));
		System.out.println("Second product selected: "+pwe.getNameProductLabelElement().get(1).getText());
		pwe.getAddToCartButtonsElement().get(1).click();
	}
	
	@Test(enabled = true)
	private void s08_Click_View_Cart_button() throws InterruptedException {
		hwe.getViewCartButtonElement().click();
		Thread.sleep(3000);
	}
	
	@Test(enabled = true)
	private void s09_Verify_both_products_are_added_to_Cart() {
		a.AssertEqualsText(String.valueOf(vcwe.getItemsElements().size()), "2");
	}
	
	@Test(enabled = true)
	private void s10_Verify_their_prices_quantity_and_total_price() {
		a.AssertVisibleElement(vcwe.getItemsPrices().get(0), true);
		a.AssertVisibleElement(vcwe.getItemsPrices().get(1), true);
		
		a.AssertVisibleElement(vcwe.getItemsQuantities().get(0), true);
		a.AssertVisibleElement(vcwe.getItemsQuantities().get(1), true);

		a.AssertVisibleElement(vcwe.getItemsTotalPrices().get(0), true);
		a.AssertVisibleElement(vcwe.getItemsTotalPrices().get(1), true);
	}
	
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
