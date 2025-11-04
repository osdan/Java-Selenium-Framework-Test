package automationexercise.products;

import org.openqa.selenium.By;

public class ProductsElementsPaths {
	private By allProductsPagePath = By.xpath("//div[@class='features_items']");
	private By viewProductButtonsPaths = By.xpath("(//a[contains(text(),'View Product')])");
	private By searchInputPath = By.xpath("//input[@name='search']");
	private By searchButtonPath = By.xpath("//button[@id='submit_search']");
	private By NameProductLabelPath = By.xpath("//div[@class='productinfo text-center']//p");
	private By addToCartButtonsPath = By.xpath("((//div[@class='product-overlay'])//a[@class='btn btn-default add-to-cart'])");
	private By continueShoppingButtonPath = By.xpath("//button[@class='btn btn-success close-modal btn-block']");
	
	public By getAllProductsPagePath() {
		return allProductsPagePath ;
	}

	public By getViewProductListButtonsPaths() {
		return viewProductButtonsPaths;
	}

	public By getSearchInputPath() {
		return searchInputPath;
	}

	public By getSearchButtonPath() {
		return searchButtonPath;
	}

	public By getNameProductLabelPaths() {
		return NameProductLabelPath ;
	}

	public By getAddToCartButtonsPaths() {
		return addToCartButtonsPath;
	}

	public By getContinueShoppingButtonPath() {
		return continueShoppingButtonPath ;
	}
}
