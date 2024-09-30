package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hepsiburada {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Ürün, kategori veya marka ara']"));
        searchBox.sendKeys("macbook");

        WebElement ara=driver.findElement(By.xpath("//div[contains(text(),'Ürün, kategori veya marka ara')]"));
        ara.click();





    }
}
