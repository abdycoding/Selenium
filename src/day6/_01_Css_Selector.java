package day6;

import Utility.Basedriver;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Css_Selector  extends Basedriver {
    // // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    //// 2- Business i çekleyin.
    //// 3- discover XYZ ye tıklatın ve online Advertising i seçin
    //// 4- Every day i seçin
    //// 5- Good u seçin
    //// 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    //// css selector
    //// her bir tıklatma vs işlemin arasına MyFunc.Bekle(2);
 @Test
    public void Test() {

            driver.get("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.bekle(2);
        WebElement a=driver.findElement(By.cssSelector("[id='u_187_4586_0']"));
        a.click();
        MyFunc.bekle(2);
        WebElement b=driver.findElement(By.cssSelector("[id='u_187_4588']"));
        b.click();
        MyFunc.bekle(2);
        WebElement c=driver.findElement(By.cssSelector("[value='Online Advertising']"));
        c.click();

        MyFunc.bekle(2);
        WebElement d=driver.findElement(By.cssSelector("[id='u_187_89585_0']"));
        d.click();
        MyFunc.bekle(2);
        WebElement e=driver.findElement(By.cssSelector("[id='u_187_4589']"));
        e.click();

        MyFunc.bekle(2);
        WebElement f=driver.findElement(By.cssSelector("[id='u_187_4597']"));
        f.click();


        MyFunc.bekle(2);
        WebElement g=driver.findElement(By.cssSelector("#u_187_4597 > option:nth-child(3)"));
        g.click();

        MyFunc.bekle(2);
        WebElement h=driver.findElement(By.cssSelector("#u_187_89597"));
        h.sendKeys("I think it is Macbook");
        MyFunc.bekle(2);

        WebElement i=driver.findElement(By.cssSelector("#u_187_4598"));
        i.sendKeys("Abylmyrat");

        MyFunc.bekle(2);
        WebElement j=driver.findElement(By.cssSelector("#u_187_4599"));
        j.sendKeys("Gummanov");
        MyFunc.bekle(2);
        WebElement k=driver.findElement(By.cssSelector("#u_187_4600"));
        k.sendKeys("aknturkmen896@gmail.com");
        MyFunc.bekle(2);
        WebElement l=driver.findElement(By.cssSelector("#u_187_14597"));
        l.sendKeys("01311998");
        MyFunc.bekle(2);
        WebElement site=driver.findElement(By.cssSelector("#u_187_4601"));
        site.sendKeys("https://www.hepsiburada.com/");
        MyFunc.bekle(2);

        /*
        WebElement selectElement = driver.findElement(By.id("u_187_14598"));

        // Create a Select object to interact with the dropdown
        Select dropdown = new Select(selectElement);

        // Select the option with value "AD"
        dropdown.selectByValue("AD");
         */
        WebElement ulke=driver.findElement(By.cssSelector("#u_187_14598 option[value='AD']"));

        ulke.click();




        BekleKapat();

    }
}
