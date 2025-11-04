package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.webDriverWait;
import utils.expectedConditions;

public class HomeWebElements {
	private HomeElementsPaths hep;
	private webDriverWait wait;
	private expectedConditions ec;

	public HomeWebElements(WebDriver driver) {
		hep = new HomeElementsPaths();
		wait = new webDriverWait(driver, 10);
		ec = new expectedConditions();
	}

	public WebElement getCartButtonElement() {
		return wait.getWait().until(ec.ExpectClickable(hep.getCartButtonPath()));
	}

	public WebElement getSignuploginElement() {
		return wait.getWait().until(ec.ExpectClickable(hep.getSignupLoginButtonPath()));
	}

	public WebElement getLoggedUser() {
		return wait.getWait().until(ec.ExpectClickable(hep.getLoggedUserLabelPath()));
	}

	public WebElement getDeleteAccountButton() {
		return wait.getWait().until(ec.ExpectClickable(hep.getDeleteAccountButtonPath()));
	}

	public WebElement getContactusButton() {
		return wait.getWait().until(ec.ExpectClickable(hep.getContactusButtonPath()));
	}

	public WebElement getTestCasesButtonElement() {
		return wait.getWait().until(ec.ExpectClickable(hep.getTestCasesButtonPath()));
	}

	public WebElement getProductsButtonElement() {
		return wait.getWait().until(ec.ExpectClickable(hep.getProductsButtonPath()));
	}

	public WebElement getFooterElement() {
		return wait.getWait().until(ec.ExpectClickable(hep.getFooterPath()));
	}

	public WebElement getSubscriptionLabelElement() {
		return wait.getWait().until(ec.ExpectClickable(hep.getSubscriptionLabelPath()));
	}

	public WebElement getEmailInputElement() {
		return wait.getWait().until(ec.ExpectClickable(hep.getEmailInputPath()));
	}

	public WebElement getSubmitButtonElement() {
		return wait.getWait().until(ec.ExpectClickable(hep.getSubmitButtonPath()));
	}

	public WebElement getSuccessMessageLabelElement() {
		return wait.getWait().until(ec.ExpectVisibility(hep.getSuccessMessageLabelPath()));
	}
	
	public WebElement getViewCartButtonElement() {
		return wait.getWait().until(ec.ExpectVisibility(hep.getViewCartButtonPath()));
	}
}