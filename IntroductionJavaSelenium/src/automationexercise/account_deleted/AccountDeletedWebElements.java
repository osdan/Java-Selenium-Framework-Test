package automationexercise.account_deleted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.webDriverWait;
import tools.expectedConditions;

public class AccountDeletedWebElements {
	private AccountDeletedElementsPaths adep;
	private webDriverWait wait;
	private expectedConditions ec;

	public AccountDeletedWebElements(WebDriver driver) {
		adep = new AccountDeletedElementsPaths();
		wait = new webDriverWait(driver, 10);
		ec = new expectedConditions();
	}

	public WebElement getVerifyAccountDeletedVisibleElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(adep.getVerifyAccounDeletedtLabelPath()));
	}
	public WebElement getContinueButtonElement() {
		return wait.getWait().until(ec.ExpectClickable(adep.getContinueButtonPath()));
	}
}
