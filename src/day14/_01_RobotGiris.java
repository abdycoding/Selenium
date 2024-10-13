package day14;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _01_RobotGiris extends Basedriver {
    @Test
    public void Test() throws AWTException {

        driver.get("https://www.selenium.dev/");
        MyFunc.bekle(2);

        Robot robot=new Robot();

        driver.switchTo().window(driver.getWindowHandle());

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        MyFunc.bekle(2);

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Set<String> ids=driver.getWindowHandles();
        Iterator target= ids.iterator();
        String firstWindowId=target.next().toString();
        String secondWindowId=target.next().toString();

        driver.switchTo().window(secondWindowId);
        MyFunc.bekle(2);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.get("https://www.facebook.com/");

        BekleKapat();



    }
}
