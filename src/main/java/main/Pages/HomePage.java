package main.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

/*
    public  HomePages(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
*/
    public String webURL = "https://www.imdb.com";

    @FindBy(linkText="Sign In")
    public WebElement btnlogin;

    @FindBy(xpath = "//a[@class='list-group-item ']")
    public WebElement btnSignIn;

    @FindBy(xpath = "//a[@class='list-group-item create-account ']")
    public WebElement btnSignUp;

    @FindBy(xpath = "//input[@class='a-input-text a-span12 cvf-widget-input cvf-widget-input-code cvf-widget-input-captcha fwcim-captcha-guess']")
    public WebElement inputCaptcha;

    @FindBy(xpath = "//input[@class='a-button-input']")
    public WebElement btnCaptcha;

    @FindBy(xpath = "//a[@class='list-group-item ']")
    public WebElement btnLoginWithIMDb;


    @FindBy(id = "signInSubmit")
    public WebElement btnSignInSubmit;

    @FindBy(xpath = "//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/a[4]")
    public WebElement dateData;


}
