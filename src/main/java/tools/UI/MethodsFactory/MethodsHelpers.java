package tools.UI.MethodsFactory;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.UI.WebDrivers.Driver;
import tools.UI.webPages.BasePage;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.time.Duration;

public class MethodsHelpers extends BasePage {
    public MethodsHelpers waitElementToBeClicked(WebElement element){
       new  WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
               .until(ExpectedConditions.elementToBeClickable(element));
       return this;
    }
    public MethodsHelpers waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }


    public MethodsHelpers sendKeys(WebElement element,String str){
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }
    public MethodsHelpers sendKeys(WebElement element, String str, Keys enter){
        waitElementToBeDisplayed(element);
        element.sendKeys(str,enter);
        return this;
    }
    public MethodsHelpers click(WebElement element){
        waitElementToBeClicked(element);
        waitElementToBeDisplayed(element);
        element.click();
        return this;
    }

    public String getText(WebElement element){
        waitElementToBeDisplayed(element);
        return element.getText();
    }
//    public MethodsHelpers keysEnter(Keys keys){
//        waitElementToBeClicked(keys)
//    }
    public MethodsHelpers loops(int num) throws Exception {
        Robot robot = new Robot();
        for (int i = 0; i < num; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        return this;
    }
    public MethodsHelpers getTExt(WebElement element){
        waitElementToBeDisplayed(element);
        getText(element);return this;
    }

    public MethodsHelpers sleep(long num){
        try {
            Thread.sleep(num);
        }catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }
    public MethodsHelpers down(int num)throws  Exception{
        Robot robot = new Robot();
        for (int i = 0; i < num; i++) {
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        }
        return this;
    }
    public MethodsHelpers frameSwitch(WebElement element){
        driver.switchTo().frame(element);
        element.click();
        return this;
    }


}
