package webdriver;

import element.AbstractElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Utils {

    public static void scrollJsIntoView(WebElement webElement){
        ((JavascriptExecutor) Driver.getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", webElement);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void jsClickElement(WebElement webElement){
        ((JavascriptExecutor) Driver.getWebDriver()).executeScript("arguments[0].click();", webElement);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
