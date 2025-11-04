package pages.login;

import org.openqa.selenium.By;

public class LoginElementsXPaths {
	private String loginToYourAccountPath = "//div[@class='login-form']";
	private String newUserSignupPath = "//div[@class='signup-form']";
	private String nameSignupLoginInput = "//input[@name='name']";
	private String emailSignupLoginInput = "//input[@data-qa='signup-email']";
	private String signupButton = "(//button[@type='submit'])[2]";
	private String enterAccountInformationPath = "//div[@class='login-form']";
	private String titleRadioButtonPath = "//div[@class='radio']";
	private String nameTextFieldPath = "//input[@id='name']";
	private String emailTextFieldPath = "//input[@id='email']";
	private String passwordTextFieldPath = "//input[@id='password']";
	private String dayOfBirthComboListPath = "//select[@id='days']";
	private String monthOfBirthComboListPath = "//select[@id='months']";
	private String yearOfBirthComboListPath = "//select[@id='years']";
	private String newsletterCheckboxPath = "//input[@id='newsletter']";
	private String receiveSpecialOffersCheckboxPath = "//input[@id='optin']";
	private String firstNameTextFieldPath = "//input[@id='first_name']";
	private String lastNameTextFieldPath = "//input[@id='last_name']";
	private String companyTextFieldPath = "//input[@id='company']";
	private String addressTextFieldPath = "//input[@id='address1']";
	private String address2TextFieldPath = "//input[@id='address2']";
	private String countryTextFieldPath = "//select[@id='country']";
	private String stateTextFieldPath = "//input[@id='state']";
	private String cityTextFieldPath = "//input[@id='city']";
	private String zipcodeTextFieldPath = "//input[@id='zipcode']";
	private String mobileNumberTextFieldPath = "//input[@id='mobile_number']";
	private String createAccountButtonPath = "(//button[@type='submit'])[1]";
	private String emailLoginPath = "(//input[@type='email'])[1]";
	private String passwordLoginPath = "//input[@type='password']";
	private String loginButtonPath = "(//button[@type='submit'])[1]";
	private String redErrorLabelPath = "//form[@action='/login']//p";
	private String logoutButtonPath = "//header[@id='header']//li[4]";
	private String emailErrorLabelPath = "(//p)[1]";

	public By getNameSignupLoginFieldPath() {
		return By.xpath(nameSignupLoginInput);
	}

	public By getEmailSignupLoginButtonPath() {
		return By.xpath(emailSignupLoginInput);
	}

	public By getSignupButtonPath() {
		return By.xpath(signupButton);
	}

	public By getEnterAccountInformationPath() {
		return By.xpath(enterAccountInformationPath);
	}

	public By getTitleRadioButtonPath(int i) {
		return By.xpath(titleRadioButtonPath + "[" + i + "]");
	}

	public By getNameTextFieldPath() {
		return By.xpath(nameTextFieldPath);
	}

	public By getEmailTextFieldPath() {
		return By.xpath(emailTextFieldPath);
	}

	public By getPasswordTextFieldPath() {
		return By.xpath(passwordTextFieldPath);
	}

	public By getDayOfBirthComboListPath() {
		return By.xpath(dayOfBirthComboListPath);
	}

	public By getMonthOfBirthComboListPath() {
		return By.xpath(monthOfBirthComboListPath);
	}

	public By getYearOfBirthComboListPath() {
		return By.xpath(yearOfBirthComboListPath);
	}

	public By getNewsletterCheckboxPath() {
		return By.xpath(newsletterCheckboxPath);
	}

	public By getReceiveSpecialOffersCheckboxPath() {
		return By.xpath(receiveSpecialOffersCheckboxPath);
	}

	public By getFirstNameTextFieldPath() {
		return By.xpath(firstNameTextFieldPath);
	}

	public By getLastNameTextFieldPath() {
		return By.xpath(lastNameTextFieldPath);
	}

	public By getCompanyTextFieldPath() {
		return By.xpath(companyTextFieldPath);
	}

	public By getAddressTextFieldPath() {
		return By.xpath(addressTextFieldPath);
	}

	public By getAddress2TextFieldPath() {
		return By.xpath(address2TextFieldPath);
	}

	public By getCountryTextFieldPath() {
		return By.xpath(countryTextFieldPath);
	}

	public By getStateTextFieldPath() {
		return By.xpath(stateTextFieldPath);
	}

	public By getCityTextFieldPath() {
		return By.xpath(cityTextFieldPath);
	}

	public By getZipcodeTextFieldPath() {
		return By.xpath(zipcodeTextFieldPath);
	}

	public By getMobileNumberTextFieldPath() {
		return By.xpath(mobileNumberTextFieldPath);
	}

	public By getCreateAccountButtonPath() {
		return By.xpath(createAccountButtonPath);
	}

	public By getNewUserSignupPath() {
		return By.xpath(newUserSignupPath);
	}

	public By getLoginToYourAccountPath() {
		return By.xpath(loginToYourAccountPath);
	}

	public By getEmailLoginPath() {
		return By.xpath(emailLoginPath);
	}

	public By getPasswordLoginPath() {
		return By.xpath(passwordLoginPath);
	}

	public By getLoginButtonPath() {
		return By.xpath(loginButtonPath);
	}
	
	public By getRedErrorLabelPath() {
		return By.xpath(redErrorLabelPath);
	}

	public By getLogoutButtonPath() {
		return By.xpath(logoutButtonPath );
	}

	public By getEmailErrorLabelElementPath() {
		return By.xpath(emailErrorLabelPath );
	}
}