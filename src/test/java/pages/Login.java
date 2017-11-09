package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class Login extends BasePage{
    AppiumDriver driver;

    @FindBy(id = "text1")
    private WebElement loginText;

    @FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private List<WebElement> allow_permissions;

    public Login(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String verifyLoginScreen() {
        new BasePage(driver).waitForElementDisplay(allow_permissions.get(0));
        allow_permissions.get(0).click();
        allow_permissions.get(0).click();
        allow_permissions.get(0).click();
        waitForElementDisplay(loginText);
        return loginText.getText();
    }

}
