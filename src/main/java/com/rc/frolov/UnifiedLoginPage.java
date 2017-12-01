package com.rc.frolov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 29.11.2017.
 */
public class UnifiedLoginPage extends BasePage {
    public UnifiedLoginPage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "https://service-amsup.lab.nordigy.ru/";

    public void unifiedLoginPageOpen() {
        driver.get(baseURL);
    }

    RCaccount rcaccount = new RCaccount("", "", "");

    public void inputPhoneNumber() {
        sendText(By.id("credential"), rcaccount.getMainNumber());
    }

    public void ckickNextButton() {
        click(By.xpath("//button[@data-test-automation-id='loginCredentialNext']"));
    }
}
