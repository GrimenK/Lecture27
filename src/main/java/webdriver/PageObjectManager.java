package webdriver;

import pageObject.*;

public class PageObjectManager {
    private static PageObjectManager instance;

    private PageObjectManager(){}

    public static PageObjectManager getInstance(){
        if(instance == null){
            instance = new PageObjectManager();
        }
        return instance;
    }

    private RozetkaHeaderPannel rozetkaHeaderPannel;
    public RozetkaHeaderPannel getRozetkaHeaderPannel(){if (rozetkaHeaderPannel== null){rozetkaHeaderPannel = new RozetkaHeaderPannel();} return rozetkaHeaderPannel;}

    private CatalogPage catalogPage;
    public CatalogPage getCatalogPage(){if (catalogPage== null){catalogPage = new CatalogPage();} return catalogPage;}

    private CartPopup cartPopup;
    public CartPopup getCartPopup(){if (cartPopup== null){cartPopup = new CartPopup();} return cartPopup;}

    private ItemPage itemPage;
    public ItemPage getItemPage(){if (itemPage== null){itemPage = new ItemPage();} return itemPage;}

    private CheckoutPage checkoutPage;
    public CheckoutPage getCheckoutPage(){if (checkoutPage== null){checkoutPage = new CheckoutPage();} return checkoutPage;}

    private FilterTab filterTab;
    public FilterTab getFilterTab(){if (filterTab== null){filterTab = new FilterTab();} return filterTab;}

}
