package com.github.git_leon.owaspjuiceshop;

import com.git_leon.leonium.browsertools.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactUs extends WebPage {
    public ContactUs(WebDriver driver) {
        super(driver);
    }

    public String getUrl() {
        return "https://juice-shop.herokuapp.com/#/contact";
    }

    public void navigateTo() {
        browserHandler.navigateTo(getUrl());
    }

    public void comment(String comment) {
        browserHandler.sendKeys(By.id("comment"), comment);
    }

    public void rate(Integer numberOfStars) {
        if (numberOfStars > 5 || numberOfStars < 1) {
            throw new IllegalArgumentException(new StringBuilder()
                    .append(numberOfStars + "is not a valid number of stars.")
                    .append("Value must range between 1 and 5")
                    .toString());
        }

        By starSelector = By.cssSelector(".br-unit.ng-star-inserted");
        List<WebElement> allStars = browserHandler.getElements(starSelector);
        WebElement selectedStar = allStars.get(numberOfStars);
        selectedStar.click();
    }
}
