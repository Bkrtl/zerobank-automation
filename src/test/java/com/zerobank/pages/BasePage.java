package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#searchTerm")
    public WebElement Searchbox;

    @FindBy(css = "#account_summary_tab > a")
    public WebElement AccountSummary;

    @FindBy(css = "#account_activity_tab > a")
    public WebElement AccountActivity;

    @FindBy(css = "#transfer_funds_tab > a")
    public WebElement TransferFund;

    @FindBy(css = "#pay_bills_tab > a")
    public WebElement PayBills;

    @FindBy(css = "#money_map_tab > a")
    public WebElement MyMoneyMap;

    @FindBy(xpath = "(//*[@class='dropdown-toggle'])[2]")
    public WebElement UsernameMenu;

    @FindBy(css = "#logout_link")
    public WebElement UsernameMenuLogoutButton;

    @FindBy(xpath = "(//*[@class='dropdown-toggle'])[1]")
    public WebElement Settings;



    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(UsernameMenu);
        BrowserUtils.clickWithJS(UsernameMenuLogoutButton);
    }







}
