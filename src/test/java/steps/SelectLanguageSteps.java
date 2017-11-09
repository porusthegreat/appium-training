package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.SelectLanguage;

import java.io.IOException;

public class SelectLanguageSteps extends DriverFactory {

    public SelectLanguageSteps() throws IOException {
    }

    @When("user selects the language as English")
    public void user_selects_language_as_English() throws InterruptedException {
        String screenTitle = new SelectLanguage(driver).getScreenTitle();
        Assert.assertTrue(screenTitle.contains("Choose Language"));
        new SelectLanguage(driver).selectsLanguageAsEnglish();
    }

    @And("user clicks on continue button")
    public void user_clicks_on_continue_btn() {
        new SelectLanguage(driver).clickOnContinue();
    }
}
