package com.sambhav.srp.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created By: Sambhav
 * Created On: 13-08-2020 || 06:20 PM
 * Project Name: SingleResponsibilityPrinciple_Demo
 **/

public class SearchSuggestion extends AbstractComponent {

    @FindBy(css = "li.sbct")
    private List<WebElement> searchSuggestion;

    public SearchSuggestion(final WebDriver driver) {
        super(driver);
    }

    public void clickSuggestionByIndex(int index) {
        this.searchSuggestion.get(index - 1).click();
    }

    public boolean isDisplayed() {
        return this.wait.until((d) -> this.searchSuggestion.size() > 5);        //if more than 5, return true. Till than, just wait.
    }
}
