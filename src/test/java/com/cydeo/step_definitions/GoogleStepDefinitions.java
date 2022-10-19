package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleStepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();



    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        googleSearchPage.popMenu.click();
        System.out.println("user is on google search page");

    }



    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        System.out.println("user is seeing title is google");
        String expected_title = "Google";
        String actual_title = Driver.getDriver().getTitle();
        Assert.assertEquals(expected_title,actual_title);
        Driver.closeDriver();
    }

    @When("user type apple in search box and click")
    public void user_type_apple_in_search_box_and_click() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

    }


    @Then("user see that title is  apple")
    public void user_see_that_title_is_apple() {
        String expectedTitle = "apple - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        Driver.closeDriver();
    }




}
