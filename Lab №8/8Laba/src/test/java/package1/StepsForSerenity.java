package package1;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class StepsForSerenity {

    public HomePage homePage;
    public WebDriver webDriver;
    public ComputerPage computerPage;
    public String siteHomePage = "https://pn.com.ua/";

    @Step("Given the user visits a page{0}")
    public void a_user_visits_a_page(String homePage)
    {
        this.siteHomePage = homePage;
    }

    @Step("When the user chooses category Computer {0}")
    public void the_user_chooses_category_Computer()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        webDriver = new ChromeDriver();
        homePage = new HomePage(webDriver);
        webDriver.get(siteHomePage);
        computerPage = homePage.choiceComputerCategory();
    }

    @Step("When the user sees {0} subcategory")
    public void the_user_can_see_subcategory_ITServise(String subcategory)
    {
        assertThat(computerPage.getTextITService()).overridingErrorMessage("testComputercategory failded").contains(subcategory);
        webDriver.quit();
    }

}
