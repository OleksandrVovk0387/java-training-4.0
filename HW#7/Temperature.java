public class Temperature {

    /**
     * Converts temperature from Fahrenheit to Celsius.
     *
     * @param fahrenheit temperature in Fahrenheit
     * @return temperature in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return 5.0 * (fahrenheit - 32) / 9.0; // Simplified formula
    }

    /**
     * Converts temperature from Celsius to Fahrenheit.
     *
     * @param celsius temperature in Celsius
     * @return temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 * celsius + 160) / 5.0; // Simplified formula
    }
}
