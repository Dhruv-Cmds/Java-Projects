package InvoiceWithDiscountPlusTax.v1_basic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Simple Invoice with Discount + Tax

        Scanner scanner = new Scanner(System.in);

        String item;
        char currency = '$';
        double price;
        int quantity;
        double tax;
        double amount;
        double disPrice;
        double total;

        System.out.print("What would you like to buy?: ");
        item = scanner.next();

        System.out.print("The price is: ");
        price = scanner.nextDouble();

        System.out.print("How much would you like to buy?:");
        quantity = scanner.nextInt();

        amount = price * quantity;

        if (amount <= 200){

            // After discount
            tax = amount * 0.08;

            // Final price
            total = tax + amount;

            System.out.println("----------------------------------");
            System.out.printf("Original price of %s is: %c%.2f\n" ,item , currency , amount);
            System.out.printf("Tax added: %c%.2f\n" , currency , tax);
            System.out.printf("Final price of item is: %c%.2f\n" , currency , total);
        }

        else {
            System.out.println("You get 15% discount: ");
            disPrice = amount * 0.85;

            // After discount

            tax = disPrice * 0.08;

            // Final price

            total = tax + disPrice;

            System.out.println("----------------------------------------------------");
            System.out.printf("Original price of item before discount is: %c%.2f\n" , currency , amount);
            System.out.printf("After discount price is: %c%.2f\n" , currency , disPrice);
            System.out.printf("Tax added: %c%.2f\n" , currency , tax);
            System.out.printf("Final price of item is: %c%.2f\n" ,currency , total);
        }
        scanner.close();
    }
}
