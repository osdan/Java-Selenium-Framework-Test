package automationexercise.view_cart;

import org.openqa.selenium.By;

public class view_cart_ElementsPaths {
	private By itemsPaths = By.xpath("//tr[contains(@id,'product-')]");
	private By itemsPricesPaths = By.xpath("//td[@class='cart_price']//p");
	private By itemsQuantitiesPaths = By.xpath("//td[@class='cart_quantity']//button");
	private By itemsTotalPricesPaths = By.xpath("//p[@class='cart_total_price']");
	
	public By getItemsPaths() {
		return itemsPaths;
	}

	public By getItemsPricesPaths() {
		return itemsPricesPaths;
	}

	public By getItemsQuantitiesPaths() {
		return itemsQuantitiesPaths;
	}

	public By getItemsTotalPricesPaths() {
		return itemsTotalPricesPaths;
	}
}