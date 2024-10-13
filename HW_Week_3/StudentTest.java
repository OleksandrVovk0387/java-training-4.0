public class StudentTest {
    public static void main(String[] args) {
        testStudentCreation();
        testGetName();
        testGetRating();
        testBetterStudent();
        testChangeRating();
    }

    // Test student creation
    public static void testStudentCreation() {
        Students student = new Students("Oleh", 4.5);
        if (student.getName().equals("Oleh") && student.getRating() == 4.5) {
            System.out.println("testStudentCreation passed");
        } else {
            System.out.println("testStudentCreation failed");
        }
    }

    // Test getName method
    public static void testGetName() {
        Students student = new Students("Iryna", 3.8);
        if (student.getName().equals("Iryna")) {
            System.out.println("testGetName passed");
        } else {
            System.out.println("testGetName failed");
        }
    }

    // Test getRating method
    public static void testGetRating() {
        Students student = new Students("Mykola", 5.0);
        if (student.getRating() == 5.0) {
            System.out.println("testGetRating passed");
        } else {
            System.out.println("testGetRating failed");
        }
    }

    // Test betterStudent method
    public static void testBetterStudent() {
        Students student1 = new Students("Viktor", 4.0);
        Students student2 = new Students("Anna", 3.5);
        if (student1.betterStudent(student2)) {
            System.out.println("testBetterStudent passed");
        } else {
            System.out.println("testBetterStudent failed");
        }
    }

    // Test changeRating method
    public static void testChangeRating() {
        Students student = new Students("Olga", 4.0);
        student.changeRating(4.7);
        if (student.getRating() == 4.7) {
            System.out.println("testChangeRating passed");
        } else {
            System.out.println("testChangeRating failed");
        }
    }
}
