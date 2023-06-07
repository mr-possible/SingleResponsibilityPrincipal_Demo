package com.sambhav.srp.result;

import com.sambhav.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created By: Sambhav
 * Created On: 13-08-2020 || 06:27 PM
 * Project Name: SingleResponsibilityPrinciple_Demo
 **/

public class NavigationBar extends AbstractComponent {

    @FindBy(id = "hdtb-msb")
    private WebElement navbar;

    @FindBy(linkText = "News")
    private WebElement news;

    @FindBy(linkText = "Images")
    private WebElement images;

    public NavigationBar(final WebDriver driver) {
        super(driver);
    }

    public void goToImages(){
        this.images.click();
    }

    public void goToNews(){
        this.news.click();
    }

    public boolean isDisplayed() {
        this.wait.until(ExpectedConditions.visibilityOf(this.navbar));
        return this.navbar.isDisplayed();
    }
}
