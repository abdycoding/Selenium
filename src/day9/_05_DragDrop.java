package day9;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_DragDrop extends Basedriver {
    @Test
    public  void Test(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions aksiyonlar=new Actions(driver);
        MyFunc.bekle(2);

        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norvec=driver.findElement(By.id("box101"));

        aksiyonlar.dragAndDrop(oslo,norvec).build().perform();
        // get the Oslo and drop it to the Norvec, sometimes it works fast so there maybe some problems

        //2nd way (better way)
        /*
        aksiyonlar.clickAndHold(oslo).build().perform(); // osloyu eline al
        aksiyonlar.moveToElement(norvec).release().build().perform();

         */

        BekleKapat();



    }
}
