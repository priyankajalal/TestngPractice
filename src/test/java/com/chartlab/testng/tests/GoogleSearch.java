package com.chartlab.testng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by vinodnayal on 08-02-2018.
 */
public class GoogleSearch {

    @Test
    public void SearchEngineTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() throws InterruptedException {
        System.out.println("test addition");
        assert(2==2);
      /*  WebDriver driver = new ChromeDriver();
        driver.get("https://www.stackoverflow.com"); */
    }
}
