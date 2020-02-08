package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the users enter the user information")
    public void the_users_enter_the_user_information() {
        LoginPage loginPage= new LoginPage();
        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualTitle=Driver.get().getTitle();
        String expectedTitle="Zero - Account Summary";
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals("Verify that expected title is actual title",actualTitle,expectedTitle);

    }

    @When("the users enter the invalid username")
    public void the_users_enter_the_invalid_username() {
        LoginPage loginPage= new LoginPage();
        String username=ConfigurationReader.get("invalidusername");
        String password=ConfigurationReader.get("password");
        loginPage.login(username,password);
    }

    @Then("the users should not be login")
    public void the_users_should_not_be_login() {
        BrowserUtils.waitFor(3);
        LoginPage loginPage=new LoginPage();
        String actualText=loginPage.invalidCredential.getText();
        String expectedText="Login and/or password are wrong.";
        Assert.assertEquals("verify that",actualText,expectedText);
    }

    @When("the users leave the username box blank")
    public void the_users_leave_the_username_box_blank() {
        LoginPage loginPage= new LoginPage();
        String username=ConfigurationReader.get("blankusername");
        String password=ConfigurationReader.get("password");
        loginPage.login(username,password);
    }

    @When("the users enter the invalid password")
    public void the_users_enter_the_invalid_password() {
        LoginPage loginPage= new LoginPage();
        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("invalidpassword");
        loginPage.login(username,password);
    }

    @When("the users leave the password box blank")
    public void the_users_leave_the_password_box_blank() {
        LoginPage loginPage= new LoginPage();
        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("blankpassword");
        loginPage.login(username,password);

    }



}
