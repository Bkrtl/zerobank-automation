package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends BasePage {

    @FindBy(xpath = "//*[@class='board-header']")
    public List<WebElement> AccountTypes;

    @FindBy(xpath = "//*[@class='board-header'][1]")
    public WebElement CashAccounts;

    @FindBy(xpath = "(//a[@style='text-decoration: underline'])[1]")
    public WebElement Savings1OfCashAccounts;

    @FindBy(xpath = "(//a[@style='text-decoration: underline'])[2]")
    public WebElement Savings2OfCashAccounts;


    @FindBy(xpath = "//*[@class='board-header'][2]")
    public WebElement InvestmentAccounts;

    @FindBy(xpath = "(//a[@style='text-decoration: underline'])[3]")
    public WebElement BrokerageOfInvestmentAccounts;

    @FindBy(xpath = "//*[@class='board-header'][3]")
    public WebElement CreditAccounts;

    @FindBy(xpath = "(//a[@style='text-decoration: underline'])[4]")
    public WebElement CheckingOfCreditAccounts;

    @FindBy(xpath = "(//a[@style='text-decoration: underline'])[5]")
    public WebElement CreditCardOfCreditAccounts;

    @FindBy(xpath = "//*[@class='board-header'][4]")
    public WebElement LoanAccounts;

    @FindBy(xpath = "(//a[@style='text-decoration: underline'])[6]")
    public WebElement LoanOfLoanAccounts;

    @FindBy(xpath = "(//table[@class='table'])[3]//th[1]")
    public WebElement AccountColumnsOfCreditAccounts;

    @FindBy(xpath = "(//table[@class='table'])[3]//th[2]")
    public WebElement CreditCardColumnsOfCreditAccounts;

    @FindBy(xpath = "(//table[@class='table'])[3]//th[3]")
    public WebElement BalanceColumnsOfCreditAccounts;

    @FindBy (xpath = "(//table[@class='table'])[3]//th")
    public List<WebElement> CreditAccountTableHeader;

    public List<String> getStringAccountTypes(List<WebElement>accountTypes){
        List<String> stringAccountTypes = new ArrayList<>();
        for(WebElement option: accountTypes){
            stringAccountTypes.add(option.getText());
        }
        return stringAccountTypes;
    }

}
