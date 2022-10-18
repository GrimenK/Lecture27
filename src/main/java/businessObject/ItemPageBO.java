package businessObject;

import pageObject.CartPopup;
import pageObject.ItemPage;
import webdriver.PageObjectManager;

public class ItemPageBO {
    ItemPage itemPage;
    CartPopup cartPopup;

    public ItemPageBO(){
        itemPage = PageObjectManager.getInstance().getItemPage();
        cartPopup = PageObjectManager.getInstance().getCartPopup();
    }

    public void addItemToCartAndProceedToCheckout(){
        System.out.println("Add item to cart and proceed to checkout.");
        itemPage
                .clickBuyBtn()
                .clickBuyBtnPopup();
    }


}
