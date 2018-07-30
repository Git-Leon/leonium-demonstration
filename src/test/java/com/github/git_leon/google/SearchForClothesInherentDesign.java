package com.github.git_leon.google;

import com.git_leon.leonium.browsertools.WebCrawl;

public class SearchForClothesInherentDesign extends WebCrawl {
    public void test() {
        browserHandler.navigateTo("https://www.google.com");
        HomePage homePage = new HomePage(super.driver);
        ResultPage resultPage = homePage.search("trendy modern clothes");
        resultPage.clickResult(1);
        browserHandler.screenshot();
        super.driver.close();
    }
}
