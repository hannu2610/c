package com.example.demo4.on1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
WebDriver webDriver;
@BeforeClass
public void setUp(){
    webDriver=new ChromeDriver();
    webDriver.manage().window().maximize();
}

@Test
    public void dangky() throws InterruptedException{
    webDriver.get("https://vitimex.com.vn/account/register");
    Thread.sleep(2000);
    webDriver.findElement(By.id("last_name")).sendKeys("bt");
    Thread.sleep(2000);
     webDriver.findElement(By.id("first_name")).sendKeys("cai deo gi");
    Thread.sleep(2000);
    webDriver.findElement(By.id("radio1")).click();
    Thread.sleep(2000);
    webDriver.findElement(By.id("birthday")).sendKeys("11/11/2000");
    Thread.sleep(2000);
      webDriver.findElement(By.id("email")).sendKeys("abcde@gmail.com");
    Thread.sleep(2000);
   webDriver.findElement(By.id("password")).sendKeys("123456789");
    Thread.sleep(2000);
    webDriver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    Thread.sleep(2000);
}

}