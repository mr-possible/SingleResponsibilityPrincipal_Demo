package com.sambhav.srp.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created By: Sambhav
 * Created On: 13-08-2020 || 06:02 PM
 * Project Name: SingleResponsibilityPrinciple_Demo
 **/

public class SearchBox extends AbstractComponent {

    @FindBy(name = "q")
    private WebElement searchBox;

    public SearchBox(final WebDriver driver) {
        super(driver);
    }

    public void enter(String keyword) {
        this.searchBox.clear();
        this.searchBox.sendKeys(keyword);
    }

    public boolean isDisplayed() {
        this.wait.until(ExpectedConditions.visibilityOf(this.searchBox));
        return this.searchBox.isDisplayed();
    }
}
