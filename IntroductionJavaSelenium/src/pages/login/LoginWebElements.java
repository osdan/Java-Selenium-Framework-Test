package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import core.webDriverWait;
import utils.expectedConditions;

public class LoginWebElements {
	private LoginElementsXPaths lep;
	private webDriverWait wait;
	private expectedConditions ec;

	public LoginWebElements(WebDriver driver) {
		lep = new LoginElementsXPaths();
		wait = new webDriverWait(driver,10);
		ec = new expectedConditions();
	}
	
	public WebElement getNewUserSignupElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getNewUserSignupPath()));
	}
	public WebElement getNameNewUserSignupElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getNameSignupLoginFieldPath()));
	}

	public WebElement getEmailNewUserSignupElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getEmailSignupLoginButtonPath()));
	}

	public WebElement getSignupButtonElement() {
		return wait.getWait().until(ec.ExpectClickable(lep.getSignupButtonPath()));
	}

	public WebElement getEnterAccountInformationElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getEnterAccountInformationPath()));
	}

	public WebElement getTitleRadioButtonElement(int i) {
		return wait.getWait().until(ec.ExpectVisibility(lep.getTitleRadioButtonPath(i)));
	}

	public WebElement getNameTextFieldElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getNameTextFieldPath()));
	}

	public WebElement getEmailTextFieldElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getEmailTextFieldPath()));
	}

	public WebElement getPasswordTextFieldElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getPasswordTextFieldPath()));
	}

	public WebElement getDayOfBirthComboListElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getDayOfBirthComboListPath()));
	}

	public WebElement getMonthOfBirthComboListElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getMonthOfBirthComboListPath()));
	}

	public WebElement getYearOfBirthComboListElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getYearOfBirthComboListPath()));
	}

	public void setDateOfBirth(String dd, String mm, String yyyy) {
		Select day = new Select(getDayOfBirthComboListElement());
		Select month = new Select(getMonthOfBirthComboListElement());
		Select year = new Select(getYearOfBirthComboListElement());
		day.selectByValue(dd);
		month.selectByValue(mm);
		year.selectByValue(yyyy);
		return;
	}
	
	public WebElement getNewsletterCheckboxElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getNewsletterCheckboxPath()));
	}

	public WebElement getReceiveSpecialOffersCheckboxElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getReceiveSpecialOffersCheckboxPath()));
	}

	public WebElement getFirstNameTextFieldElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getFirstNameTextFieldPath()));
	}

	public WebElement getLastNameTextFieldElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getLastNameTextFieldPath()));
	}

	public WebElement getCompanyTextFieldElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getCompanyTextFieldPath()));
	}

	public WebElement getAddressTextFieldElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getAddressTextFieldPath()));
	}

	public WebElement getAddress2TextFieldElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getAddress2TextFieldPath()));
	}

	public WebElement getCountryComboListElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getCountryTextFieldPath()));
	}
	public void setCountry(String country) {
		Select c = new Select(getCountryComboListElement());
		c.selectByValue(country);
		return;
	}

	public WebElement getStateTextFieldElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getStateTextFieldPath()));
	}

	public WebElement getCityTextFieldElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getCityTextFieldPath()));
	}

	public WebElement getZipcodeTextFieldElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getZipcodeTextFieldPath()));
	}

	public WebElement getMobileNumberTextFieldElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getMobileNumberTextFieldPath()));
	}

	public WebElement getCreateAccountButtonElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getCreateAccountButtonPath()));
	}

	public WebElement getLoginToYourAccountElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getLoginToYourAccountPath()));
	}

	public WebElement getEmailLoginElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getEmailLoginPath()));
	}

	public WebElement getPasswordLoginElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getPasswordLoginPath()));
	}
	
	public WebElement getLoginButtonElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getLoginButtonPath()));
	}

	public WebElement getRedErrorLabel() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getRedErrorLabelPath()));
	}

	public WebElement getLogoutElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getLogoutButtonPath()));
	}

	public WebElement getEmailErrorLabelElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(lep.getEmailErrorLabelElementPath()));
	}

}
