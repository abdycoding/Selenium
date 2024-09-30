package day4;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_findingByClassName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        driver.get("https://form.jotform.com/221934510376353");
        MyFunc.bekle(2);

        WebElement class1=driver.findElement(By.className("form-sub-label"));
        System.out.println("class1.getText() = " + class1.getText());

        List<WebElement> classler=  driver.findElements(By.className("form-sub-label"));
        for (WebElement e:classler){
            System.out.println("e.getText() = " + e.getText());
        }
        System.out.println("classler.size() = " + classler.size());

        MyFunc.bekle(3);
        driver.quit();

    }
}
