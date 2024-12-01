package test.java.example;

import org.testng.annotations.*;
import test.java.example.BaseTest;

public class TestClassOne extends BaseTest {

    @BeforeGroups(groups = "group1")
    public void setupGroup1() {
        System.out.println("Setup for group1");
    }

    @Test(groups = "group1")
    public void testA() {
        System.out.println("Test A in group1");
    }

    @Test(groups = "group2")
    public void testB() {
        System.out.println("Test B in group2");
    }

    @AfterGroups(groups = "group2", alwaysRun = false)
    public void teardownGroup2() {
        System.out.println("Teardown for group2");
    }
}
