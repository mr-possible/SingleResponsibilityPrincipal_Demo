package com.sambhav.srp.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created By: Sambhav
 * Created On: 13-08-2020 || 11:05 AM
 * Project Name: SingleResponsibilityPrinciple_Demo
 **/

public abstract class AbstractComponent {

    public WebDriverWait wait;

    public AbstractComponent(WebDriver driver) {
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public abstract boolean isDisplayed();

}