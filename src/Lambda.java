import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {

    /**
     * Function to get max value.
     *
     * @return lambda expression.
     */
    public static BiFunction<Double, Double, Double> getMax() {
        // Lambda expression to get the maximum of two Double values
        return (a, b) -> a > b ? a : b;
    }

    /**
     * Function to get square root.
     *
     * @return lambda expression.
     */
    public static Function<Double, Double> getSqrt() {
        // Method reference to calculate the square root of a Double value
        return Math::sqrt;
    }
}