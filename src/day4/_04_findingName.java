package day4;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_findingName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();


        driver.get("https://form.jotform.com/221934510376353");
        MyFunc.bekle(2);
        WebElement tikla1=driver.findElement(By.id("label_input_3_0"));
        tikla1.click();
        MyFunc.bekle(2);
        WebElement isimKutusu= driver.findElement(By.name("q8_name[first]"));
        isimKutusu.sendKeys("Abdy");
        MyFunc.bekle(2);
        isimKutusu.clear();
        isimKutusu.sendKeys("Cris");


        MyFunc.bekle(2);

        WebElement soyisimKutusu=driver.findElement(By.name("q8_name[last]"));
        soyisimKutusu.sendKeys("GUmmanov");
        MyFunc.bekle(2);
        WebElement tikla=driver.findElement(By.id("input_2"));
        tikla.click();


        MyFunc.bekle(2);

        driver.navigate().back();
        MyFunc.bekle(2);

        WebElement tikla2=driver.findElement(By.id("label_input_3_1"));
        tikla2.click();
        MyFunc.bekle(2);
        WebElement isimKutusu2= driver.findElement(By.name("q8_name[first]"));
        isimKutusu2.clear();
        MyFunc.bekle(2);
        isimKutusu2.sendKeys("Marcus");

        MyFunc.bekle(2);

        WebElement soyisimKutusu2=driver.findElement(By.name("q8_name[last]"));
        soyisimKutusu2.clear();
        MyFunc.bekle(2);
        soyisimKutusu2.sendKeys("Rashford");
        MyFunc.bekle(2);
        WebElement tikla3=driver.findElement(By.id("input_2"));
        tikla3.click();


        MyFunc.bekle(2);
//        driver.quit();

    }
}
