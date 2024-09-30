package day12;

import Utility.Basedriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_task extends Basedriver {
/*
Senaryo:
    https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html
    Sayfasına gidiniz.
    1-Sayfada PlaceHolder yazısını elementin gettextinden yazdırınız
    2-Ekrandaki checkBox çekleyiniz.
    3-Sayfadaki First row yazısını elementtin Gettext i ile yazdırınız
    4-Sayfadaki IFrame Above  yazısını elementin Gettext i ile yazdırınız
 */
    @Test
            public void Test() {

        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        WebElement placeholder= driver.findElement(By.xpath("//div[text()='Placeholder']"));
        placeholder.getText();
        driver.switchTo().frame(0);  // dışdaki frame in içine girildi

        WebElement chech=driver.findElement(By.xpath("//input[@type='checkbox']"));
        chech.click();

        WebElement first=driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]"));
        first.getText();
        driver.switchTo().parentFrame(); // anasayfaya gittim

        WebElement iframe=driver.findElement(By.xpath("/html/body/footer"));
        iframe.getText();
        BekleKapat();

    }
}
