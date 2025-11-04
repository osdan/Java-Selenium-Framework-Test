package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class actions {
	private Actions a;
	
	public actions(WebDriver wd) {
		a = new Actions(wd);
	}
	
	public void Hover(WebElement we) {
		a.moveToElement(we).perform();
	}
}
