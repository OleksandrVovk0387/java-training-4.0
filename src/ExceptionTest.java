public class ExceptionTest {

    public static void main(String[] args) {
        // Run tests
        testPositiveCases();
        testNegativeCase();
    }

    // Positive test: Check if area is calculated correctly
    public static void testPositiveCases() {
        System.out.println("Testing positive cases:");

        int result1 = ExampleException.rectangleArea(5, 10);  // 5 * 10 = 50
        System.out.println(result1 == 50 ? "Test passed" : "Test failed");

        int result2 = ExampleException.rectangleArea(2, 3);  // 2 * 3 = 6
        System.out.println(result2 == 6 ? "Test passed" : "Test failed");

        int result3 = ExampleException.rectangleArea(4, 4);  // 4 * 4 = 16
        System.out.println(result3 == 16 ? "Test passed" : "Test failed");
    }

    // Negative test: Check if exception is thrown for negative input
    public static void testNegativeCase() {
        System.out.println("\nTesting negative cases:");

        try {
            ExampleException.rectangleArea(-1, 5);
            System.out.println("Test failed: Expected exception not thrown.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage().equals("input value is below zero!") ? "Test passed" : "Test failed");
        }

        try {
            ExampleException.rectangleArea(5, -1);
            System.out.println("Test failed: Expected exception not thrown.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage().equals("input value is below zero!") ? "Test passed" : "Test failed");
        }

        try {
            ExampleException.rectangleArea(-1, -5);
            System.out.println("Test failed: Expected exception not thrown.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage().equals("input value is below zero!") ? "Test passed" : "Test failed");
        }
    }
}
