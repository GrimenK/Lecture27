import org.testng.Assert;
import org.testng.annotations.Test;
import webdriver.PageObjectManager;


public class RozetkaTest extends BaseTest {



    @Test
    public void firstTest(){

        businessObjectManager.getRozetkaMainBO()
                .enterQueryAndSearch("laptop"); //should method return another BO object(like one did in PO)

        businessObjectManager.getCatalogPageBO()
                .setMaximumPriceInFilter(20000);

        businessObjectManager.getCatalogPageBO()
                .selectItemFromCatalogByIndex(1);

        businessObjectManager.getItemPageBO()
                .addItemToCartAndProceedToCheckout();

        Assert.assertTrue(PageObjectManager.getInstance().getCheckoutPage().totalAmountText.getIntValueFromLable() < 20000);

    }

}
