import java.util.Scanner;

public class BMExercio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = scanner.nextInt();
        int y = -1;
        while (y != 1) {
            if (x % 2 == 0) y = x / 2;
            else y = 3 * x + 1;
            System.out.print("->" + y);
            x = y;
        }
    }
}
