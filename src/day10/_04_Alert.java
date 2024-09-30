package day10;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Alert extends Basedriver {
    @Test
    public void Test2() {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.bekle(2);
        WebElement click = driver.findElement(By.id("prompt"));
        click.click();
        MyFunc.bekle(2);
        driver.switchTo().alert().sendKeys("Geliyor");
        MyFunc.bekle(2);
        driver.switchTo().alert().dismiss();

        WebElement txt= driver.findElement(By.id("text"));
        Assert.assertTrue("No Message", txt.getText().equalsIgnoreCase("null"));



    }
    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.bekle(2);
        WebElement click = driver.findElement(By.id("prompt"));
        click.click();
        MyFunc.bekle(2);
        driver.switchTo().alert().sendKeys("Geliyor");
        MyFunc.bekle(2);
        driver.switchTo().alert().accept();

        WebElement txt= driver.findElement(By.id("text"));
        Assert.assertTrue("No Message", txt.getText().equalsIgnoreCase("null"));

BekleKapat();

    }

}
