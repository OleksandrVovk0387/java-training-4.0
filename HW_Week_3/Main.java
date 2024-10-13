import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create 3 Students
        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();

        // add information about students
        System.out.println("Enter name and press enter button, rating and press enter button for Student 1:");
        student1 = new Students(scanner.nextLine(), scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Enter name and press enter button, rating and press enter button for Student 2:");
        student2 = new Students(scanner.nextLine(), scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Enter name and press enter button, rating and press enter button for Student 3:");
        student3 = new Students(scanner.nextLine(), scanner.nextDouble());
        scanner.nextLine();

        // average rating
        double averageRating = (student1.getRating() + student2.getRating() + student3.getRating()) / 3;
        System.out.println("Average rating: " + averageRating);

        // new rating of a student
        System.out.println("Enter new rating for Student 1:");
        student1.changeRating(scanner.nextDouble());

        // new average rating
        averageRating = (student1.getRating() + student2.getRating() + student3.getRating()) / 3;
        System.out.println("New average rating: " + averageRating);

        scanner.close();
    }
}