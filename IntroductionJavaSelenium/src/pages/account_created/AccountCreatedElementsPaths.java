package pages.account_created;

import org.openqa.selenium.By;

public class AccountCreatedElementsPaths {
	
	private By verifyAccounCreatedtLabel = By.xpath("(//div[@class='col-sm-9 col-sm-offset-1'])[1]");
	private By continueButton = By.xpath("//a[@class='btn btn-primary']");
	
	public By getVerifyAccounCreatedtLabelPath() {
		return verifyAccounCreatedtLabel;
	}
	public By getContinueButtonPath() {
		return continueButton;
	}

}