package main.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage {

    @FindBy(id="ap_customer_name")
    public WebElement inputCustomerName;

    @FindBy(id="ap_email")
    public WebElement inputSingUpEmail;

    @FindBy(id="ap_password")
    public WebElement inputSignUpPassword;

    @FindBy(id="ap_password_check")
    public WebElement inputSignUpConfirmPassword;

    @FindBy(id="continue")
    public WebElement btnContinue;


    @FindBy(id="imdbHeader-navDrawerOpen--desktop")
    public WebElement btnDropdown;

    @FindBy(id="lister-sort-by-options")
    public WebElement sort_option;

    @FindBy(xpath = "//*[@id='main']/div/span/div/div/div[3]/table/tbody/tr[250]/td[2]/a")
    public WebElement lastMovie;










}
