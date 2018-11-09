package academy.softserve.paintingthefence;

import java.math.BigDecimal;
import java.util.Scanner;

public class PaintCalculator {

    //todo convert local total variable to BigDecimal
    int countWays(int n, int k) {
        // There are k ways to color first post
        int total = k;

        // There are 0 ways for single post to violate (same color_ and k ways to not violate (different color)
        int same = 0;
        int diff = k;

        for (int i = 2; i <= n; i++) {
            // Current same is same as previous diff
            same = diff;

            // We always have k-1 choices for next post
            diff = total * (k - 1);

            // Total choices till i.
            total = (same + diff);
        }
        return total;
    }

    public static void main(String[] args) {
        PaintCalculator paintCalculator = new PaintCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the posts numbers: ");
        int posts = checkInt(scanner);
        System.out.println("Please enter the colors numbers: ");
        int colors = checkInt(scanner);

        System.out.print("Painting ways: ");
        System.out.println(paintCalculator.countWays(posts, colors));
    }

    private static int checkInt(Scanner scanner) {
        int checkedInt = 0;
        while (checkedInt <= 0) {
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!");
                scanner.next();
            }

            checkedInt = scanner.nextInt();
            if (checkedInt <= 0) {
                System.out.println("Number must be positive");
            }
        }


        return checkedInt;
    }
}
