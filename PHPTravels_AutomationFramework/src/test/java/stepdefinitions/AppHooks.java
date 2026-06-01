package stepdefinitions;

import base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	@Before
	public void launchBrowser() {
		DriverFactory.initializeDriver("chrome");
	}
	
	@After
    public void closeBrowser() {
        DriverFactory.closeDriver();
    }
}
