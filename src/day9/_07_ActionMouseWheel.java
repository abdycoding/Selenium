package day9;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionMouseWheel extends Basedriver {
    @Test
    public  void Test(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.bekle(2);

        WebElement iframe= driver.findElement(By.name("nested_scrolling_frame"));

        new Actions(driver)
                .scrollToElement(iframe)
                .build()
                .perform();
        BekleKapat();


    }
}
