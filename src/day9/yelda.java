package day9;

import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utility.Basedriver.BekleKapat;
import static Utility.Basedriver.driver;

public class yelda {
    @Test
    public void NegativeTest() {
        driver.navigate().to("https://www.akakce.com/");
        driver.manage().window().maximize();
        MyFunc.bekle(2);

        WebElement createAccountButton = driver.findElement(By.xpath("//div[@id='H_rl_v8']//a[contains(text(),'Hesap')]"));
        createAccountButton.click();
        MyFunc.bekle(2);
        WebElement name = driver.findElement(By.cssSelector("#rnufn"));
        name.sendKeys("Team8");
        MyFunc.bekle(2);

        WebElement surname = driver.findElement(By.cssSelector("#rnufs"));
        surname.sendKeys("TeamSekiz");
        MyFunc.bekle(2);

        WebElement email = driver.findElement(By.cssSelector("#rnufe1"));
        email.sendKeys("technostudyteam8@gmail.com");
        MyFunc.bekle(2);

        WebElement emailConfirm = driver.findElement(By.cssSelector("#rnufe2"));
        emailConfirm.sendKeys("technostudyteam8@gmail.com");
        MyFunc.bekle(2);

        WebElement password = driver.findElement(By.cssSelector("#rnufp1"));
        password.sendKeys("Furkan24");
        MyFunc.bekle(2);

        WebElement passwordConfirm = driver.findElement(By.cssSelector("#rnufp2"));
        passwordConfirm.sendKeys("Furkan24");
        MyFunc.bekle(2);

        WebElement genderMale = driver.findElement(By.cssSelector("#rngm"));
        genderMale.click();
        MyFunc.bekle(2);

        WebElement dropBoxDay = driver.findElement(By.cssSelector("#bd"));
        Select dropBox = new Select(dropBoxDay);
        dropBox.selectByVisibleText("1");
        MyFunc.bekle(2);

        WebElement dropBoxMonth = driver.findElement(By.cssSelector("#bm"));
        dropBox = new Select(dropBoxMonth);
        dropBox.selectByVisibleText("1");
        MyFunc.bekle(2);

        WebElement dropBoxYear = driver.findElement(By.cssSelector("#by"));
        dropBox = new Select(dropBoxYear);
        dropBox.selectByVisibleText("2001");
        MyFunc.bekle(2);

        WebElement checkBoxPolicy = driver.findElement(By.cssSelector("#rnufpca"));
        if (!checkBoxPolicy.isSelected()) {
            checkBoxPolicy.click();
        }
        MyFunc.bekle(2);

        WebElement submitButton = driver.findElement(By.cssSelector("#rfb"));
        submitButton.click();
        MyFunc.bekle(2);

        WebElement alertMessage = driver.findElement(By.xpath("//p"));
        String actualMessage = alertMessage.getText();
        String expectedMessage = "Lütfen adınızı yazın";
        Assert.assertEquals(actualMessage, expectedMessage);
        MyFunc.bekle(2);

        WebElement tamamButton = driver.findElement(By.xpath("//b[.='Tamam']"));
        tamamButton.click();

        BekleKapat();
    }
}
