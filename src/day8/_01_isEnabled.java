package day8;

import Utility.Basedriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_isEnabled extends Basedriver {
    @Test
    public void Test(){


        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali= driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("sali.isDisplayed() = " + sali.isDisplayed());
        System.out.println("sali.isEnabled() = " + sali.isEnabled());

        System.out.println("sali.isSelected() = " + sali.isSelected());
        sali.click();
        System.out.println("sali.isSelected() = " + sali.isSelected());

        WebElement friday= driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        System.out.println("friday.isSelected() = " + friday.isSelected());
        System.out.println("friday.isEnabled() = " + friday.isEnabled());
        System.out.println("friday.isDisplayed() = " + friday.isDisplayed());
        

        BekleKapat();
    }
}
