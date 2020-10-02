package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

// All the objects belonging to home page will be defined here
public class HomePage {

    public HomePage(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement Preferences;

    @iOSBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement Preferencess;
}
