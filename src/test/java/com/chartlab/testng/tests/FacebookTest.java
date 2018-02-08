package com.chartlab.testng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by vinodnayal on 08-02-2018.
 */
public class FacebookTest {

    @Parameters({"userName","password"})
    @Test
    public void TestLogin(String userName,String password){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement user = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.id("email")));
        WebElement pass = driver.findElement(By.id("pass"));
        user.sendKeys(userName);
        pass.sendKeys(password);
    }

    @Parameters({"a","b"})
    @Test
    public void Add(int a, int b){
        System.out.println(a+b);
    }
}
