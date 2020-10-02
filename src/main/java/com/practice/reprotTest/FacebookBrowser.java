package com.practice.reprotTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class FacebookBrowser extends CapabilitiesChrome{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = setup();
        driver.get("https://m.facebook.com/");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("#m_login_email")).isDisplayed();
        driver.findElement(By.cssSelector("#m_login_email")).sendKeys("vijavenka@gmail.com");

        driver.findElement(By.cssSelector("#m_login_password")).sendKeys("candy*vij");
        driver.findElement(By.cssSelector("#login_form > div._2pie")).click();
    }
}
