public class ArrayUtilTest {
    public static void main(String[] args) {
        // Test case 1: Common elements
        String[] array1 = {"BMW", "Ford", "Cherry"};
        String[] array2 = {"BMW", "Cherry", "Honda"};
        String[] result = ArrayUtil.findCommon(array1, array2);
        System.out.println("Common elements: " + String.join(", ", result));  // Expected: BMW, Cherry

        // Test case 2: No common elements
        String[] array3 = {"Mazda", "BMW", "Cherry"};
        String[] array4 = {"Ford", "BYD", "Skoda"};
        String[] result2 = ArrayUtil.findCommon(array3, array4);
        System.out.println("Common elements: " + String.join(", ", result2));  // Expected: (empty)

        // Test case 3: One common element
        String[] array5 = {"Mazda", "BMW", "Cherry"};
        String[] array6 = {"BMW", "Ford", "BYD"};
        String[] result3 = ArrayUtil.findCommon(array5, array6);
        System.out.println("Common elements: " + String.join(", ", result3));  // Expected: BMW

        // Test case 4: Arrays with the same elements
        String[] array7 = {"Mazda", "BMW", "Cherry"};
        String[] array8 = {"Mazda", "BMW", "Cherry"};
        String[] result4 = ArrayUtil.findCommon(array7, array8);
        System.out.println("Common elements: " + String.join(", ", result4));  // Expected: "Mazda", "BMW", "Cherry"

        // Test case 5: Empty arrays
        String[] array9 = {};
        String[] array10 = {"BMW", "Mazda"};
        String[] result5 = ArrayUtil.findCommon(array9, array10);
        System.out.println("Common elements: " + String.join(", ", result5));  // Expected: (empty)
    }
}

