package com.practice.reprotTest;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.time.Duration.ofSeconds;
import java.net.MalformedURLException;

public class Gestures extends Capabilities{

    public static void main(String[] agrs) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = setup();

        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();

        //Tapping the mobile instead of click
        TouchAction touchAction = new TouchAction(driver);

        WebElement expandableLists = driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
        touchAction.tap(tapOptions().withElement(element(expandableLists))).perform();

        WebElement customAdapter = driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']"));
        touchAction.tap(tapOptions().withElement(element(customAdapter))).perform();

        WebElement peopleNames = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        touchAction.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();

        assert driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).isDisplayed();
    }
}
