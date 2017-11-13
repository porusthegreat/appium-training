package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Dashboard extends BasePage{
    AppiumDriver driver;


    @FindBy(xpath = "//android.widget.TextView[@text='Mobile Prepaid']")
    private WebElement prepaidRecharge;

    @FindBy(xpath = "//android.widget.TextView[@text='Mobile Postpaid']")
    private WebElement postpaidRecharge;

    @FindBy(id = "net.one97.paytm:id/w_custom_dialog_btn_positive")
    private WebElement acceptAlert;

    @FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private List<WebElement> allow_permissions;

    @FindBy(xpath = "//android.widget.TextView[@text='Broadband']")
    private WebElement broadBand;

    public Dashboard(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnBroadband(){
       waitForElementToBeClickable(broadBand);
        broadBand.click();
    }

    public void swipeToBroadband(){
        (new TouchAction(driver))
                .press(975, 894)
                .moveTo(-35,0)
                .release()
                .perform();
    }

    public void clickOnPrepaidRecharge() {
        waitForElementDisplay(prepaidRecharge);
        prepaidRecharge.click();
    }

    public void clickOnPostpaidRecharge() {
        waitForElementDisplay(postpaidRecharge);
        postpaidRecharge.click();
    }

    public void acceptAlerttext() throws TimeoutException{
        try {
            waitForElementDisplay(acceptAlert);
            acceptAlert.click();
        }catch(TimeoutException e){
            e.printStackTrace();
        }

    }

    public void allowPermissionsOnDashboardScreen(){
        waitForElementDisplay(allow_permissions.get(0));
        System.out.println("============================size of list is "+allow_permissions.size()+"===========================");
        while (allow_permissions.iterator().hasNext()){
            allow_permissions.get(0).click();
        }
    }

}
