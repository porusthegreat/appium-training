package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.SelectLanguage;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class SelectLanguageSteps extends DriverFactory {

    public SelectLanguageSteps() throws IOException {
    }

    @When("user selects the language as English")
    public void user_selects_language_as_English() throws TimeoutException {
            new SelectLanguage(driver).selectsLanguageAsEnglish();
    }
    @And("user clicks on continue button")
    public void user_clicks_on_continue_btn() {
        new SelectLanguage(driver).clickOnContinue();
    }
}
