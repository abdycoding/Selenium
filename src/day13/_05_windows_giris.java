package day13;

import Utility.Basedriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

// tarayicidaki hher bir sekmeye window adı veriliyor seleniumda
public class _05_windows_giris extends Basedriver {
    @Test
    public  void Test(){
        driver.get("https://www.selenium.dev/");

        // <a href="sayfa1.html" target="_blank"> google.com</a>

        List<WebElement> linkler = driver.findElements(By.xpath("//a[@target='_blank']"));

        for (WebElement e:linkler);
            
    }
}
