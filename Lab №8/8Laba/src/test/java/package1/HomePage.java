package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver webDriver;
    @FindBy(xpath = ".//*[@id='column-center']/section/div[1]/a")
    private WebElement computerCategory;

    @FindBy(xpath = ".//*[@id='column-center']section/div[6]/a")
    private WebElement buildingCategory;


    public HomePage(WebDriver webDriver)
    {
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public ComputerPage choiceComputerCategory()
    {
        computerCategory.click();
        return new ComputerPage(webDriver);
    }



}
