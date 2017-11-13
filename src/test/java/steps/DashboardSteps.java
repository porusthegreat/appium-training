package steps;

import cucumber.api.java.en.And;
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

    @And("user swipes to see broadband")
    public void user_swipes_to_see_broadband(){
        new Dashboard(driver).allowPermissionsOnDashboardScreen();
        new Dashboard(driver).acceptAlerttext();
        new Dashboard(driver).swipeToBroadband();
    }

    @And("clicks on broadband")
    public void clicks_on_broadband(){
        new Dashboard(driver).clickOnBroadband();
    }
}
