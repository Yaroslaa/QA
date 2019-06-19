import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EqualsHolodos {
    private WebDriver webDriver;

    @FindBy(xpath = "//div[contains(@class, 'goods-box')]/div[contains(@class, 'item')]")
    private List<WebElement> elements;

    public EqualsHolodos(WebDriver webDriver)
    {
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver,this);
    }
    public int getCountElement()
    {
       /*List<WebElement> element12=new ArrayList<WebElement>();
        element12.addAll(elements);*/
        return elements.size();
    }

}
