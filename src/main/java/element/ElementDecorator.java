package element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import javax.xml.bind.Element;
import java.lang.reflect.Field;

public class ElementDecorator extends DefaultFieldDecorator {

    public ElementDecorator(ElementLocatorFactory factory) {
        super(factory);
    }

    @Override
    public Object decorate(ClassLoader classLoader, Field field){
        if(field.getType().equals(Button.class)){
            ElementLocator elementLocator = factory.createLocator(field);
            if(elementLocator == null){
                return null;
            }
            return new Button(proxyForLocator(classLoader,elementLocator));
        }
        else if (field.getType().equals(Input.class)){
            ElementLocator elementLocator = factory.createLocator(field);
            if(elementLocator == null){
                return null;
            }
            return new Input(proxyForLocator(classLoader,elementLocator));
        }
        else if (field.getType().equals(TextLable.class)){
            ElementLocator elementLocator = factory.createLocator(field);
            if(elementLocator == null){
                return null;
            }
            return new TextLable(proxyForLocator(classLoader,elementLocator));
        }
        return super.decorate(classLoader,field);
    }
}
