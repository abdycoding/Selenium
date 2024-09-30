package day13;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _01_ScrollToBy extends Basedriver {
    @Test
    public  void Test(){
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.bekle(2);

        // Actions aksiyonlar = new Actions(driver);
        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("window.scrollTo(0,500)"); // driverdan bir tane Javascipt
        MyFunc.bekle(2);                                // çalıştırıcısı oluşturdum

        js.executeScript("window.scrollTo(0,500)");   // dikey yönde 500 px scroll yap
        MyFunc.bekle(2);

        js.executeScript("window.scrollTo(0,500)"); // bulunduğun yerden itibaren
        MyFunc.bekle(2);                                // dikey yönde 500 px scroll yap

        js.executeScript("window.scrollTo(0,500)");   // yani bulunduğun yerden 500 geri gel

        BekleKapat();



    }
}

