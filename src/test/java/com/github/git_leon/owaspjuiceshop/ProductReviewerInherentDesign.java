package com.github.git_leon.owaspjuiceshop;

import com.git_leon.leonium.browsertools.WebCrawl;
import com.git_leon.leonium.browsertools.factories.BrowserHandlerFactory;

/**
 * @author leon on 4/10/18.
 */
public class ProductReviewerInherentDesign extends WebCrawl {
    @Override
    public void test() {
        SearchPage searchPage = new SearchPage(BrowserHandlerFactory.FIREFOX.getDriver());
        searchPage.navigateTo();
        searchPage.selectLanguage("English");
        searchPage.search("apple");
        searchPage.clickSearch();
        AppleJuiceWidget appleJuiceWidget = searchPage.clickAppleJuice();
        appleJuiceWidget.leaveProductReview("This is a product review");
        super.driver.close();
    }
}
