package stepdefs;

import Pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class POMtest {
    AndroidDriver<AndroidElement> driver;

    @Before

    public void setup() throws MalformedURLException {
        File apkFile = new File("src/test/resources/ApiDemos-debug-newVersion.apk");
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "android");
        dc.setCapability("deviceName", "nisa");
        dc.setCapability("app", apkFile.getAbsolutePath());
        URL appiumserverUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<AndroidElement>(appiumserverUrl, dc);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

@Test
    public void  pomtest(){
        HomePage homePage = new HomePage(driver);
        homePage.appbuttontap();
}
    }

