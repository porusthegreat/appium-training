package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileRecharge extends BasePage{

    AppiumDriver driver;

    @FindBy(id = "radio_prepaid")
    private WebElement radioPrepaid;

    @FindBy(id = "radio_postpaid")
    private WebElement radioPostpaid;

    @FindBy(id = "edit_no")
    private WebElement mobileNumber;

    @FindBy(id = "text_mob_op")
    private WebElement currentOperator;

    @FindBy(id = "edit_amount")
    private WebElement totalAmount;

    @FindBy(id = "proceed_btn")
    private WebElement proceedBtn;

    public MobileRecharge(AppiumDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void inputMobileNumber(String number){
        waitForElementDisplay(mobileNumber);
        mobileNumber.clear();
        mobileNumber.sendKeys(number);
    }

    public String currentOperatorIsSelected(){
        waitForElementDisplay(currentOperator);
        return currentOperator.getText();
    }

    public void enterTotalAmount(String amount){
        totalAmount.sendKeys(amount);
    }

    public void clickOnProceedBtn(){
        proceedBtn.click();
    }

    public Boolean checkIfPostpaidIsSelected(){
        waitForElementToBeClickable(radioPostpaid);
        System.out.println(radioPostpaid.isSelected());
        return radioPostpaid.isSelected();

    }

    public Boolean checkIfPrepaidIsSelected(){
        waitForElementToBeClickable(radioPrepaid);
        System.out.println(radioPrepaid.isSelected());
        return radioPrepaid.isSelected();
    }
}
