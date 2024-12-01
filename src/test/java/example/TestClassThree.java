package test.java.example;

import org.testng.annotations.*;

public class TestClassThree {

    @Test(priority = 3)
    public void testC() {
        System.out.println("Test C");
    }

    @Test(priority = 2)
    public void testB() {
        System.out.println("Test B");
    }

    @Test(priority = 1)
    public void testA() {
        System.out.println("Test A");
    }
}

