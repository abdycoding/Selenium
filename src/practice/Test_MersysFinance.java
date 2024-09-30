package practice;

import Utility.Basedriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Test_MersysFinance extends Basedriver {
    public static void main(String[] args) {

        driver.get("https://test.mersys.io/");
        driver.manage().window().maximize();

        WebElement namePlaceholder = driver.findElement(By.id("mat-input-0"));
        namePlaceholder.sendKeys("Student_3");
        MyFunc.bekle(3);


        WebElement passwordPlaceholder = driver.findElement(By.id("mat-input-1"));
        passwordPlaceholder.sendKeys("S12345");
        MyFunc.bekle(2);

        WebElement girisYap = driver.findElement(By.className("submit-button"));
        girisYap.click();
        MyFunc.bekle(2);

        WebElement hamburgerMenu = driver.findElement(By.className("mat-mdc-menu-trigger"));
        hamburgerMenu.click();

        List<WebElement> finance = driver.findElements(By.className("mat-mdc-menu-item"));

        WebElement financebutonu = finance.get(1);
        financebutonu.click();
        MyFunc.bekle(2);


        WebElement Myfinance = driver.findElement(By.xpath("//button//span[contains(text(), 'My Finance')]"));
        // xpath("//button[@role='menuitem' and contains(., 'My Finance')]")
        Myfinance.click();

        MyFunc.bekle(3);
        List<WebElement> viewButonlari = driver.findElements(By.className("mat-mdc-tooltip-trigger"));

        WebElement view = viewButonlari.get(13);
        view.click();

        MyFunc.bekle(2);

        WebElement stripe = driver.findElement(By.id("mat-radio-8-input"));
        stripe.click();

        MyFunc.bekle(2);
        WebElement option3 = driver.findElement(By.id("mat-radio-13-input"));
        option3.click();
        MyFunc.bekle(5);
        WebElement option4 = driver.findElement(By.xpath("//input[@type='radio' and @value='CUSTOM_AMOUNT']"));
        option4.click();

        WebElement doldur = driver.findElement(By.xpath("//input[@placeholder='Amount']"));
        doldur.sendKeys("100");
        MyFunc.bekle(3);

        WebElement option5 = driver.findElement(By.xpath("//input[@type='radio' and @value='CUSTOM_AMOUNT']"));
        option5.click();

        List<WebElement> pay = driver.findElements(By.className("mat-badge"));

        WebElement pay1 = pay.get(8);
        pay1.click();
        pay1.click();

        MyFunc.bekle(5);

        WebElement GooglePay = driver.findElement(By.id("google_pay-tab"));
        GooglePay.click();

        MyFunc.bekle(2);
        WebElement cardTikla = driver.findElement(By.id("card-tab"));
        cardTikla.click();
        MyFunc.bekle(2);
        WebElement kardnUmarasi = driver.findElement(By.id("Field-numberInput"));
        kardnUmarasi.sendKeys("4242424242424242");
        MyFunc.bekle(2);

        WebElement date = driver.findElement(By.id("Field-expiryInput"));
        date.sendKeys("524");
        MyFunc.bekle(2);
        WebElement cvc = driver.findElement(By.id("Field-cvcInput"));
        cvc.sendKeys("311");
        MyFunc.bekle(2);
        WebElement stripeButon = driver.findElement(By.className("AnimateSinglePresence"));
        stripeButon.click();

        BekleKapat();


    }
}
