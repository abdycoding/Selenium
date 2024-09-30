package practice;

import Utility.Basedriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class d2 extends Basedriver {
    public static void main(String[] args) throws InterruptedException {



        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);

        List<WebElement> destinations = driver.findElements(By.className("destinationBox"));
        List<WebElement> draggables = driver.findElements(By.cssSelector("#a1, #a2, #a3")); // Adjust selector as needed

        for (WebElement from : draggables) {
            for (WebElement to : destinations) {
                actions.dragAndDrop(from, to).build().perform();
                // Add logic to verify if the drag-and-drop was successful
                // Break or continue based on the result
            }
        }

    }
}
