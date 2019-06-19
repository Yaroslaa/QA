package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver webDriver;
    @FindBy(linkText = "Холодильники")
    private WebElement holodos;

    public HomePage(WebDriver webDriver)
    {
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public HolodosPage choiceHolodosCategory()
    {
        holodos.click();
        return new HolodosPage(webDriver);
    }
}
