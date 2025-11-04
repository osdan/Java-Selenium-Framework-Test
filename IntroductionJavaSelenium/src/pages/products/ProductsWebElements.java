package pages.products;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.webDriverWait;
import utils.expectedConditions;

public class ProductsWebElements {
	private ProductsElementsPaths pep;
	private webDriverWait wait;
	private expectedConditions ec;
	private WebDriver wd;
	
	public ProductsWebElements(WebDriver driver) {
		this.wd = driver;
		pep = new ProductsElementsPaths();
		wait = new webDriverWait(wd, 10);
		ec = new expectedConditions();
	}
	public WebElement getAllProductsPageElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(pep.getAllProductsPagePath()));
	}
	public WebElement getViewProductButtonElement(int p) {
		List<WebElement> ViewProductButtons = wd.findElements(pep.getViewProductListButtonsPaths());
		System.out.println("Total de productos: "+ ViewProductButtons.size());
		return ViewProductButtons.get(p);
	}
	public List<WebElement> getNameProductLabelElement() {
		List<WebElement> ProductNameLabel = wd.findElements(pep.getNameProductLabelPaths());
		System.out.println("Total de productos: "+ ProductNameLabel.size());
		return ProductNameLabel;
	}
	public WebElement getSearchInputElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(pep.getSearchInputPath()));
	}
	public WebElement getSearchButtonElement() {
		return wait.getWait()
				.until(ec.ExpectClickable(pep.getSearchButtonPath()));
	}
	public List<WebElement> getAddToCartButtonsElement(){
		List<WebElement> addToCartButton = wd.findElements(pep.getAddToCartButtonsPaths());
		System.out.println("Total de AddToCart Buttons: "+ addToCartButton.size());
		return addToCartButton;
	}
	public WebElement getContinueShoppingButtonElement() {
		return wait.getWait()
				.until(ec.ExpectClickable(pep.getContinueShoppingButtonPath()));
	}

}
