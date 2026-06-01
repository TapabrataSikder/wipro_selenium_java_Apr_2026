package hooks;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;

public class Hooks {

     WebDriver driver;
     ConfigReader configReader;
     Properties prop;
     
     @Before(order = 0)
     public void getProperty() {
         configReader = new ConfigReader();
         prop = configReader.init_prop();
     }
     
     @Before(order = 1)
     public void launchBrowser() {
         String browserName = prop.getProperty("browser");

         driver = DriverFactory.initializeDriver(browserName);
     }

     @After
     public void quitBrowser() {
         DriverFactory.closeDriver();
     }
}