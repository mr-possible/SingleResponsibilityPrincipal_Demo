package com.sambhav.srp.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {
    public WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        this.driver = WebDriverManager.chromedriver().create();
    }

    @AfterTest
    public void quit() throws InterruptedException {
        Thread.sleep(3000);
        this.driver.quit();
    }
}
