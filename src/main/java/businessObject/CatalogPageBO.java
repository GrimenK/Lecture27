package businessObject;

import pageObject.CatalogPage;
import pageObject.FilterTab;
import webdriver.PageObjectManager;

public class CatalogPageBO {
    FilterTab filterTab;
    CatalogPage catalogPage;

    public CatalogPageBO(){
        filterTab = PageObjectManager.getInstance().getFilterTab();
        catalogPage = PageObjectManager.getInstance().getCatalogPage();
    }

    public void setMaximumPriceInFilter(int price){
        System.out.println("Set maximum price.");
        filterTab
                .setMaxPrice(String.valueOf(price))
                .applyMaxPriceFilter();
        // return this BO object???
    }

    public void selectItemFromCatalogByIndex(int index){
        System.out.println("Select item.");
        catalogPage
                .chooseItem(index);
    }

}
