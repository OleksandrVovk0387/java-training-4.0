package com.example.selenium;

import org.testng.annotations.Test;

public class LoginTest extends com.example.selenium.BaseTest {

    @Test
    public void login() {
        // TODO use steps for the login and logout
        userSteps.login("tomsmith", "SuperSecretPassword!")
                .logout();
    }
}
