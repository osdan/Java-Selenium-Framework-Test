package utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class asserts {

	private enum Estado {
		ACTIVO, INACTIVO
	}

	public void AssertVisibleElement(WebElement e, boolean flag) {
		Estado state = flag ? Estado.ACTIVO : Estado.INACTIVO;

		switch (state) {
		case ACTIVO:
			Assert.assertTrue(e.isDisplayed());
			break;
		case INACTIVO:
			Assert.assertFalse(e.isDisplayed());
			break;
		}
	}

	public void AssertEnabledElement(WebElement e, boolean flag) {
		Estado state = flag ? Estado.ACTIVO : Estado.INACTIVO;

		switch (state) {
		case ACTIVO:
			Assert.assertTrue(e.isEnabled());
			break;
		case INACTIVO:
			Assert.assertFalse(e.isEnabled());
			break;
		}
	}

	public void AssertEqualsProperty(WebElement e, String property, String StringExpected) {
		Assert.assertTrue(e.getDomProperty(property).equals(StringExpected));
	}
	public void AssertEqualsText(String txt, String StringExpected) {
		Assert.assertTrue(txt.equals(StringExpected));
	}

	public void AssertContains(boolean contains) {
		Assert.assertTrue(contains);
	}
}