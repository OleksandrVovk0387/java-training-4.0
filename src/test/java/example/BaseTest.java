package test.java.example;

import org.testng.annotations.*;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        System.out.println("Setup method");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("Teardown method");
    }
}
