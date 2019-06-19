import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test1 {

    private static WebDriver webDriver;
    private List<WebElement> elements;

    @BeforeClass
    public static void SetDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        webDriver =new ChromeDriver();
        webDriver.get("https://pn.com.ua/");
    }

    @Test
    public void test1()
    {
        elements = new ArrayList<WebElement>();
        HomePage homePage;
        HolodosPage holodosPage;
        EqualsHolodos equals;
        homePage = PageFactory.initElements(webDriver,HomePage.class);
        holodosPage = homePage.choiceHolodosCategory();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        holodosPage.SetHolodos();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("compare"));
        equals = holodosPage.choiceHolodosCategory();
        //System.out.println(equals.getCountElement());
        Assert.assertTrue(equals.getCountElement() == 2);
    }

    @AfterClass
    public static void EndWork(){
        webDriver.close();
    }
}
