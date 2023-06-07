package com.sambhav.srp.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CookiePromptHandler extends AbstractComponent {

    @FindBy(xpath = "//div[text()='Reject all']/..")
    private WebElement rejectButton;

    public CookiePromptHandler(final WebDriver driver) {
        super(driver);
    }

    public void rejectAndClosePrompt() {
        this.rejectButton.click();
    }

    @Override
    public boolean isDisplayed() {
        this.wait.until(ExpectedConditions.elementToBeClickable(this.rejectButton));
        return this.rejectButton.isDisplayed();
    }
}
