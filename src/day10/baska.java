package day10;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class baska  extends Basedriver
{
    @Test
    public void Test1() {
    driver.get("https://www.mediamarkt.com.tr/");
    WebElement hamburger = driver.findElement(By.id("mms-app-header-category-button"));

        new Actions(driver)
                .moveToElement(hamburger)
                .click()
                .build()
                .perform();
        MyFunc.bekle(2);

    WebElement beyazEsya = driver.findElement(By.id("category-197"));
        new Actions(driver)
                .moveToElement(beyazEsya)
                .build()
                .perform();
        MyFunc.bekle(2);

    WebElement kombiler = driver.findElement((By.xpath("(//span[text()='Kombiler'])[1]"))); //"(//span[text()='Kombiler'])[1]"
        new Actions(driver)
                .click(kombiler)
                .build()
                .perform();
        MyFunc.bekle(2);

        Assert.assertTrue("failed", driver.getCurrentUrl().contains("kombiler"));
    BekleKapat();
}
}
