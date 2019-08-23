$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestMe/Register.feature");
formatter.feature({
  "name": "TestMe app casestudy",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login validation for TestMeApp",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user provides valid username \"\u003cuname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user provides valid password \"\u003cpswrd\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.step({
  "name": "user verifies the login status",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "uname",
        "pswrd"
      ]
    },
    {
      "cells": [
        "lalitha",
        "password123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login validation for TestMeApp",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user provides valid username \"lalitha\"",
  "keyword": "Then "
});
formatter.match({
  "location": "demo_1.user_provides_valid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid password \"password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "demo_1.user_provides_valid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "demo_1.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the login status",
  "keyword": "And "
});
formatter.match({
  "location": "demo_1.user_verifies_the_login_status()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "search for products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user enters the item name to be searched",
  "keyword": "Then "
});
formatter.match({
  "location": "demo_1.user_enters_the_item_name_to_be_searched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on find details",
  "keyword": "And "
});
formatter.match({
  "location": "demo_1.user_click_on_find_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "demo_1.add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user proceeds to payment",
  "keyword": "Then "
});
formatter.match({
  "location": "demo_1.user_proceeds_to_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "continue the payment process",
  "keyword": "Then "
});
formatter.match({
  "location": "demo_1.continue_the_payment_process()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [Your orde has been confirmed] but found [Your order has been confirmed]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat casestudy_cucum.demo_1.continue_the_payment_process(demo_1.java:232)\r\n\tat ✽.continue the payment process(TestMe/Register.feature:42)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "The one where the user moves to cart without adding any item in it",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "Alex has registered into TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "demo_1.alex_has_registered_into_TestMeApp()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d76.0.3809.100)\n  (Driver info: chromedriver\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027HDC2-D-6XMHXH2\u0027, ip: \u002710.211.154.143\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578737 (49da6702b16031..., userDataDir: C:\\Users\\TRAINI~1.15\\AppDat...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:58898}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 76.0.3809.100, webStorageEnabled: true}\nSession ID: ef1edfde5b58b3adc8a05a12a66c690e\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat casestudy_cucum.demo_1.alex_has_registered_into_TestMeApp(demo_1.java:244)\r\n\tat ✽.Alex has registered into TestMeApp(TestMe/Register.feature:45)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Alex search for a product like headphone",
  "keyword": "Then "
});
formatter.match({
  "location": "demo_1.alex_search_for_a_product_like_headphone()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Alex go for payment without adding items into cart",
  "keyword": "And "
});
formatter.match({
  "location": "demo_1.alex_go_for_payment_without_adding_items_into_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "TestMe doesnt display the cart icon",
  "keyword": "Then "
});
formatter.match({
  "location": "demo_1.testme_doesnt_display_the_cart_icon()"
});
formatter.result({
  "status": "skipped"
});
});