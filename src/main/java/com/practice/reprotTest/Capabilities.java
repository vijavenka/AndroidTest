package com.practice.reprotTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

//    static AppiumDriver driver;
    static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> setup() throws MalformedURLException, InterruptedException {

        File f = new File("src");
        File fs = new File(f, "ApiDemos-debug.apk"); //Works by installing apk

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator"); //Works in emulator
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device"); //Works in physical device
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
        cap.setCapability(MobileCapabilityType.VERSION, "9.0");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
        
        //Already app is installed in the mobile.
        //Using apkinfo app in the mobile identify Package Name and Activities for example paytm
/*        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"net.one97.paytm");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"net.one97.paytm.AJRMainActivity");*/

        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath()); //Works by installing apk

        //Remote driver connection
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

        return driver;
    }
}
