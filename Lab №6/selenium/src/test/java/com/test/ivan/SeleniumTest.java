package com.test.ivan;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    static WebDriver webDriver;

    @BeforeClass
    public static void setWebDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.manage().window().fullscreen();
        webDriver.get("https://www.olx.ua/");
    }




    @Test
    public void appleSite(){
        WebElement link=webDriver.findElement(By.className("fleft light large queryfield defaultval with-x-clear-button autosuggest-input {suggesturl:'https://www.olx.ua/ajax/suggest/get/'} ca2"));
        link.sendKeys("notebook");
        link.sendKeys(Keys.ENTER);



    }

@Ignore
    @Test
    public void executeSearch(){
        WebElement search=webDriver.findElement(By.className("x-search__field"));
        search.sendKeys("notebook");
        search.sendKeys(Keys.ENTER);
    }

    @Ignore
    @Test
    public void executeSignUp(){
        WebElement signUp=webDriver.findElement(By.className("x-header__controls-link-text"));
        signUp.sendKeys(Keys.ENTER);
        WebElement login=webDriver.findElement(By.id("phone_email"));
        login.sendKeys("dkfvmfd");
        WebElement pass=webDriver.findElement(By.id("password"));
        pass.sendKeys("svsd");
        WebElement submit=webDriver.findElement(By.className("button__text--ujaS_"));
        submit.sendKeys(Keys.ENTER);
    }



}
