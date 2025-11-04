package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import core.webDriverWait;

public class alerts {
	private Alert a;
	private webDriverWait wdw;
	private expectedConditions ec;

	public alerts(WebDriver webdriver) {
		ec = new expectedConditions();
		wdw = new webDriverWait(webdriver, 10);
		a = wdw.getWait().until(ec.ExpectAlert());
	}
	public void alertAccept() {
		a.accept();
	}

	public String getAlertText() {
		if (a == null) {
			return a.getText();
		} else {
			return a.getText();
		}
	}
}
