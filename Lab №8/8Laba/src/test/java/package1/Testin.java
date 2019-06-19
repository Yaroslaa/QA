package package1;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class Testin {
    static String siteHomePage = "https://pn.com.ua/";
    private static WebDriver webDriver;
    private  HomePage homePage;
    private  ComputerPage computerPage;

    @BeforeClass
    public static void testBeforeClass(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get(siteHomePage);
    }

    @Test
    public  void testComputerCategory()
    {
        homePage= PageFactory.initElements(webDriver,HomePage.class);
        computerPage=homePage.choiceComputerCategory();
        System.out.println(computerPage.getTextITService());
        computerPage.getTextITService();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        assertThat(computerPage.getTextITService().contains("IT услуги"));
    }


}
