package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Do;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import tools.UI.WebDrivers.Driver;
import tools.UI.configReader.ConfigReader;
import tools.UI.configReader.MockGeneratorData;

import java.awt.*;
import java.security.Key;

public class DemogaSteps extends BaseTest {


    @Given("user open web")
    public void user_open_web() throws Exception {
        Driver.getDriver().get(ConfigReader.getProperty("qaEnv"));
        demogaPages.getText();
        helpers.down(2)
                .loops(5);




    }
    @Then("user see first name and last name")
    public void user_see_first_name_and_last_name() {
        helpers.sleep(3000);
        demogaPages.inputNameLastName(MockGeneratorData.generatorMockFirstName()
        ,MockGeneratorData.generatorMockLastName());

        
    }
    @Then("user fill data tables")
    public void user_fill_data_tables() {

        demogaPages.getText()
                .inputEmail(MockGeneratorData.generatorMockEmail())
                .buttonFemale()
                .inputMobileNumber(MockGeneratorData.generatorMockNumber())
                .buttonDay19()
                .buttonReading()
                .pictureInput()
                .inputAddress(MockGeneratorData.generatorMockAddress())
                .buttonSubmit();

    }
    @Then("user examination")
    public void user_examination() {
        helpers.sleep(3000);
//        Driver.closeDriver();
        
    }

}
