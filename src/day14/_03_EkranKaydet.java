package day14;

import Utility.Basedriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class _03_EkranKaydet extends Basedriver {
    @Test
    public void Test(){

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("12345");

        List<WebElement> errorMsg=driver.findElements(By.xpath("//*[text()='Invalid credentials']"));
        if (errorMsg.size()>0)
        {
            System.out.println("Hata");
            // hata olustu ekran kaydi al

            TakesScreenshot ts=(TakesScreenshot) driver;
           File hafizadakiFile= ts.getScreenshotAs(OutputType.FILE);
           // ekran kaydini Dosya formati olarak

        }
    }
}
