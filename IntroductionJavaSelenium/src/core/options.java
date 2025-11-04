package core;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;

public class options {
	private ChromeOptions chromeOptions;
	
	public ChromeOptions getChromeOptions() {
		chromeOptions = new ChromeOptions();
		chromeOptions.setBinary("bin/chrome-win64_CDPv136/chrome.exe");
		System.setProperty("webdriver.chrome.driver", "bin/driver/chromedriver_CDPv136.exe");
		Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        chromeOptions.setExperimentalOption("prefs", prefs);
		return chromeOptions;
	}
}
