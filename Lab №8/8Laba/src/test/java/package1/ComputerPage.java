package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
    private WebDriver webDriver;
    @FindBy(xpath = ".//*[@id='column-center']/section/div[4]/article[3]/div/div")
    private WebElement ITService;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div/div[1]/ul/li[1]/a/span")
    private WebElement returnHomePage;

    public ComputerPage(WebDriver webDriver)
    {
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public HomePage returnHomePage()
    {
        returnHomePage.click();
        return new HomePage(webDriver);

    }

    public String getTextITService(){
        return  ITService.getText();
    }

}
