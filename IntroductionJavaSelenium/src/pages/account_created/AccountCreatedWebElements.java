package pages.account_created;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.webDriverWait;
import utils.expectedConditions;

public class AccountCreatedWebElements {
	private AccountCreatedElementsPaths acep;
	private webDriverWait wait;
	private expectedConditions ec;

	public AccountCreatedWebElements(WebDriver driver) {
		acep = new AccountCreatedElementsPaths();
		wait = new webDriverWait(driver,10);
		ec = new expectedConditions();
	}
	public void waitForPageToLoad() {
		wait.getWait().until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public WebElement getVerifyAccountCreatedVisibleElement() {
		return wait.getWait().until(ec.ExpectVisibility(acep.getVerifyAccounCreatedtLabelPath()));
	}
	public WebElement getContinueButtonElement() {
		return wait.getWait().until(ec.ExpectClickable(acep.getContinueButtonPath()));
	}

}
