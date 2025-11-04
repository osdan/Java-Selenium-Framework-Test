package automationexercise.test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tools.expectedConditions;
import tools.webDriverWait;

public class TestCasesWebElements {
	private TestCasesElementsPaths tcep;
	private webDriverWait wait;
	private expectedConditions ec;
	
	public TestCasesWebElements(WebDriver driver) {
		tcep = new TestCasesElementsPaths();
		wait = new webDriverWait(driver, 10);
		ec = new expectedConditions();
	}
	
	public WebElement getTestCasesContainerElement() {
		return wait.getWait().until(ec.ExpectVisibility(tcep.getTestCasesContainerPath()));
	}
}
