package com.zerobank.step_definitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PurchaseForeignCurrencyStepDefs {

    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {
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
        PayBillsPage payBillsPage=new PayBillsPage();
        payBillsPage.PurchaseForeignCurrency.click();
        BrowserUtils.waitFor(2);
    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> expectedCurrencies) {
        PayBillsPage payBillsPage=new PayBillsPage();
        Select options=new Select(payBillsPage.CurrencyDropdown);
        List<WebElement> curencyOptions=options.getOptions();
        List<String > actualCurrency=BrowserUtils.getElementsText(curencyOptions);
        Assert.assertEquals("verify...", expectedCurrencies,actualCurrency);
    }

    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        PayBillsPage payBillsPage=new PayBillsPage();
        payBillsPage.AmountBoxOfPurchase.sendKeys("26");
        BrowserUtils.waitFor(2);
        payBillsPage.CalculateCostsButton.click();

    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        Alert alert=Driver.get().switchTo().alert();
        String expectedAlertMessage="Please, ensure that you have filled all the required fields with valid values.";
        Assert.assertEquals("",expectedAlertMessage,alert.getText());


    }

    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {
        BrowserUtils.waitFor(2);
        new PayBillsPage().CalculateCostsButton.click();


    }
}
