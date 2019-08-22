package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase{
    @Test
    public void logInTest(){
        driver.get("https://ebay.com");
        Click(By.id("gh-ug"));
        //

        Click(By.id("userid"));
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys("s@domain.com");
        //
        Click(By.id("pass"));
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("123456789");

        Click(By.id("sgnBt"));


    }

    private void Click(By locator) {
        driver.findElement(locator).click();
    }

}
