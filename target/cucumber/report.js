$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RechargeMobile.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I should be able to recharge from paytm",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-recharge-from-paytm",
  "keyword": "Feature"
});
formatter.before({
  "duration": 30134934163,
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
  "duration": 4500462713,
  "status": "passed"
});
formatter.match({
  "location": "SelectLanguageSteps.user_clicks_on_continue_btn()"
});
formatter.result({
  "duration": 2766478657,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_be_able_to_see_login_screen()"
});
formatter.result({
  "duration": 17462643483,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_skips_login()"
});
formatter.result({
  "duration": 685778515,
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
  "name": "user enters mobile number as 9901897419",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user waits for mobile operator to be auto selected",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user chooses to recharge with Rs. 30",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks on proceed button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardSteps.user_chooses_to_recharge_for_mobile()"
});
formatter.result({
  "duration": 15528783017,
  "status": "passed"
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
  "duration": 13010606809,
  "status": "passed"
});
formatter.match({
  "location": "MobileRechargeSteps.auto_select_operator_verify()"
});
formatter.result({
  "duration": 994948696,
  "status": "passed"
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
  "duration": 4942383988,
  "status": "passed"
});
formatter.match({
  "location": "MobileRechargeSteps.user_clicks_on_proceed_button()"
});
