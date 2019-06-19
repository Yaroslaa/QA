
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumGrid {
    static WebDriver webDriver;
    static DesiredCapabilities capabilities;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        capabilities = DesiredCapabilities.chrome();
        webDriver = new RemoteWebDriver(new URL("http://192.168.0.159:6666/wd/hub"),capabilities);
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);
        webDriver.get("https://pn.com.ua/");
    }

    @Test
    public void testTestFirst()
    {
        webDriver.findElement(By.xpath(".//*[@id='column-center']/section/div[1]/a")).click();

    }

    @AfterClass
    public  static void simpleTest()
    {
        webDriver.quit();
    }


}
