package day10;

import Utility.Basedriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionButtonControlSendKeys extends Basedriver {
    @Test
    public void  Test(){
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox= driver.findElement(By.id("autoCompleteMultipleInput"));

        new Actions(driver).moveToElement(txtBox) // kutucuga ait
                .click()                   // yazabilmek icin icine tiklat
                .keyDown(Keys.SHIFT)        // shift tusuna bas
                .sendKeys("a")      // a harfini gonder buyuk A yazmali shift den dolayi
                .keyUp(Keys.SHIFT)      // shift tusunu geri birak
                .sendKeys("hmet")   // hmet yazisini tusunu geri birak
                .build()            // aksiyonu hazirla
                .perform();     // islemi gerceklesir
        BekleKapat();
    }
}
