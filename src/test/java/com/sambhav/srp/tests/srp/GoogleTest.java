package com.sambhav.srp.tests.srp;

import com.sambhav.srp.main.GoogleMainPage;
import com.sambhav.srp.result.GoogleResultPage;
import com.sambhav.srp.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created By: Sambhav
 * Created On: 13-08-2020 || 10:03 PM
 * Project Name: SingleResponsibilityPrinciple_Demo
 **/
public class GoogleTest extends BaseTest {
    //Here, we have two page objects:   1) Search page    2) Result Page

    private GoogleMainPage googleMainPage;
    private GoogleResultPage resultPage;

    @BeforeTest
    public void setupPages() {
        this.googleMainPage = new GoogleMainPage(driver);
        this.resultPage = new GoogleResultPage(driver);
    }

    @Test(dataProvider = "getData")
    public void googleSearchWorkflow(String keyword, int index) {
        //Search for google
        googleMainPage.goTo();

        //Check if search box is Displayed
        Assert.assertTrue(googleMainPage.getSearchBox().isDisplayed());

        //Search for keyword
        googleMainPage.getSearchBox().enter(keyword);

        //Wait for suggestions
        Assert.assertTrue(googleMainPage.getSearchSuggestion().isDisplayed());
        googleMainPage.getSearchSuggestion().clickSuggestionByIndex(index);

        //After landing on result page.
        Assert.assertTrue(resultPage.getNavBar().isDisplayed());

        //Print the result of the count
        System.out.println(resultPage.getStat().getResultStat());
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"selenium webdriver", 3},
                {"java se 8", 3}
        };
    }

}
