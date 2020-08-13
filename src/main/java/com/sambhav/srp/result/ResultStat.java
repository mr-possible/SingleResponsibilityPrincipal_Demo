package com.sambhav.srp.result;

import com.sambhav.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created By: Sambhav
 * Created On: 13-08-2020 || 09:33 PM
 * Project Name: SingleResponsibilityPrinciple_Demo
 **/

public class ResultStat extends AbstractComponent {

    @FindBy(id = "result-stats")
    private WebElement result_stat;

    public ResultStat(final WebDriver driver) {
        super(driver);
    }

    public String getResultStat() {
        return this.result_stat.getText();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.result_stat.isDisplayed());
    }
}
