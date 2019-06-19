package package2;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepsForSerenity {

    public WebDriver webDriver;
    public HomePage homePage;
    public HolodosPage holodosPage;
    public EqualsHolodos equalsHolodos;
    public String siteHomePage = "https://pn.com.ua/";

    @Step("Given the user visits a page{0}")
    public void a_user_visits_a_page(String homePage)
    {
        this.siteHomePage = homePage;
    }

    @Step("When the user chooses category Holodos {0}")
    public void the_user_chooses_category_Holodos()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Downloads/chromedriver.exe");
        webDriver = new ChromeDriver();
        homePage = new HomePage(webDriver);
        webDriver.get(siteHomePage);
        holodosPage = homePage.choiceHolodosCategory();
    }

    @Step("after user chooses category Holodos {0}")
    public void a_user_choose_holodos()
    {
        holodosPage.SetHolodos();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("compare"));

    }

    @Step("Given equal page{0}")
    public void a_user_visit_equal_page(){
        equalsHolodos = holodosPage.choiceHolodosCategory();

    }

    @Step("When user see equal page")
    public void a_user_see_equal_page()
    {
        Assert.assertTrue(equalsHolodos.getCountElement() == 2);
        webDriver.quit();
    }

}
