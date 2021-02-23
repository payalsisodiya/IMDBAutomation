package main;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;
import java.sql.Driver;
import java.util.Random;

public class SignupPage {

public Random random = new Random(5);

    public static void main(String args[])
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String url="https://imdb.com/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.xpath("//a[@class='list-group-item create-account ']")).click();
        driver.findElement(By.id("ap_customer_name")).sendKeys("Payal");
        driver.findElement(By.id("ap_email")).sendKeys("payalsisodiya94@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("12345678");
        driver.findElement(By.id("ap_password_check")).sendKeys("12345678");
        driver.findElement(By.id("continue")).click();

        String captchaVal = JOptionPane.showInputDialog("Please solve this puzzle so we know you're a real perso");
        //Type the entered captcha to the text box
        driver.findElement(By.xpath("//input[@class='a-input-text a-span12 cvf-widget-input cvf-widget-input-code cvf-widget-input-captcha fwcim-captcha-guess']")).sendKeys(captchaVal);
        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
        //verification




        //driver.close();

    }
}
