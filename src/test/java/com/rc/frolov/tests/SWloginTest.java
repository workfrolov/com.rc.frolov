package com.rc.frolov.tests;

import com.rc.frolov.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.rc.frolov.UnifiedLoginPage;


import javax.crypto.spec.RC2ParameterSpec;

public class SWloginTest extends BaseTest {

    //@Test
    //public void openLp() {
//        UnifiedLoginPage unifiedLoginPage = new UnifiedLoginPage(driver);
//        unifiedLoginPage.unifiedLoginPageOpen();
//    }
    RCaccount rcaccount = new RCaccount("(678) 744-0130", "Test!123", "101");
    UnifiedLoginPage unifiedLoginPage = new UnifiedLoginPage(driver);
    //LoginPageLink loginPageLink = new LoginPageLink(driver);
    PhoneNumberLoginPage phoneNumberLoginPage = new PhoneNumberLoginPage(driver);
    PhoneSystemPage phoneSystemPage = new PhoneSystemPage(driver);

    @Test
    public void systemUserLoginSW() {


        unifiedLoginPage.unifiedLoginPageOpen();
        unifiedLoginPage.inputPhoneNumber();
        unifiedLoginPage.ckickNextButton();

        phoneNumberLoginPage.inputExtPin();
        phoneNumberLoginPage.inputExtPassword();
        phoneNumberLoginPage.ckickSignInButton();

        phoneSystemPage.getText(By.cssSelector("span.extension-info"));
    }

}
