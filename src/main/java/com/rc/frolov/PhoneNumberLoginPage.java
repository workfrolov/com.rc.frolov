package com.rc.frolov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 29.11.2017.
 */


public class PhoneNumberLoginPage extends BasePage {
    public PhoneNumberLoginPage(WebDriver driver) {
        super(driver);
    }

    RCaccount rcaccount = new RCaccount("","","");
    public void inputExtPin() {
        sendText(By.id("pin"), rcaccount.getExtPin());
    }

    public void inputExtPassword() {
        sendText(By.id("password"), rcaccount.getExtPswd());
    }

    public void ckickSignInButton(){
        click(By.xpath("//button[@data-test-automation-id='signInBtn']"));
    }
}
