import java.util.Scanner;
import java.lang.Math;

public class slope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(",");
        String[] input2 = scanner.nextLine().split(",");

        try {
            double x1 = Double.parseDouble(input1[0]);
            double y1 = Double.parseDouble(input1[1]);
            double x2 = Double.parseDouble(input2[0]);
            double y2 = Double.parseDouble(input2[1]);

            if (x1 == x2 && y1 == y2) {
                System.out.println("Unable to calculate slope.");
            } else {
                double slope = (y2 - y1) / (x2 - x1);
                System.out.printf("%.1f%n", slope);
            }
        } catch (NumberFormatException e) {
            System.out.println("Unable to calculate slope.");
        }
    }
}