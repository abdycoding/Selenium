package practice;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trying1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://test.mersys.io/");
        MyFunc.bekle(2);


        WebElement namePlaceholder= driver.findElement(By.xpath("//input[@placeholder='Kullanıcı Adı']"));
        namePlaceholder.sendKeys("Student_3");

        MyFunc.bekle(2);
        WebElement passwordPlaceholder=driver.findElement(By.xpath("//input[@placeholder='Parola']"));
        passwordPlaceholder.sendKeys("S12345");
        MyFunc.bekle(2);
        WebElement loginButton=driver.findElement(By.className("submit-button"));
        loginButton.click();
        MyFunc.bekle(2);

        WebElement hamburgerMenu=driver.findElement(By.className("mat-mdc-menu-trigger"));
        hamburgerMenu.click();
        MyFunc.bekle(2);


        WebElement Finance=driver.findElement(By.xpath("//button//span[contains(text(), 'Finance')]"));
        Finance.click();
        MyFunc.bekle(2);

        WebElement MyFinance=driver.findElement(By.xpath("//button//span[contains(text(), 'My Finance')]"));
        MyFinance.click();
        MyFunc.bekle(5);

        WebElement ViewElement=driver.findElement(By.xpath("(//button[@mat-icon-button])[7]"));
        ViewElement.click();


        WebElement Stripe=driver.findElement(By.linkText("Stripe"));
        Stripe.click();
        MyFunc.bekle(3);

        WebElement option3=driver.findElement(By.id("mat-radio-37"));
        option3.click();
        MyFunc.bekle(3);



                driver.quit();



    }
}
