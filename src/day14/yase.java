package day14;

import Utility.Basedriver;


import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


    public class yase extends Basedriver  {


        @Test
        public void Test1() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://shopdemo.fatfreeshop.com/?");

            MyFunc.bekle(2);
            WebElement demoBook = driver.findElement(By.xpath("//*[@id='products']/div[1]/div/div[2]/a/div/div[2]/button"));
            demoBook.click();

            MyFunc.bekle(2);
            WebElement assertBook = driver.findElement(By.xpath("//*[@id='Overlay']/div/div[2]/div/div[1]/div[2]/div[2]/h5"));
            Assert.assertTrue("Can't find in the cart", assertBook.getText().equals("Demo eBook"));
            MyFunc.bekle(2);


        }
    }


