package com.github.git_leon.owaspjuiceshop;

import com.git_leon.leonium.browsertools.factories.BrowserHandlerFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ContactUsRating {
    @Test
    public void test() {
        WebDriver webDriver = BrowserHandlerFactory.FIREFOX.getDriver();
        ContactUs contactUsPage = new ContactUs(webDriver);
        contactUsPage.navigateTo();
        for (Integer i= 1; i < 5; i++) {
            contactUsPage.rate(i);
            contactUsPage.comment("Test number " + i);
        }
        webDriver.close();
    }
}
