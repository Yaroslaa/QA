import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class L6T1 {
    static ChromeDriver driver;

    List<WebElement> nameElem;
    int numberPages;
    boolean condition = true;

    @BeforeClass

    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver", "D:\\Универ\\2 курс -4сем-\\QA\\6\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://pn.com.ua/");

    }

    @Test

    public void test1() {
        driver.findElement(By.xpath(".//*[@id='column-center']/section/div[5]/ul/li[1]/a")).click();
        driver.findElement(By.xpath(".//*[@id='producers-filter-block']/div[3]/span[3]/a")).click();

        nameElem = driver.findElements(By.xpath(".//*[@id='column-center']/section/div[3]/ul/li/article/div[2]/div[1]/a"));

        for(int i=0; i<nameElem.size()-1;i++){

            String labelSofa = nameElem.get(i).getText(); String brandSofa = "AMF";

            char[] brandlabelSofa = labelSofa.toCharArray(); char[] brandSofaa = brandSofa.toCharArray(); for (int j=0;j<brandSofaa.length;j++){
                if(brandlabelSofa[j]!=brandSofaa[j]){
                    condition = false;
                }}}Assert.assertEquals(condition,true);}

    @AfterClass
    public static void closeWeb(){
        driver.close();}}