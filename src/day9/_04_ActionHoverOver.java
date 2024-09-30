package day9;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionHoverOver extends Basedriver {
    @Test
    public  void Test(){
        driver.get("https://www.hepsiburada.com/");
        Actions aksiyonlar=new Actions(driver);

        MyFunc.bekle(2);

        WebElement element=driver.findElement(By.xpath("//span[text()='Moda']"));

        Action aksiyon=aksiyonlar.moveToElement(element).build(); // uzerine gittin
        aksiyon.perform(); // uzerinde oldugunu etkinlestir

        // new Actions(driver).moveToElement(element).build().perform();
        BekleKapat();
    }
}
