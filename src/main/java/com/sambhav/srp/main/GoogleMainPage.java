package com.sambhav.srp.main;

import com.sambhav.srp.common.SearchBox;
import com.sambhav.srp.common.SearchSuggestion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class GoogleMainPage {

    private WebDriver driver;
    private final SearchBox searchBox;
    private final SearchSuggestion searchSuggestion;

    public GoogleMainPage(final WebDriver driver) {
        this.driver = driver;
        this.searchBox = PageFactory.initElements(driver, SearchBox.class);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
    }

    public void goTo() {
        this.driver.get("https://www.google.com");
    }

    public SearchBox getSearchBox() {
        return searchBox;
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }
}
