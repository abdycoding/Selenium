package day14;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;



public class _04_WindowSize extends Basedriver {

    @Test
    public void Test(){
        driver.get("https://www.youtube.com/");
        MyFunc.bekle(2);

        driver.manage().window().maximize();

        Dimension screenSize=driver.manage().window().getSize();
        System.out.println("screenSize.height = " + screenSize.height);
        System.out.println("screenSize.width = " + screenSize.width);

        MyFunc.bekle(2);
        Dimension newDimension=new Dimension(500, 700);
        driver.manage().window().setSize(newDimension);

        BekleKapat();



    }

}
