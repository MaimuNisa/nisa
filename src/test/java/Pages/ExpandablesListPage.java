package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ExpandablesListPage {
    public ExpandablesListPage(AndroidDriver<AndroidElement> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
   @AndroidFindBy(accessibility = "//android.widget.TextView[@text='Dog Names']")
    public AndroidElement customeAdapter;
}
