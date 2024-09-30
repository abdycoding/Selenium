package day13;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _04_JavascriptClick extends Basedriver {
    @Test
    public  void Test(){
        driver.get("https://www.copado.com/robotic-testing");
        MyFunc.bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement takeTest= driver.findElement(By.xpath("//div[text()='Take Testing Quiz']"));
        // takeTest.click(); // sayfa önünde mouse click

        js.executeScript("arguments[0].click();", takeTest); // js click: sayfanın içinden click

        BekleKapat();
    }
}
