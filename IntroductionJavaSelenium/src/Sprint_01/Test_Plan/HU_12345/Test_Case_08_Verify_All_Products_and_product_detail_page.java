package Sprint_01.Test_Plan.HU_12345;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationexercise.home.HomeWebElements;
import automationexercise.products.ProductsWebElements;
import automationexercise.products.product_detail.ProductDetailWebElements;

import tools.asserts;
import tools.base;
import tools.webDriverWait;

public class Test_Case_08_Verify_All_Products_and_product_detail_page {
	private base b;
	private WebDriver driver;
	private webDriverWait wdw;
	private HomeWebElements hwe;
	private ProductsWebElements pwe;
	private ProductDetailWebElements pdwe; 
	private asserts a;
	private boolean t = true;
	private int p = 1;
	
	@BeforeClass(groups = { "smoke" })
	public void setUp() {
		System.out.println("Test_Case_08_Verify_All_Products_and_product_detail_page");
		b = new base();
		driver = b.getWebDriverBase();
		wdw = new webDriverWait(driver,10);
		hwe = new HomeWebElements(driver);
		pwe = new ProductsWebElements(driver);
		pdwe = new ProductDetailWebElements(driver);
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
	private void s06_The_Products_list_is_visible() {
		a.AssertVisibleElement(pwe.getAllProductsPageElement(), t);
	}
	
	@Test(enabled = true)
	private void s07_Click_on_View_Product_of_first_product() {
		pwe.getViewProductButtonElement(p-1).click();
	}
	
	@Test(enabled = true)
	private void s08_User_is_landed_to_product_detail_page() {
		a.AssertVisibleElement(pdwe.getProductDetailPage(), t);
		System.out.println("CurrentUrl: "+driver.getCurrentUrl());
		a.AssertEqualsText(driver.getCurrentUrl(), "https://www.automationexercise.com/product_details/"+p);
	}
	
	@Test(enabled = true)
	private void s09_Verify_that_detail_is_visible_ProductName_Category_Price_availability_condition_brand() {
		System.out.println("=======================================================");
		System.out.println("|| Product");
		a.AssertVisibleElement(pdwe.getProductNamePath(), t);
		System.out.println("|| Name: "+pdwe.getProductNamePath().getDomProperty("textContent"));
		a.AssertVisibleElement(pdwe.getProductCategoryPath(), t);
		System.out.println("|| "+pdwe.getProductCategoryPath().getDomProperty("textContent"));
		a.AssertVisibleElement(pdwe.getProductPricePath(), t);
		System.out.println("|| Price: "+pdwe.getProductPricePath().getDomProperty("textContent"));
		a.AssertVisibleElement(pdwe.getProductAvailabilityPath(), t);
		System.out.println("|| "+pdwe.getProductAvailabilityPath().getDomProperty("textContent"));
		a.AssertVisibleElement(pdwe.getProductConditionPath(), t);
		System.out.println("|| "+pdwe.getProductConditionPath().getDomProperty("textContent"));
		a.AssertVisibleElement(pdwe.getProductBrandPath(), t);
		System.out.println("|| "+pdwe.getProductBrandPath().getDomProperty("textContent"));
		System.out.println("=======================================================");
	}
	
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
