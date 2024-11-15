import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

    /**
     * Test data for positive test.
     *
     * @return test data array
     */
    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 2, 4},
                {2, 3, 6},
                {5, 4, 20},
                {10, 10, 100} // Additional test data
        };
    }

    /**
     * Test data for exception test.
     *
     * @return test data array
     */
    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2},
                {-3, -3},
                {0, -1} // Additional test data
        };
    }

    @Test(dataProvider = "data")
    public void testRectangleArea(int a, int b, int expectedArea) {
        int actualArea = ExampleException.rectangleArea(a, b);
        assertEquals(actualArea, expectedArea, "Area calculation is incorrect");
    }

    @Test(dataProvider = "negativeData")
    public void testRectangleAreaNegative(int a, int b) {
        try {
            ExampleException.rectangleArea(a, b);
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "input value is below zero!", "Exception message is incorrect");
        }
    }
}
