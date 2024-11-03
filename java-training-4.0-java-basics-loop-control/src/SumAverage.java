public class SumAverage {

    // Computes sum of running integers from a lower bound to an upper bound using a for loop
    public static int sum(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
        }
        return sum;
    }

    // Computes sum of running integers within an array using a for-each loop
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Computes average of running integers from a lower bound to an upper bound using a while loop
    public static double average(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        int i = lowerBound;
        while (i <= upperBound) {
            sum += i;
            count++;
            i++;
        }
        return (double) sum / count;
    }

    // Computes average of running integers within an array using a do-while loop
    public static double average(int[] numbers) {
        int sum = 0;
        int count = 0;
        int i = 0;
        do {
            sum += numbers[i];
            count++;
            i++;
        } while (i < numbers.length);
        return (double) sum / count;
    }

    // Main method to test the methods
    public static void main(String[] args) {
        // Test cases for sum(int, int)
        System.out.println(sum(1, 5)); // Expected: 15
        System.out.println(sum(10, 15)); // Expected: 75
        System.out.println(sum(-5, 5)); // Expected: 0
        System.out.println(sum(0, 0)); // Expected: 0

        // Test cases for sum(int[])
        System.out.println(sum(new int[]{1, 2, 3, 4, 5})); // Expected: 15
        System.out.println(sum(new int[]{10, 20, 30})); // Expected: 60
        System.out.println(sum(new int[]{-5, 5, 10})); // Expected: 10
        System.out.println(sum(new int[]{0, 0, 0})); // Expected: 0

        // Test cases for average(int, int)
        System.out.println(average(1, 5)); // Expected: 3.0
        System.out.println(average(10, 15)); // Expected: 12.5
        System.out.println(average(-5, 5)); // Expected: 0.0
        System.out.println(average(0, 0)); // Expected: 0.0

        // Test cases for average(int[])
        System.out.println(average(new int[]{1, 2, 3, 4, 5})); // Expected: 3.0
        System.out.println(average(new int[]{10, 20, 30})); // Expected: 20.0
        System.out.println(average(new int[]{-5, 5, 10})); // Expected: 3.3333...
        System.out.println(average(new int[]{0, 0, 0})); // Expected: 0.0
    }
}
