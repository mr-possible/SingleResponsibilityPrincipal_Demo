package com.sambhav.srp.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created By: Sambhav
 * Created On: 13-08-2020 || 09:51 PM
 * Project Name: SingleResponsibilityPrinciple_Demo
 **/

public class BaseTest {
    //This class will serve as a common class for instantiating and quiting the webdriver instance.

    protected WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sambhav\\Desktop\\SingleResponsibilityPrinciple_Demo\\Browser Drivers\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    @AfterTest
    public void quit() throws InterruptedException {
        Thread.sleep(3000);
        this.driver.quit();
    }
}
