package day10;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_task extends Basedriver {
    @Test
    public void Test() {
        //    https://www.mediamarkt.com.tr/ sayfasına gidiniz.
//    Tüm Kategoriler -> Beyaz Eşya -> Kombiler click
//    tıklatma işleminden sonra URL de
//    kombi kelimesinin geçtiğini doğrulayın.

        driver.get("https://www.mediamarkt.com.tr/");

        Actions aksiyonlar = new Actions(driver);
        WebElement buton = driver.findElement(By.id("mms-app-header-category-button"));

        MyFunc.bekle(2);
        new Actions(driver).moveToElement(buton).click().build().perform();

        WebElement beyazesya = driver.findElement(By.id("category-197"));
        MyFunc.bekle(2);
        Action tikla = aksiyonlar.moveToElement(beyazesya).build();
        tikla.perform();

        MyFunc.bekle(2);
        WebElement kombi = driver.findElement(By.xpath("//a[@href='/tr/category/kombiler-465754.html']"));
        aksiyonlar.click(kombi).build().perform();
        MyFunc.bekle(2);

//        WebElement kombiitext= driver.findElement(By.cssSelector(".sc-79b3b918-0>h1:nth-child(1)"));
//        Assert.assertTrue("Error", kombiitext.getText().contains("Kombi"));

        Assert.assertTrue("Urlde kombi kelimesi bulunmadi", driver.getCurrentUrl().contains("kombi"));

        BekleKapat();
    }
}
