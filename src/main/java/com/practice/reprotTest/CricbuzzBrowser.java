package com.practice.reprotTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CricbuzzBrowser extends CapabilitiesChrome{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = setup();
        driver.get("https://m.cricbuzz.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector(".row.cbz-div-header  .ui-btn-text")).click(); //clicking menu button
        driver.findElement(By.cssSelector("div.table-responsive a.td-head")).click(); //clicking home link

        JavascriptExecutor js = (JavascriptExecutor)driver;
        System.out.println(js.executeScript("return document.title").toString());

        assert driver.findElement(By.cssSelector(".cb-list-item.ui-header.ui-branding-header:nth(0)")).getAttribute("class").contains("header");

        js.executeScript("document.querySelector(\".cb-list-item.home-page-news:nth-of-type(2)\").scrollIntoView();");
        js.executeScript("arguments[0].click()",driver.findElement(By.cssSelector(".cb-list-item.home-page-news:nth-of-type(2)")));

        Thread.sleep(120);
    }
}
