package day11;

import Utility.Basedriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _07_task extends Basedriver {
    @Test
    public  void  Test(){
        driver.get("https://google.com/");

        /*
    Senaryo:
    https://google.com/ da selenium kelimesini aratınız.
    ilk çıkan sonuca tıklatıp,(selenium)
    çıkan URL yi ekrana yazdırınız.
    Beklenen url https://www.selenium.dev/  olduğunu doğrulayınız
 */

        WebElement ara= driver.findElement(By.xpath("//textarea[@title='Ara']"));
        ara.sendKeys("selenium" + Keys.ENTER);



//        new Actions(driver).moveToElement(ara)
//                .click().keyDown(Keys.ENTER).build().perform();

        WebElement click=driver.findElement(By.xpath("//*[text()='Selenium']"));
        click.click();


        Assert.assertTrue("Error",driver.getCurrentUrl().contains("https://www.selenium.dev/"));
        BekleKapat();




    }
}
