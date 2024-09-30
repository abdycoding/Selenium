package day4;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_findingName2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        MyFunc.bekle(2);

        // Submit form with initial data
        submitForm(driver, "Abdy", "GUmmanov");

        MyFunc.bekle(2);

        // Navigate back to the form page
        driver.navigate().back();
        MyFunc.bekle(2);

        // Submit form with new data
        submitForm(driver, "Marcus", "Rashford");

        MyFunc.bekle(2);
        driver.quit();
    }

    private static void submitForm(WebDriver driver, String firstName, String lastName) {
        WebElement radioButton = driver.findElement(By.id("label_input_3_0"));
        radioButton.click();

        MyFunc.bekle(2);

        WebElement firstNameField = driver.findElement(By.name("q8_name[first]"));
        firstNameField.clear(); // Clear the field before sending new keys
        firstNameField.sendKeys(firstName);

        MyFunc.bekle(2);

        WebElement lastNameField = driver.findElement(By.name("q8_name[last]"));
        lastNameField.clear(); // Clear the field before sending new keys
        lastNameField.sendKeys(lastName);

        MyFunc.bekle(2);

        WebElement submitButton = driver.findElement(By.id("input_2"));
        submitButton.click();
    }
}
