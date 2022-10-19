package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public  WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement inputusername;

    @FindBy(name = "password")
    public WebElement inputpassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginbutton;

    public void loginWithConfig(){

        inputusername.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        inputpassword.sendKeys(ConfigurationReader.getProperty("web.table.pass"));
        loginbutton.click();
    }


    public void login(String username, String password){
        inputusername.sendKeys(username);
        inputpassword.sendKeys(password);
        //this.inputpassword.sendKeys(password);--alternative statement
        this.loginbutton.click();
    }

    public void login(){
        inputusername.sendKeys(ConfigurationReader.getProperty("username"));
        inputpassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginbutton.click();
    }


}

