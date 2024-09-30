package day9;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_DoubleClick extends Basedriver {
    @Test
    public  void Test(){
        driver.get("http://demoqa.com/buttons");

        WebElement butonCLick= driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        MyFunc.bekle(2);

        Actions aksiyonlar=new Actions(driver);
        // 1st way
        Action aksiyon=aksiyonlar.moveToElement(butonCLick).doubleClick().build();
        aksiyon.perform();

        //2nd way
        //new Actions(driver).click(butonCLick).doubleClick().build().perform();


        BekleKapat();
    }
}
