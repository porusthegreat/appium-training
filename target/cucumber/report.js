$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RechargeMobile.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I should be able to recharge from paytm",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-recharge-from-paytm",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24435245170,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user selects the language as English",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user should be able to see Login Screen",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user skips the login",
  "keyword": "And "
});
formatter.match({
  "location": "SelectLanguageSteps.user_selects_language_as_English()"
});
formatter.result({
  "duration": 21003610499,
  "status": "passed"
});
formatter.match({
  "location": "SelectLanguageSteps.user_clicks_on_continue_btn()"
});
formatter.result({
  "duration": 20135300286,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_be_able_to_see_login_screen()"
});
formatter.result({
  "duration": 16415319345,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_skips_login()"
});
formatter.result({
  "duration": 454379420,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Mobile Recharge - Prepaid",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-recharge-from-paytm;mobile-recharge---prepaid",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user chooses to recharge for prepaid mobile",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user selects prepaid",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters mobile number as 9901897419",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user waits for mobile operator to be auto selected",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user chooses to recharge with Rs. 30",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user clicks on proceed button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.user_chooses_to_recharge_for_mobile()"
});
formatter.result({
  "duration": 34462190183,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.id: net.one97.paytm:id/w_custom_dialog_btn_positive\u0027 (tried for 10 second(s) with 500 MILLISECONDS interval)\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\n\tat pages.BasePage.waitForElementDisplay(BasePage.java:27)\n\tat pages.Dashboard.acceptAlerttext(Dashboard.java:43)\n\tat steps.DashboardSteps.user_chooses_to_recharge_for_mobile(DashboardSteps.java:17)\n\tat ✽.When user chooses to recharge for prepaid mobile(RechargeMobile.feature:10)\nCaused by: org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.2\u0027, revision: \u002710229a9\u0027, time: \u00272017-08-21T17:29:55.15Z\u0027\nSystem info: host: \u0027Purushothams-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:42e:92a8:edb7:ee3e%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: io.appium.java_client.AppiumDriver\nCapabilities [{appPackage\u003dnet.one97.paytm, clearSystemFiles\u003dtrue, deviceName\u003d192.168.56.101:5555, platform\u003dLINUX, deviceUDID\u003d192.168.56.101:5555, desired\u003d{app\u003dapp/Paytm_net.one97.paytm.apk, appium-version\u003d1.7.1, clearSystemFiles\u003dtrue, newCommandTimeout\u003d120, platformVersion\u003d6.0, platformName\u003dAndroid, deviceName\u003dGoogle Nexus 5x, autoAcceptAlerts\u003dtrue}, appium-version\u003d1.7.1, newCommandTimeout\u003d120, platformVersion\u003d6.0, webStorageEnabled\u003dfalse, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dAndroid, deviceManufacturer\u003dGenymotion, app\u003dapp/Paytm_net.one97.paytm.apk, deviceScreenSize\u003d1080x1920, networkConnectionEnabled\u003dtrue, warnings\u003d{}, appWaitPackage\u003dnet.one97.paytm, appWaitActivity\u003dnet.one97.paytm.AJRJarvisSplash, databaseEnabled\u003dfalse, appActivity\u003dnet.one97.paytm.AJRJarvisSplash, locationContextEnabled\u003dfalse, deviceModel\u003dGoogle Nexus 5X - 6.0.0 - API 23 - 1080x1920, autoAcceptAlerts\u003dtrue}]\nSession ID: e6df9b78-258a-4ee3-86f6-559948b18964\n*** Element info: {Using\u003did, value\u003dnet.one97.paytm:id/w_custom_dialog_btn_positive}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:89)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:457)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementById(DefaultGenericMobileDriver.java:70)\n\tat io.appium.java_client.AppiumDriver.findElementById(AppiumDriver.java:1)\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.isDisplayed(Unknown Source)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:302)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$100(ExpectedConditions.java:44)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:288)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:285)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)\n\tat pages.BasePage.waitForElementDisplay(BasePage.java:27)\n\tat pages.Dashboard.acceptAlerttext(Dashboard.java:43)\n\tat steps.DashboardSteps.user_chooses_to_recharge_for_mobile(DashboardSteps.java:17)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\n",
  "status": "failed"
});
formatter.match({
  "location": "MobileRechargeSteps.user_selects_prepaid()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "9901897419",
      "offset": 29
    }
  ],
  "location": "MobileRechargeSteps.user_enters_mobile_number(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MobileRechargeSteps.auto_select_operator_verify()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 34
    }
  ],
  "location": "MobileRechargeSteps.enter_total_amount(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MobileRechargeSteps.user_clicks_on_proceed_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1453348973,
  "status": "passed"
});
