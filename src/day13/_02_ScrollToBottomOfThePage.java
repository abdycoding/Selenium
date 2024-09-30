package day13;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // tum sayfayi scroll
        MyFunc.bekle(2);

        js.executeScript("window.scrollTo(0,0)"); // 0 noktasina geri don, basa git
        BekleKapat();

    }
}
