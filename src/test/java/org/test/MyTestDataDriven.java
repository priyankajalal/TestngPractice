package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.InputStream;
import java.io.File;

public class MyTest {

    @Test
    public void test1() throws Exception {
        Properties p= getObjectRepository();
        WebDriver driver = new ChromeDriver();
        driver.get(p.getProperty("url"));
        driver.manage().window().maximize();
        WebElement user = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.id("email")));
        WebElement pass = driver.findElement(By.id("pass"));
        user.sendKeys(p.getProperty("userName"));
        pass.sendKeys(p.getProperty("password"));
    }

    public Properties getObjectRepository() throws Exception {
        Properties p = new Properties();
        String path=System.getProperty("user.dir")+"\\src\\test\\resources\\facebookData.properties";
        File file = new File(path);
        InputStream stream = new FileInputStream(file);
        p.load(stream);
        return p;
    }
}
