package com.simbirsoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Пользователь on 26.06.2017.
 */
public class AuthPage {

    By username = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("");

    public void Auth(String login, String pass, WebDriver driver) {
        driver.findElement(username).sendKeys(login);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();

    }
}
