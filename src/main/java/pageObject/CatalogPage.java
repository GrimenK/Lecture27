package pageObject;

import java.util.List;

import element.TextLable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;
import webdriver.PageObjectManager;
import webdriver.Utils;


public class CatalogPage extends AbstractPage {


    @FindBy(xpath = "//a[contains(@class, 'goods-tile__picture')]")
    public List<WebElement> catalogItem;

    @FindBy(xpath = "//h1")
    public TextLable titlePage;

    public ItemPage chooseItem(int index){
        System.out.println("Item selected from catalog, item index: " + index);
        new WebDriverWait(Driver.getWebDriver(),10).until(ExpectedConditions.elementToBeClickable(catalogItem.get(index)));
        Utils.scrollJsIntoView(catalogItem.get(index));

        new WebDriverWait(Driver.getWebDriver(),10).until(ExpectedConditions.elementToBeClickable(catalogItem.get(index)));
        Utils.jsClickElement(catalogItem.get(index));

        return PageObjectManager.getInstance().getItemPage();
    }
}
