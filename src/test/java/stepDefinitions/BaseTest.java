package stepDefinitions;

import io.cucumber.java.hu.De;
import org.openqa.selenium.WebDriver;
import tools.UI.MethodsFactory.MethodsHelpers;
import tools.UI.WebDrivers.Driver;
import tools.UI.webPages.BasePage;
import tools.UI.webPages.DemogaPages;

public abstract class BaseTest extends BasePage {




    protected DemogaPages demogaPages = new DemogaPages();

    protected MethodsHelpers helpers = new MethodsHelpers();
}
