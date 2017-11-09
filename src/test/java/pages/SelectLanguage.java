package pages;

import io.appium.java_client.AppiumDriver;
import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectLanguage extends  BasePage{
    AppiumDriver driver;

    @FindBy(id = "screen_title")
    private WebElement screenTitle;

    @FindBy(xpath = "//android.widget.TextView[@text='English']")
    private WebElement selectsEnglish;

    @FindBy(id = "btn_language_continue_button")
    private WebElement continueBtn;

    public void selectsLanguageAsEnglish() {
        try {
        waitForElementDisplay(selectsEnglish);
        selectsEnglish.click();
        }catch (TimeoutException e){
            e.printStackTrace();
        }

    }

    public SelectLanguage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnContinue() {
        try {
            waitForElementToBeClickable(continueBtn);
            continueBtn.click();
        }catch (TimeoutException e){
            e.printStackTrace();
        }
    }
}
