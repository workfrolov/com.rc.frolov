package com.rc.frolov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 29.11.2017.
 */
public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
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

//http://www.swtestacademy.com/page-object-model-java/