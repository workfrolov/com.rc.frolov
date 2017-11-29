package com.rc.frolov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 29.11.2017.
 */
public class UnifiedLoginPage extends BasePage {

    public UnifiedLoginPage(WebDriver driver) {
        super(driver);
    }

    LoginPageLink LoginPageLink = new LoginPageLink("");
    public void goToUnifiedLoginPage() {
        driver.get(LoginPageLink.getLPLink());
    }

    RCaccount RCaccount = new RCaccount("","","");
    public void inputPhoneNumber() {
        sendText(By.id("credential"), RCaccount.getMainNumber());
    }

    public void ckickNextButton(){
        click(By.xpath("//button[@data-test-automation-id='loginCredentialNext']"));
    }
}
