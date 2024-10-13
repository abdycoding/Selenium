package day13;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

// tarayicidaki hher bir sekmeye window adı veriliyor seleniumda
public class _05_windows_giris extends Basedriver {
    @Test
    public  void Test(){
        driver.get("https://www.selenium.dev/");

        // <a href="sayfa1.html" target="_blank"> google.com</a>
        String mainPage=driver.getWindowHandle();

        List<WebElement> linkler = driver.findElements(By.xpath("//a[@target='_blank']"));

        for (WebElement e:linkler)
            js.executeScript("arguments[0].click();", e);

        Set<String> windowsIds=driver.getWindowHandles();
        for (String id:windowsIds)
            System.out.println("id= " + id);

        MyFunc.bekle(2);
        driver.switchTo().window(mainPage);

        MyFunc.bekle(2);
        BekleKapat();
            
    }
}
