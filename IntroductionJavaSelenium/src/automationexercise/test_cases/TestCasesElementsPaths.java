package automationexercise.test_cases;

import org.openqa.selenium.By;

public class TestCasesElementsPaths {
	private By testCaseContainerPath = By.xpath("(//div[@class='container'])[2]");
	
	public By getTestCasesContainerPath() {
		return testCaseContainerPath;
	}

}
