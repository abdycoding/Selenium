package day13;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _06_WindowsTask extends Basedriver {
    /*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */
    @Test
    public  void  Test(){


        driver.get("https://www.selenium.dev/");
        MyFunc.bekle(2);

        String mainPage=driver.getWindowHandle();
        List<WebElement> links=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement e:links){
            if (e.getAttribute("href").equalsIgnoreCase("https://kiwiirc.com/nextclient/irc.libera.chat/#selenium"));

            js.executeScript("arguments[0].click();", e);
            System.out.println("e.getAttribute(\"href\") = " + e.getAttribute("href"));

        }
        MyFunc.bekle(2);

        Set<String> tabIds=driver.getWindowHandles();
        for (String id:tabIds){
            driver.switchTo().window(id);
            System.out.println(driver.getTitle() + " " + driver.getCurrentUrl());
        }

        for (String id:tabIds){
            if (id.equals(mainPage)) continue; // if it is main page then pass

            driver.switchTo().window(id);

            driver.close();  // only closes the current tab
        }
        MyFunc.bekle(2);
        BekleKapat();
    }

}
