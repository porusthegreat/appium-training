package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.NoSuchElementException;
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

    @FindBy(xpath = "//android.widget.TextView[@text='Do It Later']")
    private WebElement doItLater;

    public Login(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String verifyLoginScreen() {
        try {
            new BasePage(driver).waitForElementDisplay(allow_permissions.get(0));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("============================size of list is "+allow_permissions.size()+"===========================");
        while (allow_permissions.iterator().hasNext()){
            allow_permissions.get(0).click();
        }
        waitForElementDisplay(loginText);
        return loginText.getText();
    }

    public void skipLogin(){
        waitForElementDisplay(doItLater);
        doItLater.click();
    }

}
