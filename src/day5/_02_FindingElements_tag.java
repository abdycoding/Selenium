package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_FindingElements_tag {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");

        List<WebElement> linkler=driver.findElements(By.tagName("a"));

        System.out.println("linkler.size() = " + linkler.size());
        for (WebElement a:linkler){
            if (!a.getText().equals("") && a.getAttribute("href")!=null) {
                System.out.println("a.getText() = " + a.getText());
            }
        }
        driver.quit();
    }
}
