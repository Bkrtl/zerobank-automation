package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage {


    @FindBy(css = "#tabs > ul > li:nth-child(1) > a")
    public WebElement PaySavedPayee;

    @FindBy (xpath = "//a[@href='#ui-tabs-2']")
    public WebElement AddNewPayee;

    @FindBy (id= "np_new_payee_name")
    public WebElement PayeeNameBox;
    @FindBy (id = "np_new_payee_address")
    public WebElement PayeeAddressBox;
    @FindBy (id = "np_new_payee_account")
    public WebElement AccountBox;
    @FindBy (id = "np_new_payee_details")
    public WebElement PayeeDetails;
    @FindBy (id = "add_new_payee")
    public WebElement AddButton;

    @FindBy (id = "alert_content")
    public WebElement PayeeMessage;



    @FindBy(css = "#tabs > ul > li:nth-child(3) > a")
    public WebElement PurchaseForeignCurrency;

    @FindBy(id = "pc_currency")
    public WebElement CurrencyDropdown;
    @FindBy(id = "pc_calculate_costs")
    public WebElement CalculateCostsButton;
    @FindBy(id = "pc_amount")
    public WebElement AmountBoxOfPurchase;



    @FindBy(css = "#sp_amount")
    public WebElement AmountBox;

    @FindBy(css = "#sp_date")
    public WebElement DateBox;

    @FindBy(css = "#pay_saved_payees")
    public WebElement PayButton;

    @FindBy(xpath = "//*[@id=\"alert_content\"]/span")
    public WebElement ResultText;







}
