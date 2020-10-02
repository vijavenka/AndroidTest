package com.practice.reprotTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import static java.time.Duration.ofSeconds;

public class Swipe extends Capabilities{

//    mentor@rahulshettyacademy.com
//    rahulonlinetutor@gmailcom
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = setup();

        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        driver.findElement(By.xpath("//*[@content-desc='9']")).click();

        //swipe
        //long press 2sec, move to another location and release
        TouchAction touchAction = new TouchAction(driver);
        WebElement first = driver.findElement(By.xpath("//*[@content-desc='15']"));
        WebElement second = driver.findElement(By.xpath("//*[@content-desc='45']"));
        touchAction.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
    }
}
