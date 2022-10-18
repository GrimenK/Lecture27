package pageObject;

import element.Button;
import element.Input;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;
import webdriver.PageObjectManager;
import webdriver.Utils;

public class FilterTab extends AbstractPage {

    @FindBy(xpath = "//div[@data-filter-name = 'price']//input[@formcontrolname = 'max']")
    public WebElement maxPriceInput;

    @FindBy(xpath = "//div[@data-filter-name = 'price']//button[@type = 'submit']")
    public Button applyFilterBtn;

    public FilterTab setMaxPrice(String text){
        System.out.println("Input price in filter: "+ text);
        Utils.scrollJsIntoView(maxPriceInput);
        new WebDriverWait(Driver.getWebDriver(),5).until(ExpectedConditions.visibilityOf(maxPriceInput));
        maxPriceInput.clear();
        maxPriceInput.sendKeys(text);
        return PageObjectManager.getInstance().getFilterTab();
    }

    public FilterTab applyMaxPriceFilter(){
        System.out.println("Apply price filter.");
        new WebDriverWait(Driver.getWebDriver(),5).until(ExpectedConditions.elementToBeClickable(applyFilterBtn));
        applyFilterBtn.click();
        return PageObjectManager.getInstance().getFilterTab();
    }


}
