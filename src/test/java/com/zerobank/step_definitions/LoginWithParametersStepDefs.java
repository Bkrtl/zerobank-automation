package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithParametersStepDefs {

    @When("the user enters the wrong or empty credentials {string} {string}")
    public void the_user_enters_the_wrong_or_empty_credentials(String username, String password) {
        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should not be login and see {string} message")
    public void the_user_should_not_be_login_and_see_message(String expectedMessage) {
        String actualMessage=new LoginPage().invalidCredential.getText();
        Assert.assertEquals("verify that..",expectedMessage,actualMessage);

    }
}
