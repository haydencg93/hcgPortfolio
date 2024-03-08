import java.text.DecimalFormat;
import java.util.Scanner;

public class loanCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");

        long principal = scanner.nextLong();
        if (principal < 0 || principal > 1000000000) {
            System.out.println("Unable to calculate.");
            return;
        }

        double annualInterestRate = scanner.nextDouble();
        if (annualInterestRate < 0 || annualInterestRate > 100) {
            System.out.println("Unable to calculate.");
            return;
        }

        int loanTerm = scanner.nextInt();
        if (loanTerm < 1 || loanTerm > 100) {
            System.out.println("Unable to calculate.");
            return;
        }

        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfPayments = loanTerm * 12;
        double monthlyPayment = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        double totalAmountPaid = monthlyPayment * numberOfPayments;
        double totalInterestPaid = totalAmountPaid - principal;

        System.out.println(decimalFormat.format(monthlyPayment));
        System.out.println(decimalFormat.format(totalAmountPaid));
        System.out.println(decimalFormat.format(totalInterestPaid));

        scanner.close();
    }
}