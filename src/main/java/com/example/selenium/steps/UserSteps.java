package main.java.com.example.selenium.steps;

import main.java.com.example.selenium.pages.LoginPage;
import main.java.com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class UserSteps {
    private WebDriver driver;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public main.java.com.example.selenium.steps.UserSteps login(String username, String password) {
        // TODO initialize LoginPage, call setUsername, setPassword, and click login methods
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        MainPage mainPage = loginPage.clickLogin();

        try {
            Thread.sleep(3000);  // Wait for 3 seconds (this is not a perfect solution, but works for beginners)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //  TODO assert title
        assertEquals(mainPage.getTitle(), "Secure Area", "Login failed");
        return this;
    }

    public UserSteps logout() {
        // TODO call logout method
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLogout();
        return this;
    }
}
