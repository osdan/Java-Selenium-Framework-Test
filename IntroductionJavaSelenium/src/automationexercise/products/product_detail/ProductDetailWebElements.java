package automationexercise.products.product_detail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.expectedConditions;
import tools.webDriverWait;

public class ProductDetailWebElements {
	private ProductDetailElementsPaths pdep;
	private webDriverWait wait;
	private expectedConditions ec;
	
	public ProductDetailWebElements(WebDriver driver) {
		pdep = new ProductDetailElementsPaths();
		wait = new webDriverWait(driver, 10);
		ec = new expectedConditions();	
	}

	public WebElement getProductDetailPage() {
		return wait.getWait()
				.until(ec.ExpectVisibility(pdep.getProductDetailPagePath()));
	}
	
	public WebElement getProductNamePath() {
		return wait.getWait()
				.until(ec.ExpectVisibility(pdep.getProductNamePath()));
	}
	
	public WebElement getProductCategoryPath() {
		return wait.getWait()
				.until(ec.ExpectVisibility(pdep.getProductCategoryPath()));
	}
	
	public WebElement getProductPricePath() {
		return wait.getWait()
				.until(ec.ExpectVisibility(pdep.getProductPricePath()));
	}
	
	public WebElement getProductAvailabilityPath() {
		return wait.getWait()
				.until(ec.ExpectVisibility(pdep.getProductAvailabilityPath()));
	}
	
	public WebElement getProductConditionPath() {
		return wait.getWait()
				.until(ec.ExpectVisibility(pdep.getProductConditionPath()));
	}	
	
	public WebElement getProductBrandPath() {
		return wait.getWait()
				.until(ec.ExpectVisibility(pdep.getProductBrandPath()));
	}
}
