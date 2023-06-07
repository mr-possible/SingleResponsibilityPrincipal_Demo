package com.sambhav.srp.tests.srp;

import com.sambhav.srp.common.CookiePromptHandler;
import com.sambhav.srp.main.GoogleMainPage;
import com.sambhav.srp.result.GoogleResultPage;
import com.sambhav.srp.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test(dataProvider = "getData")
    public void googleSearchWorkflow(String keyword, int index) {
        GoogleMainPage googleMainPage = new GoogleMainPage(driver);
        GoogleResultPage resultPage = new GoogleResultPage(driver);
        CookiePromptHandler cookiePromptHandler = new CookiePromptHandler(driver);

        //Search for google
        googleMainPage.goTo();

        if(cookiePromptHandler.isDisplayed()) {
            cookiePromptHandler.rejectAndClosePrompt();
        }

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
                {"selenium webdriver", 3}
        };
    }

}
