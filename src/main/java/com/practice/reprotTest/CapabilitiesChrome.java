package com.practice.reprotTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CapabilitiesChrome {

//    static AppiumDriver driver;
    static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> setup() throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator"); //Works in emulator
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "0797818a87d4f5cb"); // Device for chrome

        cap.setCapability(MobileCapabilityType.VERSION, "10.0");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        cap.setCapability("chromedriverExecutable",System.getProperty("user.dir")+"/src/main/driver/chromedriver");

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

        return driver;
    }
}
