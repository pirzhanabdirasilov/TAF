package tools.UI.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tools.UI.MethodsFactory.MethodsHelpers;
import tools.UI.WebDrivers.Driver;

import java.util.Properties;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    protected WebDriver driver = Driver.getDriver();
    protected static MethodsHelpers helpers = new MethodsHelpers();




}
