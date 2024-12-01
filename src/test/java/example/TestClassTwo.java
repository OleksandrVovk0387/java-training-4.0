package test.java.example;

import org.testng.annotations.*;

public class TestClassTwo {

    @Test
    @Parameters({"param1", "param2"})
    public void testWithXmlParameters(String param1, String param2) {
        System.out.println("Parameter 1: " + param1);
        System.out.println("Parameter 2: " + param2);
    }

    @DataProvider(name = "dataProvider")
    public Object[][] provideData() {
        return new Object[][]{
                {"Value1", "Value2"},
                {"Value3", "Value4"}
        };
    }

    @Test(dataProvider = "dataProvider")
    public void testWithDataProvider(String value1, String value2) {
        System.out.println("Value 1: " + value1 + ", Value 2: " + value2);
    }
}
