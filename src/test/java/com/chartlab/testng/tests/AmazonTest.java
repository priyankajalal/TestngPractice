package com.chartlab.testng.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by vinodnayal on 08-02-2018.
 */
public class AmazonTest {
    @Test
    public void Test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
    }

    @Test
    public void Test2(){
        System.out.println("Just Testing");
    }

}
