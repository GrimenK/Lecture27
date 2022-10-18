package element;

import org.openqa.selenium.WebElement;

public class TextLable extends AbstractElement{

    public TextLable(WebElement element){
        super(element);
    }

    public int getIntValueFromLable(){
        return Integer.parseInt(webElement.getText().replaceAll("\\D",""));
    }
}
