package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BasePage {

    AppiumDriver driver;

    public BasePage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
    }

    public WebElement waitForElementToBeClickable(WebElement element) {
        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return myDynamicElement;
    }

    public WebElement waitForElementDisplay(WebElement element) {
        WebElement wait = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOf(element));
        return wait;
    }

    public String tomorrow() {
        return currentDatePlus(1);
    }

    public String dayAfterTomorrow() {
        return currentDatePlus(2);
    }

    private String currentDatePlus(int numberOfDays) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, numberOfDays);
        return new SimpleDateFormat("dd/MM/yyyy").format(c.getTime());
    }

}
