package com.rc.frolov.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 29.11.2017.
 */
public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void setDriver() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\com.rc.frolov\\resources\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
