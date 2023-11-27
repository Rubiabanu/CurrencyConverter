import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");

        // Get the amount to convert
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        // Get the source currency
        System.out.print("Enter the source currency (e.g., USD, EUR): ");
        String sourceCurrency = scanner.next().toUpperCase();

        // Get the target currency
        System.out.print("Enter the target currency (e.g., USD, EUR): ");
        String targetCurrency = scanner.next().toUpperCase();

        // Get the exchange rate
        System.out.print("Enter the exchange rate from " + sourceCurrency + " to " + targetCurrency + ": ");
        double exchangeRate = scanner.nextDouble();

        // Perform the conversion
        double convertedAmount = convertCurrency(amount, exchangeRate);

        // Display the result
        System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);

        // Close the scanner
        scanner.close();
    }

    private static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}
