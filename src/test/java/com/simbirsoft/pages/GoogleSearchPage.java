package com.simbirsoft.pages;

import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    private WebElement q;

    public void searchFor(String text)  {
        q.sendKeys(text);
        q.submit();
    }
}
