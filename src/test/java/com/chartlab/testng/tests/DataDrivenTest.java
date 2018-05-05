package com.chartlab.testng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by vinodnayal on 14-02-2018.
 */
public class DataDrivenTest {

    @Test(dataProvider = "testData")
    public void DataTest1(String userName,String password){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement user = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.id("email")));
        WebElement pass = driver.findElement(By.id("pass"));
        user.sendKeys(userName);
        pass.sendKeys(password);

    }

    @DataProvider(name="testData")
    public Object[][] testDataFeed(){
        Object[][] facebookData = new Object[2][2];
        facebookData[0][0]= "username1";
        facebookData[0][1]= "password1";
        facebookData[1][0]= "username2";
        facebookData[1][1]= "password2";
        return facebookData;
    }
}
