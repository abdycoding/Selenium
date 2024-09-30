package day5;
import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Navigating_yeni  extends Basedriver {
    @Test
    public void Test1(){
        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
        MyFunc.bekle(2);

        WebElement link=driver.findElement(By.id("alerttest"));
        link.click();
        MyFunc.bekle(2);

        driver.navigate().back();
        MyFunc.bekle(2);

        driver.navigate().forward();

        Assert.assertTrue("Unfortunately, couldn't reach to the Page! ",driver.getCurrentUrl().equals("https://testpages.eviltester.com/styled/alerts/alert-test.html"));

        BekleKapat();

    }
}
