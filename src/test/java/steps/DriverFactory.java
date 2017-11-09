package steps;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    protected static AppiumDriver driver;

    public DriverFactory() throws IOException{
        initialize();
    }

    public void initialize() throws IOException{
        if(driver == null){
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("appium-version", "1.7.1");
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "6.0");

            caps.setCapability("deviceName", "Google Nexus 5x");
            caps.setCapability("newCommandTimeout",120);

            //Launch virtual device and wait for 120 seconds
            /*caps.setCapability("avd","testAVD");
            caps.setCapability("avdReadyTimeout",120000);
            caps.setCapability("app","app/quikr.apk");
            caps.setCapability("appActivity","com.quikr.old.SplashActivity");*/

            /*caps.setCapability("appPackage","net.one97.paytm");
            caps.setCapability("appActivity","net.one97.paytm.AJRJarvisSplash");*/
            caps.setCapability("app","app/Paytm_net.one97.paytm.apk");
            caps.setCapability("clearSystemFiles",true);
            System.out.println("----------Re-installing app-----------------");
            caps.setCapability("autoAcceptAlerts",true);

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
