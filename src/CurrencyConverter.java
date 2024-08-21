import java.util.Scanner;

public class CurrencyConverter {

    // Conversion rates
    static double usdToInr = 83.2;
    static double eurToInr = 90.5;
    static double usdToEur = 0.95;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Currency Converter");
            System.out.println("1: USD to INR");
            System.out.println("2: INR to USD");
            System.out.println("3: EUR to INR");
            System.out.println("4: INR to EUR");
            System.out.println("5: USD to EUR");
            System.out.println("6: EUR to USD");
            System.out.println("7: Exit");

            System.out.print("Choose the conversion type (1-7): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter the amount: ");
                double amount = scanner.nextDouble();
                double convertedAmount = 0;

                switch (choice) {
                    case 1:
                        convertedAmount = amount * usdToInr;
                        System.out.println(amount + " USD = " + convertedAmount + " INR");
                        break;
                    case 2:
                        convertedAmount = amount / usdToInr;
                        System.out.println(amount + " INR = " + convertedAmount + " USD");
                        break;
                    case 3:
                        convertedAmount = amount * eurToInr;
                        System.out.println(amount + " EUR = " + convertedAmount + " INR");
                        break;
                    case 4:
                        convertedAmount = amount / eurToInr;
                        System.out.println(amount + " INR = " + convertedAmount + " EUR");
                        break;
                    case 5:
                        convertedAmount = amount * usdToEur;
                        System.out.println(amount + " USD = " + convertedAmount + " EUR");
                        break;
                    case 6:
                        convertedAmount = amount / usdToEur;
                        System.out.println(amount + " EUR = " + convertedAmount + " USD");
                        break;
                }
            } else if (choice != 7) {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7); // Continue the loop until the user chooses to exit

        System.out.println("Exiting the program. Goodbye!");
        scanner.close();
    }
}
