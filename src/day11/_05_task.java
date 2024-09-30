package day11;

import Utility.Basedriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _05_task extends Basedriver {
    @Test
    public void Test() {

        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

        WebElement  btn1= driver.findElement(By.id("btn1"));
        btn1.click();

        WebElement txt1= driver.findElement(By.id("txt1"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(txt1));

        txt1.sendKeys("Hello World");

        WebElement  btn2= driver.findElement(By.id("btn2"));
        btn2.click();

        WebElement txt2= driver.findElement(By.id("txt2"));
        wait.until(ExpectedConditions.visibilityOf(txt2));
        txt2.sendKeys("Gummanov");
        BekleKapat();

    }
}
