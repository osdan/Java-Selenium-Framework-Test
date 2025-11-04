package automationexercise.contact_us;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.webDriverWait;
import tools.expectedConditions;

public class ContactUsWebElements {
	private ContactUsElementsPaths cuep;
	private webDriverWait wait;
	private WebDriver wd;
	private expectedConditions ec;
	
	public ContactUsWebElements(WebDriver driver) {
		wd = driver;
		wait = new webDriverWait(wd,10);
		cuep = new ContactUsElementsPaths();
		ec = new expectedConditions();
	}
	
	public WebElement getContactUsWebElement() {
		return wait.getWait()
				.until(ec.ExpectClickable(cuep.getGetInTouchPath()));
	}

	public WebElement getNameInputElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(cuep.getNameInputPath()));
	}
	
	public WebElement getEmailInputElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(cuep.getEmailInputPath()));
	}
	
	public WebElement getSubjectInputElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(cuep.getSubjectInputPath()));
	}
	
	public WebElement getMessageInputElement() {
		return wait.getWait()
				.until(ec.ExpectVisibility(cuep.getMessageInputPath()));
	}
	
	public WebElement getUploadFileButtonElement() {
		return wait.getWait()
				.until(ec.ExpectClickable(cuep.getUploadFileButtonPath()));
	}
	public WebElement getSubmitButtonElement() {
		return wait.getWait()
				.until(ec.ExpectClickable(cuep.getSubmitButtonPath()));
	}

	public WebElement getSuccessMessageElement() {
		return wait.getWait()
				.until(ec.ExpectClickable(cuep.getSuccessMessageElementPath()));
	}

	public WebElement getHomeButtonElement() {
		return wait.getWait()
				.until(ec.ExpectClickable(cuep.getHomeButtonElementPath()));
	}
}