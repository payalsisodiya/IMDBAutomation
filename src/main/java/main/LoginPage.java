package main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class LoginPage {
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String url="https://imdb.com/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.xpath("//a[@class='list-group-item ']")).click();
        driver.findElement(By.id("ap_email")).sendKeys("payalsisodiya94@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("12345678");
        driver.findElement(By.id("signInSubmit")).click();
      //  driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("12345678");
        //String captchaVal = JOptionPane.showInputDialog("Enter the characters you see");
        //Type the entered captcha to the text box
        //driver.findElement(By.xpath("//input[@class='a-input-text a-span12 cvf-widget-input cvf-widget-input-code cvf-widget-input-captcha fwcim-captcha-guess']")).sendKeys(captchaVal);

        driver.findElement(By.id("imdbHeader-navDrawerOpen--desktop")).click();
       // driver.findElement(By.xpath("//a[@class='ipc-list__item nav-link sc-jTzLTM fjLstn ipc-list__item--indent-one']/child::span[contains(text(),'Top Rated Movies')]")).click();
       // driver.findElement(By.xpath("//a[@href='/chart/top/?ref_=nv_mv_250']")).click();
        //driver.findElement(By.linkText("Top Rated Movies")).click();
        //driver.findElement(By.id("lister-sort-by-options")).click();
       // driver.findElement(By.xpath("//a[@href='https://www.imdb.com/chart/top/?ref_=nv_mv_250' and @class='ipc-list__item nav-link sc-jTzLTM fjLstn ipc-list__item--indent-one']")).click();

        //driver.get("https://www.imdb.com/chart/top/?ref_=nv_mv_250");
        driver.navigate().to("https://www.imdb.com/chart/top/?ref_=nv_mv_250\"");

        Select sort_by= new Select(driver.findElement(By.id("lister-sort-by-options")));
        sort_by.selectByValue("us:descending");

        driver.findElement(By.xpath("//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody/tr[250]/td[2]/a")).click();

        // WebElement webElement = driver.findElement(By.xpath("//a[@title='See more release dates' and @href='https://www.imdb.com/title/tt0012349/releaseinfo?ref_=tt_ov_inf']"));
        // String text = (webElement.getText());
        String pageText = driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/a[4]")).getText();
        System.out.println(pageText);

    }
}
