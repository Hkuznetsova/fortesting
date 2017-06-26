package com.simbirsoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Пользователь on 26.06.2017.
 */
public class MainPage {
    By title = By.name("");

    public String getTitle(WebDriver driver) {
        return driver.findElement(title).getText();
    }
}
