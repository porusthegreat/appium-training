package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Login;

import java.io.IOException;

public class LoginSteps extends DriverFactory{

    public LoginSteps() throws IOException {
    }

    @Then("user should be able to see Login Screen")
    public void user_should_be_able_to_see_login_screen() {
        String verifyLogin = new Login(driver).verifyLoginScreen();
        Assert.assertTrue(verifyLogin.contains("Login"));
    }

    @And("user skips the login")
    public void user_skips_login(){
        new Login(driver).skipLogin();
    }
}
