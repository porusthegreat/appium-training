package stepDefs;

import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LaunchApp {

    @When("user opens the app")
    public void launchApp() throws Throwable{

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("appium-version", "1.7.1");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6.0");

        caps.setCapability("deviceName", "Google Nexus 5x");
        caps.setCapability("newCommandTimeout",120);

        //Launch virtual device and wait for 120 seconds
        caps.setCapability("avd","testAVD");
        caps.setCapability("avdReadyTimeout",120000);
//        caps.setCapability("app","app/quikr.apk");

        caps.setCapability("appPackage","com.quikr");
        caps.setCapability("appActivity","com.quikr.old.SplashActivity");

        AppiumDriver appiumDriver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), caps);
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}