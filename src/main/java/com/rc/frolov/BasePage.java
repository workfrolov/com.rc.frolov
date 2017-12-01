package com.rc.frolov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 29.11.2017.
 */
public class BasePage {
    static String driverPath = "C:\\Users\\user\\chromedriver\\";
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        this.driver = driver;
    }

    public void click(By elemenLocation) {
        driver.findElement(elemenLocation).click();

    }

    public void sendText(By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);

    }

    public String getText(By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }
}