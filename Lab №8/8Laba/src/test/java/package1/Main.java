package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Main {
    public static void main(String args[])
    {
        String siteHomePage = "https://pn.com.ua/";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(siteHomePage);
        HomePage homePage;
        ComputerPage computerPage;
        homePage = PageFactory.initElements(webDriver,HomePage.class);
        computerPage = homePage.choiceComputerCategory();
    }
}
