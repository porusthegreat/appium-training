package steps;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    protected static AppiumDriver driver;

    public DriverFactory() throws MalformedURLException{
            initialize();
    }

    public void initialize() throws MalformedURLException{
        if(driver == null){
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("appium-version", "1.7.1");
            caps.setCapability("platformName", "Android");
            caps.setCapability("deviceName", "Google_Nexus_5X");
            caps.setCapability("newCommandTimeout",120);
            caps.setCapability("udid",System.getProperty("udid"));
//            caps.setCapability("avd","google_2");
//            caps.setCapability("avdReadyTimeout",120000);
            caps.setCapability("app","/Users/purushothamreddy/Developments/appium-training/app/Paytm_net.one97.paytm.apk");
            caps.setCapability("clearSystemFiles",true);

            driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

    public AppiumDriver getAppiumDriver(){
        return driver;
    }

    public void destroyAppiumDriver(){
        driver.quit();
        driver = null;
    }
}
