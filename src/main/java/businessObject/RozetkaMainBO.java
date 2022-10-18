package businessObject;

import pageObject.RozetkaHeaderPannel;
import webdriver.PageObjectManager;

public class RozetkaMainBO {
    RozetkaHeaderPannel rozetkaHeader;

    public RozetkaMainBO(){
        rozetkaHeader = PageObjectManager.getInstance().getRozetkaHeaderPannel();
    }

    public void enterQueryAndSearch(String request){
        System.out.println("Enter search query.");
        rozetkaHeader
                .enterTextInSearchInput(request)
                .clickSearch();
    }

}
