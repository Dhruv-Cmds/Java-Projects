package InvoiceWithDiscountPlusTax.v2_oop_file;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        String item;
        double price;
        int quantity;
        double total;

        Scanner scanner = new Scanner(System.in);
        Invoice invoice = new Invoice();

        System.out.print("What would you like to buy?: ");
        item = scanner.next();

        System.out.print("The price is: ");
        price = scanner.nextDouble();

        System.out.print("How much would you like to buy?:");
        quantity = scanner.nextInt();

        invoice.calculate(price , quantity);

        double original = price * quantity;

        System.out.println("--------------------");
        System.out.println("Item: " + item);
        System.out.printf("Original price: $%.2f%n", original);
        System.out.printf("After discount: $%.2f%n", invoice.getDiscountedAmount());
        System.out.printf("Tax: $%.2f%n", invoice.getTax());
        System.out.printf("Final price: $%.2f%n", invoice.getTotal());

        scanner.close();

    }
}
