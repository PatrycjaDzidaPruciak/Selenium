package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("Webdriver.Chrome.Driver", "\"C:\\Users\\user\\Desktop\\repozytoria\\Selenium\\chromedriver\\chromedriver.exe\"");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();
        driver.findElement(By.id("login")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
        driver.findElement(By.id("password")).sendKeys("Password@123");
        driver.findElement(By.id("login")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Jestes na stronie" + driver.getCurrentUrl());
        driver.quit();
    }
}

