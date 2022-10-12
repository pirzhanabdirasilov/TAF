package tools.UI.WebDrivers;

import org.openqa.selenium.WebDriver;
import tools.UI.configReader.ConfigReader;

public class Driver {


    public Driver() {
    }

    private  static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase().trim()){
                case ("chrome"):
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case ("edge"):
                    driver = EdgeWebDriver.loadEdgeDriver();
                default:
                    driver = ChromeWebDriver.loadChromeDriver();

            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
