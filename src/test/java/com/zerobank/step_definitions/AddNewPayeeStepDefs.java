package com.zerobank.step_definitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class AddNewPayeeStepDefs {
    @Given("the user accesses the Add New Payee tab")
    public void the_user_accesses_the_Add_New_Payee_tab() {
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
        payBillsPage.AddNewPayee.click();
        BrowserUtils.waitFor(2);
    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> releventData) {
       PayBillsPage payBillsPage = new PayBillsPage();
       payBillsPage.PayeeNameBox.sendKeys(releventData.get("Payee Name"));
       payBillsPage.PayeeAddressBox.sendKeys(releventData.get("Payee Address"));
       payBillsPage.AccountBox.sendKeys(releventData.get("Account"));
       payBillsPage.PayeeDetails.sendKeys(releventData.get("Payee Details"));
       payBillsPage.AddButton.click();
       BrowserUtils.waitFor(3);
    }

    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String expectedMessage) {
        PayBillsPage payBillsPage=new PayBillsPage();
        String actualMessage=payBillsPage.PayeeMessage.getText();
        Assert.assertEquals("verify..",expectedMessage,actualMessage);
    }

}
