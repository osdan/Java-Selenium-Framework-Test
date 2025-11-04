package tools;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
	WebDriver wd = new webDriverConfig().getChromeWebDriver();
	//WebDriverWait wdw = new webDriverWait(wd, 0).getWait();
	
	public WebDriver getWebDriverBase() {
		return wd;
	}
	/*
	public WebDriverWait getWebDriverWaitBase() {
		return wdw;
	}
	*/
}