package pages.view_cart;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import tools.expectedConditions;
//import tools.webDriverWait;

public class view_cart_WebElements {
	private view_cart_ElementsPaths vcep;
	//private webDriverWait wait;
	//private expectedConditions ec;
	private WebDriver wd;
	
	public view_cart_WebElements(WebDriver driver) {
		this.wd = driver;
		vcep = new view_cart_ElementsPaths();
		//wait = new webDriverWait(driver, 10);
		//ec = new expectedConditions();
	}
	
	public List<WebElement> getItemsElements(){
		List<WebElement> items = wd.findElements(vcep.getItemsPaths());
		System.out.println("Total de Items: "+ items.size());
		return items;
	}

	public List<WebElement> getItemsPrices(){
		List<WebElement> itemsPrices = wd.findElements(vcep.getItemsPricesPaths());
		System.out.println("Total de ItemsPrices: "+ itemsPrices.size());
		return itemsPrices;
	}
	public List<WebElement> getItemsQuantities(){
		List<WebElement> itemsQuantities = wd.findElements(vcep.getItemsQuantitiesPaths());
		System.out.println("Total de ItemsQuantities: "+ itemsQuantities.size());
		return itemsQuantities;
	}
	
	public List<WebElement> getItemsTotalPrices(){
		List<WebElement> itemsTotalPrices = wd.findElements(vcep.getItemsTotalPricesPaths());
		System.out.println("Total de itemsTotalPrices: "+ itemsTotalPrices.size());
		return itemsTotalPrices;
	}

}
