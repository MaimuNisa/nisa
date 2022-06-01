import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class Intro {
    @Test
    public void test1() throws MalformedURLException {
        File apkFile = new File("src/test/resources/ApiDemos-debug-newVersion.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","nisa");
       desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setCapability("app",apkFile.getAbsolutePath());

        URL serverUrl = new URL("http://localhost:4723/wd/hub");

        AndroidDriver<AndroidElement>driver = new AndroidDriver<AndroidElement>(serverUrl,desiredCapabilities);

 AndroidElement appbutton = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]"));
appbutton.click();

    }

    @Test
    public  void test2() throws MalformedURLException {
        File apkFile = new File("src/test/resources/ApiDemos-debug-newVersion.apk");
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName","android");
        dc.setCapability("deviceName", "nisa");
        dc.setCapability("app",apkFile.getAbsolutePath() );
        URL appiumserverUrl = new URL("http://localhost:4723/wd/hub");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(appiumserverUrl,dc);
        List<AndroidElement> liastOfeLEMENTS = driver.findElements(By.id("android:id/text1"));
        for(AndroidElement element : liastOfeLEMENTS){
            System.out.println(element.getText());
        }

        AndroidElement mediabutton= driver.findElementByAccessibilityId("Media");
        mediabutton.click();
    }
}
