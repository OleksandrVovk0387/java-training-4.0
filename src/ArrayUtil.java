/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        // Create a simple list to hold common elements
        StringBuilder commonElements = new StringBuilder();

        // Loop through each element in the first array
        for (String element1 : array1) {
            // Check if the element exists in the second array
            for (String element2 : array2) {
                if (element1.equals(element2) && commonElements.indexOf(element1) == -1) {
                    commonElements.append(element1).append(",");
                }
            }
        }

        // If there are common elements, return them as an array, else return an empty array
        if (commonElements.length() > 0) {
            return commonElements.toString().split(",");
        } else {
            return new String[0];
        }
    }
}