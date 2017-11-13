package steps;

import cucumber.api.java.en.And;
import org.junit.Assert;
import pages.MobileRecharge;

import java.io.IOException;

public class MobileRechargeSteps extends DriverFactory {

    public MobileRechargeSteps() throws IOException {
    }

    @And("^user enters mobile number as ([^\\\"]*)$")
    public void user_enters_mobile_number(String number){
        new MobileRecharge(driver).inputMobileNumber(number);
    }

    @And("user waits for mobile operator to be auto selected")
    public void auto_select_operator_verify(){
        String operator = new MobileRecharge(driver).currentOperatorIsSelected();
        Assert.assertTrue(operator.contains("Airtel"));
    }

    @And("^user chooses to recharge with Rs. ([^\\\"]*)$")
    public void enter_total_amount(String amount){
        new MobileRecharge(driver).enterTotalAmount(amount);
    }

    @And("user clicks on proceed button")
    public void user_clicks_on_proceed_button(){
        new MobileRecharge(driver).clickOnProceedBtn();
    }

    @And("user verifies whether prepaid option is selected")
    public void verify_prepaid_is_selected(){
        Boolean prepaid = new MobileRecharge(driver).isPrepaidSelected();
        System.out.println("==========prepaid value is ==========="+prepaid);
//        Assert.assertTrue(prepaid);
    }

    @And("user verifies whether postpaid option is selected")
    public void verify_postpaid_is_selected(){
        Boolean postpaid = new MobileRecharge(driver).isPostpaidSelected();
        System.out.println("==========prepaid value is ==========="+postpaid);
//        Assert.assertTrue(postpaid);
    }

}
