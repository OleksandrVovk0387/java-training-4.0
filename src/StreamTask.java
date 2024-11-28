import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        // Перетворення масиву в потік, фільтрація парних чисел, піднесення до квадрату і сума
        return Arrays.stream(numbers)
                .filter(number -> number % 2 == 0) // Залишаємо лише парні числа
                .map(number -> number * number) // Підносимо до квадрату
                .sum(); // Підраховуємо суму
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        // Перетворення масиву в потік, фільтрація непарних чисел, сортування і повернення масиву
        return Arrays.stream(numbers)
                .filter(number -> number % 2 != 0) // Залишаємо лише непарні числа
                .sorted() // Сортуємо за зростанням
                .toArray(); // Повертаємо як масив
    }
}
