package main.java.com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends main.java.com.example.selenium.pages.BasePage {

    // TODO define title and logout WebElements using @FindBy
    @FindBy(css = "h2")
    private WebElement title;

    @FindBy(css = ".icon-2x")
    private WebElement logoutButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return title.getText();
        //return null;
    }

    public MainPage clickLogout() {
        // TODO click logout and return MainPage
        logoutButton.click();
        return this;
    }
}
