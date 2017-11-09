package steps;

import cucumber.api.java.en.When;
import pages.Dashboard;

import java.io.IOException;


public class DashboardSteps extends DriverFactory {

    public DashboardSteps() throws IOException {
    }

    @When("user chooses to recharge for prepaid mobile")
    public void user_chooses_to_recharge_for_mobile(){
        new Dashboard(driver).allowPermissionsOnDashboardScreen();
        new Dashboard(driver).acceptAlerttext();
        new Dashboard(driver).clickOnPrepaidRecharge();
    }

    @When("user chooses to recharge for postpaid mobile")
    public void user_chooses_to_recharge_for_postpaid_mobile(){
        new Dashboard(driver).allowPermissionsOnDashboardScreen();
        new Dashboard(driver).acceptAlerttext();
        new Dashboard(driver).clickOnPostpaidRecharge();
    }
}
