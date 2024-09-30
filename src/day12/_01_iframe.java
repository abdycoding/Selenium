package day12;

import Utility.Basedriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_iframe extends Basedriver {
    @Test
    public void Test() {
        driver.get("https://demo.automationtesting.in/Frames.html");
        //önce ilgili WebElementin bulunduğu iframe e geçmem lazım
        // id=singleframe, name=singleframe, index=0, WebElement  olarak

        driver.switchTo().frame(0); // indexi ni vererek gecebilirsin
        /*
         driver.switchTo().frame("singleframe"); // id sini vererek de gecebilirsin
           driver.switchTo().frame("singleframe"); // name ini vererek de gecebilirsin

         WebElement iframe1=driver.findElement(By.id("singleframe"));
          driver.switchTo().frame(iframe); // WebElement haline getirip oyle de gecebilirsin
         */

        WebElement txtBox = driver.findElement(By.xpath("//input[@type=]"));

    }
}
