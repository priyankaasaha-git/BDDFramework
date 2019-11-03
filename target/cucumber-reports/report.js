$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BritishAirwaysRegistration.feature");
formatter.feature({
  "line": 2,
  "name": "British Airways Registration",
  "description": "",
  "id": "british-airways-registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@britishTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "British Airways registration by filling all the mandatory fields.",
  "description": "",
  "id": "british-airways-registration;british-airways-registration-by-filling-all-the-mandatory-fields.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@regisClick"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch british airways URL \"https://britishairways.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on Registration Link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "check for registration page is opended",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enter email address \"rebabeachresort2020@gmail.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "confirm the same email address \"rebabeachresort2020@gmail.com\" again",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter the password \"Password@12345\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "confirm the same password \"Password@12345\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "select the title \"Mr\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "enter the first name \"Chiranjit\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "enter the last name \"Saha\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "select the radio button Register with ba.com",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on Join now",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "check registartion is successful",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://britishairways.com",
      "offset": 28
    }
  ],
  "location": "BritishAirwaysSteps.launch_british_airways_URL(String)"
});
formatter.result({
  "duration": 6834192500,
  "status": "passed"
});
formatter.match({
  "location": "BritishAirwaysSteps.click_on_Registration_Link()"
});
formatter.result({
  "duration": 1750609200,
  "status": "passed"
});
formatter.match({
  "location": "BritishAirwaysSteps.check_for_registration_page_is_opended()"
});
formatter.result({
  "duration": 2824500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rebabeachresort2020@gmail.com",
      "offset": 21
    }
  ],
  "location": "BritishAirwaysSteps.enter_email_address(String)"
});
formatter.result({
  "duration": 130225100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rebabeachresort2020@gmail.com",
      "offset": 32
    }
  ],
  "location": "BritishAirwaysSteps.confirm_the_same_email_address_again(String)"
});
formatter.result({
  "duration": 67455300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password@12345",
      "offset": 20
    }
  ],
  "location": "BritishAirwaysSteps.enter_the_password(String)"
});
formatter.result({
  "duration": 55758900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password@12345",
      "offset": 27
    }
  ],
  "location": "BritishAirwaysSteps.confirm_the_same_password(String)"
});
formatter.result({
  "duration": 61870900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr",
      "offset": 18
    }
  ],
  "location": "BritishAirwaysSteps.select_the_title(String)"
});
formatter.result({
  "duration": 440709500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chiranjit",
      "offset": 22
    }
  ],
  "location": "BritishAirwaysSteps.enter_the_first_name(String)"
});
formatter.result({
  "duration": 33526100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Saha",
      "offset": 21
    }
  ],
  "location": "BritishAirwaysSteps.enter_the_last_name(String)"
});
formatter.result({
  "duration": 31520200,
  "status": "passed"
});
formatter.match({
  "location": "BritishAirwaysSteps.select_the_radio_button_Register_with_ba_com()"
});
formatter.result({
  "duration": 310730700,
  "status": "passed"
});
formatter.match({
  "location": "BritishAirwaysSteps.click_on_Join_now()"
});
formatter.result({
  "duration": 1200192000,
  "status": "passed"
});
formatter.match({
  "location": "BritishAirwaysSteps.registration_page_is_opended()"
});
formatter.result({
  "duration": 31469000,
  "error_message": "org.openqa.selenium.NoSuchWindowException: Browsing context has been discarded\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-CFEN8OJG\u0027, ip: \u0027192.168.86.250\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 70.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20191030021342, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 3816, moz:profile: C:\\Users\\priya\\AppData\\Loca..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 7fb08e87-c65d-402e-8ff5-c181a52fb302\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:281)\r\n\tat stepDefinitions.BritishAirwaysSteps.registration_page_is_opended(BritishAirwaysSteps.java:95)\r\n\tat ✽.Then check registartion is successful(BritishAirwaysRegistration.feature:18)\r\n",
  "status": "failed"
});
});