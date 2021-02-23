package main.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id="ap_email")
    public WebElement inputEmail;

    @FindBy(id="ap_password")
    public WebElement inputPassword;

    @FindBy(id="signInSubmit")
    public WebElement btnSubmit;





}
