package day7;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_Xpath extends Basedriver {
    @Test
    public void Test() {
        //        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.
        //    Assert.assertTrue(urunFiyatToplamlam == itemTotal)

        driver.get("https://www.saucedemo.com/");
        MyFunc.bekle(2);
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        MyFunc.bekle(2);
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        MyFunc.bekle(2);
        WebElement login = driver.findElement(By.xpath("//input[@name='login-button']"));
        login.click();
        MyFunc.bekle(2);
        WebElement sauce = driver.findElement(By.xpath("//a[@id='item_4_title_link']"));
        sauce.click();
        MyFunc.bekle(2);
        WebElement button1 = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        button1.click();
        MyFunc.bekle(2);
        WebElement back1 = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        back1.click();
        MyFunc.bekle(2);
        WebElement tshirt = driver.findElement(By.xpath("//a[@id='item_1_title_link']"));
        tshirt.click();
        MyFunc.bekle(2);
        WebElement button2 = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        button2.click();
        MyFunc.bekle(2);
        WebElement back2 = driver.findElement(By.xpath("//button[@name='back-to-products']"));
        back2.click();
        MyFunc.bekle(2);
        WebElement sepet = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
        sepet.click();
        MyFunc.bekle(2);

        WebElement check = driver.findElement(By.xpath("//button[@id='checkout']"));
        check.click();
        MyFunc.bekle(2);


        WebElement Fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        Fname.sendKeys("Akin");
        MyFunc.bekle(2);
        WebElement Lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        Lname.sendKeys("turkmen");
        MyFunc.bekle(2);

        WebElement Posta = driver.findElement(By.xpath("//input[@name='postalCode']"));
        Posta.sendKeys("55200");
        MyFunc.bekle(2);

        WebElement continue2 = driver.findElement(By.xpath("//input[@type='submit']"));
        continue2.click();
        MyFunc.bekle(2);

        WebElement total = driver.findElement(By.xpath("//div[@data-test='subtotal-label']"));

        List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        double totalfiyat = 0.0;


        for (WebElement a : priceElements) {
            String fiyat1 = a.getText().replace("$", "");
            //             String fiyat1 = a.getText().replaceAll("[^0-9,.]", "");

            double fiyat = Double.parseDouble(fiyat1);

            totalfiyat += fiyat;
        }
        System.out.println("Total price = " + totalfiyat);

        String fiyat = Double.toString(totalfiyat);

        Assert.assertTrue("Error!", total.getText().contains(fiyat));
        //Assert.assertTrue("Error!", total==fiyat)

        BekleKapat();


    }
}
