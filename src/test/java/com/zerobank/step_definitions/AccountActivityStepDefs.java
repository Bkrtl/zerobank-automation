package com.zerobank.step_definitions;

import com.zerobank.pages.*;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityStepDefs {


    @Then("the users should be at Account Activity page")
    public void the_users_should_be_at_Account_Activity_page() {
        BrowserUtils.waitFor(3);
        //DashboardPage dashboardPage=new DashboardPage();
        //dashboardPage.AccountActivity.click();
        //AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        //accountSummaryPage.AccountActivity.click();
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        accountActivityPage.AccountActivity.click();
        BrowserUtils.waitFor(3);
        String actualTitle= Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle="Zero - Account Activity";
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertEquals("Verify that expected title is actual title",actualTitle,expectedTitle);
    }

    @Given("the user is on Account Activity page")
    public void the_user_is_on_Account_Activity_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        LoginPage loginPage= new LoginPage();
        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");
        loginPage.login(username,password);
        BrowserUtils.waitFor(3);
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.AccountActivity.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the users see that Savings option is selected")
    public void the_users_see_that_Savings_option_is_selected() {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        Select stateList = new Select(accountActivityPage.dropdownBox);
        BrowserUtils.waitFor(3);
        String expectedOption = "Savings";
        String actualOption = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals("Verify that expected title is actual title",expectedOption,actualOption);

    }

    @When("the users clicks dropdown")
    public void the_users_clicks_dropdown() {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        accountActivityPage.dropdownBox.click();
        BrowserUtils.waitFor(3);

    }

    @Then("the users see following options:")
    public void the_users_see_following_options(List<String> dropdownOptions) {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        List<String> actualDropdownOptions = accountActivityPage.getActualOptionsListString();
        Assert.assertEquals(dropdownOptions,actualDropdownOptions);
    }

    @Then("the users see following columns of transaction table :")
    public void the_users_see_following_columns_of_transaction_table(List<String> TransactionTableHeaders) {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        List<String> actualTransactionTableHeaders = BrowserUtils.getElementsText(accountActivityPage.AccountActivityTransactionTableHeaders);
        Assert.assertEquals("Verify that",TransactionTableHeaders,actualTransactionTableHeaders);
    }

}

