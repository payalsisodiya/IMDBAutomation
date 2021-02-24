package main.TestScripts;

import main.Generic.FileLib;
import main.Pages.HomePage;
import main.Pages.LoginPage;
import main.Pages.SignupPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.io.IOException;

public class FinalTest {


    public static void main(String arg[]) throws IOException, InterruptedException {
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
         homePage.btnLoginWithIMDb.click();

        signupPage.inputSingUpEmail.sendKeys(email);
        signupPage.inputSignUpPassword.sendKeys(password);
        homePage.btnSignInSubmit.click();
        

        Thread.sleep(5000);
        signupPage.btnDropdown.click();
        driver.navigate().to("https://www.imdb.com/chart/top/?ref_=nv_mv_250");

        Select sort_by = new Select(signupPage.sort_option);
        sort_by.selectByValue("us:descending");
        signupPage.lastMovie.click();

        String pageText = homePage.dateData.getText();
        System.out.println(pageText);
        driver.close();
    }

}
