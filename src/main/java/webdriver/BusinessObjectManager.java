package webdriver;

import businessObject.CatalogPageBO;
import businessObject.ItemPageBO;
import businessObject.RozetkaMainBO;

public class BusinessObjectManager {
    private static BusinessObjectManager instance;

    private BusinessObjectManager(){}

    public static BusinessObjectManager getInstance(){
        if(instance == null){
            instance = new BusinessObjectManager();
        }
        return instance;
    }

    private CatalogPageBO catalogPageBO;

    public CatalogPageBO getCatalogPageBO() {
        if(catalogPageBO == null){
            catalogPageBO = new CatalogPageBO();
        }
        return catalogPageBO;
    }

    private ItemPageBO itemPageBO;

    public ItemPageBO getItemPageBO() {
        if(itemPageBO == null){
            itemPageBO = new ItemPageBO();
        }
        return itemPageBO;
    }

    private RozetkaMainBO rozetkaMainBO;

    public RozetkaMainBO getRozetkaMainBO() {
        if(rozetkaMainBO == null){
            rozetkaMainBO = new RozetkaMainBO();
        }
        return rozetkaMainBO;
    }
}
