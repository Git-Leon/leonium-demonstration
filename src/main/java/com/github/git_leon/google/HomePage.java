package com.github.git_leon.google;

import com.git_leon.leonium.browsertools.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends WebPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ResultPage search(String searchQuery) {
        By bySearchBar = By.xpath(".//*[@id='lst-ib']");
        browserHandler.sendKeys(bySearchBar, searchQuery, Keys.ENTER);
        return new ResultPage(driver);

    }
}
