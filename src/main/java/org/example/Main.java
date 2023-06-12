package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        System.setProperty("Webdriver.Chrome.Driver", "\"C:\\Users\\user\\Desktop\\repozytoria\\Selenium\\chromedriver\\chromedriver.exe\"");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.get("https://www.w3schools.com/xml/ajax_examples.asp");
        driver.manage().window().maximize();
        //*[@id="accept-choices"]
        driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();
    }
}

