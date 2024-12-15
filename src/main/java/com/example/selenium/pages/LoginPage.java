package main.java.com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {

    // TODO define username, password, and login WebElements using @FindBy
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = ".fa")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage setUsername(String text) {
        // TODO set username
        usernameField.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        // TODO set password
        passwordField.sendKeys(text);
        return this;
    }

    public MainPage clickLogin() {
        // TODO click logout return instance of MainPage
        loginButton.click();
        return new MainPage(driver);
    }
}
