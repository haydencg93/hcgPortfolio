import java.util.Scanner;

public class integerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sum")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                return;
            }
        }

        System.out.println(sum);
    }
}