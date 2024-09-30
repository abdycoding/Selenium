package day10;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionButtonControl extends Basedriver {

    @Test
    public void Test() {
        driver.get("https://demoqa.com/auto-complete");
        MyFunc.bekle(2);
        WebElement txtBox = driver.findElement(By.id("autoCompleteMultipleInput"));

        MyFunc.bekle(2);
        new Actions(driver).moveToElement(txtBox) // kutucuga ait
                .click()
                .sendKeys("b")
                .build()
                .perform();

        MyFunc.bekle(2);

        new Actions(driver)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        BekleKapat();

    }
}