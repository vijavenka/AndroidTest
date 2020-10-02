package com.practice.reprotTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class Scrolling extends Capabilities{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = setup();

        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();

//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).property(value)"); syntax
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
        driver.findElement(By.xpath("//android.widget.TextView[@text='WebView']")).click();
    }
}
