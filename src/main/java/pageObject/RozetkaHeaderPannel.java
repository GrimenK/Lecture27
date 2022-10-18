package pageObject;

import element.Button;
import element.Input;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;
import webdriver.PageObjectManager;

public class RozetkaHeaderPannel extends AbstractPage {

    @FindBy(xpath = "//input[contains(@class, 'search-form__input')]")
    public Input searchInput;

    @FindBy(xpath = "//button[contains(@class, 'search-form__submit')]")
    public Button searchButton;

    public RozetkaHeaderPannel enterTextInSearchInput(String text){
        new WebDriverWait(Driver.getWebDriver(),5).until(ExpectedConditions.visibilityOf(searchInput));
        searchInput.sendKeys(text);
        return this;
    }

    public CatalogPage clickSearch(){
        new WebDriverWait(Driver.getWebDriver(),5).until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
        return PageObjectManager.getInstance().getCatalogPage();
    }
}
