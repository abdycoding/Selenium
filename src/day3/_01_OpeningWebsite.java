package day3;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        driver.get("https://techno.study/"); // open the web page

        // 3 sn bekle
        MyFunc.bekle(5);
        driver.quit();


    }
}
