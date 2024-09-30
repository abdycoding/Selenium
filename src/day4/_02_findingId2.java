package day4;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

public class _02_findingId2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();


        driver.get("https://form.jotform.com/221934510376353");

        try {


            WebElement isimKutusu = driver.findElement(By.id("Error locator"));

        }

     catch (Exception ex){
         System.out.println("There is no message in the element " + ex.getMessage());
     }

        MyFunc.bekle(5);



        driver.quit();
    }
}
