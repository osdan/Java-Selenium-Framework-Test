package automationexercise.contact_us;

import org.openqa.selenium.By;

public class ContactUsElementsPaths {
	
	private By getInTouchPath = By.xpath("(//div[@class='col-sm-8'])[2]");
	private By nameInputPath = By.xpath("//input[@name='name']");
	private By emailInputPath = By.xpath("//input[@name='email']");
	private By subjectInputPath = By.xpath("//input[@name='subject']");
	private By messageInputPath = By.xpath("//textarea[@name='message']");
	private By uploadFileButtonPath = By.xpath("(//div[@class='form-group col-md-12'])[3]");
	private By submitButtonPath = By.xpath("//input[@name='submit']");
	private By successMessagePath = By.xpath("//div[@class='status alert alert-success']");
	private By homeButtonePath = By.xpath("//a[@class='btn btn-success']");

	public By getGetInTouchPath() {
		return getInTouchPath;
	}

	public By getNameInputPath() {
		return nameInputPath;
	}
	
	public By getEmailInputPath() {
		return emailInputPath;
	}
	
	public By getSubjectInputPath() {
		return subjectInputPath;
	}
	
	public By getMessageInputPath() {
		return messageInputPath;
	}
	
	public By getUploadFileButtonPath() {
		return uploadFileButtonPath;
	}
	
	public By getSubmitButtonPath() {
		return submitButtonPath;
	}

	public By getSuccessMessageElementPath() {
		return successMessagePath;
	}

	public By getHomeButtonElementPath() {
		return homeButtonePath ;
	}
}