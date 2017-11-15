package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import static steps.DriverFactory.driver;


public class StartingSteps {
    AppiumDriverLocalService appiumService;

    @Before
    public void startAppiumServer() throws MalformedURLException {
        System.out.println("Inside setup method");
         int port = 4723;
        String osName = System.getProperty("os.name");
        if (osName.contains("Mac")) {
            appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                    .usingDriverExecutable(new File(("/usr/local/bin/node")))
                    .withAppiumJS(new File(("/usr/local/bin/appium")))
                    .withIPAddress("0.0.0.0")
                    .usingPort(port)
                    .withArgument(GeneralServerFlag.SESSION_OVERRIDE));
                    /*.withArgument(GeneralServerFlag.ROBOT_ADDRESS, udid)
                    .withArgument(AndroidServerFlag.BOOTSTRAP_PORT_NUMBER,String.valueOf(bp+2))*/
//                     .withLogFile(new File("build/appium.log")));
            appiumService.start();
            new DriverFactory().getAppiumDriver();
        }

    }

    @After
    public void stopAppiumServer(Scenario scenario) throws MalformedURLException {
        captureScreenShotInCaseOfFailure(scenario);
        new DriverFactory().destroyAppiumDriver();
        appiumService.stop();
    }


    protected void captureScreenShotInCaseOfFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotFolder = "screenshots";
            File screenShotSourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                createFolder(screenShotFolder);
                String fileName = scenario.getName();
                File screenShotTargetFile = getTargetFile(screenShotFolder, fileName, "png");
                FileUtils.copyFile(screenShotSourceFile, screenShotTargetFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void createFolder(String folderName) throws IOException {
        if (!(new File(folderName).exists())) new File(folderName).mkdir();
    }

    private File getTargetFile(String folderName, String fileName, String ext) throws IOException {
        String rootPath = new File(".").getCanonicalPath();
        String fullPath = String.format("%s//%s//%s.%s", rootPath, folderName, fileName, ext);
        return new File(fullPath);
    }
}
