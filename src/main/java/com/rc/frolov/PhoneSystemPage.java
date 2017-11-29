package com.rc.frolov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 29.11.2017.
 */
public class PhoneSystemPage extends BasePage {
    public PhoneSystemPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getText(By elementLocation) {
        return super.getText(By.cssSelector("span.extension-info"));
    }
}
