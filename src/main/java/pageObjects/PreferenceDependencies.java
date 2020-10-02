package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PreferenceDependencies {

    public PreferenceDependencies(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement wifiCheckbox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
    public WebElement wifiSettings;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement wifiName;

    @AndroidFindBy(className = "android.widget.Button")
    public List<WebElement> okButton;

}
