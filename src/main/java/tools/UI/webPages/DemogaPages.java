package tools.UI.webPages;

import io.cucumber.java.hu.De;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemogaPages extends BasePage{
    @FindBy(xpath = "//div[@class='main-header']")
    private WebElement text;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private  WebElement firstNameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private  WebElement lastNameInput;

    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    private WebElement emailInput;

    @FindBy(xpath = "(//label[@class='custom-control-label'])[2]")
    private WebElement femaleButton;

    @FindBy(xpath = "//input[@placeholder='Mobile Number']")
    private WebElement mobileNumberInput;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement dateButton;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--019']")
    private WebElement day19;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]")
    private WebElement subjectInput;

    @FindBy(xpath = "(//label[@class='custom-control-label'])[5]")
    private WebElement readingButton;

    @FindBy(xpath = "//input[@class='form-control-file']")
    private WebElement pictureInput;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement currentAddressInput;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[1]")
    private WebElement stateInput;

//    @FindBy(xpath = )

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[2]")
    private WebElement cityInput;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//button[@id='closeLargeModal']")
    private WebElement close;

    @FindBy(xpath = "//iframe[@id='google_ad_621791051965']")
    private WebElement frame;

    @FindBy(xpath = "")

    private final String img =  "C:\\Users\\User\\Pictures\\Saved Pictures\\images.jfif";

    public DemogaPages getText(){
        Assertions.assertEquals("Practice Form",helpers.getText(text));
//        helpers.frameSwitch(frame).;
        return this;
    }
    public DemogaPages inputNameLastName(String firstName, String lastName){
        helpers.sendKeys(firstNameInput,firstName)
                .sendKeys(lastNameInput,lastName);
        return this;
    }

    public  DemogaPages inputEmail(String email){
        helpers.sendKeys(emailInput,email);
        return this;
    }

    public DemogaPages buttonFemale(){
        helpers.click(femaleButton);
        return this;
    }
    public DemogaPages inputMobileNumber(String number){
        helpers.sendKeys(mobileNumberInput,number);
        return this;
    }
    public DemogaPages buttonDay19(){
        helpers.click(dateButton)
                .click(day19);
        return this;
    }
    public DemogaPages inputSubject() throws InterruptedException {
        helpers.sleep(3000)
                .sendKeys(subjectInput,"Eng",Keys.ENTER);
        return this;
    }
    public DemogaPages buttonReading(){
        helpers.click(readingButton);
        return this;
    }
    public DemogaPages pictureInput(){
        helpers.sendKeys(pictureInput,img);
        return this;
    }
    public DemogaPages inputAddress(String address){
        helpers.sendKeys(currentAddressInput,address);
        return this;
    }
//    public DemogaPages inputState(){
////        helpers.click(stateInput);
//        helpers.sendKeys(stateInput,"Hary",Keys.ENTER);
////        stateInput.sendKeys("Hary",Keys.ENTER);
//        return this;
//    }
//    public DemogaPages inputCity(){
////        helpers.click(cityInput);
//        helpers.sendKeys(cityInput,"Kar",Keys.ENTER);
//        return this;
//    }
    public DemogaPages buttonSubmit(){
        helpers.click(submitButton);
        Assertions.assertEquals("Close",helpers.getText(close));
        helpers.click(close);
        return this;
    }


}


















