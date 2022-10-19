package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class day71 {



    @Given("User is on  amazon page")
    public void user_is_on_amazon_page() {
        Driver.getDriver().get("https://www.amazon.com");
    }
    @When("user creates multiple tabs")
    public void user_creates_multiple_tabs() {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('http://facebook.com','_blank');");


    }
    @When("user switches to Etsy tab.")
    public void user_switches_to_etsy_tab() {
        for ( String  eachTab  :Driver.getDriver().getWindowHandles()) {
            if(Driver.getDriver().switchTo().window(eachTab).getTitle().contains("Etsy")){
                break;
            }
           // System.out.println("TabName = " + Driver.getDriver().switchTo().window(eachTab).getTitle());
        }
    }
    @Then("user should see the Etsy in the title")
    public void user_should_see_the_etsy_in_the_title() {
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Etsy"));
    }

}
