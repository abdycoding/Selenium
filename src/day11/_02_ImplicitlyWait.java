package day11;

import Utility.Basedriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _02_ImplicitlyWait extends Basedriver {
    @Test
    public  void Test(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        // önce alttaki bölüm yok/sonra 5 sn / sonra 20sn
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement btn= driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        WebElement msg= driver.findElement(By.xpath("//*[text()='WebDriver']"));
        System.out.println("msg.getText() = " + msg.getText());

        BekleKapat();


    }
}
