package core;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriverWait {
	private WebDriver wd;
	private WebDriverWait wait;
	private int i;
	
	public webDriverWait(WebDriver wdv, int d) {
		this.wd = wdv;
		this.i = d;
		wait = new WebDriverWait(wd, Duration.ofSeconds(i));
	}

	public WebDriverWait getWait() {
		return wait;
	}
	
	public void waitForPageToLoad() {
		wait.until(webDriver  ->
        ((JavascriptExecutor) webDriver )
        .executeScript("return document.readyState")
        .equals("complete")
		);
	}
	
}