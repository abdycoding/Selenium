package day8;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Select_class extends Basedriver {
    @Test
    public void Test(){
        driver.get("https://www.amazon.com.tr/");
        MyFunc.bekle(2);
        WebElement select= driver.findElement(By.id("searchDropdownBox"));
        /*
        // bu element eğer SELECT tag ile başlayan web elementi ise
        // bu Select nesnesine CAST yap ve öyle kullan,

        // elementi daha rahat kullanılabilir SELECT nesnesi haline dönüştürdü.
         */

        Select dropdownMenu=new Select(select);// web deki select, Selenium Java daki Selecte cast ediliyor

        dropdownMenu.selectByIndex(4); // index ile
        MyFunc.bekle(2);
        dropdownMenu.selectByVisibleText("Gıda ve İçecek"); // gorunen text ile
        MyFunc.bekle(2);
        dropdownMenu.selectByValue("search-alias=fashion"); // value ile
        MyFunc.bekle(2);

        System.out.println("dropdownMenu.getOptions() = " + dropdownMenu.getOptions().size());

        for (WebElement secenek: dropdownMenu.getOptions())
            System.out.println("secenek.getText() = " + secenek.getText());

        BekleKapat();





    }
}
