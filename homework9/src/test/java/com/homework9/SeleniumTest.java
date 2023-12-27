package com.homework9;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

    @Test
    public void loginTest() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // open makemytrip.com
        String url = "https://www.makemytrip.com/";
        driver.get(url);

        try {
            Thread.sleep(5000);
            WebElement searchButton = driver.findElement(By.cssSelector("a.widgetSearchBtn"));
            searchButton.click();
            Thread.sleep(10000);
            WebElement closePopUp = driver.findElement(By.cssSelector("span.bgProperties.overlayCrossIcon.icon20"));
            closePopUp.click();
        } catch (Exception e) {
            System.out.println("Pop-up tidak ditemukan atau tidak dapat ditutup: " + e.getMessage());
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement topPriceElement = driver.findElement(By.cssSelector(".clusterViewPrice"));
        String topPrice = topPriceElement.getText();

        System.out.println("Top Price: " + topPrice);

        driver.quit();
    }

}