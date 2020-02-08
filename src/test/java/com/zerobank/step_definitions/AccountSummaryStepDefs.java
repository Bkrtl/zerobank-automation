package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefs {

    @Then("the users should be at Account Summary page")
    public void the_users_should_be_at_Account_Summary_page() {
        BrowserUtils.waitFor(3);
        String actualTitle= Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle="Zero - Account Summary";
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertEquals("Verify that expected title is actual title",actualTitle,expectedTitle);
    }

    @Given("the user is on the Account Summary Page")
    public void the_user_is_on_the_Account_Summary_Page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        LoginPage loginPage= new LoginPage();
        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");
        loginPage.login(username,password);
        BrowserUtils.waitFor(3);
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.AccountSummary.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the users see following account types :")
    public void the_users_see_following_account_types(List<String> AccountTypes) {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        List<String> actualAccountTypes = BrowserUtils.getElementsText(accountSummaryPage.AccountTypes);
        Assert.assertEquals("Verify that",AccountTypes,actualAccountTypes);
    }

    @Then("the users see following columns of Credit Accounts :")
    public void the_users_see_following_columns_of_Credit_Accounts(List<String> CreditAccountTableHeader) {
        BrowserUtils.waitFor(3);
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        List<String> actualCreditAccountHeader = BrowserUtils.getElementsText(accountSummaryPage.CreditAccountTableHeader);
        Assert.assertEquals("Verify that",CreditAccountTableHeader,actualCreditAccountHeader);
    }
}
