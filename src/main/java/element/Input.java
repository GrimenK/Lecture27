package element;

import org.openqa.selenium.WebElement;

public class Input extends AbstractElement{

    public Input(WebElement element){
        super(element);
    }

    @Override
    public void sendKeys(CharSequence... charSequences){
        webElement.clear();
        webElement.sendKeys(charSequences);
    }

}
