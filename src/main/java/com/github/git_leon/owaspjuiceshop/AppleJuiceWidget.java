package com.github.git_leon.owaspjuiceshop;

import com.git_leon.leonium.browsertools.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author leon on 4/10/18.
 */
public class AppleJuiceWidget extends WebPage {
    public AppleJuiceWidget(WebDriver web) {
        super(web);
    }


    public void leaveProductReview(String reviewMessage) {
        By byInputProductReview = By.id("mat-input-1");
        By byButtonSubmit = By.id("submitButton");
        browserHandler.sendKeys(byInputProductReview, reviewMessage);
        browserHandler.click(byButtonSubmit);
    }

    public void spam(Integer numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            leaveProductReview("This is such an awesome tool.");
            leaveProductReview("I am testing a selenium bot.");
        }
    }
}
