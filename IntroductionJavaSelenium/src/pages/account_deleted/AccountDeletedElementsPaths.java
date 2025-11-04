package pages.account_deleted;

import org.openqa.selenium.By;

public class AccountDeletedElementsPaths {
	private By verifyAccounDeletedtLabel = By.xpath("(//div[@class='col-sm-9 col-sm-offset-1'])[1]");
	private By continueButton = By.xpath("//a[@class='btn btn-primary']");
	
	public By getVerifyAccounDeletedtLabelPath() {
		return verifyAccounDeletedtLabel;
	}
	public By getContinueButtonPath() {
		return continueButton;
	}
}
