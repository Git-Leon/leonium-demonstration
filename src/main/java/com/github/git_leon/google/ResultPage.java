package com.github.git_leon.google;

import com.git_leon.leonium.browsertools.WebPage;
import com.git_leon.leonium.browsertools.With;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPage extends WebPage {
    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getResults() {
        return browserHandler.getElements(With.tagAttributeValue("h3", "class", "r"));
    }

    public WebElement getResult(int resultNumber) {
        return getResults().get(resultNumber);
    }

    public WebPage clickResult(int resultNumber) {
        getResult(resultNumber).click();
        return null; // TODO - Return appropriate WebPage
    }
}
