package com.chartlab.testng.tests;

import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test(dependsOnMethods="OpenBrowser")
    public void Login(){
        System.out.println("Login");
    }

    @Test
    public void OpenBrowser(){
        System.out.println("Browser will open");
    }

    @Test(dependsOnMethods = "Login")
    public void LogOut(){
        System.out.println("LogOut");
    }
}
