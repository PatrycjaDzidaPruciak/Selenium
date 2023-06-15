package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;

    }
    @FindBy(xpath="//label[@id=\"userName-value\"]\n")
    WebElement currentUser;

    public void is_current_user_correct(String user) {

        if(currentUser.getText().equalsIgnoreCase(user)) {

            System.out.println("Prawidłowy użytkownik = " + currentUser.getText());
        }
        else {

            System.out.println("Błędny użytkownik");
        }
    }
}
