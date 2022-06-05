import java.util.Scanner;

public class BMExercio06 {
    static String[] WEEKDAYS = new String[]{
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0 to stop");
        while (true) {
            System.out.println("Enter a number to convert to weekday: ");
            int number = scanner.nextInt();
            if (number == 0) break;
            if (1 <= number && number <= 7) {
                System.out.println(WEEKDAYS[number - 1]);
            } else {
                System.out.println("Invalid option (must be between 1 and 7)");
            }
        }
    }
}
