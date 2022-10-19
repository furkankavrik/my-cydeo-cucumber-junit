package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import  io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class DataTable_StepDefinitions {

    @Given("user is on dropdown page  of the practice tool")
    public void user_is_on_dropdown_page_of_the_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    DropdownsPage dropdownsPage = new DropdownsPage();
    @Then("user should see below info in month dropdown.")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {
        System.out.println("expectedMonths = " + expectedMonths);

        Select select = new Select(dropdownsPage.monthDropdown);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }
        Assert.assertEquals(expectedMonths,actualOptionsAsString);

        //Alternative solution by using utilities class below
        List<String> actualOptionsAsString2 = BrowserUtils.dropdowOptionsAsString(dropdownsPage.monthDropdown);
        Assert.assertEquals(expectedMonths,actualOptionsAsString2);




    }

    @Then("User should see fruits I like")
    public void userShouldSeeFruitsILike(String string) {
        System.out.println(string);
    }


}
