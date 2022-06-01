package stepdefs;

import Pages.ExpandablesListPage;
import Pages.HomePage;
import Pages.ViewsPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiDemosStepDefs {
    AndroidDriver<AndroidElement>driver;


    @Given("I have APIDemos application launched")
    public void i_have_api_demos_application_launched() throws MalformedURLException {
        File apkFile = new File("src/test/resources/ApiDemos-debug-newVersion.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","nisa");
       // desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setPlatform(Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.APP,apkFile.getAbsolutePath());

        URL serverurl = new URL("http//localhost:4723/wd/hub");
        driver = new AndroidDriver<AndroidElement>(serverurl,desiredCapabilities);
    }
    @When("I navigate to {string} page")
    public void i_navigate_to_page(String path) {
        HomePage homePage = new HomePage(driver) ;
        homePage.viewsbutton.click();
        ViewsPage viewsPage = new ViewsPage(driver);
        viewsPage.expandables.click();
        ExpandablesListPage expandablesListPage = new ExpandablesListPage(driver);
        expandablesListPage.customeAdapter.click();


    }
    @When("I long press on Dog Names button for {int} seconds")
    public void i_long_press_on_dog_names_button_for_seconds(String string) {

    }
    @Then("new menu {string} option should pop up.")
    public void new_menu_option_should_pop_up(String string) {

    }
}
