package day9;

import Utility.Basedriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_DragandDrop extends Basedriver {
    @Test
    public void Test(){
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement first= driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
        WebElement second=driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));

        Actions actions=new Actions(driver);

        Action action=actions.dragAndDropBy(first,100,0).build();
        // dragAndDropBy (WebElement , x, y) x: yatay yonde, y dikey yonde
        // + deger girdigimizde saga dogru, - deger girdigimizde sola dogru kaydiriyor
        action.perform();

        Action action2=actions.dragAndDropBy(second, 101,0).build();
        action2.perform();

        WebElement slider=driver.findElement(By.id("slider-range"));
        int genislik=slider.getSize().width;
        System.out.println(genislik);





        BekleKapat();



    }
}
