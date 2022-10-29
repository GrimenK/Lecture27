package pageObject;

import element.Button;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;
import webdriver.PageObjectManager;

public class ItemPage extends AbstractPage {

    @FindBy(xpath = "//ul[@class = 'product-buttons']//span[@class = 'buy-button__label ng-star-inserted']")
    public Button buyBtn;

    @FindBy(xpath = "//h1[@class = 'product__title']")
    public Button itemPageTitle;

    public CartPopup clickBuyBtn(){
        System.out.println("Click add to cart on item page.");
        new WebDriverWait(Driver.getWebDriver(),5).until(ExpectedConditions.visibilityOf(buyBtn));
        buyBtn.click();
        return PageObjectManager.getInstance().getCartPopup();
    }
}
