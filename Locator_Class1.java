package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.WeakHashMap;

public class Locator_Class1 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {

        WebDriver driver=WebDriverFactory.getDriver("firefox");

        driver.get("https://www.mercadolibre.com.mx");

        WebElement searchBox=driver.findElement(By.name("as_word"));
        searchBox.sendKeys("Selenium");

        WebElement searchButton=driver.findElement(By.className("nav-icon-search"));
        searchButton.click();

        WebElement firstProduct=driver.findElement(By.className("main-title"));
        firstProduct.click();

        Thread.sleep(2000);
        driver.quit();

    }
}