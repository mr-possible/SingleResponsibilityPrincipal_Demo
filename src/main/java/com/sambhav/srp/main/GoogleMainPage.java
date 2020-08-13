package com.sambhav.srp.main;

import com.sambhav.srp.common.SearchBox;
import com.sambhav.srp.common.SearchSuggestion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created By: Sambhav
 * Created On: 13-08-2020 || 09:37 PM
 * Project Name: SingleResponsibilityPrinciple_Demo
 **/
public class GoogleMainPage {

    //This main page contains two elements/ components : 1) Search Icon/Box      2) Search Suggestion

    private WebDriver driver;
    private SearchBox searchBox;
    private SearchSuggestion searchSuggestion;

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
