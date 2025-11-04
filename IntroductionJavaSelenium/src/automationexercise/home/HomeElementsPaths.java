package automationexercise.home;

import org.openqa.selenium.By;

public class HomeElementsPaths {

	private By cartButton = By.xpath("(//a[@href='/view_cart'])[1]");
	private By viewCartButtonPath = By.xpath("(//a[@href='/view_cart'])[2]");
	private By signupLoginButton = By.xpath("//a[@href='/login']");
	private By loggedUserLabelPath = By.xpath("//header[@id='header']//li[10]//a[1]");
	private By deleteAccountButtonPath = By.xpath("//header[@id='header']//li[5]");
	private By contactusButtonPath = By.xpath("//a[@href='/contact_us']");
	private By testCasesButtonPath = By.xpath("(//li)[5]");
	private By productsButtonPath = By.xpath("(//li)[2]");
	private By footerPath = By.xpath("//div[@class='single-widget']");
	private By subscriptionLabelPath = By.xpath("(//div[@class='single-widget'])//h2");
	private By emailInputPath = By.xpath("//input[@type='email']");
	private By submitButtonPath = By.xpath("//button[@type='submit']");
	private By successMessageLabelPath = By.xpath("//div[@class='alert-success alert']");
	
	public By getCartButtonPath() {
		return cartButton;
	}
	public By getViewCartButtonPath() {
		return viewCartButtonPath;
	}

	public By getSignupLoginButtonPath() {
		return signupLoginButton;
	}

	public By getLoggedUserLabelPath() {
		return loggedUserLabelPath;
	}
	public By getDeleteAccountButtonPath() {
		return deleteAccountButtonPath;
	}

	public By getContactusButtonPath() {
		return contactusButtonPath;
	}

	public By getTestCasesButtonPath() {
		return testCasesButtonPath;
	}

	public By getProductsButtonPath() {
		return productsButtonPath;
	}

	public By getFooterPath() {
		return footerPath ;
	}

	public By getSubscriptionLabelPath() {
		return subscriptionLabelPath;
	}

	public By getEmailInputPath() {
		return emailInputPath;
	}

	public By getSubmitButtonPath() {
		return submitButtonPath;
	}

	public By getSuccessMessageLabelPath() {
		return successMessageLabelPath ;
	}

}
