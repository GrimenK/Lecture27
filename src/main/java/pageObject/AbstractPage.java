package pageObject;

import element.ElementDecorator;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import webdriver.Driver;



public abstract class AbstractPage {

    public AbstractPage(){
        PageFactory.initElements(new ElementDecorator(new DefaultElementLocatorFactory(Driver.getWebDriver())), this);
    }

}
