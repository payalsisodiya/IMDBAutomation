package main.TestScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.Generic.FileLib;
import main.Pages.HomePage;
import main.Pages.LoginPage;
import main.Pages.SignupPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.io.IOException;
import java.util.Random;

public class SignupTest {
    public Random random = new Random(5);

    public static void main(String args[]) throws IOException
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        LoginPage loginPage =  PageFactory.initElements(driver, LoginPage.class);
        SignupPage signupPage =  PageFactory.initElements(driver, SignupPage.class);
        HomePage homePage =  PageFactory.initElements(driver, HomePage.class);
        FileLib fileLib = new FileLib();
        String url =  fileLib.getData().getProperty("URL");
        String name =  fileLib.getData().getProperty("NAME");
        String email =  fileLib.getData().getProperty("EMAIL");
        String password = fileLib.getData().getProperty("PASSWORD");
        driver.get(url);
        driver.manage().window().maximize();
        homePage.btnlogin.click();
        homePage.btnSignUp.click();

        signupPage.inputCustomerName.sendKeys(name);
        signupPage.inputSingUpEmail.sendKeys(email);
        signupPage.inputSignUpPassword.sendKeys(password);
        signupPage.inputSignUpConfirmPassword.sendKeys(password);
        signupPage.btnContinue.click();

        String captchaVal = JOptionPane.showInputDialog("Please solve this puzzle so we know you're a real perso");
        //Type the entered captcha to the text box
        homePage.inputCaptcha.sendKeys(captchaVal);
        homePage.btnCaptcha.click();
        System.out.println("Account Created Successfully!");

        driver.close();

    }

}
