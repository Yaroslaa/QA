import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolodosPage {
    private WebDriver webDriver;
    @FindBy(xpath = "//article[contains(@class,'item td-table')][1]//a[contains(@class,'add-to-compare-link')][1]")
    private WebElement firstHolodos;

    @FindBy(xpath ="//article[contains(@class,'item td-table')][2]//a[contains(@class,'add-to-compare-link')][1]" )
    private WebElement secondHolodos;

    @FindBy(linkText = "сравнить")
    private WebElement equals;

    public HolodosPage(WebDriver webDriver)
    {
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void SetHolodos(){
        firstHolodos.click();
        secondHolodos.click();
        equals.click();
    }
    public EqualsHolodos choiceHolodosCategory()
    {
        return new EqualsHolodos(webDriver);
    }

}
