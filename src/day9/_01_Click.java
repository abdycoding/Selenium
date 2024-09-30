package day9;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_Click extends Basedriver {

    @Test
    public  void Test(){
        driver.get("http://demoqa.com/buttons");

        WebElement butonCLick= driver.findElement(By.xpath("//button[text()='Click Me']"));


        Actions aksiyonlar=new Actions(driver);
        //1st way
      Action aksiyon =aksiyonlar.moveToElement(butonCLick).click().build();
     // elementin uzerine click icin git orda bekle. aksiyona Hazirla

        MyFunc.bekle(2);
        aksiyon.perform();

        // kisa hali
        // aksiyonlar.moveToElement(butonClick).click().build().perform();

//        new Actions(driver).click(butonCLick).build().perform();


//        MyFunc.bekle(2);
//        BekleKapat();

    }


}
