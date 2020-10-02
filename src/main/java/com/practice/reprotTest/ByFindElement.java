package com.practice.reprotTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.Preference;
import pageObjects.PreferenceDependencies;

import java.net.MalformedURLException;

public class ByFindElement extends Capabilities{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = setup();

        HomePage homepage = new HomePage(driver);
        Preference preference = new Preference(driver);
        PreferenceDependencies preferenceDependencies = new PreferenceDependencies(driver);

        homepage.Preferences.click();
        preference.preferenceDependencies.click();
        preferenceDependencies.wifiCheckbox.click();
        preferenceDependencies.wifiSettings.click();
        preferenceDependencies.wifiName.sendKeys("Hello");
        preferenceDependencies.okButton.get(1).click();

        //tagName[@attribute="Value"] xPath syntax
//        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
//        driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
//        driver.findElement(By.id("android:id/checkbox")).click();
//        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
//        driver.findElement(By.className("android.widget.EditText")).sendKeys("Hello");
//        driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
//                or
//        driver.findElementsByClassName("android.widget.Button").get(1).click();
    }
}
