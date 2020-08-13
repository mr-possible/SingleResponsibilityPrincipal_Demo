package com.sambhav.srp.result;

import com.sambhav.srp.common.SearchSuggestion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created By: Sambhav
 * Created On: 13-08-2020 || 09:43 PM
 * Project Name: SingleResponsibilityPrinciple_Demo
 **/
public class GoogleResultPage {

    // This result page has:  1)Nav Bar    2) Search Suggestion    3) Result count status

    private WebDriver driver;
    private NavigationBar navBar;
    private SearchSuggestion searchSuggestion;
    private ResultStat resultStat;

    public GoogleResultPage(final WebDriver driver) {
        this.driver = driver;
        this.navBar = PageFactory.initElements(driver, NavigationBar.class);
        this.resultStat = PageFactory.initElements(driver, ResultStat.class);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    public NavigationBar getNavBar() {
        return navBar;
    }

    public ResultStat getStat() {
        return resultStat;
    }
}
