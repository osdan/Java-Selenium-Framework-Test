package automationexercise.products.product_detail;

import org.openqa.selenium.By;

public class ProductDetailElementsPaths {
	private By productDetailPagePath = 		By.xpath("(//div[@class='col-sm-9 padding-right'])[1]");
	private By productnamePath = 			By.xpath("(//div[@class='product-information'])//h2");
	private By productcategoryPath = 		By.xpath("(//div[@class='product-information'])//p[1]");
	private By productpricePath = 			By.xpath("((//div[@class='product-information'])//span[1])[2]");
	private By productavailabilityPath = 	By.xpath("(//div[@class='product-information'])//p[2]");
	private By productconditionPath = 		By.xpath("(//div[@class='product-information'])//p[3]");
	private By productbrandPath = 			By.xpath("(//div[@class='product-information'])//p[4]");
	
	public By getProductDetailPagePath() {
		return productDetailPagePath;
	}
	public By getProductNamePath() {
		return productnamePath;
	}
	public By getProductCategoryPath() {
		return productcategoryPath;
	}
	public By getProductPricePath() {
		return productpricePath;
	}
	public By getProductAvailabilityPath() {
		return productavailabilityPath;
	}
	public By getProductConditionPath() {
		return productconditionPath;
	}
	public By getProductBrandPath() {
		return productbrandPath;
	}
}
