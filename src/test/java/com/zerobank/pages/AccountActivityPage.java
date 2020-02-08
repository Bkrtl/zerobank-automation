package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityPage extends BasePage {


    @FindBy (css = "#account_activity_tab")
    public WebElement AccountActivity;

    @FindBy(css = "#aa_accountId")
    public  WebElement dropdownBox;

    @FindBy(xpath = "//*[@id=\"all_transactions_for_account\"]/table//th")
    public List<WebElement> AccountActivityTransactionTableHeaders;

    @FindBy (xpath = "//*[@href='#ui-tabs-2']")
    public  WebElement FindTransactions;

    @FindBy(id = "aa_fromDate")
    public WebElement FromDate;

    @FindBy(id = "aa_toDate")
    public WebElement ToDate;

    @FindBy (xpath = " //button[@type='submit']")
    public  WebElement FindButton;







    //WebDriverWait wait=new WebDriverWait(Driver.get(),15);
    public List<String> getActualOptionsListString(){
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.id("aa_accountId")));
        Select select = new Select(dropdownBox);
        List<WebElement> actualOptions = select.getOptions();
        List<String> textActualOptions = new ArrayList<>();

        for(WebElement option: actualOptions){
            textActualOptions.add(option.getText());
        }
        return textActualOptions;
    }

}
