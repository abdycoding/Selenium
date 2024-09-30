package day8;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_task extends Basedriver {

    @Test
    public void Test(){
        /*
        //        Test Senaryosu
//        1- https://www.ebay.co.uk/  sayfasına gidiniz
//        2- Kategorilerden Baby seçeneğini seçiniz.
//        3- Arama butonuna tıklatınız.
//        4- Sonuçları çıktığı ekranda sol başlık
//            kısmında Baby kelimesinin geçtiğini doğrulayınız
         */
        driver.get("https://www.ebay.co.uk/");
        MyFunc.bekle(2);
        WebElement secenek= driver.findElement(By.id("gh-cat"));
        MyFunc.bekle(2);
        Select dr=new Select(secenek);

        dr.selectByIndex(3);

        WebElement click= driver.findElement(By.id("gh-btn"));
        click.click();
        MyFunc.bekle(2);
        WebElement baby=driver.findElement(By.className("b-pageheader__text"));
        // //span[text()='Baby Essentials']
        MyFunc.bekle(2);
        Assert.assertTrue("Hata var burda",baby.getText().contains("Baby"));
        BekleKapat();



    }
}
