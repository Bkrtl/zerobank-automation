package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityNavigationStepDefs {
    @When("the user click on Savings link on the Account Summary page")
    public void the_user_click_on_Savings_link_on_the_Account_Summary_page() {
        BrowserUtils.waitFor(3);
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        accountSummaryPage.Savings1OfCashAccounts.click();
    }


    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        BrowserUtils.waitFor(3);
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        accountSummaryPage.BrokerageOfInvestmentAccounts.click();
    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        BrowserUtils.waitFor(3);
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        accountSummaryPage.CheckingOfCreditAccounts.click();
    }

    @When("the user clicks on Credit card link on the Account Summary page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
        BrowserUtils.waitFor(3);
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        accountSummaryPage.CreditCardOfCreditAccounts.click();
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        BrowserUtils.waitFor(3);
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        accountSummaryPage.LoanOfLoanAccounts.click();
    }

    @Then("account dropdown should have {string} selected")
    public void account_dropdown_should_have_selected(String expectedDefaultValue) {
        BrowserUtils.waitFor(2);
        int i=-1;
        if (expectedDefaultValue.equals("Savings")) {
            i = 0;
        } else if (expectedDefaultValue.equals("Checking")){
            i = 1;
        } else if (expectedDefaultValue.equals("Credit Card")){
            i = 4;
        } else if (expectedDefaultValue.equals("Loan")){
            i = 3;
        } else if (expectedDefaultValue.equals("Brokerage")){
            i = 5;
        }
        AccountActivityPage accountActivityPage= new AccountActivityPage();
        Select accountList = new Select(accountActivityPage.dropdownBox);
        List<WebElement> options= accountList.getOptions();
        String actualDefaultValue= options.get(i).getText();
        Assert.assertEquals(expectedDefaultValue,actualDefaultValue);

    }
}
