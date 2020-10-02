package com.practice.reprotTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;

public class ByFindsByAndroidUIAutomator extends Capabilities{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = setup();

//        ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Views\").instance(0))");
//        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();

//        driver.findElementByAndroidUIAutomator("attribute(value)"); syntax
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

//        driver.findElementByAndroidUIAutomator("new UiSelector().property(value)"); syntax
        List<AndroidElement> ele = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)");
        System.out.println("Total count of clickable elements : " + ele.size());
    }
}
