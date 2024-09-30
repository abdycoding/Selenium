package day9;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_RightClick extends Basedriver {
    @Test
    public void  Test(){
        driver.get("http://demoqa.com/buttons");

        WebElement butonCLick= driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        MyFunc.bekle(2);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(butonCLick).contextClick().build();
        aksiyon.perform();

        BekleKapat();


    }
}
