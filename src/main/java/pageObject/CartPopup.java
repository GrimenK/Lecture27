package pageObject;

import element.Button;
import element.TextLable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;
import webdriver.PageObjectManager;

public class CartPopup extends AbstractPage {

    @FindBy(xpath = "//div[contains(@class, 'cart-receipt')]//a")
    public Button buyBtn;

    @FindBy(xpath = "//div[contains(@class, 'cart-receipt')]//a")
    public TextLable sumText;

    public CheckoutPage clickBuyBtnPopup(){
        System.out.println("Click proceed to checkout on cart popup. ");
        new WebDriverWait(Driver.getWebDriver(),5).until(ExpectedConditions.elementToBeClickable(buyBtn));
        buyBtn.click();
        return PageObjectManager.getInstance().getCheckoutPage();
    }
}
