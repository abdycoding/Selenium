package day4;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_findingId {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();


        driver.get("https://form.jotform.com/221934510376353");
        WebElement isimKutusu= driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("Abdy");

        MyFunc.bekle(1);

        WebElement soyisimKutusu=driver.findElement(By.id("last_8"));
        soyisimKutusu.sendKeys("GUmmanov");

        MyFunc.bekle(1);



        driver.quit();
    }
}

        /*
        html form elemanlarını gördük.
Html de kullanılan tagleri gördük.

web element
<html></html>
<input ..../>
<select></select>
<div>...</div>
<span>...</span>
<ul>...</ul>
<ol>...</ol>
<table>...</table>

kutucuğu bul, ona bir isim ver ve ona yazı gönder
butonu bul,tıklat.
select i bul bir seçenek seç
         */
