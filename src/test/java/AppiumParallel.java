import gherkin.lexer.Ru;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumParallel extends Thread{
    String udid;
    AppiumDriver driver;

    public AppiumParallel(String udid){
        this.udid = udid;
    }

    public void desiredCapsAndTest(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium-version", "1.7.1");
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Google_Nexus_5X");
        caps.setCapability("newCommandTimeout",120);
        caps.setCapability("udid",udid);
        System.out.println(udid);
        caps.setCapability("app","/Users/purushothamreddy/Documents/training/appium-training/app/Paytm_net.one97.paytm.apk");
        caps.setCapability("clearSystemFiles",true);
        try {
            driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Override
    public void run(){
        desiredCapsAndTest();
    }

    public static void main(String[] args) {
        Runnable r1 =  new AppiumParallel("192.168.56.101:5555");
        Runnable r2 =  new AppiumParallel("192.168.56.102:5555");
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
