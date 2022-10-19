package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import  io.cucumber.java.en.*;

import java.util.Map;

public class WebTableLogin_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table")
    public void user_is_on_the_login_page_of_web_table() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTableLoginPage.inputusername.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTableLoginPage.inputpassword.sendKeys(string);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        webTableLoginPage.loginbutton.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        BrowserUtils.verifyURLContains("web-table-2");
        Driver.closeDriver();
    }

    @When("user enters username {string} password {string} and click.")
    public void user_enters_username_password_and_click(String string, String string2) {
        //webTableLoginPage.inputusername.sendKeys(string);
        //webTableLoginPage.inputpassword.sendKeys(string2);
        //webTableLoginPage.loginbutton.click();
        webTableLoginPage.login(string,string2);
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {

        System.out.println("credentials.get(\"username\") = " + credentials.get("username"));
        System.out.println("credentials.get(\"password\") = " + credentials.get("password"));

        webTableLoginPage.inputusername.sendKeys(credentials.get("username"));
        webTableLoginPage.inputpassword.sendKeys(credentials.get("password"));
        webTableLoginPage.loginbutton.click();

        //Following command id from utility class.
        //webTableLoginPage.login(credentials.get("username"), credentials.get("password"));


    }





}
