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
}