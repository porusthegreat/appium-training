package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Login;

import java.io.IOException;

public class LoginSteps extends DriverFactory{

    public LoginSteps() throws IOException {
    }

    @Then("user should be able to see Login Screen")
    public void user_should_be_able_to_see_login_screen() throws InterruptedException {
        String verifyLogin = new Login(driver).verifyLoginScreen();
        Assert.assertTrue(verifyLogin.contains("Login"));
    }
}
