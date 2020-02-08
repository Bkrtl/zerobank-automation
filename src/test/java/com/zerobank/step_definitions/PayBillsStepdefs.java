package com.zerobank.step_definitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;


public class PayBillsStepdefs {

    @Then("the users should be at Pay Bills page")
    public void the_users_should_be_at_Pay_Bills_page() {
        BrowserUtils.waitFor(3);
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.PayBills.click();
        BrowserUtils.waitFor(3);
        String actualTitle= Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle="Zero - Pay Bills";
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertEquals("Verify that expected title is actual title",actualTitle,expectedTitle);
    }

    @Given("the user is on Pay Bills  page")
    public void the_user_is_on_Pay_Bills_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        LoginPage loginPage= new LoginPage();
        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");
        loginPage.login(username,password);
        BrowserUtils.waitFor(3);
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.PayBills.click();
        BrowserUtils.waitFor(3);
    }

    @Given("the user enters {string} and {string}")
    public void the_user_enters_and(String amount, String date) {
        BrowserUtils.waitFor(3);
        PayBillsPage payBillsPage= new PayBillsPage();
        payBillsPage.AmountBox.sendKeys(amount);
        payBillsPage.DateBox.sendKeys(date);
    }

    @When("the user click {string} button")
    public void the_user_click_button(String string) {
        BrowserUtils.waitFor(3);
        PayBillsPage payBillsPage= new PayBillsPage();
        payBillsPage.PayButton.click();
    }

    @Then("the positive message is displayed {string}")
    public void the_message_is_displayed(String expectedMessage) {
        BrowserUtils.waitFor(3);
        PayBillsPage payBillsPage= new PayBillsPage();
        String actualMessage= payBillsPage.ResultText.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Given("the user enters wrong information into the fields {string} and {string} as follows")
    public void the_user_enters_wrong_information_into_the_fields_and_as_follows(String amount, String date) {
        BrowserUtils.waitFor(3);
        PayBillsPage payBillsPage= new PayBillsPage();
        payBillsPage.AmountBox.sendKeys(amount);
        payBillsPage.DateBox.sendKeys(date);
    }

    @Then("the negative message is displayed {string} due to lack of amount")
    public void the_negative_message_is_displayed_due_to_lack_of_amount(String expectedMessage) {
        BrowserUtils.waitFor(5);
        PayBillsPage payBillsPage= new PayBillsPage();
        String actualMessage = payBillsPage.AmountBox.getAttribute("validationMessage");
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("the negative message is displayed {string} due to lack of date")
    public void the_negative_message_is_displayed_due_to_lack_of_date(String expectedMessage) {
        BrowserUtils.waitFor(5);
        PayBillsPage payBillsPage= new PayBillsPage();
        String actualMessage = payBillsPage.DateBox.getAttribute("validationMessage");
        Assert.assertEquals(expectedMessage, actualMessage);
    }



}
