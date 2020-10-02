package com.practice.reprotTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class DragDropDown extends Capabilities {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = setup();

        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();

//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).property(value)"); syntax
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Drag and Drop\"));");
        driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();

//        long press(source), move to(destination), release
        TouchAction touchAction = new TouchAction(driver);
        WebElement source = driver.findElementsByClassName("android.view.View").get(0);
        WebElement destination = driver.findElementsByClassName("android.view.View").get(1);
        touchAction.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();

    }
}
