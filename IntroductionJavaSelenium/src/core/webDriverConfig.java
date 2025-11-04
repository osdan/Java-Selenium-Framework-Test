package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverConfig {
	
	private WebDriver driver;
	private options o = new options();
	
	public WebDriver getChromeWebDriver() {
		driver = new ChromeDriver(o.getChromeOptions());
		return driver;
	}
}