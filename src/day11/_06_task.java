package day11;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _06_task extends Basedriver {
    @Test
    public  void  Test(){

            /*
    Senaryo
    1-  https://www.demoblaze.com/index.html  siteyi açınız.
    2- Samsung galaxy s6  linkine tıklayınız.
    3- Sepete ekleyiniz.
    4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
     */

        driver.get("https://www.demoblaze.com/index.html");
        WebDriverWait wait=new WebDriverWait( driver, Duration.ofSeconds(5));
        WebElement click = driver.findElement(By.xpath("//a[@href='prod.html?idp_=1']"));
        click.click();

        WebElement click2 = driver.findElement(By.linkText("Add to cart"));
        click2.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement click3=driver.findElement(By.id("nava"));
        click3.click();
        BekleKapat();
    }
}
