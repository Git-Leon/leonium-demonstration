package com.github.git_leon.owaspjuiceshop;

import com.git_leon.leonium.browsertools.WebCrawl;

/**
 * @author leon on 4/10/18.
 */
public class ProductReviewerInherentDesign extends WebCrawl {
    @Override
    public void test() {
        SearchPage searchPage = new SearchPage(super.driver);
        searchPage.navigateTo();
        searchPage.selectLanguage("English");
        searchPage.search("apple");
        searchPage.clickSearch();
        AppleJuiceWidget appleJuiceWidget = searchPage.clickAppleJuice();
        appleJuiceWidget.leaveProductReview("This is a product review");
    }
}
