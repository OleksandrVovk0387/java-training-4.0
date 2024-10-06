import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SeasonExample {

    public static void main(String[] args) {

        String input = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please enter a month name: ");
            input = br.readLine();
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }

        String season;
        String Month = input;

        switch (Month.toLowerCase()){
            case "january":
            case "february":
            case "december":
                season = "It is a Winter Season";
                break;
            case "march":
            case "april":
            case "may":
                season = "It is a Spring Season";
                break;
            case "june":
            case "july":
            case "august":
                season = "It is a Summer Season";
                break;
            case "september":
            case "october":
            case "november":
                season = "It is a Autumn Season";
                break;
            default:
                season = "It is not a month's name!";
        }
        System.out.println(season);
    }
}
