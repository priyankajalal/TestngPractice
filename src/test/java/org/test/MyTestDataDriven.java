package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class MyTestDataDriven {


    @Test(dataProvider = "testdata")
    public void test1(String url,String userName,String pwd) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement user = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.id("email")));
        WebElement pass = driver.findElement(By.id("pass"));
        user.sendKeys(userName);
        pass.sendKeys(pwd);
    }

    @DataProvider(name="testdata")
    public Object[][] getObjectRepository() throws Exception {
        Properties p = new Properties();
        String path=System.getProperty("user.dir")+"\\src\\test\\resources\\test.properties";
        File file = new File(path);
        InputStream stream = new FileInputStream(file);
        p.load(stream);
        Object[][] facebookData = new Object[1][3];
        Enumeration<String> enums = (Enumeration<String>) p.propertyNames();
        int i=0;
        while (enums.hasMoreElements()) {
            String key = enums.nextElement();
            String[] values = p.getProperty(key).split(",");
            facebookData[i][0]=values[0];
            facebookData[i][1]=values[1];
            facebookData[i][2]=values[2];
            i++;
        }
        return facebookData;
    }
}
