package com.rc.frolov.tests;

import com.rc.frolov.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import javax.crypto.spec.RC2ParameterSpec;
@Test
public class SWloginTest extends BaseTest{
    public void systemUserLoginSW(){
        RCaccount rcaccount = new RCaccount("(678) 744-0130", "Test!123", "101");
        UnifiedLoginPage unifiedLoginPage = new UnifiedLoginPage(driver);
        LoginPageLink loginPageLink = new LoginPageLink("https://service-amsup.lab.nordigy.ru/");
        PhoneNumberLoginPage phoneNumberLoginPage = new PhoneNumberLoginPage(driver);
        PhoneSystemPage phoneSystemPage = new PhoneSystemPage(driver);

        unifiedLoginPage.goToUnifiedLoginPage();
        unifiedLoginPage.inputPhoneNumber();
        unifiedLoginPage.ckickNextButton();

        phoneNumberLoginPage.inputExtPin();
        phoneNumberLoginPage.inputExtPassword();
        phoneNumberLoginPage.ckickSignInButton();

        phoneSystemPage.getText(By.cssSelector("span.extension-info"));
    }

}
