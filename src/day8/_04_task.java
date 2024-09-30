package day8;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_task extends Basedriver {
    /*

     */
    @Test
    public void Test(){

        driver.get("https://www.facebook.com/");

        MyFunc.bekle(2);

        WebElement tikla=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        tikla.click();

        WebElement gun=driver.findElement(By.id("day"));
        WebElement ay=driver.findElement(By.id("month"));
        WebElement yil=driver.findElement(By.id("year"));

        Select gun1=new Select(gun);
        MyFunc.bekle(2);
        Select ay1=new Select(ay);
        MyFunc.bekle(2);
        Select yil1=new Select(yil);
        MyFunc.bekle(2);

        gun1.selectByValue("31");
        ay1.selectByIndex(0);
        yil1.selectByValue("1998");

        BekleKapat();


    }
}
