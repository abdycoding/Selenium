package practice;

import Utility.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dragandDrop extends Basedriver {
    public static void main(String[] args) {

        // Navigate to the quiz page
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Actions actions=new Actions(driver);
        List<WebElement> from = driver.findElements(By.cssSelector("#a1, #a2, #a3, #a4, #a5, #a6, #a7, #a8, #a9, #a10, #a11, #a12, #a13, #a14, #a15"));
        for (WebElement b:from) {

            List<WebElement> to = driver.findElements(By.className("destinationBox"));

            for (WebElement draggable : from) {
                boolean placedCorrectly = false;

                // Try to drag and drop to each destination box
                for (WebElement destination : to) {
                    // Perform drag-and-drop action
                    actions.dragAndDrop(draggable, destination).perform();

                    // Check the background color of the draggable element
                    String backgroundColor = draggable.getCssValue("background-color");

                    if (backgroundColor.equals("rgb(0, 255, 0)")) { // Check if the color is green (correct)
                        placedCorrectly = true;
                        break; // Move to the next draggable element
                    } else {
                        // Revert the drag if not placed correctly
                        actions.dragAndDrop(draggable, findOriginalLocation(draggable)).perform();
                    }
                }

        }

}}  private static WebElement findOriginalLocation(WebElement element) {
        // Implement logic to find the original location of the element, if needed
        return null; }}









