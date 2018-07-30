package com.github.git_leon.owaspjuiceshop;

import com.git_leon.leonium.browsertools.factories.BrowserHandlerFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ProductReviewerCompositeDesign {
    @Test
    public void test() {
        WebDriver webDriver = BrowserHandlerFactory.FIREFOX.getDriver();
        SearchPage searchPage = new SearchPage(webDriver);
        searchPage.navigateTo();
        searchPage.selectLanguage("English");
        searchPage.search("apple");
        searchPage.clickSearch();
        AppleJuiceWidget appleJuiceWidget = searchPage.clickAppleJuice();
        appleJuiceWidget.leaveProductReview("This is a product review");
        webDriver.close();
    }
}
