//package com.rc.frolov.tests;
//
//import com.rc.frolov.LoginPageLink;
//import com.rc.frolov.RCaccount;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * Created by user on 29.11.2017.
// */
//public class LoginTests {
//
//    private RCaccount account = new RCaccount("(678) 744-0130", "101", "Test!123");
//    private LoginPageLink loginPageLink = new LoginPageLink("https://service-amsup.lab.nordigy.ru/");
//
//
//    static final Logger LOGGER = LoggerFactory.getLogger(LoginTests.class);
//    private static WebDriver driver;
//
//    @BeforeTest
//    public static void setDriver() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
//    @Test
//    public void swLogin() {
//        driver.get(loginPageLink.getLPLink());
//        LOGGER.info(driver.getCurrentUrl());
//
//        WebElement enterCredentialValue = driver.findElement(By.id("credential"));
//        enterCredentialValue.sendKeys(account.getMainNumber());   //mainNumber
//
//        WebElement enterCredentialNextButton = driver.findElement(By.xpath("//button[@data-test-automation-id='loginCredentialNext']"));
//        enterCredentialNextButton.click();
//
//        WebElement extPin = driver.findElement(By.id("pin"));
//        extPin.sendKeys(account.getExtPin()); //extPin
//
//        WebElement extPswd = driver.findElement(By.id("password"));
//        extPswd.sendKeys(account.getExtPswd()); //extPswd
//
//        WebElement signInButton = driver.findElement(By.cssSelector("button[data-test-automation-id=signInBtn]"));
//        signInButton.click();
//
//        String accountInfo = driver.findElement(By.cssSelector("span.extension-info")).getText();
//        Assert.assertEquals(accountInfo, "(678) 744-0130" + " Ext. " + "101", accountInfo);
//
//        LOGGER.info(driver.findElement(By.cssSelector("span.extension-info")).getText());
//
//    }
//    @AfterTest
//    public static void closeDriver() {
//        driver.quit();
//    }
//}
//