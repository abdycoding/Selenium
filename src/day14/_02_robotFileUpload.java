package day14;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.Instant;

public class _02_robotFileUpload extends Basedriver {


    @Test
    public void Test() throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");

        MyFunc.bekle(2);
        Robot rbt = new Robot();

        for (int i = 1; i <= 14; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);

        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        MyFunc.bekle(2);

        //stringi hafızaya kopyalama yöntemi
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\MEYLİS\\Downloads\\se.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        //ctrl+v dosya yolunu yapıştırma işlemi
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);


        MyFunc.bekle(1);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        MyFunc.bekle(2);

        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);

        }//Submit buttonuna geldin
        MyFunc.bekle(1);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);


        WebElement msg=wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[text()='has been successfully uploaded.']")));

            Assert.assertTrue(msg.isDisplayed()); // assert
        MyFunc.bekle(5);

        BekleKapat();

    }
}
