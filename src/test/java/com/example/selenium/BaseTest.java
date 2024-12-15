package test.java.com.example.selenium;

import main.java.com.example.selenium.steps.UserSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps userSteps;

    @BeforeClass
    public void setUp() {
        // TODO initialize a driver, open login URL, resize windows, and initialize steps
        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
        userSteps = new UserSteps(driver);
    }

    @AfterClass
    public void tearDown() {
        // TODO driver close and quit
        if (driver != null) {
            driver.quit();
        }
    }
}
