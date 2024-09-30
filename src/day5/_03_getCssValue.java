package day5;

import Utility.Basedriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_getCssValue extends Basedriver {
    public static void main(String[] args) {
// baslangicIslemleri() direk  static bolum calisti

        driver.get("https://www.snapdeal.com/");

        WebElement link= driver.findElement(By.id("inputValEnter"));


        System.out.println("link.getAttribute(\"class\") = " + link.getAttribute("class"));

        //elementi sekillendiren degerleri veriyor
        System.out.println("link.color = " + link.getCssValue("color"));
        System.out.println("link.background = " + link.getCssValue("background"));
        System.out.println("link.font-size = " + link.getCssValue("font-size"));
        System.out.println("link.border = " + link.getCssValue("border"));
        System.out.println("link.font-family = " + link.getCssValue("font-family"));


      BekleKapat();
    }
}
