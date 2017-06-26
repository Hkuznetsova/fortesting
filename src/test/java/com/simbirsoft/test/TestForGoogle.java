package com.simbirsoft.test;

import com.simbirsoft.pages.AuthPage;
import com.simbirsoft.pages.GoogleSearchPage;
import com.simbirsoft.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.google.gson.internal.bind.TypeAdapters.URL;

public class TestForGoogle {
    private WebDriver driver;
    private String googleURL = "http://www.google.com/";
    private String mainURL = "http://localhost:8087/login";
    @BeforeTest

    public void beforeTest() throws MalformedURLException {
        //DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setBrowserName("firefox");
        //URL hubUrl = new URL("http://localhost:4444/wd/hub");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void searchTest() {
        driver.get(googleURL);
        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);
        page.searchFor("Cheese");
    }
    @Test
    public void AuthT () {
        driver.get(mainURL);
        AuthPage authPage = new AuthPage();
        authPage.Auth("username1","12345678",driver);
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getTitle(driver),"hfhjd");
    }

}
