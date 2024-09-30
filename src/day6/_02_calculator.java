package day6;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_calculator extends Basedriver {

    @Test
    public void Test (){


        //    Senaryo:
//    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//    Calculate'e tıklayınız.
//    İlk input'a herhangi bir sayı giriniz.
//    İkinci input'a herhangi bir sayı giriniz.
//    Calculate button'una tıklayınız.
//    Sonucu yazdırınız.


        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calc = driver.findElement(By.cssSelector("[href='calculator']"));
        calc.click();
        MyFunc.bekle(2);

        WebElement sayi = driver.findElement(By.id("number1"));
        sayi.sendKeys("5");
        MyFunc.bekle(2);

        WebElement sayi2 = driver.findElement(By.id("number2"));
        sayi2.sendKeys("6");
        MyFunc.bekle(2);
        WebElement submit = driver.findElement(By.id("calculate"));
        submit.click();
        BekleKapat();


    }


}
