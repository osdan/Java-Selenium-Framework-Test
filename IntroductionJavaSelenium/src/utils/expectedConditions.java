package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class expectedConditions {

	public ExpectedCondition<WebElement> ExpectClickable(By by) {
		return ExpectedConditions.elementToBeClickable(by);
	}
	
	public ExpectedCondition<WebElement> ExpectVisibility(By by) {
		return ExpectedConditions.visibilityOfElementLocated(by);
	}
	
	public ExpectedCondition<Alert> ExpectAlert() {
		return ExpectedConditions.alertIsPresent();
	}

}