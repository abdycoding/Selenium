package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oxford_dictionary {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Oxford Learner's Dictionaries page
        driver.get("https://www.oxfordlearnersdictionaries.com/");

        // Array of words to search for
        String[] words = {"initialize", "barrier", "optimization"};

        // Loop through each word
        for (String word : words) {
            // Find the search input field by its id
            WebElement placeHolder = driver.findElement(By.id("q"));

            // Clear the input field before entering the next word
            placeHolder.clear();

            // Enter the word into the search field
            placeHolder.sendKeys(word);

            // Find the search button by its title attribute and click it
            WebElement click = driver.findElement(By.xpath("//label[@title='Search']"));
            click.click();

            // Add a short wait to allow the page to load
            try {
                Thread.sleep(3000); // Adjust the sleep time if necessary
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Close the browser
        driver.quit();

    }
}
