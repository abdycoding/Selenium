package day5;

import Utility.Basedriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _04_Navigating  extends Basedriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        MyFunc.bekle(2);

        WebElement link=driver.findElement(By.id("alerttest"));
        link.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        MyFunc.bekle(2);

        driver.navigate().back();
        link.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        MyFunc.bekle(2);

        driver.navigate().forward();
        link.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


        BekleKapat();
    }
}
