package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorDriver {
	private JavascriptExecutor jse;
	
	public JavascriptExecutorDriver(WebDriver driver) {
		jse = (JavascriptExecutor) driver;
	}
	
	public void ScrollToElement(WebElement we) {
		jse.executeScript("arguments[0].scrollIntoView(true);", we);
	}
}