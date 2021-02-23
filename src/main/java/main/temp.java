package main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;

public class temp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // driver.get();
        driver.navigate().to("https://www.imdb.com/chart/top/?ref_=nv_mv_250\"");
        driver.manage().window().maximize();

        Select sort_by = new Select(driver.findElement(By.id("lister-sort-by-options")));
        sort_by.selectByValue("us:descending");

        driver.findElement(By.xpath("//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody/tr[250]/td[2]/a")).click();

       // WebElement webElement = driver.findElement(By.xpath("//a[@title='See more release dates' and @href='https://www.imdb.com/title/tt0012349/releaseinfo?ref_=tt_ov_inf']"));
       // String text = (webElement.getText());
        String pageText = driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/a[4]")).getText();
        System.out.println(pageText);


    }

}
