import java.util.*;

public class FinancialForecast {
    static void forecast(int year, int totalYears, double amount, double rate) {
        if (year > totalYears)
            return;

        System.out.printf("Year %d: Rs%.2f%n", year, amount);

        double nextAmount = amount * (1 + rate / 100);
        forecast(year + 1, totalYears, nextAmount, rate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Financial Forecast Tool");

        System.out.print("Enter initial amount (in INR): ");
        double amount = scanner.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        System.out.println("\nForecast Year-wise:");
        forecast(1, years, amount, rate);

        System.out.println("Do you want to run the forecast again? (y/n)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("y")) {
            main(args);
        } else {
            System.out.println("Thank you for using the Financial Forecast tool!");
        }
        scanner.close();
    }
}
