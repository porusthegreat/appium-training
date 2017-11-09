package steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.io.IOException;

public class StartingSteps {
    AppiumDriverLocalService appiumService;


    @Before
    public void startAppiumServer() throws IOException {
        System.out.println("Inside setup method");
        int port = 4723;
        String osName = System.getProperty("os.name");
        if (osName.contains("Mac")) {
            appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                    .usingDriverExecutable(new File(("/usr/local/bin/node")))
                    .withAppiumJS(new File(("/usr/local/bin/appium")))
                    .withIPAddress("0.0.0.0")
                    .usingPort(port)
                    .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                    .withLogFile(new File("build/appium.log")));
            appiumService.start();
            new DriverFactory().getAppiumDriver();
        }

    }

    @After
    public void stopAppiumServer() throws IOException {
        new DriverFactory().destroyAppiumDriver();
        appiumService.stop();
    }
}
